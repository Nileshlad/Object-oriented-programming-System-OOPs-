/*
Inheritance Example
In this example,we have a parent
Class Teacher and a child
class MathTeacher.In the MathTeacher

class we need not to write the same code which is already present in the present class.
Here we have college name,designation and does()method that is common for all the teachers,thus MathTeacher
class does not need to write this code,the common data members and methods can inherited from the Teacher class.
*/

package com.inheritance;
public class Teacher {
    //variable
    String designation = "Teacher";
    String college = "Beginnersbook";

    //method
    void does() {
        System.out.println("Teaching");
    }
}

class MathTeacher extends Teacher {
    String mainSubject = "Maths";

    public static void main(String args[]) {
       //object
        MathTeacher obj = new MathTeacher();
       //call object and print
        System.out.println(obj.college);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
