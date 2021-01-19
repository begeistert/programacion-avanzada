
 public class Hora
 {
    private byte Horas;
    private byte Minutos;
    private byte Segundos;


    
    public Hora()
    {
     //crea y/o inicializa el estado de un objeto
     Horas=0;
     Minutos=0;
     Segundos=0;
    }
   
    //Constructor
    public Hora (byte _Horas, byte _Minutos, byte _Segundos)
    {
       setHora (_Horas);
       setMinutos (_Minutos);
       setSec (_Segundos);
    }
    
    public Hora (byte _Horas, byte _Minutos)
    {
       setHora (_Horas);
       setMinutos (_Minutos);
       Segundos = 0;
    }
    
     public Hora (byte _Horas)
    {
       setHora (_Horas);
       Minutos=0;
       Segundos=0;
    }
       
    //Nueva hora entre 0 y 23
    public void setHora (byte _Horas)
    {
    Horas = (_Horas <=23 && _Horas >= 0) ?_Horas:0;
    
    } 
    
    public void setMinutos(byte _Minutos){
        Minutos = _Minutos;
    }
    
    public void setSec (byte _Segundos)
    {
     Segundos = ( _Segundos <= 59 && _Segundos >= 0) ?_Segundos :0;
    }

    public byte getHoras()
    {
     return Horas;
    }
    
    
    public byte getMinutos()
    {
        return Minutos;
    }

    
    public byte getSegundos()
    {
        return Segundos;
    }
    
    
    public String toString( )
    {
        return ( (Horas == 12 || Horas == 0) ? 12 : Horas % 12) 
        + ":" + (Minutos < 10 ? "0" : "") + Minutos 
        + ":" + (Segundos < 10 ? "0" : "") + Segundos +
        (Horas < 12 ? " AM" : " PM");
    }


 }