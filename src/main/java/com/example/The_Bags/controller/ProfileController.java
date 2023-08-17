//package com.example.The_Bags.controller;
//
//
//import ch.qos.logback.core.model.Model;
//import com.example.The_Bags.entity.User;
//import com.example.The_Bags.services.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping
//public class ProfileController {
//
//    private final UserService userService;
//    @GetMapping("/profile")
//    public String getProfile(Model model) {
//        User user = userService.fetchById(getUser(getCurrentUser()).getId()).get();
//        model.addAttribute("user", getUser(getCurrentUser()));
//        model.addAttribute("edi", User.builder()
//                .imageBase64(getImageBase64(user.getImage()))
//                .build());
//        return "profilepage/profile.html";
//    }
//
//
//    public String getCurrentUser() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentemail = authentication.getName();
//        return currentemail;
//    }
//
//    public User getUser(String email){
//        User u = userService.fatchByEmail(email);
//        return u;
//    }
//    public String getImageBase64(String fileName) {
//        String filePath = System.getProperty("user.dir") + "/photo_file/";
//        File file = new File(filePath + fileName);
//        byte[] bytes = new byte[0];
//        try {
//            bytes = Files.readAllBytes(file.toPath());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//        String base64 = Base64.getEncoder().encodeToString(bytes);
//        return base64;
//    }
//}
//
