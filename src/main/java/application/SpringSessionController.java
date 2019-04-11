package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SpringSessionController {
    @Autowired
    MishaService mishaService;


    @GetMapping("/misha")
    public ResponseEntity homes(Model model, HttpSession session) {

        return new ResponseEntity<>(mishaService.getMisha(), HttpStatus.OK);
    }

}