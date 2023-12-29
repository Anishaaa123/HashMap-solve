package AnudipProject;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) { 
        
        String[] sid = {"s1", "s2", "s3", "s4"}; //array of sid
        int[] smarks = {90, 85, 95, 88};  //array of marks

        
        HashMap<String, Integer> studentMap = new HashMap<>();

            for (int i = 0; i < sid.length; i++) { //iteration through array
            String studentId = sid[i];
            int studentMark = smarks[i];

            studentMap.put(studentId, studentMark); //storing the information
        }

        System.out.println("Student Information:"); //print the information
        for (String id : studentMap.keySet()) {
            int mark = studentMap.get(id);
            System.out.println("Sid: " + id + ", Smarks: " + mark);
        }
        System.out.println("Size of the Data: " + studentMap.size());
    }
}