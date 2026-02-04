package bank;

import java.time.LocalDateTime;

public class Transactions {
    private double amount;
    private TransactionType type;
    private LocalDateTime date;
        public Transactions(double amount,TransactionType type,LocalDateTime date){
            this.amount=amount;
            this.type=type;
            this.date=date;
        }
        public String toString(){
            return amount+" "+type+" "+date;
        }
}
