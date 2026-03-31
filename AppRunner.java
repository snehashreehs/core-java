class AppRunner{

   public static void main(String[] args) {
 App app1 = new App();
 
 app1.companyName ="meta";
 app1.appName="insta"; 
 app1.userName ="JONY@123";
app1.id =43125;
 app1.personName= "jony";
 app1.isActive =true;
  app1.phnNo= 91147789;
  
   App app2 = new App();
    app2.companyName ="meta";
 app2.appName="watsapp"; 
 app2.userName ="impi@123";
app2.id =742125;
 app2.personName= "impika";
 app2.isActive =false;
  app2.phnNo= 751147789;
 
 App app3 = new App();
 
  app3.companyName ="meta";
 app3.appName="facebook"; 
 app3.userName ="vidhya@123";
app3.id =61515;
 app3.personName= "vidhya";
 app3.isActive =true;
  app3.phnNo= 91147789;
  
  App app4 = new App();
  
   app4.companyName ="meta";
 app4.appName="snapchat"; 
 app4.userName ="sowndu@123";
app4.id =81425;
app4.isActive =false;
  app4.phnNo= 911187789;
  
 
   System.out.println(" ***** printing the statement*****");
    System.out.println("app1 companyName: " + app1.companyName);
     System.out.println("app1 appName: " + app1.appName);
	 System.out.println("app1 userName :"+ app1.userName);
	 System.out.println("app1 id : "+app1.personName);
    System.out.println("app1 personName: " + app1.personName);
	System.out.println("app1 isActive:"+ app1.phnNo);
	
   System.out.println(" ***** printing the statement*****");
  System.out.println("app2 companyName: " + app2.companyName);
     System.out.println("app2 appName: " + app2.appName);
	 System.out.println("app2 userName :"+ app2.userName);
	 System.out.println("app2 id : "+app2.personName);
    System.out.println("app2 personName: " + app2.personName);
	System.out.println("app2 isActive:"+ app2.phnNo);
	
	 System.out.println(" ***** printing the statement*****");
  System.out.println("app3 companyName: " + app3.companyName);
     System.out.println("app3 appName: " + app3.appName);
	 System.out.println("app3 userName :"+ app3.userName);
	 System.out.println("app3 id : "+app3.personName);
    System.out.println("app3 personName: " + app3.personName);
	System.out.println("app3 isActive:"+ app3.phnNo);

	 System.out.println(" ***** printing the statement*****");
  System.out.println("app4 companyName: " + app4.companyName);
     System.out.println("app4 appName: " + app4.appName);
	 System.out.println("app4 userName :"+ app4.userName);
	 System.out.println("app4 id : "+app4.personName);
    System.out.println("app4 personName: " + app4.personName);
	System.out.println("app4 isActive:"+ app4.phnNo);

	   }
}