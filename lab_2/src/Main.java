import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House[] houses = {
                new House(1, 101, 50, 2, 3, "Green Street 5"),
                new House(2, 202, 80, 5, 4, "Blue Avenue 12"),
                new House(3, 303, 45, 3, 2, "Red Road 15"),
                new House(4, 404, 65, 7, 3, "Yellow Lane 8"),
                new House(5, 505, 90, 10, 5, "Black Square 20"),
                new House(6, 606, 55, 4, 3, "Orange Boulevard 33"),
                new House(7, 707, 75, 6, 4, "Purple Hill 7"),
                new House(8, 808, 40, 1, 1, "Silver Path 9"),
                new House(9, 909, 100, 12, 5, "Golden Avenue 22"),
                new House(10, 1001, 60, 8, 3, "Bronze Street 14")
        };

        System.out.print("Enter number of rooms: ");
        int number = sc.nextInt();

        System.out.println("Houses with " + number + " rooms: ");
        for(House house : houses) {
            if(house.getRoom() == number){
                System.out.println(house);
            }
        }

        System.out.print("Enter range of floors. \nFrom floor: ");
        int flor_from = sc.nextInt();
        System.out.print("To: ");
        int flor_to = sc.nextInt();

        System.out.println("Houses found: ");
        for(House house : houses) {
            if((house.getRoom() == number) && (house.getFloor() >= flor_from) && (house.getFloor() < flor_to)){
                System.out.println(house);
            }
        }

        System.out.print("Enter area: ");
        int area = sc.nextInt();

        System.out.println("Houses with mote that " + area + " m^2: ");
        for(House house : houses) {
            if(house.getArea() > area){
                System.out.println(house);
            }
        }








    }
//    House search_by_roms(){
//
//    }
}