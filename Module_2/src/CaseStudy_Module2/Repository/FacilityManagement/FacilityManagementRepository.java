package CaseStudy_Module2.Repository.FacilityManagement;

import CaseStudy_Module2.Data.ReadFile.ReadFile;
import CaseStudy_Module2.Data.WriteFile.WriteFile;
import CaseStudy_Module2.Models.Facility.Facility;
import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityManagementRepository implements IFacilityManagementRepository {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
//    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
//    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    public static final String PATH_ROOM = "src\\CaseStudy_Module2\\Data\\FileCSV\\room.csv";
    public static final String PATH_VILLA = "src\\CaseStudy_Module2\\Data\\FileCSV\\villa.csv";

//    static {
//        roomIntegerMap.put(new Room("SVRO","tổng thống", "40", "25tr/đêm", "10", "theo ngày",
//                "buffes free"), 1);
//
//        roomIntegerMap.put(new Room("SVRO1","vip", "30", "10tr/đêm", "6", "theo ngày",
//                "Ăn sáng miễn phí"), 2);
//
//        roomIntegerMap.put(new Room("SVRO2","thường", "25", "7tr/đêm", "4", "theo tháng",
//                "hồ bơi miễn phí"), 3);
//
//
//        villaIntegerMap.put(new Villa("SVVL","villa gia đình", "100", "25tr/3 ngày", "20",
//                "theo ngày", "phòng 2 giường", "35.5", "5"), 1);
//
//        villaIntegerMap.put(new Villa("SVVL1","villa nhóm", "50", "10tr/3 ngày", "10",
//                "theo ngày", "phòng 2 giường", "30", "4"), 2);
//
//        villaIntegerMap.put(new Villa("SVVL2","villa tình yêu", "40", "6tr/3 ngày", "2",
//                "theo ngày", "phòng 2 giường", "30", "2"), 3);
//    }

    public void writeFileRoom(Map<Room, Integer> roomIntegerMap) {
        WriteFile.writeFileRoom(PATH_ROOM, roomIntegerMap);
    }

    public void writeFileVilla(Map<Villa, Integer> villaIntegerMap) {
        WriteFile.writeFileVilla(PATH_VILLA, villaIntegerMap);
    }

    @Override
    public void displayFacility() {
        Map<Room,Integer> roomIntegerMap = ReadFile.readFileRoom(PATH_ROOM);
        for (Map.Entry<Room, Integer> room : roomIntegerMap.entrySet()) {
            System.out.println(room.getKey() + ":" + room.getValue() + " lần sử dụng");
        }
        Map<Villa,Integer> villaIntegerMap = ReadFile.readFileVilla(PATH_VILLA);
        for (Map.Entry<Villa, Integer> villa : villaIntegerMap.entrySet()) {
            System.out.println(villa.getKey() + ":" + villa.getValue() + " lần sử dụng");
        }
    }


    @Override
    public void addVilla(Villa villa, int num) {
        Map<Villa,Integer> villaIntegerMap = ReadFile.readFileVilla(PATH_VILLA);
        villaIntegerMap.put(villa, num);
        writeFileVilla(villaIntegerMap);

    }

    @Override
    public void addRoom(Room room, int num) {
        Map<Room,Integer> roomIntegerMap = ReadFile.readFileRoom(PATH_ROOM);
        roomIntegerMap.put(room, num);
        writeFileRoom(roomIntegerMap);
    }

    @Override
    public void displayFacilityMaintenance() {
        Map<Room,Integer> roomIntegerMap = ReadFile.readFileRoom(PATH_ROOM);
        for (Map.Entry<Room, Integer> roomEntry : roomIntegerMap.entrySet()) {
            if (roomEntry.getValue() > 4) {
                System.out.println(roomEntry.getKey());
                System.out.println("Number of times used is: " + roomEntry.getValue());
            }
        }
        Map<Villa,Integer> villaIntegerMap = ReadFile.readFileVilla(PATH_VILLA);
        for (Map.Entry<Villa, Integer> villaEntry : villaIntegerMap.entrySet()) {
            if (villaEntry.getValue() > 4) {
                System.out.println(villaEntry.getKey());
                System.out.println("Number of times used is: " + villaEntry.getValue());
            }
        }
    }

}
