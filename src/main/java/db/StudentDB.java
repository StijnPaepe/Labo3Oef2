package db;

import domain.model.Student;

import java.util.ArrayList;

public class StudentDB {
    private ArrayList<Student> studenten = new ArrayList<>();

    public StudentDB(){
        Student greetje = new Student("Jongen","Greetje", "Toegepaste Informatica", 23);
        Student kristien = new Student("Melaerts","Kristien", "Chemie", 21);
        Student elke = new Student("Steegmans","Elke", "Vroedkunde", 16);
        Student jan = new Student("Van Hee","Jan", "Verpleegkunde", 18);

        addStudent(greetje);
        addStudent(kristien);
        addStudent(elke);
        addStudent(jan);
    }

    public ArrayList<Student> getStudenten() {
        return (ArrayList<Student>) studenten.clone();
    }

    public void addStudent(Student student) {
        if(student == null){
            throw new IllegalArgumentException("Geen geldige student om toe te voegen");
        }
        studenten.add(student);
    }

    public Student vindStudent(String naam, String voornaam){
        if(Student.isValidString(naam) && Student.isValidString(voornaam)){
            for(Student student : studenten){
                if(student.getNaam().equals(naam) && student.getVoornaam().equals(voornaam)){
                    return student;
                }
            }
        }
        return null;
    }

}
