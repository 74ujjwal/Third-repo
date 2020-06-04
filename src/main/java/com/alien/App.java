package com.alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	Alien alien = new Alien();
	alien.setaId(101);
	alien.setaName("Ujjwal Basnet");
	alien.setColor("Grenn");
	
	Configuration con = new Configuration();
	SessionFactory sf = con.buildSessionFactory();
	
	Session session = sf.openSession();
	session.save(alien);
	
}
}
