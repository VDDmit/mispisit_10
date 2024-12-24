package ru.vsu.cs.vddmit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        Faculty engineering = new Faculty("Engineering Sciences");
        Institute robotics = new Institute("Robotics Research Center", "Tech Avenue, 42");
        Institute aiLab = new Institute("Artificial Intelligence Lab", "Tech Avenue, 45");
        engineering.setInstitutes(new Institute[]{robotics, aiLab});

        ResearchAssociate researcher1 = new ResearchAssociate(1, "Alice Smith", "asmith@gmail.com", "robotics");
        ResearchAssociate researcher2 = new ResearchAssociate(2, "Bob Johnson", "bobj@gmail.com", "robotics");
        ResearchAssociate researcher3 = new ResearchAssociate(3, "Clara Brown", "clara@gmail.com", "ai");
        ResearchAssociate researcher4 = new ResearchAssociate(4, "David Lee", "dlee@gmail.com", "ai");
        robotics.setEmployees(new ResearchAssociate[]{researcher1, researcher2});
        aiLab.setEmployees(new ResearchAssociate[]{researcher3, researcher4});

        Project project1 = new Project("Autonomous Drones",
                new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2024"),
                new SimpleDateFormat("dd.MM.yyyy").parse("30.06.2024"), new Participation(8));
        researcher1.setProjects(new Project[]{project1});

        Course course1 = new Course("Neural Networks", 40, 75);
        Lecturer lecturer1 = new Lecturer(5, "Eleanor Green", "egreen@gmail.com", "ai");
        lecturer1.setCourses(new Course[]{course1});

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
                "Frank Moore", "fmoore@gmail.com", "admin");

        Institute[] institutes = engineering.getInstitutes();
        System.out.println("Institutes in " + engineering.getName() + ": \n");
        for (Institute institute : institutes) {
            System.out.println(institute.getName());
        }
        System.out.println();

        ResearchAssociate[] roboticsResearchers = robotics.getEmployees();
        System.out.println("Research Associates in " + robotics.getName() + ": \n");
        for (ResearchAssociate researchAssociate : roboticsResearchers) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        ResearchAssociate[] aiResearchers = aiLab.getEmployees();
        System.out.println("Research Associates in " + aiLab.getName() + ": \n");
        for (ResearchAssociate researchAssociate : aiResearchers) {
            System.out.println(researchAssociate.getName());
        }
        System.out.println();

        Project[] projects = researcher1.getProjects();
        System.out.println("Projects of " + researcher1.getName() + ": \n");
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

        System.out.println("Administrative Staff:");
        System.out.println();
        System.out.println(administrativeEmployee.getName());
    }
}