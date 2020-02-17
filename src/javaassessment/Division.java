package javaassessment;

public class Division {
    private float no1, no2;

    public Division(float no1, float no2) {

        if (no1 == 0 || no2 == 0) {
            System.out.println("Both numbers should be non zero..");
        } else {
            this.no1 = no1;
            this.no2 = no2;
        }
    }

    public Division() {
    }

    public float getNo1() {
        return no1;
    }

    public void setNo1(float no1) {
        if (no1 == 0) {
            System.out.println("Zero not allowed");
            System.out.println("Terminating.....");

        } else {
            this.no1 = no1;
        }
    }

    public float getNo2() {
        return no2;
    }

    public void setNo2(float no2) {
        if (no2 == 0) {
            System.out.println("Zero not allowed");
            System.out.println("Terminating.....");

        } else {
            this.no2 = no2;
        }
    }

    public float divisionOperation() {
        return getNo1()/getNo2();
    }
}
