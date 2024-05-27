package school.redrover.lecture22;

import java.util.Comparator;
import java.util.List;

public class WC {
    static class Counters {
        private int words;
        private int lines;
        public void addWords(int noOfWords) {
            words+=noOfWords;
        }
        public void addLines(int noOfLines) {
            lines+=noOfLines;
        }
        public String getString() {
            return String.format("Lines: %s, Words: %s", lines, words);
        }
    }

    public static Counters wc(List<String> lines) {
        return lines.stream()
                .reduce(
                        new Counters(),
                        (counters, line) -> {
                            counters.addLines(1);
                            counters.addWords(line.split(" ").length);
                            return counters;
                        },
                        (c1, c2) -> {
                            c1.addWords(c2.words);
                            c1.addLines(c2.lines);
                            return c1;
                        }
                );
    }

    public static void main(String[] args) {
        System.out.println(wc(List.of(
                "This is my first line",
                "Second line",
                "Third line",
                "I'm really tired of typing lines"
        )).getString());
    }
}