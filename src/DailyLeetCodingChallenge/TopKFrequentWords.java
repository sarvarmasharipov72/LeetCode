package DailyLeetCodingChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FrequentWord implements Comparable<FrequentWord> {

    private String word;
    private int count;

    public FrequentWord(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    @Override
    public int compareTo(FrequentWord o) {

        if (count != o.count) {
            return o.count - count;
        }
        return word.compareTo(o.word);
    }
}

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Long> map = Arrays
                .stream(words)
                .collect(
                        Collectors.groupingBy(x -> x, Collectors.counting())
                );
        return map
                .entrySet()
                .stream()
                .map(entry -> new FrequentWord(entry.getKey(), entry.getValue().intValue()))
                .toList()
                .stream()
                .sorted()
                .map(FrequentWord::getWord)
                .limit(k)
                .toList();
    }
}
