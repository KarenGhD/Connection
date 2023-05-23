package Comp;

public class Main {
    public static void main(String[] args){
        DBFunctions db = new DBFunctions();
        db.connect_to_db("TentativaJDBC", "postgres","/@JK@bb78" );
    }
}
