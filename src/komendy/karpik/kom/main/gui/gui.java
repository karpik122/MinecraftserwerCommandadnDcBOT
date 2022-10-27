package komendy.karpik.kom.main.gui;

import komendy.karpik.kom.main.item.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class gui {
    public gui() {
    }

    public static void OpenGUI(Player p) {
        Inventory i = Bukkit.createInventory((InventoryHolder)null, 36, "§2Rangi VIP");
        ItemStack vip = Vip.getItem(p);
        ItemStack vip_ = Vip_.getItem(p);
        ItemStack vipkit = Vipkit.getItem(p);
        ItemStack vip_kit = Vip_kit.getItem(p);
        ItemStack czer = Czer.getItem(p);
        ItemStack ziel = Ziel.getItem(p);
        i.setItem(0, czer);
        i.setItem(1, czer);
        i.setItem(2, ziel);
        i.setItem(3, ziel);
        i.setItem(4, ziel);
        i.setItem(5, ziel);
        i.setItem(6, ziel);
        i.setItem(7, czer);
        i.setItem(8, czer);
        i.setItem(9, czer);
        i.setItem(10, czer);
        i.setItem(11, ziel);
        i.setItem(13, ziel);
        i.setItem(15, ziel);
        i.setItem(16, czer);
        i.setItem(17, czer);
        i.setItem(18, czer);
        i.setItem(19, czer);
        i.setItem(20, ziel);
        i.setItem(22, ziel);
        i.setItem(24, ziel);
        i.setItem(25, czer);
        i.setItem(26, czer);
        i.setItem(27, czer);
        i.setItem(28, czer);
        i.setItem(29, ziel);
        i.setItem(30, ziel);
        i.setItem(31, ziel);
        i.setItem(32, ziel);
        i.setItem(33, ziel);
        i.setItem(34, czer);
        i.setItem(35, czer);
        i.setItem(12, vip);
        i.setItem(14, vip_);
        i.setItem(21, vipkit);
        i.setItem(23, vip_kit);
        p.openInventory(i);
    }
}
