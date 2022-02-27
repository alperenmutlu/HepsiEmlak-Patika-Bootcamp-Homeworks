package dao;

import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository  extends JdbcConnectionRepository{
    private static final String INSERT_USER = "INSERT INTO USER(ID, NAME, EMAIL, BIO) VALUES (?,?,?,?)";
    private static final String SELECT_ALL_USER = " SELECT * FROM USER";
    private static final String FIND_USER = "SELECT * FROM USER WHERE id = ?";

    public void save(User user){

        Connection connection = connect();

        if(connection != null){

            PreparedStatement preparedStatement = null;

            try {

                preparedStatement = connection.prepareStatement(INSERT_USER);
                preparedStatement.setInt(1,user.id);
                preparedStatement.setString(2,user.name);
                preparedStatement.setString(3,user.email);
                preparedStatement.setString(4,user.bio);

                int executeUpdate = preparedStatement.executeUpdate();

                System.out.println("result: " + executeUpdate);

            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try{
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }else{
            System.out.println("Connection oluşturulamadı");
        }

    }


    public List<User> findAll(){

            List<User> userList = new ArrayList<>();

            Connection connection = connect();



                PreparedStatement preparedStatement = null;

                try{
                    preparedStatement = connection.prepareStatement(SELECT_ALL_USER);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    while(resultSet.next()){
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("email");
                        String bio = resultSet.getString("bio");

                        userList.add(prepareUser(id,name,email,bio));
                    }


                } catch (SQLException e) {
                    e.printStackTrace();
                }

            return userList;



    }

    private User prepareUser(int id, String name, String email, String bio) {
        User user = new User();
        user.id = id;
        user.name = name;
        user.email = email;
        user.bio = bio;
        return  user;
    }


    public User findOne(int id){

        User user = null;

        Connection connection = connect();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER);

            preparedStatement.setInt(1,id);


            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int userId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String bio = resultSet.getString("bio");

                user = prepareUser(userId,name,email,bio);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return user;

    }


}
