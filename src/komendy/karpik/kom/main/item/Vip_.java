package komendy.karpik.kom.main.item;

import java.util.ArrayList;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Vip_ {
    public Vip_() {
    }

    public static ItemStack getItem(Player p) {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utilities.chat("&eRanga &8[&eVIP&a+&8] &e"));
        ArrayList<String> lore = new ArrayList();
        lore.add(Utilities.chat("&bCena na edycjęc&8: &a40 zł"));
        lore.add(" ");
        lore.add(Utilities.chat("&bPrefix&8: &8[&eVIP&a+&8]" + p.getName()));
        lore.add(" ");
        lore.add(Utilities.chat("&bPrzywileje&8:"));
        lore.add(Utilities.chat("&aMożliwoś pisania na wyłączonym Chat'cie"));
        lore.add(Utilities.chat("&aMożliwość pisania kolorami na Chat'cie"));
        lore.add(Utilities.chat("&aMożliwość pisania kolorami na tabliczkach"));
        lore.add(Utilities.chat("&aMożliwość zmiany koloru nicku &6/kolor"));
        lore.add(Utilities.chat("&aDostęp do komendy &6/workbench"));
        lore.add(Utilities.chat("&aDostęp do komendy &6/enderchest"));
        lore.add(Utilities.chat("&aDostęp do komendy &6/feed"));
        lore.add(Utilities.chat("&aDostęp do komendy &6/hat"));
        lore.add(Utilities.chat("&aKolorowy nick na Chat'cie i na Tabie"));
        lore.add(Utilities.chat("&aDostęp do zestawu VIP+"));
        lore.add(Utilities.chat("&a20% Zniżki na zakupy umiejętności"));
        lore.add(Utilities.chat("&aDodatkowy Slot"));
        lore.add(Utilities.chat("&aSkrzydła"));
        lore.add(Utilities.chat("&aCustomowe obrazy"));
        lore.add(Utilities.chat("&aCustomowe rolowa na serwerze Discord"));
        lore.add(Utilities.chat("&aPrywatny kanał dla VIP na serwerze Discord"));
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
