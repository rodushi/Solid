
package Solid;


public class ants implements Insects,movelegs {
    private String name;
    private int weight;
    private int walk;
    
    public ants(String name, int weight, int walk) {
        this.name =name;
        
        this.weight = weight;
        this.walk = walk;
    }
  


    @Override
    public void walk(int speed) {
        System.out.println("it walks "+speed+"km per hour");
    }

    @Override
    public void run(int speed) {
        System.out.println("it runs "+speed+"km per hour");
    }

    @Override
    public void NumberOfLegs(int n) {
        System.out.println("it has "+n+"legs");
    }

    @Override
    public void name(String name) {
        System.out.println("Its name is "+name);
    }

    @Override
    public void weight(int n) {
        System.out.println("Its wight is "+n+"mg");
    }

    @Override
    public void brain() {

    }
}

