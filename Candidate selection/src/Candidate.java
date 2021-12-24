public class Candidate {
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
}
