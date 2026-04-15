static class Singleton {
    private static Singleton uniqueInstance = null;
    private static String s = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        } 
        return uniqueInstance;
    }

    public String getValue() {
        return s;
    }

    public void setValue(String value) {
        s = value;
    }
    
}
