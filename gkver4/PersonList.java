package gkver4;

import java.util.ArrayList;

public class PersonList {

    private static ArrayList<Person> personList = new ArrayList<>();

    public PersonList() {
    }

    public static ArrayList<Person> getPersonList() {
        return personList;
    }

    public static void setPersonList(ArrayList<Person> personList) {
        PersonList.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person instanceof Student && person.getId().equals(id)) {
                Student student = (Student) person;
                student.updatePerson(id);
            } else if (person instanceof Teacher && person.getId().equals(id)) {
                Teacher teacher = (Teacher) person;
                teacher.updatePerson(id);
            }
            System.out.println("Update successfully!");
            return ;
        }
        System.out.println("Not find");
    }

    public void deletePersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                System.out.println("Delete Successfully!");
                return;
            }
        }
        System.out.println("Not found!");

    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void dispkayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
