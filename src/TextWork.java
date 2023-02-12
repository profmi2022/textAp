import java.util.HashMap;
import java.util.Map;

public class TextWork {

    private final Map<String, Integer> textMap = new HashMap<>();

    private static int wordsCount = 0;

    public TextWork(String string) {
        for (String text : string.split("\\s")){
            wordsCount++;
            if(textMap.containsKey(text)){
                textMap.put(text, textMap.get(text)+1);
            }else {
                textMap.put(text, 1);
            }
        }
    }

    public void printMap(){
        System.out.println("В тексте " + wordsCount + " слов");
        textMap.entrySet().stream()
                .limit(10)
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(entry.getValue() + " - " + entry.getKey()));
    }
}