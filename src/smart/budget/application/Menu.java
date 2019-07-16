/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.budget.application;

/**
 *
 * @author labsadmin
 */
public class Menu {
    
    public static void main(String...args){
    
        Menu menu = new Menu();
        menu.mainMenu();
        menu.budgetMenu();
        menu.settingsMenu();
        menu.analysisMenu();
    
    }
    public void mainMenu(){
    
        System.out.println();
        System.out.println("Smart-Budget-App");
        System.out.println();
        
        System.out.println("+-------------------------------+");
        System.out.println("|1) Add a budget  2)Transaction ");
        System.out.println("|3) Settings      4)Wallet      ");
        System.out.println("|5) Analysis      6)List        ");
        System.out.println("|7) Contact       8)Log out     ");
              
    }
    
        public void budgetMenu(){
    
        System.out.println();    
        System.out.println("Budget-Menu");
        System.out.println();
        
        System.out.println("+-------------------------------+");
        System.out.println("|1) Add a budget  2) Remover Budget ");
        System.out.println("|3) Analysis      4) List        ");
        System.out.println("|5) Exit   ");
              
    }
        
        public void transactionMenu(){
    
        System.out.println();    
        System.out.println("Transaction-Menu");
        System.out.println();
        
        System.out.println("+-------------------------------+");
        System.out.println("|1) Add a Transaction  2) Remover Transaction ");
        System.out.println("|3) Analysis           4) List        ");
        System.out.println("|5) Exit   ");
              
    }
        
        public void settingsMenu(){
    
        System.out.println();    
        System.out.println("Settings");
        System.out.println();
        
        System.out.println("+-------------------------------+");
        System.out.println("|1) Account       2) Wallet ");
        System.out.println("|3) Analysis      4) Budget        ");
        System.out.println("|5) Exit   ");
              
    }
        
               
        public void walletMenu(){
    
        System.out.println();    
        System.out.println("Wallet Menu");
        System.out.println();
        
        System.out.println("+----------------------------------+");
        System.out.println("|1) Add cash       2) Take out cash ");
        System.out.println("|3) Analysis              ");
        System.out.println("|4) Exit   ");
              
    }
    
        public void  analysisMenu(){
        
                    System.out.println();    
        System.out.println("Analysis Menu");
        System.out.println();
        
        System.out.println("+----------------------------------+");
        System.out.println("|1) Budget Analysis ");
        System.out.println("|2) Transaction Analysis");
        System.out.println("|3) Wallet Analysis");
        
        }
    
}
