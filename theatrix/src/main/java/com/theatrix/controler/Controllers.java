package com.theatrix.controler;


import com.google.gson.Gson;
import com.theatrix.domain.*;
import com.theatrix.factory.*;
import com.theatrix.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by aubrey on 07/09/2017.
 */

@Controller
@RequestMapping(path = "/theatrix")
public class Controllers {

    @Autowired
    private AdminUserRepository adminUserRepository;
    private CustomerRepository customerRepository;
    private MovieRepository movieRepository;
    private SeatRepository seatRepository;
    private BookingRepository bookRepository;

    //inserts new admin user
    @GetMapping(path ="/addAdmin/{firstname}/{lastname}/{password}")
    public @ResponseBody String addAdminUser(@RequestParam String firstname, @RequestParam String lastname,
                                             @RequestParam String password)
    {
        AdminUser admin = AdminUserFactory.buildAdminUser(firstname,lastname,password);
        adminUserRepository.save(admin);
        System.out.println("admin Record Added Successfully\n");
        return new Gson().toJson(admin);
    }
    //reads single admin user
    @GetMapping(path ="/readSingleUser/{userIdentity}")
    public @ResponseBody String readSingleUser(@RequestParam Long userIdentity)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        System.out.println("display single admin user record Successfully\n");
        return new Gson().toJson(admin);
    }
    //reads all admin users
    @GetMapping(path ="/readAllUsers")
    public @ResponseBody Iterable<AdminUser> getAllAdminUsers()
    {
        System.out.println("displaying all admin members \n");
        return adminUserRepository.findAll();
    }
    //delete single user
    @GetMapping(path ="/deleteAdminUser/{userIdentity}")
    public @ResponseBody String deleteAdminUser(@RequestParam Long userIdentity)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        if(admin ==null){
            System.out.println("Record does not exists");
        }
        else{
            adminUserRepository.delete(admin);
            System.out.println("admin record deleted Successfully\n");
        }
        return new Gson().toJson(admin);
    }
    //update single user admin details
    @GetMapping(path ="/updateAdmin/{userIdentity}")
    public @ResponseBody String updateAdminUser(@RequestParam Long userIdentity, @RequestParam String firstname,@RequestParam String lastname,
                                                @RequestParam String password)
    {
        AdminUser admin = adminUserRepository.findOne(userIdentity);
        if(admin !=null){

            AdminUser adminUserUpdate = new AdminUser.Builder()
                    .nameVal(firstname)
                    .surnameVal(lastname)
                    .passwordVal(password)
                    .build();

            adminUserRepository.save(adminUserUpdate);
            System.out.println("admin record updated Successfully\n");
        }
        else{
            System.out.println("admin record not updated\n");
        }
        return new Gson().toJson(admin);
    }

    //adding customer details
    @GetMapping(path ="/addCustomer/{firstname}/{lastname}/{cellphone}/{email}/{age}/{password}")
    public @ResponseBody String addCustomer(@RequestParam String firstname,
                                             @RequestParam String lastname,@RequestParam String cellphone,
                                             @RequestParam String email,@RequestParam String age,
                                             @RequestParam String password)
    {
        Customer customer = CustomerFactory.buildCustomer(firstname,lastname,cellphone,email,age,password);
        if(customer!=null){
            customerRepository.save(customer);
            System.out.println("customer Record Added Successfully\n");
        }
        else{
            System.out.println("customer Record failed to add\n");
        }
        return new Gson().toJson(customer);
    }
    //reads single customer details
    @GetMapping(path ="/readSingleCustomer/{customerId}")
    public @ResponseBody String readSingleCustomer(@RequestParam Long customerId)
    {
        Customer customer = customerRepository.findOne(customerId);
        System.out.println("display single customer record Successfully\n");
        return new Gson().toJson(customer);
    }
    //reads all customer
    @GetMapping(path ="/readAllCustomers")
    public @ResponseBody Iterable<Customer> getAllCustomers()
    {
        System.out.println("displaying customers \n");
        return customerRepository.findAll();
    }
    //delete customer
    @GetMapping(path ="/deleteCustomerAccount/{customerId}")
    public @ResponseBody String deleteCustomerAccount(@RequestParam Long customerId)
    {
        Customer customer = customerRepository.findOne(customerId);
        if(customer ==null){
            System.out.println("Record does not exists");
        }
        else{
            customerRepository.delete(customerId);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(customer);
    }
    //update customer details
    @GetMapping(path ="/updateCustomer/{userIdentity}")
    public @ResponseBody String updateCustomer(@RequestParam Long customerId,@RequestParam String firstname,
                                               @RequestParam String lastname,@RequestParam String cellphone,
                                               @RequestParam String email,@RequestParam String age,
                                               @RequestParam String password)
    {
        Customer customer = customerRepository.findOne(customerId);
        if(customer !=null){

            Customer customerUpdate = new Customer.Builder()
                    .nameVal(firstname)
                    .surnameVal(lastname)
                    .phoneNumVal(cellphone)
                    .emailVal(email)
                    .ageVal(age)
                    .passwordVal(password)
                    .build();

            customerRepository.save(customerUpdate);
            System.out.println("your details updated successfully updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(customer);
    }
    //inserts new movie
    @GetMapping(path ="/addNewMovie/{movieTitle}/{category}/{duration}/{yearReleased}/{ageRestriction}")
    public @ResponseBody String addNewMovie(@RequestParam String movieTitle, @RequestParam String category,
                                             @RequestParam String duration,@RequestParam String yearReleased,
                                            @RequestParam String ageRestriction)
    {
        Movie movie = MoviesFactory.buildMovie(movieTitle,category,duration,yearReleased,ageRestriction);
        movieRepository.save(movie);
        System.out.println("movie Record Added Successfully\n");
        return new Gson().toJson(movie);
    }
    //reads single movie details
    @GetMapping(path ="/readSingleMovie/{movieId}")
    public @ResponseBody String readSingleMovie(@RequestParam Long movieId)
    {
        Movie movie = movieRepository.findOne(movieId);
        System.out.println("display single movie record\n");
        return new Gson().toJson(movie);
    }
    //reads all movie information
    @GetMapping(path ="/readAllMovies")
    public @ResponseBody Iterable<Movie> getAllMovies()
    {
        System.out.println("displaying customers \n");
        return movieRepository.findAll();
    }
    //delete movie
    @GetMapping(path ="/deleteMovie/{movieId}")
    public @ResponseBody String deleteMovie(@RequestParam Long movieId)
    {
        Movie movie = movieRepository.findOne(movieId);
        if(movieId ==null){
            System.out.println(" movie Record does not exists");
        }
        else{
            movieRepository.delete(movie);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(movie);
    }
    //update movie details
    @GetMapping(path ="/updateMovie/{userIdentity}")
    public @ResponseBody String updateMovie(@RequestParam Long movieId,@RequestParam String movieTitle,
                                            @RequestParam String category,@RequestParam String duration,
                                            @RequestParam String yearReleased,
                                            @RequestParam String ageRestriction)
    {
        Movie movie = movieRepository.findOne(movieId);
        if(movie !=null){

            Movie movieUpdate = new Movie.Builder()
                    .nameVal(movieTitle)
                    .categoryVal(category)
                    .durationVal(duration)
                    .yearReleaseVal(yearReleased)
                    .ageRestrictionVal(ageRestriction)
                    .build();

            movieRepository.save(movieUpdate);
            System.out.println("movie record updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(movie);
    }
    //inserts seats
    @GetMapping(path ="/addSeatsMovie/{seatNumber}/{category}")
    public @ResponseBody String addSeatsMovie(@RequestParam String seatCategory, @RequestParam int seat_qauntity)
    {
        Seat seat = SeatFactory.buildSeat(seatCategory,seat_qauntity);
        seatRepository.save(seat);
        System.out.println("seat Record Added Successfully\n");
        return new Gson().toJson(seat);
    }
    //reads single seat details
    @GetMapping(path ="/readSingleSeat/{seatId}")
    public @ResponseBody String readSingleSeat(@RequestParam Long seatId)
    {
        Seat seat = seatRepository.findOne(seatId);
        System.out.println("display single seat record\n");
        return new Gson().toJson(seatId);
    }
    //reads all movie information
    @GetMapping(path ="/readAllSeats")
    public @ResponseBody Iterable<Seat> getAllSeats()
    {
        System.out.println("displaying all seats \n");
        return seatRepository.findAll();
    }
    //delete movie
    @GetMapping(path ="/deleteSeat/{seatId}")
    public @ResponseBody String deleteSeat(@RequestParam Long seatId)
    {
        Seat seat = seatRepository.findOne(seatId);
        if(seatId ==null){
            System.out.println(" seat Record does not exists");
        }
        else{
            seatRepository.delete(seat);
            System.out.println("your record deleted successfully Successfully\n");
        }
        return new Gson().toJson(seat);
    }
    //update movie details
    @GetMapping(path ="/updateSeat/{seatIdentity}")
    public @ResponseBody String updateSeat(@RequestParam Long seatId,@RequestParam String seatNumber,
                                           @RequestParam int seat_quntity)
    {
        Seat seat = seatRepository.findOne(seatId);
        if(seat !=null){

            Seat seatUpdate = new Seat.Builder()
                    .seat_class_category(seatNumber)
                    .seat_quantity(seat_quntity)
                    .build();

            seatRepository.save(seatUpdate);
            System.out.println("seat record updated Successfully\n");
        }
        else{
            System.out.println("failed to update record(s)\n");
        }
        return new Gson().toJson(seat);
    }

    //inserts seats
    @GetMapping(path ="/bookmovie/{customer_ID}/{movie_ID}/{theatre_ID}/{show_ID}/{seat_ID}/{noSesats}{date}")
    public @ResponseBody String bookmovie(@RequestParam Long customer_ID, @RequestParam Long movie_ID,@RequestParam Long theatre_ID,
                                          @RequestParam Long show_ID,@RequestParam Long seat_ID,@RequestParam int noSesats,
                                          @RequestParam String date)
    {

        Booking booking = BookingsFactory.buildBookings(customer_ID,movie_ID,theatre_ID,show_ID,seat_ID,date,noSesats);
        bookRepository.save(booking);
        System.out.println("movie Record booked Successfully\n");
        return new Gson().toJson(booking);
    }
}
