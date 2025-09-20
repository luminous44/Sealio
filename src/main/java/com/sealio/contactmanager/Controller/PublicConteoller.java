package com.sealio.contactmanager.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicConteoller {

    @PostMapping("public")
    public  String  fileUploader(){

        return "working";
    }
}
