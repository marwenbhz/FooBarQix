public class FooBarQix{

    public static String compute(String s){
        String result = getDiv(s);
        
        for(int i=0; i < s.length(); i++){
            result += getEqual(String.valueOf(s.charAt(i)));
        }
        if(result.equals("")) return s;
        return result;
    }
    public static String getDiv(String s){
        String result = "";
        if(Integer.parseInt(s) % 3 == 0){
            result += "Foo";
        }
        if(Integer.parseInt(s) % 5 == 0){
            result += "Bar";
        }
        if(Integer.parseInt(s) % 7 == 0){
            result += "Qix";
        }
        return result;
    }
    public static String getEqual(String s){
        String result = "";
        if(Integer.parseInt(s) == 3){
            result += "Foo";
        }
        if(Integer.parseInt(s) == 5){
            result += "Bar";
        }
        if(Integer.parseInt(s) == 7){
            result += "Qix";
        }
        return result;
    }
    public static void main(String []args){
        System.out.println(compute("51"));
    }
}