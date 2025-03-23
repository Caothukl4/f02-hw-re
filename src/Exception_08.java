import java.util.ArrayList;
import java.util.Scanner;

class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "ID: "+ id+ ", Tên: "+ name;
    }
}

class StudentManager{
    private ArrayList<Student> studentList = new ArrayList<>();
    public void addStudent(int id, String name) {
        studentList.add(new Student(id, name));
        System.out.println("Đã thêm sinh viên: " + name);
    }
    public void removeStudent(int index) {
        try {
            if (studentList.isEmpty()) {
                throw new EmptyStudentListException("Danh sách sinh viên đang rỗng!");
            }
            Student removedStudent = studentList.remove(index);
            System.out.println("Đã xóa sinh viên: " + removedStudent.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi: Chỉ số sinh viên không hợp lệ!");
        } catch (EmptyStudentListException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    //show Student
    public void showStudent(){
        try {
            if(studentList.isEmpty()){
                throw new EmptyStudentListException("Danh sách sinh viên trống! Không có gì để hiển thị.");
            }
            System.out.println("Danh sách sinh viên:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (EmptyStudentListException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Exception_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Quản lý danh sách sinh viên ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Nhập ID sinh viên: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập tên sinh viên: ");
                        String name = scanner.nextLine();
                        manager.addStudent(id, name);
                        break;
                    case 2:
                        System.out.print("Nhập chỉ số sinh viên cần xóa: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        manager.removeStudent(index);
                        break;
                    case 3:
                        manager.showStudent();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Vui lòng chọn từ 1 đến 4!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
            }
        }
    }
}
