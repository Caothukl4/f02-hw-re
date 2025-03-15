import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Human  human = new Human("Phạm Tuấn Anh", 22,"tuananhpvpl@gmail.com");
        System.out.println(human);
        //========= toString() =============

        //========= equals() ===============
        Animal animal1 = new Animal("Lucky","Dog");
        Animal animal2 = new Animal("John","Cat");

        System.out.println(animal1 == animal2);
        animal1=animal2;
        System.out.println(animal1.equals(animal2));


        Integer i1 = 2;
        Integer i2 = 3;
        System.out.println(i1+i2);

        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.parseDouble("3.14");
        System.out.println("Integer: "+ intObj);
        System.out.println("Double: "+doubleObj);
        System.out.println("Integer is binary: "+Integer.toBinaryString(intObj));

        String text = "Java is perfect";
        System.out.println("UPPERCASE: "+text.toUpperCase());
        System.out.println("Substring: "+text.substring(0,4));

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append("Ronin"));


        BigInteger bg1 = new BigInteger("1236448547856665");
        BigInteger bg2 = new BigInteger("6433666448521122");
        System.out.println("BigInteger: "+ bg1.add(bg2));

        BigDecimal bg3 = new BigDecimal("336522545");
        BigDecimal bg4 = new BigDecimal("33144255");
        System.out.println("BigDecimal: "+bg3.multiply(bg4));


    }
}
//>>>>>>>toString()<<<<<<<<<<<<<
class Human{
    private String name ;
    private int age;
    private String email;

    public Human(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Thông tin của "+ name+ " là: "+age+" tuổi,email là: "+email;
    }
}
//=============================================================
//============equals()=============================
class Animal {
    private String name;
    private String loài;

    public Animal(String name, String loài) {
        this.name = name;
        this.loài = loài;
    }
}
//===============================================================


//method của các Wrapper, String,StringBuilder============








// BigInteger, BigDecimal class==================
