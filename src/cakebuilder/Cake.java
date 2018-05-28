/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakebuilder;

/**
 *
 * @author Administrator
 */
public class Cake {

    private final String Sabor1;
    private final String Sabor2;
    private final String Topping;
    private final int capas;
    
    private Cake(CakeBuilder builder){
        this.Sabor1=builder.Sabor1;
        this.Sabor2=builder.Sabor2;
        this.Topping=builder.Topping;
        this.capas=builder.capas;
    }
    
    public String getSabor1(){
        return Sabor1;
    }
    public String getSabor2(){
        return Sabor2;
    }
    public String getTopping(){
        return Topping;
    }
    public int getCapas(){
        return capas;
    }
    
    public static class CakeBuilder{
        private final String Sabor1;
        private final String Sabor2;
        private  String Topping;
        private  int capas;
        
        public CakeBuilder(String sabor1,String sabor2){
            this.Sabor1=sabor1;
            this.Sabor2=sabor2;
        }
        
        public CakeBuilder Topping( String top){
            this.Topping=top;
            return this;
        }
        
        public CakeBuilder capas(int capa){
            this.capas=capa;
            return this;
        }
        
        public Cake build(){
            return new Cake(this);
        }
    
    }
    
    public static Cake getCake(){
        return new Cake.CakeBuilder("Chocolate", "Vainilla").Topping("Fresas").capas(11).build();
    }

    @Override
    public String toString() {
        return "Pastel\n"+"Sabor1:" + Sabor1 + ", Sabor2:" + Sabor2 + ", Topping:" + Topping + ", Capas:" + capas ;
    }
    
    
}
