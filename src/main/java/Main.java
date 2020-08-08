import com.upgrad.hirewheels.dao.RoleDAO;
import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.entities.Role;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //To save this users details
        Users user1 = new Users("BHUTALA","AJAY","ABCDEFG","ajaybhutala@gmail.com","9182497095",10000.00);
        //getting bean of UsersDAO
        UsersDAO usersDAO = (UsersDAO) context.getBean("usersDAO");//only for method accessing

        //INSERT
        System.out.println("=========================INSERT=============================");
        user1 = usersDAO.save(user1);
        System.out.println(user1);//printing it

        //SELECT ALL
        System.out.println("=========================SELECT ALL=============================");
        List<Users> usersList = usersDAO.findAll();
        usersList.forEach(users -> System.out.println(users));//printing all

        /*=========================TODO checkpoint3==============================*/

        RoleDAO roleDAO = (RoleDAO) context.getBean("roleDAO");
        Role admin = new Role("Admin");
        admin = roleDAO.save(admin);
        System.out.println(admin);

        /*============================TODO 3.2===================================*/
        Users ADMIN = new Users("Admin","Admin","admin@123","upgrad@gmail.com","9999999999",10000.00);
        ADMIN.setRole(admin);
        ADMIN = usersDAO.save(ADMIN);
        System.out.println(ADMIN);

        /*================================TODO 3.3===================================*/
        //Getting user details with role Admin
        System.out.println("=========================SELECT=============================");
        System.out.println(usersDAO.findByRole(admin));



    }
}
