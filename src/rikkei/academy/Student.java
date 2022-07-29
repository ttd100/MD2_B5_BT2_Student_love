package rikkei.academy;

public class  Student {
    private String name="John";
    private Classes classes ;
    Student(){

    }
    private Student(String name,Classes classes){
        this.name= name;
        this.classes = classes;

    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
