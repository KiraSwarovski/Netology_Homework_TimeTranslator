import java.util.Objects;

public class WordSorter implements Comparable<WordSorter> {
    private final String word;
    private final Integer count;

    public WordSorter(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int compareTo(WordSorter sort) {
        if (count<sort.getCount()){
            return 1;
        }
        if (count>sort.getCount()){
            return -1;
        }
        return word.compareTo(sort.getWord());
    }

    @Override
    public String toString() {
        return word+"->"+count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordSorter that = (WordSorter) o;
        return word.equals(that.word) &&
                count.equals(that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }
}
