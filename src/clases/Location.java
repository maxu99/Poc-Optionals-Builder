package clases;

public class Location {

    private int id;
    private String nombre;
    private City city;

    public Location(){

    }

    public Location(int id, String nombre, City city) {
        this.id = id;
        this.nombre = nombre;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "Id Localidad=" + id +
                "\nNombre Localidad='" + nombre + city +'\n';
    }
}
