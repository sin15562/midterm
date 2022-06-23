/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StatusUser {

   
    public void printStatus(UserStatus status) {
        if (status == null) {
            System.out.println("Invalid status code! Please enter a valid code.");
            return;
        }

        switch (status) {
            case REJECTED:
                System.out.println("User status: REJECTED");
                break;
            case PENDING:
                System.out.println("User status: PENDING");
                break;
            case PROCESSING:
                System.out.println("User status: PROCESSING");
                break;
            case APPROVED:
                System.out.println("User status: APPROVED");
                break;
        }
    }
}