public class level1Q2 {
    public static void main(String[] args) { 
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
              int totalMarks = maths + physics + chemistry;
              int numSubjects = 3;
          double averageMarks = (double) totalMarks / numSubjects;
            System.out.printf("Sam's average mark in PCM is %.2f", averageMarks);
    }
}
