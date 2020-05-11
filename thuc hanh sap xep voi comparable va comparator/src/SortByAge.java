import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student p1,Student p2){
        if(p1.getAge() > p2.getAge()) return 1;
        else return -1;
    }
}
