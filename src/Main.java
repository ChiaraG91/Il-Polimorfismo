public class Main {

    public static void main(String[] args){

        Forma forma = new Forma("Quadrato");
        Rettangolo rettangolo = new Rettangolo("Rettangolo",3.5, 6);
        Triangolo triangolo = new Triangolo("Triangolo",5.0,7);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();


    }
}