import java.util.HashSet;

class Student {
    private String name;
    private Integer age;
    private Integer yearOfPassing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int releaseYr) {
        this.yearOfPassing = releaseYr;
    }
}

/**
 * Example class demonstrating the set behavior We will create 3 objects and add
 * into the Set Later will create a new object resembling same as one of the 3
 * objects created and added into the set
 */
public class HashCodeExample {
    public static void main(String[] args) {
        Student m = new Student();
        m.setName("RAYMONDS");
        m.setAge(20);
        m.setYearOfPassing(2011);
        Student m1 = new Student();
        m1.setName("ALLEN");
        m1.setAge(19);
        m1.setYearOfPassing(2010);
        Student m2 = new Student();
        m2.setName("MAGGY");
        m2.setAge(18);
        m2.setYearOfPassing(2012);

        HashSet<Student> set = new HashSet<Student>();
        set.add(m);
        set.add(m1);
        set.add(m2);
        // printing all the elements of Set
        System.out.println("Before Adding ALLEN for second time : ");
        for (Student mm : set) {
            System.out.println(mm.getName() + " " + mm.getAge());
        }
        // creating a student similar to m1 (name:ALLEN, age:19, yearOfPassing:2010)
        Student m3 = new Student();
        m3.setName("ALLEN");
        m3.setAge(19);
        m3.setYearOfPassing(2010);
        // this Student will be added as hashCode() and equals() are not implemented
        set.add(m3);
        // 2 students with same details (ALLEN 19 will be noticed twice)
        System.out.println("After Adding ALLEN for second time: ");
        for (Student mm : set) {
            System.out.println(mm.getName() + " " + mm.getAge());
        }
    }
}