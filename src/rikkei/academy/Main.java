package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Classes classes = new Classes("JV062022");
        Classes classes1 = new Classes("NoteJS 072022");
        student.setName("Đạt");
        student.setClasses(classes);
        student1.setName("Chi");
        student1.setClasses(classes1);
        System.out.println(student.getName()+" học lớp "+student.getClasses().getName());
        System.out.println(student1.getName()+" học lớp "+student1.getClasses().getName());
    }
}