package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;
import CaseStudy_Module2.Services.IService.IFacilityService;
import CaseStudy_Module2.Services.service.FacilityServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;

import java.io.IOException;
import java.util.Scanner;

public class FacilityManagementController {

    public void facilityManagement() throws IOException {
        IFacilityService iFacilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        try {
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
                        iFacilityService.displayFacility();
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
                                String newIdVl;
                                do {
                                    System.out.println("Enter ID Service Villa");
                                    newIdVl = scanner.nextLine();
                                    if (!RegexCode.checkVilla(newIdVl)) {
                                        System.err.println("Choice Again");
                                    }
                                } while (!RegexCode.checkVilla(newIdVl));

                                String newNameVilla;
                                do {
                                    System.out.println("Enter Name: ");
                                    newNameVilla = scanner.nextLine();
                                    if (!RegexCode.checkName(newNameVilla)) {
                                        System.err.println("Choice Again");
                                    }
                                } while (!RegexCode.checkName(newNameVilla));

                                String newSVilla;
                                do {
                                    System.out.println("Enter Area Villa: ");
                                    newSVilla = scanner.nextLine();
                                    if (!RegexCode.checkArea(newSVilla)) {
                                        System.err.println("Choice Again");
                                    }
                                } while (!RegexCode.checkArea(newSVilla));

                                String newCostsVilla;
                                do {
                                    System.out.println("Enter Rental Costs: ");
                                    newCostsVilla = scanner.nextLine();
                                    if (!RegexCode.checkRentalCosts(newCostsVilla)) {
                                        System.err.println("Choice Again");
                                    }
                                } while (!RegexCode.checkRentalCosts(newCostsVilla));

                                String newPeopleVilla;
                                do {
                                    System.out.println("Enter Amount Of People: ");
                                    newPeopleVilla = scanner.nextLine();
                                    if (!RegexCode.checkPeople(newPeopleVilla)) {
                                        System.err.println("Choice Again");
                                    }
                                } while (!RegexCode.checkPeople(newPeopleVilla));
                                String newRentalVilla = "";
                                do {
                                    System.out.println("Enter Rental Type: (loại cho thuê) \n" +
                                            "1.\t theo ngày\n" +
                                            "2.\t theo tháng\n" +
                                            "3.\t theo năm");
                                    newRentalVilla = scanner.nextLine();
                                    int choiceRental = Integer.parseInt(scanner.nextLine());
                                    switch (choiceRental) {
                                        case 1:
                                            newRentalVilla = "theo ngày";
                                            break;
                                        case 2:
                                            newRentalVilla = "Theo tháng";
                                            break;
                                        case 3:
                                            newRentalVilla = "theo năm";
                                            break;
                                    }
                                    if (!RegexCode.checkRental(newRentalVilla)) {
                                        System.err.println("Please Again");
                                    }
                                } while (!RegexCode.checkRental(newRentalVilla));

                                System.out.println("Enter room Standard: (tiêu chuẩn phòng) ");
                                String newStandardVilla = scanner.nextLine();

                                String newSPoolVilla;
                                do {
                                    System.out.println("Enter Area Pool: ");
                                    newSPoolVilla = scanner.nextLine();
                                    if (!RegexCode.checkArea(newSPoolVilla)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkArea(newSPoolVilla));

                                String newFloorsVilla;
                                do {
                                    System.out.println("Enter Number Floors: ( số tầng ) ");
                                    newFloorsVilla = scanner.nextLine();
                                    if (!RegexCode.checkFloors(newFloorsVilla)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkFloors(newFloorsVilla));

                                Villa villa = new Villa(newIdVl, newNameVilla, newSVilla, newCostsVilla, newPeopleVilla,
                                        newRentalVilla, newStandardVilla, newSPoolVilla, newFloorsVilla);
                                iFacilityService.addVilla(villa, 5);
                                break;
                            case 2:
                                String newIdRo;
                                do {
                                    System.out.println("Enter ID Room");
                                    newIdRo = scanner.nextLine();
                                    if (!RegexCode.checkRoom(newIdRo)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkRoom(newIdRo));

                                String newNameRoom;
                                do {
                                    System.out.println("Enter Name Room: ");
                                    newNameRoom = scanner.nextLine();
                                    if (!RegexCode.checkName(newNameRoom)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkName(newNameRoom));

                                String newSRoom;
                                do {
                                    System.out.println("Enter Area Room: ");
                                    newSRoom = scanner.nextLine();
                                    if (!RegexCode.checkArea(newSRoom)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkArea(newSRoom));

                                String newCostsRoom;
                                do {
                                    System.out.println("Enter Rental Costs Room: (chi phí thuê) ");
                                    newCostsRoom = scanner.nextLine();
                                    if (!RegexCode.checkRentalCosts(newCostsRoom)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkRentalCosts(newCostsRoom));

                                String newPeopleRoom;
                                do {
                                    System.out.println("Enter Amount Of People: ");
                                    newPeopleRoom = scanner.nextLine();
                                    if (!RegexCode.checkPeople(newPeopleRoom)) {
                                        System.err.println("Retype again");
                                    }
                                } while (!RegexCode.checkPeople(newPeopleRoom));

                                String newRentalRoom = "";
                                do {
                                    System.out.println("Enter Rental Type: (loại cho thuê) \n" +
                                            "1.\t theo ngày\n" +
                                            "2.\t theo tháng\n" +
                                            "3.\t theo năm");
                                    newRentalRoom = scanner.nextLine();
                                    int choiceRental = Integer.parseInt(scanner.nextLine());
                                    switch (choiceRental) {
                                        case 1:
                                            newRentalRoom = "theo ngày";
                                            break;
                                        case 2:
                                            newRentalRoom = "Theo tháng";
                                            break;
                                        case 3:
                                            newRentalRoom = "theo năm";
                                            break;
                                    }
                                    if (!RegexCode.checkRental(newRentalRoom)) {
                                        System.err.println("Please Again");
                                    }
                                } while (!RegexCode.checkRental(newRentalRoom));

                                System.out.println("Enter the Room's Free Service: ");
                                String newFreeService = scanner.nextLine();

                                Room room = new Room(newIdRo, newNameRoom, newSRoom, newCostsRoom, newPeopleRoom,
                                        newRentalRoom, newFreeService);
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
                        return;
                    default:
                        System.err.println("You choose wrong. Please choose again");
                }
            } while (true);
        } catch (NumberFormatException e) {
            System.err.println("Please enter the correct number!");
        }
    }
}
