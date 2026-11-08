public class Student {
    int[][] marks = new int[3][4];


    Student(int[][] marks){
        this.marks=marks;
    }

    void displayMarks(){

        for(int i=0;i<marks.length;i++){
            System.out.print("Student " + (i + 1) + ": ");
            for (int j=0;j<marks[i].length;j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    void calculateTotal(int studentIndex) {
        int sum = 0;

        for (int j = 0; j < marks[studentIndex].length; j++) {
            sum += marks[studentIndex][j];
        }

        System.out.println("Student " + (studentIndex + 1) + " Total: " + sum);
    }

    void calculateAverage(int studentIndex) {
        int sum = 0;

        for (int j = 0; j < marks[studentIndex].length; j++) {
            sum += marks[studentIndex][j];
        }

        double avg = (double) sum / marks[studentIndex].length;

        System.out.println("Student " + (studentIndex + 1) + " Avg marks: " + avg);
    }

    void findTopper() {
        int topperrank = 0;
        int topmarks = 0;

        for (int i = 0; i < marks.length; i++) {
            int sum = 0;

            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }

            if (sum > topmarks) {
                topperrank = i;
                topmarks = sum;
            }
        }

        System.out.println("Topper: Student " + (topperrank + 1));
        System.out.println("Highest Marks: " + topmarks);
    }

    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90, 85},
            {70, 88, 76, 80},
            {92, 90, 85, 95}
        };

        Student students = new Student(marks);
        students.displayMarks();
        System.out.println();
        students.calculateTotal(0);
        students.calculateTotal(1);
        students.calculateTotal (2);
        System.out.println();
        students.calculateAverage(0);
        students.calculateAverage(1);
        students.calculateAverage(2);
        System.out.println();
        students.findTopper();
    }
    
}
