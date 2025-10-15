package com.yankiodasi.api;

//Komut arayüzü
public interface Result {
    void apply(GameState state);
}

// Oyuncunun bir stat'ını değiştirir
public class statusChangeResult implements Result {
    private final int amount;
    // Gelecekte vicdan, paranoya gibi başka statlar için
    // private String statusName; de eklenebilir.

    public statusChangeResult(int amount) {
        this.amount = amount;
    }

    public void apply(GameState state) {
        state.getPlayer().updateMentalHealth(amount);
    }
}

// Bir story flag ayarlar.
public class FlagSettingResult implements Result {
    private final String key;
    private final Object value;

    public FlagSettingResult(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void apply(GameState state) {
        state.setFlag(key, value);
    }
}

// Sadece metin gösteren basit bir sonuç
public class showResultText implements Result {
    private final String text;

    public showResultText(String text) {
        this.text = text;
    }

    @Override
    public void apply(GameState state) {
        System.out.println(text);
    }
}