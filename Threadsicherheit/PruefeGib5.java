
class PruefeGib5 {
    public static void main(String[] args) {
        Gib5_nicht_threadsicher gib5 = new Gib5_nicht_threadsicher();
        
        PruefeGibThread threadA = new PruefeGibThread(gib5);
        PruefeGibThread threadB = new PruefeGibThread(gib5);
        
        threadA.start();
        threadB.start();
    }
}

class PruefeGibThread extends Thread {
    Gib5_nicht_threadsicher gib5;
    
    PruefeGibThread(Gib5_nicht_threadsicher pGib5) {
        gib5 = pGib5;
    }
    
    public void run() {
        for (int i = 0; i < 1000; i++) {
           int erwarte5 = gib5.gib5();
           if (erwarte5 != 5) {
                System.out.println("fehler! erarte5=" + erwarte5);
            }
            
        }
    }
}
