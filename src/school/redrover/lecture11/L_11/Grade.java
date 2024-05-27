package school.redrover.lecture11.L_11;

public class Grade {

    private final int grade;

    public Grade(int grade) {
        if(isVAlidGrade(grade)) {
            this.grade = grade;
        }
        else {
            // error
            System.out.println("WRONG GRADE, default to 3");
            this.grade = 3;
        }
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPAssingGrade() {
        return grade >= 3;
    }
    public static boolean isThisAGoodGrade(int g) {
        if(isVAlidGrade(g)) {
            return g >= 3;
        } else {
            // throw exception
            System.out.println("WRONG GRADE");
            return false;
        }
    }

    private static boolean isVAlidGrade(int grade) {
        return grade >= 1 && grade <=5;
    }



}
