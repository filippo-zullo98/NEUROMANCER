package com.main;

public abstract class CharacterClass {
    protected String name;
    protected int baseHealth;
    protected int baseStamina;
    protected int power;



    public abstract void specialAbility(String abilityChoice); // fine del metodo specialAbility

    // Character setters methods
    public void setName(String name){
        this.name = name;
    }
    public void setBaseHealth(int baseHealth){
        this.baseHealth = baseHealth;
    }
    public void setBaseStamina(int baseStamina){
        this.baseStamina = baseStamina;
    }

    public void setPower(int power){
        this.power = power;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseStamina() {
        return baseStamina;
    }

    public int getPower() {
        return power;
    }




}
