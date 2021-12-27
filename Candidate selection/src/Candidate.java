import java.util.Objects;

public class Candidate implements Comparable<Candidate>{
    private String name;
    private String sex;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String name, String sex, String age, int relevance, int rating) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return relevance == candidate.relevance && rating == candidate.rating && name.equals(candidate.name) && sex.equals(candidate.sex) && age.equals(candidate.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, relevance, rating);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", relevance=" + relevance +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Candidate o) {
        return this.name.compareTo(o.name);
    }
}