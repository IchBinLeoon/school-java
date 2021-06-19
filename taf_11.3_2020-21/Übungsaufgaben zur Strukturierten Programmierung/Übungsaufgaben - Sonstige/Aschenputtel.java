import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aschenputtel {

    public static void main(String[] args) throws IOException {

        String PATH = "Aschenputtel.txt";

        String data = new String(Files.readAllBytes(Paths.get(PATH)));
        String text = data.replaceAll("(?m)^[ \t]*\r?\n", "").replaceAll("\\s+", " ");

        HashMap<Character, Long> characters = new HashMap<Character, Long>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char i : alphabet) characters.put(i, text.toLowerCase().chars().filter(char_ -> char_ == i).count());
        System.out.println(characters.toString());

        LinkedHashMap<Character, Long> sortedCharacters = new LinkedHashMap<Character, Long>();
        characters.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedCharacters.put(x.getKey(), x.getValue()));
        System.out.println(sortedCharacters.toString());

        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");
        System.out.println(words.length);

        int upperCaseCount = 0;
        for(String i : words) if(Character.isUpperCase(i.toCharArray()[0])) upperCaseCount++;
        System.out.println(upperCaseCount);

        List<String> matches = new ArrayList<String>();
        Matcher m = Pattern.compile("\\p{Punct}").matcher(text);
        while (m.find()) {
            matches.add(m.group());
        }
        System.out.println(matches.size());

        System.out.println(text.replaceAll("Aschenputtel", "Leon"));

    }

}
