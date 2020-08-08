import com.upgrad.hirewheels.daos.RoleDAO;
import com.upgrad.hirewheels.daos.UsersDAO;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserDetailsNotFoundException;
import com.upgrad.hirewheels.services.UserService;
import com.upgrad.hirewheels.services.initService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) throws UserAlreadyExistsException, UserDetailsNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        /*==============================TODO checkpoint2==============================*/

        //To save this users details
        Users userDemo = new Users("BHUTALA","AJAY","ABCDEFG","ajaybhutala@gmail.com","9182497095",10000.00);
        //getting bean of UsersDAO
        UsersDAO _usersDAO = (UsersDAO) context.getBean("usersDAO");//only for method accessing

        //INSERT
        System.out.println("=========================INSERT=============================");
        userDemo = _usersDAO.save(userDemo);
        System.out.println(userDemo);//printing it

        //SELECT ALL
        System.out.println("=========================SELECT ALL=============================");
        List<Users> usersList = _usersDAO.findAll();
        usersList.forEach(users -> System.out.println(users));//printing all



        /*==============================TODO checkpoint3==============================*/

        RoleDAO _roleDAO = (RoleDAO) context.getBean("roleDAO");
        Role admin = new Role("Admin");
        admin = _roleDAO.save(admin);
        System.out.println(admin);

        /*============================TODO 3.2===================================*/
        Users ADMIN1 = new Users("Admin","Admin","admin@123","upgrad@gmail.com","9999999999",10000.00);
        ADMIN1.setRole(admin);
        ADMIN1 = _usersDAO.save(ADMIN1);
        System.out.println(ADMIN1);

        /*================================TODO 3.3===================================*/
        //Getting user details with role Admin
        System.out.println("=========================SELECT=============================");
        System.out.println(_usersDAO.findByRole(admin));


        /*===============================TODO checkpoint4==============================*/
        /*============================TODO 4.1===================================*/
        _usersDAO.deleteAll();
        _roleDAO.deleteAll();

        /*============================TODO 4.2===================================*/
        initService service = (initService) context.getBean("initService");

        Role ADMIN = new Role("ADMIN");
        Role USER = new Role("USER");

        service.populateUserRoleDetails(ADMIN);
        service.populateUserRoleDetails(USER);

        Users user1 = new Users("Admin","Admin","admin@123","upgrad@gmail.com","9999999999",10000.00);
        user1.setRole(ADMIN);

        service.populateUserDetails(user1);

        VehicleCategory CAR = new VehicleCategory("Car");
        VehicleCategory BIKE = new VehicleCategory("Bike");

        service.populateVehicleCategoryDetails(CAR);
        service.populateVehicleCategoryDetails(BIKE);


        VehicleSubCategory SUV = new VehicleSubCategory("SUV",300);
        VehicleSubCategory SEDAN = new VehicleSubCategory("SEDAN",350);
        VehicleSubCategory HATCHBACK = new VehicleSubCategory("HATCHBACK",250);
        VehicleSubCategory CRUISER = new VehicleSubCategory("CRUISER",200);
        VehicleSubCategory DIRTBIKE = new VehicleSubCategory("DIRTBIKE",200);
        VehicleSubCategory SPORTSBIKE = new VehicleSubCategory("SPORTSBIKE",150);

        service.populateVehicleSubCategoryDetails(SUV);
        service.populateVehicleSubCategoryDetails(SEDAN);
        service.populateVehicleSubCategoryDetails(HATCHBACK);
        service.populateVehicleSubCategoryDetails(CRUISER);
        service.populateVehicleSubCategoryDetails(DIRTBIKE);
        service.populateVehicleSubCategoryDetails(SPORTSBIKE);

        FuelType PETROL = new FuelType("Petrol");
        FuelType DIESEL = new FuelType("Diesel");

        service.populateFuelTypeDetails(PETROL);
        service.populateFuelTypeDetails(DIESEL);

        City city = new City("Mumbai");

        service.populateCityDetails(city);

        Location location1 = new Location("Worli","Dr E Moses Rd, Worli Naka, Upper Worli","400018");
        Location location2 = new Location("Chembur","Optic Complex","400019");
        Location location3 = new Location("Powai","Hiranandani Towers","400020");
        location1.setCity(city);
        location2.setCity(city);
        location3.setCity(city);
        service.populateLocationDetails(location1);
        service.populateLocationDetails(location2);
        service.populateLocationDetails(location3);



        /*============================TODO 4.6===================================*/
        UserService userService = (UserService) context.getBean("userService");

        Users user2 = new Users("Sachin","Tendulkar","sachin@123","sachin.Tendulkar@gmail.com","8888888888",20000.00);
        user2.setRole(USER);
        user2 = userService.createUser(user2);

        Users getUser1 = userService.getUser("sachin.Tendulkar@gmail.com","sachin@123");
        System.out.println(getUser1);

        //UserAlreadyExists Exception
        Users user3 = new Users("Sachin","Tendulkar","sachin@123","sachin.Tendulkar@gmail.com","8888888888",20000.00);
        user3.setRole(USER);
        user3 = userService.createUser(user3);

        /*============comment above exception to check thi=================*/
        //UserDetailsNotFound Exception
        Users getUser2 = userService.getUser("sachin.Tendulkar@gmail.com","wrongPassword");
        System.out.println(getUser2);


    }
}
