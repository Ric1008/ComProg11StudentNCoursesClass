import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //----------------------------------------------------------------------------------------------------------------------------------
        Car toyota= new Car("toyota", "red", 200);

        Car honda= new Car();

        System.out.println(toyota.getCurrentSpeed());
        toyota.speedUp();
        System.out.println(toyota.getCurrentSpeed());
        toyota.slowdown();
        toyota.slowdown();
        System.out.println(toyota.getCurrentSpeed());
        ArrayList<Car>cars=new ArrayList<>();
        cars.add(toyota);
        cars.add(new Car());
        for(int i=0; i<100;i++){
            cars.add(new Car());
        }
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i).getIdNum());
        }
        for(int i=0; i<cars.size();i++){
            cars.get(i).setCurrentSpeed((int)(Math.random()*100));
            System.out.println(cars.get(i).getCurrentSpeed());
        }
        System.out.println(toyota);
        toyota.setCurrentSpeed(25);
        honda.setCurrentSpeed(20);
        System.out.println(honda.equals(toyota));

        Employee Howard=new Employee();
        Employee Jody= new Employee("Jallico ", "Harvey",1360 );
        System.out.println(Howard.getName());
        System.out.println(Jody.getName());
        System.out.println(Howard.getId());
        System.out.println(Jody.getId());
        System.out.println(Howard.getSalary());
        System.out.println(Jody.getSalary());
        System.out.println(Howard.getYearSalary());
        System.out.println(Jody.getYearSalary());
        System.out.println(Howard);
        System.out.println(Jody);
        Howard.raisesalary(30);
        Jody.raisesalary(200);
        System.out.println(Howard.getSalary());
        System.out.println(Howard.getYearSalary());
        System.out.println(Jody.getSalary());
        System.out.println(Jody.getYearSalary());
//------------------------------------------------------------------------------------------------------------------------------




        System.out.println("k");
        System.out.println((int)(Math.random()*101));
        ClassPracticeStudent1 student = new ClassPracticeStudent1();
        int i=3;
        student.setStudeCorsCors("hope");

        System.out.println(student.studentCors);
        ArrayList<ClassPracticeCourse>courseAgain=new ArrayList<>();
        for(int a=0; a<100;a++){
            courseAgain.add(new ClassPracticeCourse());
        }
        courseAgain.get(3).setSubject("jump");
        System.out.println(courseAgain.get(3).getSubject());
        System.out.println();
        ClassPracticeStudent1 Marcus=new ClassPracticeStudent1();
        Marcus.studentCors.get(3).setSubject("jump");
        System.out.println(Marcus.studentCors);
        System.out.println(Marcus.studentCors.get(4).getSubject());
        Marcus.setCourseThing(5,"lake");
        System.out.println(Marcus.studentCors);
        int totegrds=0;
        int avg=0;
        for(int e=0; e < 9; e++){
            totegrds+=courseAgain.get(e).getGrade();
            System.out.println(totegrds);
            avg=totegrds/8;
            System.out.println(avg);
        }
        System.out.println(totegrds);
        System.out.println(avg
        );
        System.out.println(Marcus.averagesMan());
        System.out.println(Marcus.studentCors);
        Marcus.allCourses();

    }
}
