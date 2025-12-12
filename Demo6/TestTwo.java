class Test{
    public static void main(String[] args) {
        System.out.println("Good Morning");
        System.out.println(10/5);
        try{
            System.out.println(10/0); //AE
        }
        catch(Exception e){
            System.out.println(10/1);
        }
        
        System.out.println("Good Night");
    }
}