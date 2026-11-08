class Subject{
    String subjectName;
    int subjectId;
    int marks;

    Subject(String subjectName,int subjectId,int marks){
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.marks = marks;
    }
}

class Student{
    String Name;
    Subject[] subjects;

    Student(String Name,Subject[] subjects){
        this.Name = Name;
        this.subjects = subjects;
    }
}

class Batch{

    String batchName;
    int batchId;
    String mentorName;
    Student[] students;


    Batch(String batchName,int batchId,String mentorName,Student[] students){
        this.batchName = batchName;
        this.batchId = batchId;
        this.mentorName = mentorName;
        this.students = students;
    }

    void batchinfo(){

    }


}