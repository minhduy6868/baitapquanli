package OOPManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. Thêm động vật");
            //System.out.println("0. Cho động vật kêu");
            System.out.println("2. Hiển thị danh sách con vật");
            System.out.println("3. Tìm theo tên động vật");
            System.out.println("4. Xóa động vật theo tên");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
//                case 9:
//                    System.out.println("Tiếng gọi rừng núi: ");
//                    System.out.println("Nhập tên con vật muốn nghe tiếng: ");
//                    String name1 = scanner.nextLine();
//                    animalManager.sound(name1);
                case 1:
                    System.out.print("Nhập kiểu động vật (Dog/Cat): ");
                    String type = scanner.nextLine();
                    System.out.print("Tên động vật là: ");
                    String name = scanner.nextLine();
                    System.out.print("Nó có tuổi là: ");
                    int age = scanner.nextInt();

                    Animal animal;
                    if (type.equalsIgnoreCase("Dog")) {
                        animal = new Dog(name, age);
                    } else {
                        animal = new Cat(name, age);
                    }
                    animalManager.addAnimal(animal);
                    break;
                case 2:
                    animalManager.displayAnimals();
                    break;
                case 3:
                    System.out.print("Nhập tên động vật cần tim: ");
                    String searchName = scanner.nextLine();
                    Animal foundAnimal = animalManager.findAnimalByName(searchName);
                    if (foundAnimal != null) {
                        System.out.println("Đã thấy: " + foundAnimal);
                    } else {
                        System.out.println("404 Động vật đã bị đánh cắp.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên động vật cần xóa: ");
                    String removeName = scanner.nextLine();
                    animalManager.removeAnimalByName(removeName);
                    System.out.println("Đã xóa động vật.");
                    break;
                case 5:
                    System.out.println("Thoát! Bye...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chọn số không có trong danh sách, chọn lại.");
            }
        }
    }
}
