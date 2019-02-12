package life;

/**
 * life.Human object builder
 * Templates Builder
 */
public class HumanBuilder implements Builder {

    /**
     * human references
     */
    private Human instance;

    @Override
    public Human build() {
        return instance;
    }

    // seter
    public HumanBuilder(){
        instance = new Human();
    }
    public HumanBuilder setName(String name) {
        instance.setName(name);
        return this;
    }
    public HumanBuilder setLastName(String lastname) {
        instance.setLastName(lastname);
        return this;
    }
    public HumanBuilder setGender(int gender) {
        instance.setGender(gender);
        return this;
    }
    public HumanBuilder setTemperament(int temperament) {
        instance.setTemperament(temperament);
        return this;
    }
    public HumanBuilder setBody(Body body){
        instance.setBody(body);
        return this;
    }
}
