import dao.AdvertRepository;
import dao.UserRepository;
import entity.Advert;
import entity.User;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        AdvertRepository advertRepository = new AdvertRepository();

        //advertRepository.save(prepareAdvert(1,UUID.randomUUID().toString(),"3+1","ACİL SATILIK"));
       // advertRepository.save(prepareAdvert(2,UUID.randomUUID().toString(),"2+1","DENİZ MANZARALI"));
        //advertRepository.save(prepareAdvert(3,UUID.randomUUID().toString(),"1+1","GÜZEL EV"));
       // advertRepository.save(prepareAdvert(4,UUID.randomUUID().toString(),"1+1","GÜZEL EV"));
       // advertRepository.save(prepareAdvert(5,UUID.randomUUID().toString(),"1+0","NIIIIIICE"));
       // advertRepository.save(prepareAdvert(6,UUID.randomUUID().toString(),"1+0","ALL GOOD"));

        //userRepository.save(prepareUser(1,"alperen"));
        //userRepository.save(prepareUser(2,"ahmet"));
        //userRepository.save(prepareUser(3,"mehmet"));
        //userRepository.save(prepareUser(4,"hasan"));
       // userRepository.save(prepareUser(5,"hüseyin"));


        System.out.println("--------ALL USERS---------");
        List<User> users = userRepository.findAll();
        users.stream().forEach(user -> System.out.println(user.toString()));

        System.out.println("---FIND USER-----");

        User foundUser = userRepository.findOne(1);
        System.out.println(foundUser.toString());

        System.out.println("------ALL ADVERTS---------");
        List<Advert> adverts = advertRepository.findAll();
        adverts.stream().forEach(advert -> System.out.println(advert.toString()));


        System.out.println("-------FIND ADVERT-------");

        Advert foundAdvert = advertRepository.findOne(3);
        System.out.println(foundAdvert.toString());

        System.out.println("-------DElETED ADVERT------");
       // advertRepository.delete(2);



        System.out.println(advertRepository.findAll());
    }

    private static Advert prepareAdvert(int id,String advertNo, String title, String description) {
        Advert advert = new Advert();
        advert.id = id;
        advert.advertNo = advertNo;
        advert.title = title;
        advert.description = description;
        return advert;
    }

    private static User prepareUser(int id, String name){
        User user = new User();
        user.id = id;
        user.name = name;
        user.email = "alperen@alperen.com";
        user.bio = "sa";
        return user;
    }

    private static Advert updateAdvert(int id, String title, String description){
        Advert advert = new Advert();
        advert.title = title;
        advert.description = description;
        return advert;
    }
}
