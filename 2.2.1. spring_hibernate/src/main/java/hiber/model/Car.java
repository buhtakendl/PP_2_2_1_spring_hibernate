package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "cars")
public class Car {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    Long id;

    @Column(name = "model")
    String model;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "series")
    int series;

    public Car() {
    }
    public Car(String model) {
        this.model = model;
    }

    public int getSeries() {
        return this.series;
    }

    public String getModel() {
        return this.model;
    }
}
