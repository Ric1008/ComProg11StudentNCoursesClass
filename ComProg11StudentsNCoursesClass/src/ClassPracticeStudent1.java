import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ClassPracticeStudent1 {
    private String name;
    private int id;
    static int idNum=1;
    private int numOCors;
    ArrayList<ClassPracticeCourse>studentCors=new ArrayList<>();

    public String toString(){
        return "Student ID: "+id+" First Name: ";
    }
    ClassPracticeStudent1(){
        id=idNum;
        idNum++;
        name=" Jade ";

        for(int i=0; i<8;i++){
            studentCors.add(new ClassPracticeCourse());
        }
    }

    ClassPracticeStudent1(String name, int numOCors){
        id=idNum;
        idNum++;
        this.name=name;
        for(int i=0; i<numOCors;i++){
            studentCors.add(new ClassPracticeCourse());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ClassPracticeCourse> getStudeCors(String lordy) {
        return studentCors;
    }

    public void setStudeCors(ArrayList<ClassPracticeCourse> studeCors) {
        this.studentCors = studeCors;
    }

public void setStudeCorsCors(String subject){
    setSubject(subject);
}

    private void setSubject(String subject) {

    }

    public void setCourseThing(int position, String newsSubject){
        studentCors.get(position).setSubject(newsSubject);
    }
public String averagesMan(){
    int totegrades=0;
    int avgr=0;
    for(int e=0; e < 8; e++){
        totegrades+=studentCors.get(e).getGrade();
        System.out.println(totegrades);
        avgr=totegrades/8;
        System.out.println(avgr);
    }
    return "Average grades: "+avgr+"%";
}
public void allCourses(){

    System.out.println(studentCors);
}

}
