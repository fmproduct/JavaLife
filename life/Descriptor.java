package life;

import static life.Constants.*;

/**
 * Class converts the code (a constant from life.Constants)
 * into a string for a better understanding by the user.
 */
public class Descriptor {
    /**
     * @param code
     * @return String description
     */
    public static String describeConstants(int code){
        switch (code){
            case MALE: return "Мужчина";
            case FEMALE: return "Девушка";
            case MONGOLOID: return "Монголоид";
            case EUROPEAN: return "Еврапоид";
            case NEGROID: return "Неграид";
            case SECONDARY_EDUCATION:return "Среднее оброзование";
            case HIGHER_EDUCATION: return "Высшее оброзование";
            case WITHOUT_EDUCATION: return "Без оброзование";
            case CHOLERIC: return "Холерик";
            case SANGUINE: return "Сангвиник";
            case MELANCHOLIC: return "Меланхолик";
            case REDDISH:return "Рыжий";
            case BLACK: return "Черные";
            case BLOND: return "Блондин";
            case BLUE: return "Голубые";
            case GREEN: return "Зеленые";
            case BROWN: return "Коричнивые";
            default: return "unknown";
        }
    }

    /**
     * @param power
     * @return String description
     */
    public static String describePower(int power){
        if (power < 160) return "Слабый";
        else if(power >= 160 && power < 210) return "Средне";
        else return "Сильный";
    }

    /**
     * @param mind
     * @return String description
     */
    public static String describeMind(double mind){
        if (mind < 150) return "Неразумный";
        else if(mind >= 200 && mind < 500) return "Разумный";
        else return "Умный";
    }

    /**
     * @param success
     * @return String description
     */
    public static String describeSuccess(double success){
        if(success < 20) return "Неудачник";
        else if(success >= 20 && success < 60)return "Среднея успешность";
        else return "Очень успешный";
    }
}
