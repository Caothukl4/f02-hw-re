package Structure;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Hw06 {
    private static final String FILE_NAME = "Structure/Student";
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        loadStudents();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMENU QUẢN LÝ SINH VIÊN:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Sắp xếp danh sách sinh viên");
            System.out.println("6. Tìm kiếm sinh viên");
            System.out.println("7. Thoát (Lưu vào file)");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: editStudent(sc); break;
                case 3: deleteStudent(sc); break;
                case 4: displayStudents(); break;
                case 5: sortStudents(sc); break;
                case 6: searchStudent(sc); break;
                case 7: saveStudents(); break;
                default: System.out.println("Chức năng không hợp lệ!");
            }
        }while (choice != 7);
    }
    private static void loadStudents() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                students = (List<Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Lỗi tải dữ liệu: " + e.getMessage());
            }
        }
    }
    private static void addStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.print("Nhập điểm trung bình: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        students.add(new Student(id, name, age, gpa));
        System.out.println("Thêm sinh viên thành công!");
    }
    private static void editStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("Nhập họ tên mới: ");
                s.setName(scanner.nextLine());
                System.out.print("Nhập tuổi mới: ");
                s.setAge(scanner.nextInt());
                System.out.print("Nhập điểm TB mới: ");
                s.setGpa(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }
    private static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String id = scanner.nextLine();
        students.removeIf(s -> s.getId().equals(id));
        System.out.println("Xóa thành công!");
    }
    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            students.forEach(System.out::println);
        }
    }
    private static void sortStudents(Scanner scanner) {
        System.out.println("1. Sắp xếp theo họ tên");
        System.out.println("2. Sắp xếp theo điểm trung bình (tăng dần)");
        System.out.println("3. Sắp xếp theo điểm trung bình (giảm dần)");
        System.out.print("Chọn kiểu sắp xếp: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> students.sort(Comparator.comparing(Student::getName));
            case 2 -> students.sort(Comparator.comparingDouble(Student::getGpa));
            case 3 -> students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
        System.out.println("Sắp xếp thành công!");
    }
    private static void searchStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String id = scanner.nextLine();
        students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Không tìm thấy!"));
    }
    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Dữ liệu đã được lưu!");
        } catch (IOException e) {
            System.out.println("Lỗi lưu dữ liệu: " + e.getMessage());
        }
    }
}
class Student implements Serializable {
    private String id ;
    private String name;
    private int age;
    private double gpa;

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return "MSSV: " + id + ", Họ tên: " + name + ", Tuổi: " + age + ", Điểm TB: " + gpa;
    }
}
