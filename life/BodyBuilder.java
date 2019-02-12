package life;

/**
 * life.Body object builder
 * Templates Builder
 */
public class BodyBuilder implements Builder{

    /**
     * body references
     */
    private Body instance;

    @Override
    public Body build() {
        return instance;
    }

    public BodyBuilder(){
        instance = new Body();
    }

    // seter
    public BodyBuilder setHeight(int height) {
        instance.setHeight(height);
        return this;
    }
    public BodyBuilder setWeight(int weight) {
        instance.setWeight(weight);
        return this;
    }
    public BodyBuilder setPower(int power) {
        instance.setPower(power);
        return this;
    }
    public BodyBuilder setHair(int hair) {
        instance.setHair(hair);
        return this;
    }
    public BodyBuilder setRace(int race) {
        instance.setRace(race);
        return this;
    }
    public BodyBuilder setEye_color(int eye_color) {
        instance.setEye_color(eye_color);
        return this;
    }
}
