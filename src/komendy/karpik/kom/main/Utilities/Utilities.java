package komendy.karpik.kom.main.Utilities;

import org.bukkit.ChatColor;

public class Utilities {
    public Utilities() {
    }

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
