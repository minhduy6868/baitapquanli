package OOP;

public class Cho implements Dongvat1{


    @Override //ghi đè lên phuong thức cha
    public void keu() {
        System.out.println("Gâu Go Go ...");
    }

    @Override
    public void an() {
        System.out.println("Chó gặm xương ");
    }
}
