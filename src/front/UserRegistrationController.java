import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class USerRegistrationController {
  private UserService userService;

  public UserRegistrationController(UserService userService) {
    //super();
    this.userService = userService;
  }

  @GetMapping
  public String showRegistrationForm() {
    return "registration";
  }

  @PostMapping
  public String registerUserAccount(@NodelAttribute("user") UserRegistrationOto registrationOto) {
    userService.save(registrationOto);
    return "redirect:/reqistration?success";
  }

  @ModelAttribute("user")
  public UserRegistrationDto userRegistrationDto() {
    return new UserRegistrationDto();
  }
}