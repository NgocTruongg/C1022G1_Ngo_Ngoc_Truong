package CaseStudy_Module2.Services.IService;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;

public interface IFacilityService {
    void addVilla(Villa villa, int num);
    void addRoom (Room room, int num);
    void displayFacilityMaintenance();
    void displayFacility();



}
