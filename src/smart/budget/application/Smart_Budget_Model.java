/*

*/
package smart.budget.application;

/**
 *
 * @author labsadmin
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import java.util.Set;
//import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

public class Smart_Budget_Model {

    private  SessionFactory factory;
    private  List<Budget> budgetList = new ArrayList<>();
    private  List<SmartTransaction> transactionList = new ArrayList<>();
        
    
     
    public Budget addBudget(){
        
          System.out.println("---Add a budget---");
        Smart_Budget_Model app = new Smart_Budget_Model();
        Date currentDate = new Date ();
        Budget budget = new Budget();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter budget name");
        budget.setBudgName(keyboard.next());
        System.out.println("Enter budget Amount");
        budget.setBudgAmnt(keyboard.nextDouble());
        System.out.println("Enter budhet Cartegory");
        budget.setBudgCat(keyboard.next());
        budget.setBudgDate((new Date()).toString());
      
        
        /*if(app.addBudget(budget.getBudgName(),budget.getBudgAmnt(),budget.getBudgCat(),currentDate)){
            
 
        
        }*/
        return budget;
    }
    
    public  boolean addBudgetToDB(){

       //SessionFactory session = new AnnotationConfiguration().configure().buildSessionFactory();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        //budgDate = new Date();
      
        
        //String textDate = budgDate.toString();
        try{
        
            transaction =  session.beginTransaction();
            //Budget budget = new Budget(budgName,  budgAmnt, budgCat, textDate);
          
            System.out.println("Before Save Session");
            session.save( addBudget());
            System.out.println("After Save Session");
            transaction.commit();
          
        }
        catch(Exception ioe){
        
            System.out.println("Could not add budget");
            System.out.println("message: " + ioe.getMessage() );
         
            
            if(transaction != null){
            
                transaction.rollback();
            }
        }
        finally{
        
            session.close();
        }
        
        return true;
        
    }
    
    
    
}
