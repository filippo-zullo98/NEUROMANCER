package com.main;


public class Hacker extends CharacterClass {
    private String name; // che può essere solo Henry Dorset Case o Dixie Flatline
    private int baseHealth = 80;
    private int baseStamina = 120;
    private int power;

    // Hacker constructor
    public Hacker(String name, int power) {
        // istanziamo il valore degli attributi della superclasse (CharacterClass) assegnando ad essi quelli della sottoclasse (Hacker)
        super.setName(name);
        super.setBaseHealth(baseHealth);
        super.setBaseStamina(baseStamina);
        super.setPower(power);
    } // fine del costruttore

    @Override
    public void specialAbility(String abilityChoice) {
        // Implementa l'abilità speciale dell'Hacker
        switch (abilityChoice) {
            case "crack":
                crackPassword();
                break;
            case "exploit":
                exploit();
                break;
            case "encrypt":
                encryptData();
                break;
            default:
                System.out.println("Errore: abilità non valida");
        } // fine di switch
    } // fine del metodo specialAbility

    private void crackPassword(){
        System.out.println("crack");
    }
    private void exploit()
    {
        System.out.println("exploit");
    }
    private void encryptData() {
        System.out.println("encrypt");
    }

}
