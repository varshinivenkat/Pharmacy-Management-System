/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributor;

/**
 *
 * @author Sweety
 */
public class SessionManager {
    private static String username;
    private static String shipid;
    private static String disid;
   
    public static String getUsername() {
        return username;
    }
   
    public static String getDisid(){
        return disid;
    }

    public static void setUsername(String username) {
        SessionManager.username = username;
    }
   
    public static void setDisid(String disid){
        SessionManager.disid = disid;
    }
   
    public static String getshipid() {
        return shipid;
    }

    public static void setshipid(String username) {
        SessionManager.shipid = username;
    }
   
}
