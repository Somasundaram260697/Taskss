package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {

        BufferedReader Buffer = new BufferedReader(new FileReader("C:\\Users\\Dell\\OneDrive - Platform 3 Solutions LLC\\Documents\\students.csv"));
        List<Student> array = new ArrayList<Student>();
        String line = Buffer.readLine();
        while(line != null) {
            array.add(new Student(line));
            System.out.println(line);
            line = Buffer.readLine();
        }Buffer.close();

        Student data =new Student();
        data.header();
        for (Student studentdetails:array )

        {
            studentdetails.show();
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = Integer.parseInt(s.nextLine());
        data.header();
        for (Student studentdetail :array) {
            if (studentdetail.Student_totalmarks > marks ) {
                studentdetail.show();
            }
            System.out.println("Enter department:");
            String Department  = s.nextLine();
            data.header();
            for (Student student : array) {
                if (student.Student_Dept.equals(Department))
                {
                    studentdetail.show();
                }
            }
        }
    }
}


