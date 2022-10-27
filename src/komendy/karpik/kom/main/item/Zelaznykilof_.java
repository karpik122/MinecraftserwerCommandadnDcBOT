package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Zelaznykilof_ {
    public Zelaznykilof_() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat("&eŻelazny Kilof"));
        ArrayList<String> lore = new ArrayList();
        lore.add(" ");
        lore.add(Utilities.chat("&bEnchanty:"));
        lore.add(Utilities.chat("&aWydajność II"));
        lore.add(Utilities.chat("&aNiezniszczalność II"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}

