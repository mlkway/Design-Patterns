package Builder;

import java.util.Locale;

public class TestBuilder {

    public static void main(String[] args) {

        User temo  = new User.UserBuilder("Temo", "khatiashvili")
                .build();

        User nika = new User.UserBuilder("Nika", "Mgaloblishvili")
                .age(20)
                .phone("213123132")
                .address("Varketili")
                .build();


        System.out.println(temo + "" + nika);
    }



}

