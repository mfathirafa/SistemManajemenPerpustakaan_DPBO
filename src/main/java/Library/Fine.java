/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public class Fine {
    private String fineId;
    private double amount;
    private Loan loan;

    public Fine(String fineId, double amount, Loan loan) {
        this.fineId = fineId;
        this.amount = amount;
        this.loan = loan;
    }

    public String getFineDetails() {
        return "Fine[ID=" + fineId + ", Amount=$" + amount + ", Loan=" + loan.getLoanDetails() + "]";
    }
}
