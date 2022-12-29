package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;
import CaseStudy_Module2.Services.IService.IFacilityService;
import CaseStudy_Module2.Services.service.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagementController {

    public void facilityManagement() {
        IFacilityService iFacilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("----Facility Management----");
            System.out.println("1\tDisplay list facility: \n" +
                    "2\tAdd new facility: \n" +
                    "3\tDisplay list facility maintenance: \n" +
                    "4\tReturn main menu: ");
            System.out.println("--Selection Management--");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List of Facility: \n" +
                            "1.\t Room:\n" +
                            "2.\t Villa:");
                    System.out.println("What kind of service do you want to choice?");
                    int choiceService = Integer.parseInt(scanner.nextLine());
                    switch (choiceService) {
                        case 1:
                            iFacilityService.displayRoom();
                            break;
                        case 2:
                            iFacilityService.displayVilla();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("list of Facility: \n" +
                            "1.\t Add new Villa\n" +
                            "2.\t Add new Room \n" +
                            "3.\t Back to Menu");
                    System.out.println("What kind of service do you want to add?");
                    int choiceAdd = Integer.parseInt(scanner.nextLine());
                    switch (choiceAdd) {
                        case 1:
                            System.out.println("Enter Name: ");
                            String newNameVilla = scanner.nextLine();
                            System.out.println("Enter S: ");
                            String newSVilla = scanner.nextLine();
                            System.out.println("Enter Rental Costs: ");
                            String newCostsVilla = scanner.nextLine();
                            System.out.println("Enter Amount Of People: ");
                            int newPeopleVilla = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Rental Type: ");
                            String newRentalVilla = scanner.nextLine();
                            System.out.println("Enter room Standard: ");
                            String newStandardVilla = scanner.nextLine();
                            System.out.println("Enter  S Pool: ");
                            Double newSPoolVilla = Double.parseDouble(scanner.nextLine());
                            System.out.println("Enter  Number Floors: ");
                            int newFloorsVilla = Integer.parseInt(scanner.nextLine());
                            Villa villa = new Villa(newNameVilla, newSVilla, newCostsVilla, newPeopleVilla, newRentalVilla,
                                    newStandardVilla, newSPoolVilla, newFloorsVilla);
                            iFacilityService.addVilla(villa, 5);
                            break;
                        case 2:
                            System.out.println("Enter Name: ");
                            String newNameRoom = scanner.nextLine();
                            System.out.println("Enter S: ");
                            String newSRoom = scanner.nextLine();
                            System.out.println("Enter Rental Costs: ");
                            String newCostsRoom = scanner.nextLine();
                            System.out.println("Enter Amount Of People: ");
                            int newPeopleRoom = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter Rental Type: ");
                            String newRentalRoom = scanner.nextLine();
                            System.out.println("Enter the Room's Free Service: ");
                            String newFreeService = scanner.nextLine();
                            Room room = new Room(newNameRoom, newSRoom, newCostsRoom, newPeopleRoom, newRentalRoom,
                                    newFreeService);
                            iFacilityService.addRoom(room, 5);
                            break;
                        case 3:
                            facilityManagement();
                            break;
                        default:
                            System.out.println("wrong choice please choose again");
                    }
                case 3:
                    iFacilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
            }
        } while (true);
    }
}
