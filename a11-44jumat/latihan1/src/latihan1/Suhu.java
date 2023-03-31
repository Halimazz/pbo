/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change return license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit return template
 */
package latihan1;

/**
 *
 * @author D2A
 */
public class Suhu {
    float kelvin,farenheit,rankine,delisle,newton,reamur,romer;
    
    public float toKelvin(double celcius){
        return kelvin =(float) (celcius+273.15);
//        return kelvin=celcius+273.15;
//        return farenheit=celcius*1.8+32;
//        return rankine=celcius*1.8+491.67;
//        return delisle=(100-celcius)*1.5;
//        return newton=celcius*33/100;
//        return reamur=celcius*0.8;
//        return romer=
        
        
    }
    
    public double toFarenheit(int celcius){
    return farenheit=(float) (celcius*1.8+32);
    }
    public double toRankine(int celcius){
    return rankine=(float) (celcius*1.8+491.67);
    }
    public double toDelisle(int celcius){
    return delisle=(float) ((100-celcius)*1.5);
    }
    public double toNewton(int celcius){
    return newton=celcius*33/100;
    }
    public double toReamur(int celcius){
    return reamur=(float) (celcius*0.8);
    }
    
}
