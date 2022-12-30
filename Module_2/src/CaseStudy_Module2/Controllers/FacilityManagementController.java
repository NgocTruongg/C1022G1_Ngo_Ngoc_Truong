package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;
import CaseStudy_Module2.Services.IService.IFacilityService;
import CaseStudy_Module2.Services.service.FacilityServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;

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
                            String newNameVilla;
                            do {
                                System.out.println("Enter Name: ");
                                 newNameVilla = scanner.nextLine();
                            }while (!RegexCode.checkVilla(newNameVilla));
                            String newSVilla;
                            do {
                                System.out.println("Enter S: ");
                                 newSVilla = scanner.nextLine();
                            }while (!RegexCode.checkArea(newSVilla));
                            String newCostsVilla;
                            do {
                                System.out.println("Enter Rental Costs: ");
                                 newCostsVilla = scanner.nextLine();
                            }while (!RegexCode.checkRentalCosts(newCostsVilla));
                            String newPeopleVilla;
                            do {
                                System.out.println("Enter Amount Of People: ");
                                 newPeopleVilla = scanner.nextLine();
                            }while (!RegexCode.checkPeople(newPeopleVilla));
                            System.out.println("Enter Rental Type: ");
                            String newRentalVilla = scanner.nextLine();
                            System.out.println("Enter room Standard: ");
                            String newStandardVilla = scanner.nextLine();
                            String newSPoolVilla;
                            do {
                                System.out.println("Enter S Pool: ");
                                 newSPoolVilla = scanner.nextLine();
                            }while (!RegexCode.checkArea(newSPoolVilla));
                            String newFloorsVilla;
                            do {
                                System.out.println("Enter Number Floors: ");
                                 newFloorsVilla = scanner.nextLine();
                            }while (!RegexCode.checkFloors(newFloorsVilla));

                            Villa villa = new Villa(newNameVilla, newSVilla, newCostsVilla, newPeopleVilla, newRentalVilla,
                                    newStandardVilla, newSPoolVilla, newFloorsVilla);
                            iFacilityService.addVilla(villa, 5);
                            break;
                        case 2:
                            String newNameRoom;
                            do {
                                System.out.println("Enter Name Room: ");
                                 newNameRoom = scanner.nextLine();
                            }while (!RegexCode.checkRoom(newNameRoom));
                            String newSRoom;
                            do {
                                System.out.println("Enter S Room: ");
                                 newSRoom = scanner.nextLine();
                            }while (!RegexCode.checkArea(newSRoom));

                            String newCostsRoom;
                            do {
                                System.out.println("Enter Rental Costs Room: ");
                                 newCostsRoom = scanner.nextLine();
                            }while (!RegexCode.checkArea(newCostsRoom));
                            String newPeopleRoom;
                            do {
                                System.out.println("Enter Amount Of People: ");
                                 newPeopleRoom = scanner.nextLine();
                            }while (!RegexCode.checkPeople(newPeopleRoom));
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
                            System.out.println("Wrong choice please choose again !");
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
