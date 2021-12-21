import java.util.Objects;

public enum Group {
     WORK("Work"),
     FRIENDS("Friends"),
     FAMILY("Family");

    private String group;

     Group(String group) {
        this.group = group;
    }

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
