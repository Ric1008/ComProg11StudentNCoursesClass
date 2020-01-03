public class ClassPracticeCourse {
    private String subject;
    private int grade;

    public String toString(){
        return "Subject: "+subject;
    }
    ClassPracticeCourse(){
        subject="";
        grade= (int) (Math.random()*102+1);
    }

    ClassPracticeCourse(String subject, int grade){
            this.subject=subject;
            this.grade=grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
