import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //we need to save this user details
        Users user1 = new Users("BHUTALA","AJAY","ABCDEFG","ajaybhutala@gmail.com","9182497095",10000.00);
        //getting bean of DAO
        UsersDAO usersDAO = (UsersDAO) context.getBean("usersDAO");//only for method accessing

        //INSERT
        System.out.println("=========================INSERT=============================");
        user1 = usersDAO.save(user1);
        System.out.println(user1);//printing it

        //SELECT ALL
        System.out.println("=========================SELECT ALL=============================");
        List<Users> usersList = usersDAO.findAll();
        usersList.forEach(users -> System.out.println(users));//printing all
    }
}
