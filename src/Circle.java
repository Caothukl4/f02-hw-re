public class Circle {
    private float r ;
    final float pi = 3.14f;

    public Circle(float r) {
        this.r = r;
    }
    public void Chuvi(){
        System.out.println("Chuvi: " + (r*2*pi));
    }
    public void Dientich(){
        System.out.println("Dientich: "+ (r*r*pi));
    }
}
