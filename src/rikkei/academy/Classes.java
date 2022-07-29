package rikkei.academy;

public class Classes {
    private String name ;
    Classes(){
    }

    public String getName() {
        return name;
    }

    public Classes(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                '}';
    }
}

