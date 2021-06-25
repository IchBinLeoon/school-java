import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Class that represents a quiz.
 */
class Quiz {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int rounds;
    private final ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Question> questions;
    private int questionsIndex = 0;
    private final String[] VALID_ANSWERS = {"A", "B", "C", "D"};
    private final int MIN_ROUNDS = 1;
    private final int MAX_ROUNDS = 100;
    private final int MIN_PLAYERS = 1;
    private final int MAX_PLAYERS = 10;
    private final int POINTS = 10;

    /**
     * Main method.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();
    }

    /**
     * Starts the quiz.
     */
    public void start() {
        System.out.print("Starting the Quiz.\n");
        try {
            setQuestions();
            setRounds();
            setPlayers();
            boolean c = askForConfirmation();
            if (!c) {
                System.exit(0);
            }
            play();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Performs the actual quiz.
     *
     * @throws IOException If an IO exception occurs.
     */
    private void play() throws IOException {
        int currentRound = 1;
        Collections.shuffle(this.questions);
        while (currentRound <= this.rounds) {
            System.out.printf("\n=====[ Round %s ]=====\n\n", currentRound);
            for(Player player : players) {

                // Sets the question index back to zero and shuffles the questions again when the question index is through the list.
                if (this.questionsIndex == this.questions.size()) {
                    this.questionsIndex = 0;
                    Collections.shuffle(this.questions);
                }
                askQuestion(player);

                // Increases the question index to get the next question from the list.
                this.questionsIndex += 1;
            }
            currentRound += 1;
        }
        printResults();
        exit();
    }

    /**
     * Sets the number of rounds.
     *
     * @throws IOException If an IO exception occurs.
     */
    private void setRounds() throws IOException {
        while (true) {
            System.out.printf("How many rounds to play? [%s-%s]: ", MIN_ROUNDS, MAX_ROUNDS);
            try {
                String rounds = this.reader.readLine();
                int roundsInt = Integer.parseInt(rounds);
                if (roundsInt < this.MIN_ROUNDS) {
                    System.out.print("Not enough rounds. Try again.\n");
                    continue;
                } else if (roundsInt > this.MAX_ROUNDS) {
                    System.out.print("Too many rounds. Try again.\n");
                    continue;
                }
                this.rounds = roundsInt;
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again.\n");
            }
        }
    }

    /**
     * Sets the players.
     *
     * @throws IOException If an IO exception occurs.
     */
    private void setPlayers() throws IOException {
        int playerCount;
        while (true) {
            System.out.printf("How many players? [%s-%s]: ", this.MIN_PLAYERS, this.MAX_PLAYERS);
            try {
                String rounds = this.reader.readLine();
                playerCount = Integer.parseInt(rounds);
                if (playerCount < this.MIN_PLAYERS) {
                    System.out.print("Not enough players. Try again.\n");
                    continue;
                } else if (playerCount > this.MAX_PLAYERS) {
                    System.out.print("Too many players. Try again.\n");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again.\n");
            }
        }
        for(int i = 1; i <= playerCount; i++) {
            System.out.printf("Player %d Name: ", i);
            String name = this.reader.readLine();
            Player player = new Player(name);
            this.players.add(player);
            System.out.printf("Player %s added.\n", player.getName());
        }
    }

    /**
     * Loads the questions from the json file.
     *
     * @throws IOException If an IO exception occurs.
     */
    private void setQuestions() throws IOException {
        String path = "Quiz.json";

        // Checks if the json file exists, if not the user is asked for the path.
        while (true) {
            if (Files.notExists(Path.of(path))) {
                System.out.print("Can't find quiz json. Specify a valid path: ");
                path = this.reader.readLine();
            } else {
                break;
            }
        }

        String data = new String(Files.readAllBytes(Paths.get(path)));
        Gson gson = new Gson();
        Question[] questions = gson.fromJson(data, Question[].class);
        this.questions = new ArrayList<>(Arrays.asList(questions));
    }

    /**
     * Asks the selected player a question.
     *
     * @param player {@link Player} object of the selected player.
     * @throws IOException If an IO exception occurs.
     */
    private void askQuestion(Player player) throws IOException {
        Question question = this.questions.get(this.questionsIndex);
        String answer = question.getOptions()[question.getAnswer()];
        HashMap<String, String> options = shuffleOptions(question.getOptions());
        System.out.printf("Question for player %s.\n\n", player.getName());
        System.out.printf("%s\n\n", question.getQuestion());
        for(Map.Entry<String, String> entry : options.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
        System.out.print("\n");
        while(true) {
            System.out.printf("Your answer? %s: ", Arrays.toString(this.VALID_ANSWERS));
            String input = this.reader.readLine();
            if(Arrays.asList(this.VALID_ANSWERS).contains(input.toUpperCase())) {
                if(options.get(input.toUpperCase()).equals(answer)) {
                    player.addPoints(this.POINTS);
                    System.out.printf("\nCorrect answer! +%s Points\n\n", this.POINTS);
                } else {
                    System.out.print("\nWrong answer!\n\n");
                }
                break;
            } else {
                System.out.print("Invalid input. Try again.\n\n");
            }
        }
    }

    /**
     * Shuffles the options of the question.
     *
     * @param options The options.
     * @return The shuffled options as a HashMap.
     */
    private HashMap<String, String> shuffleOptions(String[] options) {
        ArrayList<String> optionList = new ArrayList<>(Arrays.asList(options));
        Collections.shuffle(optionList);
        HashMap<String, String> optionsMap = new HashMap<>();
        optionsMap.put(this.VALID_ANSWERS[0], optionList.get(0));
        optionsMap.put(this.VALID_ANSWERS[1], optionList.get(1));
        optionsMap.put(this.VALID_ANSWERS[2], optionList.get(2));
        optionsMap.put(this.VALID_ANSWERS[3], optionList.get(3));
        return optionsMap;
    }

    /**
     * Outputs the results.
     */
    private void printResults() {
        System.out.print("\n=====[ Results ]=====\n\n");
        for (Player player : this.players) {
            System.out.printf("%s: %s Points\n", player.getName(), player.getScore());
        }
    }

    /**
     * Closes the BufferedReader.
     *
     * @throws IOException If an IO exception occurs.
     */
    private void exit() throws IOException {
        this.reader.close();
    }

    /**
     * Asks the user for a confirmation.
     *
     * @throws IOException If an IO exception occurs.
     * @return Either true or false.
     */
    private boolean askForConfirmation() throws IOException {
        while (true) {
            System.out.print("Ready to play? [Y/N]: ");
            String input = this.reader.readLine();
            String res = input.toLowerCase();
            if (res.equals("y") || res.equals("yes")) {
                return true;
            } else if (res.equals("n") || res.equals("no")) {
                break;
            } else {
                continue;
            }
        }
        return false;
    }
}

/**
 * Class that represents a player.
 */
class Player {
    private final String name;
    private int score = 0;

    /**
     * The class constructor.
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds points to the player.
     *
     * @param points The points to be added.
     */
    public void addPoints(int points) {
        this.score += points;
    }

    /**
     * Returns the score of the player.
     *
     * @return The score of the player.
     */
    public int getScore() {
        return score;
    }
}

/**
 * Class that represents a question.
 */
class Question {
    private String question;
    private String[] options;
    private int answer;

    /**
     * Returns the question.
     *
     * @return The question.
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * Sets the question.
     *
     * @param question The question.
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Returns the options.
     *
     * @return The options.
     */
    public String[] getOptions() {
        return this.options;
    }

    /**
     * Sets the options.
     *
     * @param options The options.
     */
    public void setOptions(String[] options) {
        this.options = options;
    }

    /**
     * Returns the answer.
     *
     * @return The answer.
     */
    public int getAnswer() {
        return this.answer;
    }

    /**
     * Sets the answer.
     *
     * @param answer The answer.
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }
}