package suppliers;

public class SessionManager {
    private static String username;
    private static String shipid;
    private static String warehouseid;
   
    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        SessionManager.username = username;
    }
    
    public static String getWarehouseid() {
        return username;
    }

    public static void setWarehouseid(String id) {
        SessionManager.warehouseid = id;
    }
   
    public static String getshipid() {
        return shipid;
    }

    public static void setshipid(String username) {
        SessionManager.shipid = username;
    }
}
