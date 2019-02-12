package life;

public class Human implements Homo {

    private String name;
    private String lastname;

    private int gender;
    private int temperament;

    private int education;
    private int age;
    private boolean isAlive;
    private Body body;

    private double mind = 5.0;
    private double success = 1.0;

    protected Human(){
        this.gender = Randomise.getGender();
        this.temperament = Randomise.getTemperament();
        born();
    }

    public Human(int gender,int temperament,Body body){
        this.gender = gender;
        this.temperament = temperament;
        this.body = body;
        if (body == null) throw new NullPointerException();
        born();
    }

    public Human(int gender,Body body){
        this.gender = gender;
        this.temperament = Randomise.getTemperament();
        this.body = body;
        if (body == null) throw new NullPointerException();
        born();
    }
    public Human(Body body){
        this.gender = Randomise.getGender();
        this.temperament = Randomise.getTemperament();
        this.body = body;
        if (body == null) throw new NullPointerException();
        born();
    }

    @Override
    public void born() {
        this.age = 1;
        this.isAlive = true;
        this.education = Constants.WITHOUT_EDUCATION;
    }

    @Override
    public void birthday() {
        this.age++;
        // education
        if (age > 7 && age < 17) education = Constants.SECONDARY_EDUCATION;
        else if (age > 25) education = Constants.HIGHER_EDUCATION;
        mind = mind + Randomise.getDouble()*10;
        success = success + Randomise.getDouble();
        body.progress(age);
        // death
        if (Randomise.getProbabilityDeath(age) || age > Constants.MAX_AGE) death();
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void death() {
        this.isAlive = false;
    }

    // seter
    void setName(String name) {
        this.name = name;
    }
    void setLastName(String lastname) {
        this.lastname = lastname;
    }
    void setGender(int gender) {
        this.gender = gender;
    }
    void setTemperament(int temperament) {
        this.temperament = temperament;
    }
    protected void setBody(Body body) {
        this.body = body;
    }

    // geter
    public int getGender() {
        return gender;
    }
    public int getTemperament() {
        return temperament;
    }
    public int getEducation() {
        return education;
    }
    public int getAge() {
        return age;
    }
    public Body getBody() {
        return body;
    }
    public double getMind() {
        return mind;
    }
    public double getSuccess() {
        return success;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName() {
        return name;
    }
}
