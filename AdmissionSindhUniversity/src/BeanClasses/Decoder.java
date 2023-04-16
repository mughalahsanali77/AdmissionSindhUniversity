package BeanClasses;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Decoder {
    
    public static String shiftDecode(String shift){
        
        switch(shift){
            case "M" : return "Morning";
            case "E" : return "Evening";
            case "N" : return "Noon";
        }
        
        return shift;
    }
    
    public static String groupDecode(String group){
        
        switch(group){
            case "G" : return "General";
            case "M" : return "Medical";
            case "E" : return "Engineering";
            case "C" : return "Commerce";      
                
        }
        
        return group;
    }
    
    public static String genderDecode(String gender){
        
        if(gender.equals(null)){
            return "other";
        }
        else{
        switch(gender){
            case "M"  : return "Male";
            case "F"  : return "Female";
        }
        }
        return gender;
    }
    
    public static String bookCategoryDecode(String bookCategory){
        
        switch(bookCategory){
            case "M": return "Magzine";
            case "N": return "News";
            case "S": return "Story";
            case "H": return "Histry";
            case "P": return "Poem";
        }
        
        return bookCategory;
    }
    
    public static String languageDecode(String language){

        switch(language){
            case "S": return "Sindhi";
            case "U": return "Urdu";
            case "E": return "English";
            case "A": return "Arabic";
            case "P": return "Persian";
        }
        
        return language;
    }
    
    public static String getDateFormat(java.util.Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
        String dateFormat = sdf.format(date);
        return dateFormat;
    }
}
