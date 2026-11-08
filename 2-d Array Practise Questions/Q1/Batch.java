public class Batch{
    int mark[][];
    String[] Student;

    Batch(String[] Student , int[][] mark){
        this.Student = Student;
        this.mark = mark;
    }

    void displayMarks(){
        System.out.println("mark are as follow \n");
        
        for(int i=0;i<Student.length;i++){
            for(int j = 0; j<mark[i].length;j++){
                System.out.println("Marks of "+Student[i]+ " In Subject "+ i +" is "+mark[i][j]);
            }
        }
    }

    void displayMarks(int index){
        System.out.println("mark are as follow \n");
        
        for(int i=0;i<Student.length;i++){
            for(int j = 0; j<mark[i].length;j++){
                System.out.println("Marks of "+Student[index]+ " In Subject "+ i +" is "+mark[index][j]);
                break;
            }
        }
    }

    void calculatetotal(int index){
        System.out.print("Total Marks = ");

        int sum = 0;

        for (int j = 0; j < mark[index].length; j++) {
            sum += mark[index][j];
        }

        System.out.println(sum);
    }

    void topper(){
        String Name = "";
        int max = 0;

        int sum = 0;

        for(int i=0;i<Student.length;i++){
            for (int j = 0; j < mark[i].length; j++) {
                sum += mark[i][j];
            }

            if (sum > max) {
                max = sum;
                Name = Student[i];
            }
        }

        System.out.println("Topper is "+Name+" With marks "+ max );
    }

    public static void main(String[] args) {

        
        String[] students1 = {
            "Rahul",
            "Aman",
            "Rohit"
        };

        int[][] marks1 = {
            {80,75},
            {70,80},
            {95,85}
        };

        Batch obj1 = new Batch(students1, marks1);

        
        String[] students2 = {
            "A",
            "B",
            "C",
            "D"
        };

        int[][] marks2 = {
            {80, 75},
            {70, 80},
            {95, 85},
            {88, 90}
        };

        Batch obj2 = new Batch(students2, marks2);

        //obj1.displayMarks();

        obj1.displayMarks(1);

        // obj1.calculatetotal(0);
        // obj1.calculatetotal(1);
       

        // obj1.topper();


        // obj2.displayMarks();

        // obj2.calculatetotal(0);
        // obj2.calculatetotal(1);
        

        // obj2.topper();
    }




    

}