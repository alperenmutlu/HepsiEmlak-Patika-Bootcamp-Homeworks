package entity;

import java.util.Random;


public class Advert {
    public int id;
    public String advertNo;
    public String title;
    public String description;

    public Advert(){

    }

    public Advert(int id, String title, String advertNo, String description) {

        this.id = id;
        this.advertNo = advertNo;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", advertNo='" + advertNo + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
