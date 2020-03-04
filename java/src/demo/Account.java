package demo;

public final class Account
{
    private final int accountNumber;
    private final String holderName;
 
    public Account(AccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.holderName = builder.holderName;
    }
    
    public String getHolderName() {
        return holderName;
    } 
 
    public int getAccountNumber() {
        return accountNumber;
    }
 
    //Depends only on account number
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        //result=  prime * result + holderName.hashCode();
        return result;
    }
 
    //Compare only account numbers
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
       // if (holderName != null ? !holderName.equals(other.holderName) : other.holderName!=null)
          //  return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '}';
    }
 
    
    public static final class AccountBuilder {

   	 private int accountNumber;
   	 private String holderName;
   	 
   	 private AccountBuilder(){
   		 
   	 }
   	 
   	 public static AccountBuilder anAccount(){
   		 return new AccountBuilder();
   	 }

   	 public static AccountBuilder anAccount(Account account) {
            return anAccount().withAccNumber(account.getAccountNumber()).withName(account.getHolderName());
        }


   	public AccountBuilder withAccNumber(int id) {
   		this.accountNumber=id;
   		return this;
   	}


   	public AccountBuilder withName(String name) {
   		this.holderName=name;
   		return this;
   	}
   	
   	 public Account build() {
            return new Account(this);
        }
   }
}