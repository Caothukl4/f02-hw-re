public class student<T> {
    private String name;
    private T gpa;

    public student(String name, T gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return this.name + " " + this.gpa;
    }
}
