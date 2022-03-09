
package Solid;


public class Butterfly implements Insects,moveMuscle  {
     
    private int fly ;
    private int fins;
    private String name;

    public Butterfly(int fly,int fins,String name) {
       
        
        this.fly = fly;
        this.fins = fins;
         this.name =name;
    }

 @Override
    public void fly(int Speed) {
    System.out.println("It swims "+ Speed +"meters per minute");
    }

    

    @Override
    public void NumberOfFins(int m) {
        System.out.println("It has "+m+"fins");
    }


    @Override
    public void name(String name) {
        System.out.println("its name is "+name);
    }

    @Override
    public void weight(int n) {
        System.out.println("Its weight is "+n);
    }

    @Override
    public void brain() {
        System.out.println("it has Brain");
    }
}

