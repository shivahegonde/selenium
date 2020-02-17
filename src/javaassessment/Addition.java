package javaassessment;

public class Addition {
    private float no1, no2;

    public Addition(float no1, float no2) {

            this.no1 = no1;
            this.no2 = no2;

    }

    public Addition() {
    }

    public float getNo1() {
        return no1;
    }

    public void setNo1(float no1) {

            this.no1 = no1;

    }


    public float getNo2() {
        return no2;
    }

    public void setNo2(float no2) {

            this.no2 = no2;

    }

    public float additionOperation() {
        return getNo1()+getNo2();
    }
}
