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
    	System.out.println("Hello ");
        Session session=HibernateUtil.getSessionFactory().openSession();
        System.out.println("object "+session);
        session.beginTransaction();
        
        PayMent payMent=new PayMent();
        payMent.setPaymentid(100);
        payMent.setAmount(1000);
        
        Cheque cheque=new Cheque();
        cheque.setPaymentid(101);
        cheque.setAmount(2000);
        cheque.setChequeType("ICIC");
        
        CreaditCard card=new CreaditCard();
        card.setPaymentid(102);
        card.setAmount(3000);
        card.setCreaditCardType("VISA");
        
        session.save(cheque);
        session.save(card);
        
        System.out.println("saved successfully");
        
        session.getTransaction().commit();
        session.close();
        
    }
}
