package busbookingapp.busbookingapp.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainPage() {
    return "main_page.html";
  }

  @GetMapping("/admin_dashboard")
  public String adminDashboardPage() {
    return "admin_dashboard_page.html";
  }

  @GetMapping("/admin_login")
  public String adminLoginPage() {
    return "admin_login_page.html";
  }

  @GetMapping("/admin_registration")
  public String adminRegistrationPage() {
    return "admin_register_page.html";
  }

  @GetMapping("/book_ticket")
  public String bookTicketPage() {
    return "book_ticket_page.html";
  }

  @GetMapping("/cancel_bus_ticket")
  public String cancelBusTicketPage() {
    return "cancel_bus _ticket_page.html";
  }

  @GetMapping("/create_bus")
  public String createBusPage() {
    return "create_bus_page.html";
  }

  @GetMapping("/delete_bus")
  public String deleteBusPage() {
    return "delete_bus_page.html";
  }

  @GetMapping("/edit_bus")
  public String editBusPage() {
    return "edit_bus_page.html";
  }

  @GetMapping("/forgot_admin_password")
  public String forgotAdminPasswordPage() {
    return "forgot_admin_password_page.html";
  }

  @GetMapping("/forgot_user_password")
  public String forgotUserPasswordPage() {
    return "forgot_user_password_page.html";
  }

  @GetMapping("/passenger_details")
  public String passengerDetailsPage() {
    return "passenger_details_page.html";
  }

  @GetMapping("/payment")
  public String paymentPage() {
    return "payment_page.html";
  }

  @GetMapping("/reset_admin_password")
  public String resetAdminPasswordPage() {
    return "reset_admin_password_page.html";
  }

  @GetMapping("/reset_user_password")
  public String resetUserPasswordPage() {
    return "reset_user_password_page.html";
  }

  @GetMapping("/search_booked_ticket_details")
  public String searchBookedTicketDetailsPage() {
    return "Search_Booked _Ticket _Details_Page";
  }

  @GetMapping("/search_bus")
  public String searchBusPage() {
    return "search_bus_page.html";
  }

  @GetMapping("/user_dashboard")
  public String userDashboardPage() {
    return "user_dashboard_page.html";
  }

  @GetMapping("/user_login")
  public String userLoginPage() {
    return "user_login_page.html";
  }

  @GetMapping("/user_register")
  public String userRegistrationPage() {
    return "user_register_page.html";
  }

  @GetMapping("/view_booked_details")
  public String viewBookedDetailsPage() {
    return "ViewBookedDetailsPage.html";
  }

  @GetMapping("/view_booked_ticket")
  public String viewBookedTicketPage() {
    return "ViewBookedTicketPage.html";
  }

}
