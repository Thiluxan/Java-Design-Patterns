package com.thiluxan;

import com.thiluxan.phone.OS;
import com.thiluxan.phone.OSFactory;

public class Main {

    public static void main(String[] args) {

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getOS("windows");
        os.readme();
    }
}
