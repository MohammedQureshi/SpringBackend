package com.mohammed.SpringIntroduction;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<UserDetails> users(){
        return Arrays.asList(
            new UserDetails(1, "Adam", "Carte", 22, "369 Victoria Street, BLACKBURN, BB88 8GH", "Male"),
            new UserDetails(2, "Kamil ", "Alcock", 27, "3 Stream Lane Cottages, Stream Lane, Hawkhurst,TN18 4RF", "Female"),
            new UserDetails(3, "Bianca ", "Robson", 24, "32 Lichfield Road, Halewood,L26 1TT", "Female")
        );
    }

}
