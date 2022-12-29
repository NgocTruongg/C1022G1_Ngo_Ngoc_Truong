package CaseStudy_Module2.Repository.FacilityManagement;


import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;

public interface IFacilityManagementRepository {


    void displayRoom();
    void displayVilla();
    void addVilla(Villa villa, int num);
    void addRoom (Room room, int num);
    void displayFacilityMaintenance();
}
