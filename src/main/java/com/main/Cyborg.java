package com.main;

public class Cyborg extends CharacterClass {

    private String name; // che può essere solo Molly Millions o Armitage
    private int baseHealth = 120; // salute (base)
    private int baseStamina = 80; // resistenza (base)
    private int power;
    // nuovi attributi (Solo per i Cyborg)
    private int wideVision = 50; // visione in ampiezza
    private int lengthwiseVision = 50; // visione in larghezza
    private String ip_Cyborg; // indirizzo ip del cyborg per collegarsi in rete

    public Cyborg(String Name, int power) {
        // istanziamo il valore degli attributi della superclasse (CharacterClass) assegnando ad essi quelli della sottoclasse (Hacker)
        super.setName(name);
        super.setBaseHealth(baseHealth);
        super.setBaseStamina(baseStamina);
        super.setPower(power);
    }

    public String getIpCyborg() {
        return ip_Cyborg;
    }

    @Override
    public void specialAbility(String abilityChoice) {
        // Implementa l'abilità speciale dell'Hacker
        switch (abilityChoice) {
            case "Power Up": // Potenzia il fisico
                super.baseHealth = super.baseHealth * 2; // raddoppia la salute
                super.baseStamina = super.baseStamina * 2; // raddoppia la resistenza
                break;
            case "Enhanced Vision": // Raddoppia il campo visivo del cyborg
                wideVision = wideVision * 2;
                lengthwiseVision = lengthwiseVision * 2;
                break;
            case "Match": // connette alla rete il cyborg
                tryToConnect();
                break;
            default:
                System.out.println("Errore: abilità non valida");
        } // fine di switch
    } // fine del metodo specialAbility

    public void tryToConnect() {
        System.out.println("Trying to connect " + getName() +  "IP: " + getIpCyborg());
    }
}
