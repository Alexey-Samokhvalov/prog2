package ch.makery.prog.Model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Person {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty index;
    private final StringProperty city;
    private final ObjectProperty <LocalDate> birthday;
    /**
     * Конструктор по умолчанию.
     */
    public Person() {
        this(null, null);
    }
    /**
     * Конструктор с некоторыми начальными данными.
     *
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        // Какие-то фиктивные начальные данные для удобства тестирования.
        this.street = new SimpleStringProperty("какая-то улица");
        this.city = new SimpleStringProperty("какой-то город");
        this.index = new SimpleIntegerProperty(1234);
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public StringProperty streetProperty() {
        return street;
    }

    public int getIndex() {
        return index.get();
    }

    public void setIndex(int postalCode) {
        this.index.set(postalCode);
    }

    public IntegerProperty indexProperty() {
        return index;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty() {
        return city;
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }
}
