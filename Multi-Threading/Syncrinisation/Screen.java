public class Screen{
    private int seats;
    Screen(int seats){
        this.seats=seats;
    }

    public int getSeats(){
        return seats;
    }

    public void setSeat(int seats){
        this.seats = seats;
    }

    void bookMyseat(){
        if(seats == 0){
            System.out.println("No Seats Available.");
            return ;
        }

        seats = seats - 1;
    }
}