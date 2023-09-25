package PbJavaJuneLesson1;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"The architect {името на архитекта} will need {необходими часове}
        // hours to complete {брой на проектите} project/s."
        String name =  scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = projects * 3;
        System.out.println("The architect " + name + " will need " + time + " hours to complete " + projects + " project/s.");
    }
}
