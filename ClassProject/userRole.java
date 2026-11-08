enum userRole{
    ONE("Student"),
    TWO("Recruiter"),
    THREE("Admin");


    private final String value;
    userRole(String val){
        this.value = val;
    }

    public String getValue() {
        return this.value;
    }
}