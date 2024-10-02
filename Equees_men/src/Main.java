public class Main {
    public static void main(String[] args) throws Exception {
        Xmen xmen = new Xmen();//Instance of the object
        while(xmen.loop()){
            xmen.audio();//Infinite soundtrack loop in a while loop
        }
    }
}