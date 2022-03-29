class Gib5_nicht_threadsicher {
    
    int zwischenergebnis = 0;
    
    int gib5() {
        zwischenergebnis += 3000;
        zwischenergebnis++; //3001
        zwischenergebnis++; //3002
        zwischenergebnis++; //3003
        zwischenergebnis++; //3004
        zwischenergebnis++; //3005
        int rueckgabe = zwischenergebnis - 3000;
        zwischenergebnis = 0;
        return rueckgabe;
    }
}
