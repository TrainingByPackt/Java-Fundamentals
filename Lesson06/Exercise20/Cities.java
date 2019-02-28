import java.util.ArrayList;
import java.util.Iterator;
public class Cities {
public static void main(String[] args){
ArrayList<String> cities = new ArrayList<>();
cities.add( "London");
cities.add( "New York");
cities.add( "Tokyo");
cities.add( "Nairobi");
cities.add( "Sydney");
Iterator<String> citiesIterator = cities.iterator();
while (citiesIterator.hasNext()){
String city = citiesIterator.next();
System.out.println(city);
}
}
}