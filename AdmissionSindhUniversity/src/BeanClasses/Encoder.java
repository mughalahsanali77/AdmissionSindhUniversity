package BeanClasses;

public class Encoder {
    
    public static String shiftEncode(String shift){
        
        switch(shift){
            case "Morning" : return "M";
            case "Evening" : return "E";
            case "Noon"    : return "N";
        }
        
        return shift;
    }
    
    public static String groupEncode(String group){
        
        switch(group){
            case "General" : return "G";
            case "Medical" : return "M";
            case "Engineering" : return "E";
            case "Commerce": return "C";      
        }
        
        return group;
    }
    
    
     public static String genderEncode(String gender){
        
        switch(gender){
            case "Male" : return "M";
            case "Female" : return "F";      
        }
        
        return gender;
    }
     
    
    public static String bookCategoryEncode(String bookCategory){
        
        switch(bookCategory){
            case "Magzine": return "M";
            case "News": return "N";
            case "Story": return "S";
            case "HIstry": return "H";
            case "Poem": return "P";
        }
        
        return bookCategory;
    }
    
    public static String languageEncode(String language){

        switch(language){
            case "Sindhi": return "S";
            case "Urdu": return "U";
            case "English": return "E";
            case "Arabic": return "A";
            case "Persian": return "P";
        }
        
        return language;
    }
}
