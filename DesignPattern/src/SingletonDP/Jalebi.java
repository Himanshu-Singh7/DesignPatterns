package SingletonDP;

public class Jalebi {

    // Eager way to creating Singleton Object
    private static Jalebi jalebi = new Jalebi();
    private Jalebi(){

    }

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
