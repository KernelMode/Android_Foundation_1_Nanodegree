package com.example.ankur.tourguide;

/**
 * Created by Ankur on 11-02-2018.
 */
public class LocationInfo {

      private String heading;
      private int imageResId;
      private String info;

      public LocationInfo(String h, int resId, String i){
          heading = h;
          imageResId = resId;
          info = i;
      }

      public String getHeading(){
          return heading;
      }

      public int getImageResId(){
          return imageResId;
      }

      public String getInfo(){
          return info;
      }

}
