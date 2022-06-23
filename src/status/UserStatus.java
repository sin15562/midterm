/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author Jaspreet
 */
public enum UserStatus {
    REJECTED("ZERO"),
    PENDING("ONE"),
    PROCESSING("TWO"),
    APPROVED("THREE");

    private final String code;

    UserStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

   
    public static UserStatus getStatusByCode(String code) {
        for (UserStatus status : UserStatus.values()) {
            if (status.getCode().equalsIgnoreCase(code)) {
                return status;
            }
        }
        return null; 
    }
}


