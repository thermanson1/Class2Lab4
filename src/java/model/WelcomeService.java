/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Calendar;

/**
 *
 * @author Teraesa
 */
public class WelcomeService {
    private Calendar currentDate= Calendar.getInstance();

    public Calendar getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Calendar currentDate) {
        this.currentDate = currentDate;
    }
    
    public String timeOfDay(){
        Calendar noon = Calendar.getInstance();
        Calendar evening = Calendar.getInstance();
        Calendar morning = Calendar.getInstance();
        String time;
        
        noon.set(Calendar.HOUR_OF_DAY, 12);
        evening.set(Calendar.HOUR_OF_DAY, 17);
        morning.set(Calendar.HOUR_OF_DAY, 24);
        
        if (currentDate.before(noon) && currentDate.after(morning)){
            time = "morning";
        } else if (currentDate.before(evening) && currentDate.after(noon)){
            time = "afternoon";
        } else {
            time = "evening";
        }
        
        return time;
    }
    
    public String getMessage(String name){
        String message = "Good " +  timeOfDay() + " " + name + ". Welcome!";

        return message;
    }
}
