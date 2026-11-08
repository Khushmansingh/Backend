public class Threater {

 public static void main(String[] args) {
    
    Screen s1 = new Screen(50);
    //Screen s2 = new Screen(40);

    MyScreenThread st1 = new MyScreenThread(s1);
    MyScreenThread st2 = new MyScreenThread(s1);

    st1.start();
    st2.start();
 }   

}
