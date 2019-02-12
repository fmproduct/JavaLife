package life;

/**
 * A class which includes all the parameters of
 * the appearance of the person (the human body)
 */
public class Body {
    private double height;
    private double weight;
    private int power;

    private int hair = Constants.BLACK;
    private int race = Constants.EUROPEAN;
    private int eye_color = Constants.BROWN;

    /**
     * @param age
     */
    public void progress(int age){
        if (age < 25) height = height + Randomise.getDouble()*10;

        if (Randomise.getDigit() > 5 && weight > 60) weight = weight - Randomise.getDigit();
        else weight = weight + Randomise.getDigit();

        power = power + (int) ((height + weight) / 50);
    }

    /**
     * protected constructor
     */
    protected Body(){
    }

    // seter
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public void setEye_color(int eye_color) {
        this.eye_color = eye_color;
    }

    // geter
    public int getHeight() {
        return (int) height;
    }

    public int getWeight() {
        return (int) weight;
    }

    public int getPower() {
        return power;
    }

    public int getHair() {
        return hair;
    }

    public int getRace() {
        return race;
    }

    public int getEye_color() {
        return eye_color;
    }
}
