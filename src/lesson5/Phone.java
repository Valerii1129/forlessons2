package lesson5;

import java.util.Objects;

public class Phone {
    private String model;
    private String colour;
    private int numberOfModel;

    private Phone(Builder builder) {
        this.model = builder.model;
        this.colour = builder.colour;
        this.numberOfModel = builder.numberOfModel;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfModel=" + numberOfModel +
                '}';
    }

    static class Builder {
        private String model;
        private String colour;
        private int numberOfModel;

        public Builder(String model) {
            this.model = model;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setNumberOfModel(int numberOfModel) {
            this.numberOfModel = numberOfModel;
            return this;
        }

        public Phone Build() {
            return new Phone(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return numberOfModel == phone.numberOfModel && Objects.equals(model, phone.model) && Objects.equals(colour, phone.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, colour, numberOfModel);
    }
}
