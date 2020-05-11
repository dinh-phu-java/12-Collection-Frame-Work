import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student myStudent1= new Student("Phu",9.5);
        Student myStudent2 =new Student("Kante",5.5);
        Student myStudent3= new Student("Ozil",8.7);
        Student myStudent4= new Student("KaKa",7.8);
        HashMap<String,Double> myStudentList= new HashMap<>();
        myStudentList.put(myStudent3.getName(),myStudent3.getAveragePoint());
        myStudentList.put(myStudent2.getName(),myStudent2.getAveragePoint());
        myStudentList.put(myStudent1.getName(),myStudent1.getAveragePoint());
        myStudentList.put(myStudent4.getName(),myStudent4.getAveragePoint());
        System.out.println("Here is my Hash Map:");
        myStudentList.forEach( (key, value) -> {
            System.out.print("Student Name: "+key +" have average point is: "+value);
            System.out.println();
        });

        TreeMap<String,Double> myTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o2.compareTo(o1) >0) return 1;
                else return -1;
            }
    });

        myTreeMap.putAll(myStudentList);
        System.out.println("Here is my TreeMap");

        myTreeMap.forEach((key,value) ->{
            System.out.print("Student Name: "+key +" have average point is: "+value);
            System.out.println();
        });
    }
}
