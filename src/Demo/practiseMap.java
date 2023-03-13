package Demo;

import java.util.HashMap;

public class practiseMap {
    public static void main(String[] args) {
        HashMap<String,Integer> courses = new HashMap<>();
        courses.put("core java", 50000);
        courses.put("python", 40000);
        courses.put("angular",80000);
        System.out.println("courses = " + courses);

       courses.forEach((e1,e2)->{
           System.out.println(e1+"=>" +e2);
       });



    }
}
