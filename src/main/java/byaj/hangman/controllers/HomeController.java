package byaj.hangman.controllers;

import byaj.hangman.models.Body;
import byaj.hangman.repositories.BodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by student on 6/20/17.
 */
@Controller
public class HomeController {
  //   @Autowired
 //  private UserRepository userRepository;

  //   @Autowired
 //   private RoleRepository roleRepository;

    @Autowired
    private BodyRepository bodyRepository;

  //   @Autowired
 //   private WordRepository wordRepository;


    @RequestMapping("/")
    public String home(){
        return "base";
    }
   /* @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("resFirstName", new String());
        model.addAttribute("resLastName", new String());
        model.addAttribute("resEmail", new String());
        model.addAttribute("username", new String());
        model.addAttribute("password", new String());
        model.addAttribute("role", new String());

        return "register2";
    }
    @PostMapping("/register")
    public String registering(@RequestParam("resFirstName") String resFirstName,
                              @RequestParam("resLastName") String resLastName,
                              @RequestParam("resEmail") String resEmail,
                              @RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("role") String theRole,
                              Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        Role role = new Role();
        role.setRole(theRole);
        Resume resume = new Resume();
        resume.setResFirstName(resFirstName);
        resume.setResLastName(resLastName);
        resume.setResEmail(resEmail);

        userRepository.save(user);
        resumeRepository.save(resume);
        roleRepository.save(role);

        userRepository.findOneByUsername(user.getUsername()).setUserResume(resume.getResID());
        userRepository.save(userRepository.findOneByUsername(user.getUsername()));

        resume.setResUser(userRepository.findOneByUsername(user.getUsername()).getID());
        resumeRepository.save(resume);
        return "login2";
    }*/

    /*@PostMapping("/register")
    public String newUser(){
        if (userBindingResult.hasErrors()) {
            System.out.println("user");
            return "register";
        }
        if (resBindingResult.hasErrors()) {
            System.out.println("resume");
            return "register";
        }
        if (roleBindingResult.hasErrors()) {
            System.out.println("role");
            return "register";
        }
        userRepository.save(user);
        resumeRepository.save(resume);
        roleRepository.save(role);

        userRepository.findOneByUsername(user.getUsername()).setUserResume(resume.getResID());
        userRepository.save(userRepository.findOneByUsername(user.getUsername()));

        resume.setResUser(userRepository.findOneByUsername(user.getUsername()).getID());
        resumeRepository.save(resume);
        return "login";
    }*/

    @GetMapping("/game")
    public String newGame(Model model){
       if(bodyRepository.findAll().size()==0) {
            Body body = new Body();
            bodyRepository.save(body);
            return "redirect:/game";

        }
        model.addAttribute("body",bodyRepository.findById(1));

        return "game";
    }
    @PostMapping("/game")
    public String checkGame( Model model){
        bodyRepository.findById(1).countIterateNum();
        bodyRepository.save(bodyRepository.findById(1));

        if(bodyRepository.findById(1).getIterateNum()>10){
            return "defeat";
        }

        model.addAttribute("body",bodyRepository.findById(1));
        return "game";
    }
    @PostMapping("reset")
    public String resetGame(Model model){
        bodyRepository.findById(1).setIterateNum(0);
        bodyRepository.save(bodyRepository.findById(1));
        model.addAttribute("body",bodyRepository.findById(1));
        return "redirect:/game";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    /*@GetMapping("/add")
    public String getRooms(Model model){
        model.addAttribute(new TransactionATM());
        model.addAttribute("items", transactionATMRepository.findAllByOrderByTranDateDesc());
        return "result";
    }

    @GetMapping("/user")
    public String getReddit(Model model, Principal principal){

        model.addAttribute("items", transactionATMRepository.findAllByTranUserOrderByTranDateDesc(Integer.parseInt(principal.getName())));
        return "byuser";
    }

    @PostMapping("/add")
    public String processTransaction(@Valid TransactionATM transactionATM, BindingResult bindingResult, Userount user, Principal principal) {
        if (bindingResult.hasErrors()) {
            System.out.println("two");
            return "redirect:/";
        }

        userRepository.save(user);
        transactionATMRepository.save(transactionATM);
        return "redirect:/user";

    }*/


}
