package CaseStudy_Module2.Services.service;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;
import CaseStudy_Module2.Repository.FacilityManagement.FacilityManagementRepository;
import CaseStudy_Module2.Repository.FacilityManagement.IFacilityManagementRepository;
import CaseStudy_Module2.Services.IService.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {

  IFacilityManagementRepository iFacilityManagementRepository = new FacilityManagementRepository();


  @Override
  public void addVilla(Villa villa, int num) {
    iFacilityManagementRepository.addVilla(villa,num);
  }

  @Override
  public void addRoom(Room room, int num) {
    iFacilityManagementRepository.addRoom(room, num);
  }

  @Override
  public void displayFacilityMaintenance() {
    iFacilityManagementRepository.displayFacilityMaintenance();
  }

  @Override
  public void displayFacility() {
    iFacilityManagementRepository.displayFacility();

  }

}
