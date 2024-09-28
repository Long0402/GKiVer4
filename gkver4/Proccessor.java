package gkver4;

import java.util.Scanner;

public class Proccessor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1.Add new student"
                    + "\n2.Add new teacher"
                    + "\n3.Update person by id"
                    + "\n4.Delete person by id"
                    + "\n5.Display all students and teachers"
                    + "\n6.Find the student with the highest GPA"
                    + "\n7.Find teachers by department"
                    + "\n8.Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("*****Add new student*****");
                    Student newStudent = new Student();
                    newStudent.addPerson();
                    personList.addPerson(newStudent);
                    break;
                case 2:
                    System.out.println("*****Add new teacher*****");
                    Teacher newTeacher = new Teacher();
                    newTeacher.addPerson();
                    personList.addPerson(newTeacher);
                    break;
                case 3:
                    System.out.println("*****Update person by id*****");
                    System.out.print("Enter ID To Update: ");
                    String idUpdate = sc.nextLine();
                    personList.updatePerson(idUpdate);
                    break;
                case 4:
                    System.out.println("*****Delete person by id*****");
                    System.out.print("Enter ID To Delete: ");
                    String idDelete = sc.nextLine();
                    personList.deletePersonById(idDelete);
                    break;
                case 5:
                    System.out.println("*****Display all students and teachers*****");
                    personList.dispkayEveryone();
                    break;
                case 6:
                    System.out.println("*****Find the student with the highest GPA*****");
                    Student topStudent = personList.findTopStudent();
                    topStudent.displayInfo();
                    break;
                case 7:
                    System.out.println("*****Find the student with the highest GPA*****");
                    System.out.print("Enter Department To Find Teacher: ");
                    String department = sc.nextLine();
                    Teacher findTeacher = personList.findTeacherByDepartment(department);
                    if(findTeacher!=null){
                        findTeacher.displayInfo();
                    }else System.out.println("No teacher found!");
                    break;
                case 8:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice! Pleasr choose again!");
            }
        }
    }

}
