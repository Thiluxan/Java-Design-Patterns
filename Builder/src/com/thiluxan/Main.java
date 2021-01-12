package com.thiluxan;

import com.thiluxan.phone.Phone;
import com.thiluxan.phone.PhoneBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Phone phone = new PhoneBuilder().setOs("MediaTech").setRam(8).getPhone();

        System.out.println(phone);
    }
}
