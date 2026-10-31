package Lab_4.Exercises.Exercise_9;

public class TempConversion {
    public double celcius;
    public double fahrenheit;

    TempConversion(){

    }
    double celcius(){
        celcius = 5.0/9.0 *(fahrenheit -32);
        return celcius;
    }
    double fahrenheit(){
        fahrenheit = 9.0/5.0 *celcius +32;
        return fahrenheit;
    }
}
