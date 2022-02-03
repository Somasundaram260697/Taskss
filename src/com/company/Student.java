package com.company;

public class Student {
    String Student_name;
    int  Student_Rollno;
    int Student_totalmarks;
    String Student_Dept;
    String Student_doj;
    String Student_doo;



    public Student(){

    }



    Student(String str) {
        String[] split = str.split(",");
       this.Student_name = split[0].trim();
//       this.Student_Rollno = Integer.parseInt(split[1].trim());
        this.Student_totalmarks = Integer.parseInt(split[3].trim());
        this.Student_Dept = (split[2].trim());
        this.Student_doj = split[4].trim();
        this.Student_doo = split[5].trim();
    }


    @Override
    public String toString() {
        return "Student{" +
                "Student_name='" + Student_name + '\'' +
                ", Student_Rollno='" + Student_Rollno + '\'' +
                ", Student_totalmarks='" + Student_totalmarks + '\'' +
                ", Student_Dept='" + Student_Dept + '\'' +
                ", Student_doj='" + Student_doj + '\'' +
                ", Student_doo='" + Student_doo + '\'' +
                '}';
    }
    void header()
    {

        String header = String.format("" +
                "NAME\t\t" +
                "ROLL.NO\t\t" +
                "TOTALMARKS\t" +
                "DEPARTMENT\t\t" +
                "Date Of joining\t\t" +
                "Date Of Out");
        System.out.println(header);
    }
    void show()
    {
        String data = String.format("" +
                        "%s\t" +
                        "%s\t" +
                        "%s\t" +
                        "%s\t" +
                        "%s\t" +
                        "%s",
                Student_name,
                Student_Rollno,
                Student_Dept,
                Student_totalmarks,
                Student_doj,
                Student_doo);
        System.out.println(data);
    }



}


