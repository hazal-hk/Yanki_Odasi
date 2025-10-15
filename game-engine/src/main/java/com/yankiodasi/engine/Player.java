package com.yankiodasi.engine;

public class Player {
    private final String name;
    private int mentalHealth;

    public Player(String name, int FirstMentalHealth) {
        this.name = name;
        this.mentalHealth = FirstMentalHealth;
    }

    public void updateMentalHealth(int amount) {
        this.mentalHealth += amount;
        if (amount < 0) {
            if (amount <= -2) { // Ciddi düşüş için
                System.out.println("[AKIL SAĞLIĞI CİDDİ ŞEKİLDE DÜŞTÜ ]");
            } else {
                System.out.println("[AKIL SAĞLIĞI HAFİFÇE DÜŞER ]");
            }
        } else if (amount > 0) {
            System.out.println("[AKIL SAĞLIĞI HAFİFÇE TOPARLAR ]");
        }
        System.out.println("--> Mevcut Akıl Sağlığı: " + this.mentalHealth);
    }

    public String getName() {
        return name;
    }
}