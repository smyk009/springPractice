package JavaPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employeee {
    private int id  = 0;
    
    public Employeee(int id) {
           this.setId(id);
    }

    public int getId() {
           return id;
    }

    public void setId(int id) {
           this.id = id;
    }  

    @Override
    public int hashCode(){
        final int RANDOM = 31;
        int result = 1;
        result = RANDOM + result + id;
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Employee e = (Employee) o;
        return (this.getId() == e.getId());
    }
}

public class HashTest {

	public static void main(String[] args) {
        Set<Employeee> hset = new HashSet<Employeee>();    
        Scanner s = new Scanner(System.in);
        String inputValues = s.nextLine();
        
        String[] values = inputValues.split("\\s");
        for (String v: values) {
        	hset.add(new Employeee(Integer.parseInt(v)));
        }

        System.out.println(hset.size());      
        
        s.close();
	}

}
