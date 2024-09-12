package day08_JavaPractice;

import java.util.ArrayList;
import java.util.Random;

public class Listing {
    static public void printHappyUsers(ArrayList<User>usersList){
        if (usersList.isEmpty()) {
            System.out.println("Kullanici listesi bos oldugundan herhangi bir sonuc görüntülenemedi. Lütfen önce kayit yapiniz.");
            return;

        }
        Random random = new Random();
        int randomindex = random.nextInt(usersList.size());

        User LuckyUser = usersList.get(randomindex);
        System.out.println("Sansli kisi sensiiiinnn!!: " + LuckyUser.name + "Senin dogum tarihin: " + LuckyUser.birthdate);

    }
}