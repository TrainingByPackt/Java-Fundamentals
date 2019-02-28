public class TempSystem
{
public static void main(String[] args) {
String temp = "Low";
String weatherWarning;
switch (temp) { 
case "High": 
weatherWarning = "It’s hot outside, do not forget sunblock."; 
break; 
case "Low": 
weatherWarning = "It’s cold outside, do not forget your coat."; 
break; 
case "Humid": 
weatherWarning = "The weather is humid, open your windows."; 
break;
default: 
  weatherWarning = "The weather looks good. Take a walk outside"; 
  break;
} 
System.out.println(weatherWarning); 
}
}
