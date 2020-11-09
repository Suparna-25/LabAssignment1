import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
class Employee {
    String name;
    int salary;
    public Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
     public void setName(String name)
      {
          this.name=name;
      }
       public void setSalary(int salary)
      {
           this.salary=salary;
      }
      public String getName()
      {
          return name;
      }
      public int getSalary()
      {
          return salary;
      }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();
     
    }
}
class EmployeeInfo{
    enum SortMethod implements Comparator<Employee> {
        BYNAME{
           public int compare(Employee e1,Employee e2)
           {
               return e1.name.compareTo(e2.name);
           }
        },
        BYSALARY
        {
           public int compare(Employee e1,Employee e2)
           {
               if(e1.getSalary()==e2.getSalary())
               return e1.getName().compareTo(e2.getName());
               else  if(e1.getSalary()>e2.getSalary())
               return 1;
               else 
               return -1;        }  
        }
    };
    public List<Employee> sort(List<Employee> emps, final SortMethod method)
    {
        Collections.sort(emps,method);
        return emps;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities,String character)
    {   
        List<Employee> list=( List<Employee>)entities ;
        for(Employee e:list)
        {
           if(!e.getName().contains(character))
           {
               return false;
           }
        }
        return true;
    }
}
class Source{
    public static void main(String args[])
    {
       
    }
}