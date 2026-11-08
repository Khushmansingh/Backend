public class MyScreenThread extends Thread {
    Screen sc;

    MyScreenThread(Screen sc){
        this.sc = sc;
    }

    synchronized public void run(){
        for(int i=0;i<10;i++){
            sc.bookMyseat();
            System.out.print(this.getName()+" "+sc.getSeats()+ "\n");
        }
    }
}
