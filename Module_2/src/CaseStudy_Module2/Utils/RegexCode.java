package CaseStudy_Module2.Utils;

import javax.swing.plaf.PanelUI;

public class RegexCode {
    private static final String CUSTOMER_ID_REGEX = "KH-[\\d]{1,}$"; // ID khách hàng
    private static final String EMPLOYEE_ID_REGEX = "NV-[\\d]{1,}$"; // id nhân viên
    private static final String ROOM_REGEX = "^SVRO-[0-9]{4}$"; // room
    private static final String VILLA_REGEX = "^SVVL-[0-9]{4}$"; // villa
    private static final String SERVICE_NAME_REGEX = "[a-zA-Z]*+(\\s[a-z]+)*$"; // tên dịch vụ
    private static final String AREA_REGEX = "^([12][0-9]{2,}|[3-9][0-9]+)(\\.\\d+)?m2$"; // diện tích
    private static final String RENTAL_COSTS_REGEX = "^\\d*(\\.\\d+)?$"; // chi phí thuê
    private static final String PEOPLE_REGEX = "^[1-9]|1\\d$"; // số lượng người
    private static final String FLOORS_REGEX = "^[1-9]\\d*$"; // số tầng
    private static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)" +
            "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static final String CMND_REGEX = "^([\\d]{9}|[\\d]{12})$";
    public static final String EMAIL_REGEX = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";

    public static boolean checkCustomerId(String string) {
        return string.matches(CUSTOMER_ID_REGEX);
    }

    public static boolean checkEmployeeId(String string) {
        return string.matches(EMPLOYEE_ID_REGEX);
    }

    public static boolean checkRoom(String string) {
        return string.matches(ROOM_REGEX);
    }
    public static boolean checkVilla(String string) {
        return string.matches(VILLA_REGEX);
    }

    public static boolean checkServiceName(String string) {
        return string.matches(SERVICE_NAME_REGEX);
    }

    public static boolean checkArea(String string) {
        return string.matches(AREA_REGEX);
    }

    public static boolean checkRentalCosts(String string) {
        return string.matches(RENTAL_COSTS_REGEX);
    }
    public static boolean checkPeople(String string) {
        return string.matches(PEOPLE_REGEX);
    }
    public static boolean checkFloors(String string) {
        return string.matches(FLOORS_REGEX);
    }
    public static boolean checkName (String string) {
        return string.matches(NAME_REGEX);
    }
    public static boolean checkBirthday(String string) {
        return string.matches(DATE_OF_BIRTH);
    }
    public static boolean checkCMND(String string) {
        return string.matches(CMND_REGEX);
    }
    public static boolean checkMail(String string) {
        return string.matches(EMAIL_REGEX);
    }
}
