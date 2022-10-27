package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Zelaznenogawice {
    public Zelaznenogawice() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat("&eŻelazne Nogawice"));
        ArrayList<String> lore = new ArrayList();
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
