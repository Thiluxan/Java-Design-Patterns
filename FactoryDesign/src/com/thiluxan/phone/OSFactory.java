package com.thiluxan.phone;

public class OSFactory {

    public OS getOS(String osText){
        if(osText.equals("android")){
            return new Android();
        }
        else if(osText.equals("ios")){
            return new IOS();
        }
        else if(osText.equals("windows")){
            return new Windows();
        }

        return null;
    }
}
