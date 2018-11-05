package PetPack;

import java.awt.MouseInfo;

public class MovementThread implements Runnable {
	
	        boolean loop = true;
			static boolean runner= false;
			static int Ychange = 0;
			static int Xchange = 0;
			 static int yInitial=0;
			 static int yFinal = 0;
			 static int xInitial=0;
			 static int xFinal = 0;
			
			public int changeY(int yI,int yF){
				
				Ychange = yF-yI;
				
				return Ychange;
				
				
			}
			public int changeY(){
				 
				return Ychange;
			}
          public int changeX(int xI,int xF){
				
				Xchange =  xF-xI;
				
				return Xchange;
				
			}
          public int changeX(){
				 
				return Xchange;
			}
			
			
	@Override
	public void run() {
while(loop){
	try {
		Thread.sleep(10);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	while(runner){
		
       /* yInitial = GUIXlass.GOLD.getLocationOnScreen().y;
        xInitial = GUIXlass.GOLD.getLocationOnScreen().x;	
        */
        yInitial = MouseInfo.getPointerInfo().getLocation().y;
        xInitial = MouseInfo.getPointerInfo().getLocation().x;
		
       
       try {
		Thread.sleep(120);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
     
      /* yFinal = GUIXlass.GOLD.getLocationOnScreen().y;
       System.out.println(yFinal+ "   " + yInitial);
       xFinal = GUIXlass.GOLD.getLocationOnScreen().x;	
       */
       yFinal = MouseInfo.getPointerInfo().getLocation().y;
       System.out.println(yFinal+ "   " + yInitial);
       xFinal = MouseInfo.getPointerInfo().getLocation().x;
       
       try {
   		Thread.sleep(5);
   	} catch (InterruptedException e) {
   		
   		e.printStackTrace();
   	}
        
       
     changeY(yInitial, yFinal);
       changeX(xInitial, xFinal);
       
		
	}}}}

	

