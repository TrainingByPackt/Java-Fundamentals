public class EnumExample
{
public static void main(String[] args)
{
public enum Direction
{
EAST(45), WEST(90), NORTH(180), SOUTH(360);
int no;
Direction(int i){
no =i;
}
}
Direction north = Direction.NORTH;
System.out.println(north + " : " + north.no);
Direction south = Direction.valueOf("SOUTH");
System.out.println(south + " : " + south.no);
}
}
