/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author HP
 */
public class Loan {
    private String loanId;
    private Patron patron;
    private LibraryItem item;
    private Date loanDate;
    private Date dueDate;

    public Loan(String loanId, Patron patron, LibraryItem item, Date loanDate, Date dueDate) {
        this.loanId = loanId;
        this.patron = patron;
        this.item = item;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public String getLoanDetails() {
        return "Loan[ID=" + loanId + ", Patron=" + patron.getName() + ", Item=" + item.getTitle() + "]";
    }
}