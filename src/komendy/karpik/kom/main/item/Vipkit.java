package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Vipkit {
    public Vipkit() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat("&eZestaw &8[&eVIP&8]:"));
        ArrayList<String> lore = new ArrayList();
        lore.add(" ");
        lore.add(Utilities.chat("&bKliknij aby zobaczyć zestaw &8[&eVIP&8]:"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
