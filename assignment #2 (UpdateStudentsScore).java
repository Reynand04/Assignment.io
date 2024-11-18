import java.util.Scanner;
public class UpdateStudentScores {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
       	
        String[] names = {"Reynand", "Mharcel", "Crestline", "Lezeil"};
        int[] scores = {98, 97, 89, 90};
        
        System.out.println("Student Scores:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }

        System.out.print("Enter student's name to update: ");
        String updateName = sc.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(updateName)) {
                System.out.print("Enter new score for " + updateName + ": ");
                scores[i] = sc.nextInt(); 
                break; 
            }
        }

        System.out.println("Updated Student Scores:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }

        sc.close();
    }
}

