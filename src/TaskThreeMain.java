public class TaskThreeMain {
    public static void main(String[] args){
        //Exception catching
        try{
            //Creating account object with parameters
            Account ac = new Account("Anthony",300,22324);
            int current = ac.setBalance(300);
            // Printing the user data
            System.out.println( ac.methodPrint());
            //Calling the method transfer
            ac.methodTransferAnthony(350);

            throw new NotEnoughMoneyException("There is insufficient money in the account!!!");

        }
        catch (NotEnoughMoneyException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println( ex);
        }
        finally{
            // System.out.println( "The Balance left is" + Account.current);
        }
    }
}

