package com.bridgeit.model;

import org.hibernate.Session;

import com.bridgeit.utility.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Payment payment=new Payment();
        //payment.setPymntid(100);
        payment.setAmount(4000);
        
        Cheque cheque=new Cheque();
       // cheque.setPymntid(101);
        cheque.setAmount(4000);
        cheque.setChequeType("SBI");
        
        CreaditCard card=new CreaditCard();
        card.setAmount(2000);
        card.setCreaditCardType("MasterCard");
        
        session.save(payment);
        session.save(cheque);
        session.save(card);
        
        System.out.println("successfully Inserted ");
        session.getTransaction().commit();
        session.close();
    }
}
