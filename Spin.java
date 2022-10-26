package IsingModel;

class position {

}

public class Spin {
    boolean is_up;

    Position pos;

    int index;

    public Spin(boolean is_it_up, Position space_position, int index_in_table) {
        is_up = is_it_up;
        pos = space_position;
        index = index_in_table;
    }

    public String toString() {
        String up_or_down = is_up ? "up" : "down";
        return String.format("%5d idx:%-8d position: ",up_or_down,index) + pos.toString();
    }

    public static void main(String[] args) {
        
    }

}

public class Material