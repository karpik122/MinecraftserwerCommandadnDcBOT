package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Zelaznyhelm_ {
    public Zelaznyhelm_() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat("&eŻelazny Hełm"));
        ArrayList<String> lore = new ArrayList();
        lore.add(" ");
        lore.add(Utilities.chat("&bEnchanty:"));
        lore.add(Utilities.chat("&aOchrona II"));
        lore.add(Utilities.chat("&aNiezniszczalność II"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}

