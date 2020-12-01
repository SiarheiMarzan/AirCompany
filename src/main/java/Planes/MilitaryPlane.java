package Planes;

import models.MilitaryType;

import static java.util.Objects.hash;

public class MilitaryPlane extends Plane {

    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;               // добавить поля в сравнение!!!
    }

    @Override
    public int hashCode() {
        return hash(super.hashCode(), type);
    }
}
