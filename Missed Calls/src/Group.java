import java.util.Objects;

public enum Group {
     WORK("Work"),
     FRIENDS("Friends"),
     FAMILY("Family");

    private String group;

     Group(String group) {
        this.group = group;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Group group1 = (Group) o;
//        return group.equals(group1.group);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(group);
//    }

    public String getGroup() {
        return this.group;
    }
    public static Group isEqual(String text){
        for (Group gr: Group.values()) {
            if(gr.group.equalsIgnoreCase(text)){
                return gr;
            }
        }
        return null;
    }
}
