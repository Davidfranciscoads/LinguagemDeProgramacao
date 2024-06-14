import java.util.Random;

public class Square extends Rectangle {
    private int size;
    private Random r = new Random();

    public Square(int size){

       // ele deu 2 size porque esta verificando a assinatura
        super(size,size);
        this.size=size;
    }

    public  Square(){
        super();
        super.setHeight(super.getWidth());
        this.size=super.getWidth();


    }

}
