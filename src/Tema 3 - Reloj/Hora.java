
 /**
 * Esta clase implementa el objeto hora
 *
 * @ autor Iván Montiel Cardona
 * @version 1.1
 */
 public class Hora
 {
    private byte Horas;
    private byte Minutos;
    private byte Segundos;
    
    /**
    * Constructor para objetos de la clase hora
    */
    public Hora()
    {
     Horas=0;
     Minutos=0;
     Segundos=0;
    }
   
    /**
     * Constructor para objetos de la clase hora recibiendo horas,
     * minutos y segundos
     */
    public Hora (byte _Horas, byte _Minutos, byte _Segundos)
    {
       setHora (_Horas);
       setMinutos (_Minutos);
       setSec (_Segundos);
    }
    
    /**
    * Constructor para objetos de la clase hora recibiendo horas 
    * y minutos
    */
    public Hora (byte _Horas, byte _Minutos)
    {
       setHora (_Horas);
       setMinutos (_Minutos);
       Segundos = 0;
    }
    
    /**
    * Constructor para objetos de la clase hora recibiendo horas
    */
    public Hora (byte _Horas)
    {
       setHora (_Horas);
       Minutos=0;
       Segundos=0;
    }
       
    /**Nueva hora, siempre entre 0 y 23*/
    public void setHora (byte _Horas)
    {
    Horas = (_Horas <=23 && _Horas >= 0) ?_Horas:0;
    
    } 
    
    /**Nuevos minutos siempre entre 0 y 59*/
    public void setMinutos(byte _Minutos){
        Minutos = _Minutos;
    }
    
    /**Nuevos segundos siempre entre 0 y 59*/
    public void setSec (byte _Segundos)
    {
     Segundos = ( _Segundos <= 59 && _Segundos >= 0) ?_Segundos :0;
    }

    /**Obtener hora actual*/
    public byte getHoras()
    {
     return Horas;
    }
    
    /**Obtener minuto actual*/
    public byte getMinutos()
    {
        return Minutos;
    }

    /**Obtener segundo actual*/
    public byte getSegundos()
    {
        return Segundos;
    }
    
    /**Obtener hora con formato*/
    public String toString( )
    {
        return ( (Horas == 12 || Horas == 0) ? 12 : Horas % 12) 
        + ":" + (Minutos < 10 ? "0" : "") + Minutos 
        + ":" + (Segundos < 10 ? "0" : "") + Segundos +
        (Horas < 12 ? " AM" : " PM");
    }


 }