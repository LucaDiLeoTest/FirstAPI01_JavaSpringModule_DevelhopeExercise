package co.develhope.firstAPI01.controllers;

import co.develhope.firstAPI01.entities.Person;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/name")
public class NameController {



    @GetMapping("/getname")
    public String getName(){
        return new Person("test-name").getName();
    }

    @PostMapping("/reverse")
    public String reverseName(){
        StringBuilder sb = new StringBuilder(this.getName()); //Using StringBuilder class with the getName method of this controller to obtain the reverse of the name
        return sb.reverse().toString();
    }

}
