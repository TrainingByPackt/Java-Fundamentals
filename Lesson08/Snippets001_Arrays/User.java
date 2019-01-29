public class User {
    public int id;
    public String name;
    public String email;

    public User(String[] row) {
        this.id = Integer.parseInt(row[0]);
        this.name = row[1];
        this.email = row[2];
    }
}