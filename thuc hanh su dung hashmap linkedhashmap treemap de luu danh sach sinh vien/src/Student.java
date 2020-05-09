public class Student {
    private String name;
    private int studentId;
    private double averagePoint;
    private static int nextId=1;
    {
        this.studentId=nextId;
        nextId++;
    }
    public Student(String name,double averagePoint){
        this.name=name;
        this.averagePoint=averagePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }


    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

}
