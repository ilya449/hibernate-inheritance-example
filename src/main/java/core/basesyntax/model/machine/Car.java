package core.basesyntax.model.machine;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends Machine {
    private int horsePower;
    private String model;

    public Car() {
    }

    public Car(int year) {
        super(year);
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{"
                + "year=" + getYear()
                + '}';
    }
}
