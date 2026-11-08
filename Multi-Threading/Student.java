public class Student {
    private String userName;
    private String pass;

    Student(String userName,String pass){
        this.userName = userName;
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    void getinfo(){
        System.out.println("=====Login Success====");
        System.out.println("UserName: "+userName);
        System.out.println("Pass: "+pass);
        System.out.println("======================");
    }

    
}
