package fmproducts;

import life.Body;
import life.BodyBuilder;
import life.Constants;
import life.Descriptor;
import life.Human;
import life.HumanBuilder;
/**
 *
 * @author Fariz Mamedow
 */
public class Life {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Body body = new BodyBuilder()
              .setHeight(50)
                .setEye_color(Constants.BROWN)
                .setRace(Constants.MONGOLOID)
                .setHair(Constants.BLACK)
                .setWeight(2)
                .setPower(3)
                .build();

            Human human = new HumanBuilder().setBody(body).build();

            while (human.isAlive()){

                writeln("Возраст:   "+human.getAge());
                writeln("Оброзование:   "+Descriptor.describeConstants(human.getEducation()));
                writeln("Гендер:   "+Descriptor.describeConstants(human.getGender()));
                writeln("Темперамент:   "+Descriptor.describeConstants(human.getTemperament()));
                writeln("Ум:   "+Descriptor.describeMind(human.getMind()));
                writeln("Успешность:   "+Descriptor.describeSuccess(human.getSuccess()));
                writeln("Сила:   "+Descriptor.describePower(human.getBody().getPower()));
                writeln("Рост:   "+human.getBody().getHeight() + "sm");
                writeln("Вес:   "+human.getBody().getWeight() + "kg");
                writeln("Цвет глаз:   "+ Descriptor.describeConstants(human.getBody().getEye_color()));
                writeln("Цвет волос:   "+ Descriptor.describeConstants(human.getBody().getHair()));
                writeln("раса:   "+ Descriptor.describeConstants(human.getBody().getRace()));
                writeln("");
                writeln("");
                writeln("");
                human.birthday();
        }
    

    }
      private static void writeln(Object o){
        System.out.println(o);
    }
    
}
