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
            new UserDetails(3, "Bianca ", "Robson", 24, "32 Lichfield Road, Halewood,L26 1TT", "Female"),
            new UserDetails(4, "Richard ", "Holton", 24, "82 Melongrove Road, Elsbury, E20 8SD", "Male")
        );
    }

    @GetMapping("/testUsers")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<UserDetails> testUsers(){
        return Arrays.asList(
                new UserDetails(1, "Shauna", "Jada", 24, "34 Evergreen Road, Lowestoft,NR32 2SA", "Female"),
                new UserDetails(2, "Dexter ", "Schuyler", 21, "J J B Soccer Dome, Trafford Way, Dumplington,M17 8DD", "Male"),
                new UserDetails(3, "Deidre ", "Paisley", 22, "11 Meadow Lane, Leasingham,NG34 8LL", "Male"),
                new UserDetails(4, "Madoline ", "Charlotte", 29, "Hewletts Mill, Galhampton,BA22 7BG", "Male")
        );
    }
}
