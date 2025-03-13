public class Student {
    private String  name ;
    private String address;
    private String email;
    private String number;
    private String msv;

    public Student(String name, String address, String email, String number, String msv) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.number = number;
        this.msv = msv;
    }
    public Student(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void showinfor(){
        System.out.println(name+" "+ address+ " "+email+ " "+number+" "+msv);
    }

    public void Study(){
        System.out.println("Hoc sinh di hoc");
        showinfor();
    }
    public void Homework(){
        System.out.println("Hoc sinh lam bai");
        showinfor();
    }
    public void pay(){
        System.out.println("Hoc sinh nop hoc phi");
        showinfor();
    }
    public void test(){
        System.out.println("Hoc sinh kiem tra");
        showinfor();
    }
}
