public class Toys {
    private Integer id;
    private String name;
    
    public Toys(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "; Имя: " + this.name + ";";
    }
}
