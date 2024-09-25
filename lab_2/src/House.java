/*
3.	House: id, Номер квартири, Площа, Поверх, Кількість кімнат, Вулиця.
Скласти масив об'єктів. Вивести:
a) список квартир, які мають задане число кімнат;
b) список квартир, які мають задане число кімнат та розташовані на поверсі, який знаходиться в заданому проміжку;
c) список квартир, які мають площу, що перевищує задану.
*/
public class House {
    private int id;
    private int apartment_number;
    private int area;
    private int floor;
    private int room;
    private String address;

    House(int id, int apartment_number, int area, int floor, int room, String address) {
        this.id = id;
        this.apartment_number = apartment_number;
        this.area = area;
        this.floor = floor;
        this.room = room;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getApartment_number() {
        return apartment_number;
    }
    public void setApartment_number(int apartment_number) {
        this.apartment_number = apartment_number;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return  "ID: " + id +
                ", apartment_number: " + apartment_number +
                ", area: " + area +
                ", floor: " + floor +
                ", room: " + room +
                ", address: " + address;
    }

}
