import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator; 
  
class Student { 
  
    String Name; 
    int Age; 
    public Student(String Name, Integer Age) { 
        this.Name = Name; 
        this.Age = Age; 
    } 
  
    public String getName() { 
        return Name; 
    } 
  
    public void setName(String Name) { 
        this.Name = Name; 
    } 
  
    public Integer getAge() { 
        return Age; 
    } 
  
    public void setAge(Integer Age) { 
        this.Age = Age; 
    } 
   
    @Override
    public String toString() { 
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}'; 
    } 
}
  
    static class SortingComparator implements Comparator<Student> { 
  
        @Override
        public int compare(Student c1, Student c2) { 
 
            int NameCompare = c1.getName().compareTo(c2.getName()); 
            int AgeCompare = c1.getAge().compareTo(c2.getAge()); 
  
         
            if (NameCompare == 0) { 
                return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
            } else { 
                return NameCompare; 
            } 
        } 
    } 

public class SortingStudents{
  
    public static void main(String[] args) { 
  
        List<Student> al = new ArrayList<>(); 
        Student obj1 = new Student("Ajay", 27); 
        Student obj2 = new Student("Sneha", 23); 
        Student obj3 = new Student("Simran", 37); 
        Student obj4 = new Student("Ajay", 22); 
        Student obj5 = new Student("Ajay", 29); 
        Student obj6 = new Student("Sneha", 22); 
  
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6); 
  
        Iterator<Student> custIterator = al.iterator(); 
  
        System.out.println("Before Sorting:\n"); 
        while (stIterator.hasNext()) { 
            System.out.println(stIterator.next()); 
        } 

        Collections.sort(al, new SortingComparator()); 
  
        System.out.println("\nAfter Sorting:\n"); 
        for (Student s : al) { 
            System.out.println(s); 
        } 
    } 
} 