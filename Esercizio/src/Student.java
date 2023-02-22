import java.util.ArrayList;
import java.util.List;

public class Student {
    public String studentName;
    public String studentSurname;
    public double marksAverage;

    public Student (String studentName, String studentSurname, double marksAverage){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }
    List<?> listOfMarks = new ArrayList<>(3);

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double a = listOfMarks.get(0).doubleValue();
        double b = listOfMarks.get(1).doubleValue();
        double sum = a + b;
        double media = sum/2;
        return media;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}
