import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(8.70);
        individualMarksListLisa.add(7.00);
        System.out.println("Media di Lisa: " + Student.getAverageMark(individualMarksListLisa));

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(9);
        projectMarksListJeremy.add(7);
        System.out.println("Media di Mark: " + Student.getAverageMark(projectMarksListJeremy));

        Student studentLisa = new Student("Lisa", "Gherardini", Student.getAverageMark(individualMarksListLisa));
        Student studentMark = new Student("Mark", "Twain", Student.getAverageMark(projectMarksListJeremy));
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(studentLisa);
        listOfStudent.add(studentMark);
        System.out.println("Usando toString: " + studentLisa.toString());
        System.out.println("Usando toString: " + studentMark.toString());
        System.out.println("Usando get: " + listOfStudent.get(0));
        System.out.println("Usando get: " + listOfStudent.get(1));


    }
}
