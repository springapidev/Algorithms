package com.coderbd.test;

import com.coderbd.entity.Email;
import com.coderbd.entity.TargetEmail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        List<Email> emailList = new ArrayList<Email>();
        emailList.add(new Email(1L, "rajaul.cse@gmail.com", true, "rajaul.cse@gmail.com", "123456"));
        emailList.add(new Email(2L, "rajaul.cse@gmail.com", true, "rajaul.cse@gmail.com", "123456"));

        List<TargetEmail> targetEmailList = new ArrayList();
        targetEmailList.add(new TargetEmail(1L, "sami.cse@gmail.com", true));
        targetEmailList.add(new TargetEmail(2L, "sejiti.cse@gmail.com", true));

        Map<List<Email>, List<TargetEmail>> maps = new HashMap<List<Email>, List<TargetEmail>>();

    }

}
