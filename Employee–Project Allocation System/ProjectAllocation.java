import java.util.ArrayList;

public class ProjectAllocation {
    int[][] hours;
    int m;
    int n;
        

    ProjectAllocation(int[][] hours) {
        this.hours = hours;
        this.m = hours.length;
        this.n = hours[0].length;
    }

    void displayEmployeeReport(){

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(hours[i][j] + " ");
            }
        }
    }

    void calculateEmployeeTotal(){
        
        for (int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum+=hours[i][j];
            }
            System.out.println("Employee" + i + "Total: "+sum);
        }
    }

    void generateProjectReport(){

        int[][] res = new int[n][m];

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = hours[j][i];
            }
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }

    void calculateProjectTotal(){

        for (int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+=hours[j][i];
            }
            System.out.println("Project" + i + "Total: "+sum);
        }

    }

    void findMostWorkedProject(){

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+=hours[j][i];
            }
            arr.add(sum);
        }

        int max = 0;
        int index = 0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max = arr.get(i);
                index = i;
            }
        }

        System.out.println("Most Worked Project: "+ "P"+index + " with " + max + " Hours");

    }

    public static void main(String[] args) {
        int[][] hours = {
            {8, 6, 4},
            {7, 9, 5},
            {6, 8, 10}
        };

        ProjectAllocation allocation = new ProjectAllocation(hours);

        System.out.println("Employee Report:");
        allocation.displayEmployeeReport();

        System.out.println("\nEmployee Totals:");
        allocation.calculateEmployeeTotal();

        System.out.println("\nProject Totals:");
        allocation.calculateProjectTotal();

        System.out.println();
        allocation.findMostWorkedProject();

        System.out.println();

        allocation.generateProjectReport();
    }

}