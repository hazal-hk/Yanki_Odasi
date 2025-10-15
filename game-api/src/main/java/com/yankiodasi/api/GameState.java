package com.yankiodasi.api;

import java.util.HashMap;
import java.util.Map;

public class GameState {
    private final Player player;
    private final Map<String, Object> storyFlags;

    public GameState(Player player) {
        this.player = player;
        this.storyFlags = new HashMap<>();
    }

    public Player getPlayer() {
        return player;
    }

    public void setFlag(String key, Object value) {
        System.out.println("[Status Updated: " + key + " -> " + value + "]");
        this.setFlag.put(key, amount);
    }

    public Object getFlag(String key) {
        return storyFlags.get(key);
    }
}