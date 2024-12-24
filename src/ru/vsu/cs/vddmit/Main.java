package ru.vsu.cs.vddmit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty aeroastro = new Faculty("Aeronautics and Astronautics");
        Institute aero = new Institute("aeronautics", "University square, 1");
        Institute astro = new Institute("astronautics", "University square, 1");
        aeroastro.setInstitutes(new Institute[]{aero, astro});

        ResearchAssociate employee1 = new ResearchAssociate(1, "John Doe", "jodo@gmail.com", "aero");
        ResearchAssociate employee2 = new ResearchAssociate(2, "Ronald Roe", "roro.com", "aero");
        ResearchAssociate employee3 = new ResearchAssociate(3, "Wonnie Woah", "wowo@gmail.com", "astro");
        ResearchAssociate employee4 = new ResearchAssociate(4, "Eustas Eum", "eueu@gmail.com", "astro");
        aero.setEmployees(new ResearchAssociate[]{employee1, employee2});
        astro.setEmployees(new ResearchAssociate[]{employee3, employee4});

        Project project1 = new Project("Railgun",
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "12.12.2023" ),
                new SimpleDateFormat( "dd.MM.yyyy" ).parse( "08.03.2024" ), new Participation(5));
        employee1.setProjects(new Project[]{project1});

        Course course1 = new Course("Cosmic rays", 25, 60);
        Lecturer lecturer1 = new Lecturer(5, "Donnie Duh", "dodu@gmail.com", "astro");
        lecturer1.setCourses(new Course[]{course1});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
                "Sonny Soy", "soso@gmail.com", "admin");

        Institute[] institutes = aeroastro.getInstitutes();
        System.out.println("Institutes on " + aeroastro.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchAssociate[] researchEconomy = aero.getEmployees();
        System.out.println("Research Associates on " + aero.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchEconomy) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        ResearchAssociate[] researchFinance = astro.getEmployees();
        System.out.println("Research Associates on " + astro.getName() + ": \n");
        for (ResearchAssociate researchAssociate : researchFinance) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        Project[] projects = employee1.getProjects();
        System.out.println("Projects of " + employee1.getName() + ": \n");
        for (Project project : projects) {
            System.out.println(project.getName());
        }
        System.out.println();

        Course[] courses = lecturer1.getCourses();
        System.out.println("Courses of " + lecturer1.getName() + ": \n");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();
        System.out.println("Admin:");
        System.out.println();
        System.out.println(administrativeEmployee.getName());
    }
}
