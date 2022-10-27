package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Ziel {
    public Ziel() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat(" "));
        ArrayList<String> lore = new ArrayList();
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
