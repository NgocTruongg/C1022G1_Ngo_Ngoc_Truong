package CaseStudy_Module2.Repository.FacilityManagement;

import CaseStudy_Module2.Models.Facility.Room;
import CaseStudy_Module2.Models.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FacilityManagementRepository implements IFacilityManagementRepository {

    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();


    static {
        roomIntegerMap.put(new Room("tổng thống", "40", "25tr/đêm", 10, "theo ngày",
                "buffes free"), 1);
        roomIntegerMap.put(new Room("vip", "30", "10tr/đêm", 6, "theo ngày",
                "Ăn sáng miễn phí"), 2);
        roomIntegerMap.put(new Room("thường", "25", "7tr/đêm", 4, "theo tháng",
                "hồ bơi miễn phí"), 3);


        villaIntegerMap.put(new Villa("villa gia đình", "100", "25tr/3 ngày", 20,
                "theo ngày", "phòng 2 giường", 35.5, 5), 1);
        villaIntegerMap.put(new Villa("villa nhóm", "50", "10tr/3 ngày", 10,
                "theo ngày", "phòng 2 giường", 30, 4), 2);
        villaIntegerMap.put(new Villa("villa tình yêu", "40", "6tr/3 ngày", 2,
                "theo ngày", "phòng 2 giường", 30, 2), 3);
    }

    @Override
    public void displayRoom() {
        for (Map.Entry<Room, Integer> room : roomIntegerMap.entrySet()) {
            System.out.println(room.getKey() + ":" + room.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void displayVilla() {
        for (Map.Entry<Villa, Integer> villa : villaIntegerMap.entrySet()) {
            System.out.println(villa.getKey() + ":" + villa.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void addVilla(Villa villa, int num) {
        villaIntegerMap.put(villa,num);
    }

    @Override
    public void addRoom(Room room, int num) {
        roomIntegerMap.put(room, num);
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Map.Entry<Room,Integer> roomEntry: roomIntegerMap.entrySet()) {
            if (roomEntry.getValue() > 4) {
                System.out.println(roomEntry.getKey());
                System.out.println("Number of times used is: " + roomEntry.getValue());
            }
        }
        for (Map.Entry<Villa, Integer> villaEntry : villaIntegerMap.entrySet()) {
            if (villaEntry.getValue() > 4) {
                System.out.println(villaEntry.getKey());
                System.out.println("Number of times used is: " + villaEntry.getValue());
            }
        }
    }

}
