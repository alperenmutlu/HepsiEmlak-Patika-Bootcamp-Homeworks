package dao;

import entity.Advert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdvertRepository extends JdbcConnectionRepository{

    private static final String INSERT_ADVERT = "INSERT INTO ADVERT (ID, ADVERTNO, TITLE, DESCRIPTION) VALUES(?,?,?,?)";
    private static final String SELECT_ALL_ADVERT = "SELECT * FROM ADVERT";
    private static final String FIND_ADVERT = "SELECT * FROM ADVERT WHERE id = ?";
    private static final String DELETE_ADVERT = "DELETE * FROM ADVERT WHERE id = ?";

    public void save(Advert advert){

        Connection connection = connect();

        if(connection != null){
        PreparedStatement preparedStatement = null;

        try{
            preparedStatement = connection.prepareStatement(INSERT_ADVERT);
            preparedStatement.setInt(1,advert.id);
            preparedStatement.setString(2, advert.advertNo);
            preparedStatement.setString(3,advert.title);
            preparedStatement.setString(4,advert.description);

            int executeUpdate = preparedStatement.executeUpdate();

            System.out.println("result : " + executeUpdate);


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
           try{
               connection.close();
           }catch (SQLException e){
               e.printStackTrace();
           }
        }
        }
        else{
            System.out.println("Connection oluşturulamadı");
        }

    }

    public List<Advert> findAll(){

        List<Advert> advertList = new ArrayList<>();
        Connection connection = connect();
        PreparedStatement preparedStatement = null;


            try{
                preparedStatement = connection.prepareStatement(SELECT_ALL_ADVERT);

                ResultSet resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    int id = resultSet.getInt("id");
                    String advertNo = resultSet.getString("advertNo");
                    String title = resultSet.getString("title");
                    String description = resultSet.getString("description");

                    advertList.add(prepareAdvert(id,advertNo,title,description));

                }

            }catch (SQLException e){
                e.printStackTrace();
            }

            return advertList;


    }

    private Advert prepareAdvert(int id,String advertNo,String title, String description) {
        Advert advert = new Advert();
        advert.id = id;
        advert.advertNo = advertNo;
        advert.title = title;
        advert.description = description;
        return advert;
    }

    public Advert findOne(int id){

        Advert advert = null;
        Connection connection = connect();

        PreparedStatement preparedStatement = null;

        try{
            preparedStatement = connection.prepareStatement(FIND_ADVERT);
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                int advertId = resultSet.getInt("id");
                String advertNo = resultSet.getString("advertNo");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                advert = prepareAdvert(advertId,advertNo,title,description);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        return advert;

    }

    public void delete(int id){

        Connection connection = connect();
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(DELETE_ADVERT);
            preparedStatement.setInt(1,id);
            int executeUpdate = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
