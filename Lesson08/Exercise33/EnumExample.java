public class EnumExample {

    public enum Direction {
        EAST(45), WEST(90), NORTH(180), SOUTH(360);
        int no;

        Direction(int i) {
            no = i;
        }
    }

    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        System.out.println(north + " : " + north.no);
        Direction south = Direction.valueOf("SOUTH");
        System.out.println(south + " : " + south.no);
    }
}
