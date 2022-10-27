package komendy.karpik.kom.main.gui;

import komendy.karpik.kom.main.item.Czer;
import komendy.karpik.kom.main.item.Powrot;
import komendy.karpik.kom.main.item.Zelaznalopata_;
import komendy.karpik.kom.main.item.Zelaznamotyka_;
import komendy.karpik.kom.main.item.Zelaznasiekiera_;
import komendy.karpik.kom.main.item.Zelaznebuty_;
import komendy.karpik.kom.main.item.Zelaznenogawice_;
import komendy.karpik.kom.main.item.Zelaznyhelm_;
import komendy.karpik.kom.main.item.Zelaznykilof_;
import komendy.karpik.kom.main.item.Zelaznymiecz_;
import komendy.karpik.kom.main.item.Zelaznynapiersnik_;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class zestawvip_gui {
    public zestawvip_gui() {
    }

    public static void OpenGUI(Player p) {
        Inventory i = Bukkit.createInventory((InventoryHolder)null, 36, "§2Zestaw VIP+");
        ItemStack czer = Czer.getItem(p);
        ItemStack zelm = Zelaznymiecz_.getItem(p);
        ItemStack zelk = Zelaznykilof_.getItem(p);
        ItemStack zels = Zelaznasiekiera_.getItem(p);
        ItemStack zell = Zelaznalopata_.getItem(p);
        ItemStack zelma = Zelaznamotyka_.getItem(p);
        ItemStack zelh = Zelaznyhelm_.getItem(p);
        ItemStack zeln = Zelaznynapiersnik_.getItem(p);
        ItemStack zelno = Zelaznenogawice_.getItem(p);
        ItemStack zelb = Zelaznebuty_.getItem(p);
        ItemStack pow = Powrot.getItem(p);
        i.setItem(0, czer);
        i.setItem(1, czer);
        i.setItem(2, czer);
        i.setItem(3, czer);
        i.setItem(4, czer);
        i.setItem(5, czer);
        i.setItem(6, czer);
        i.setItem(7, czer);
        i.setItem(8, czer);
        i.setItem(9, czer);
        i.setItem(17, czer);
        i.setItem(18, czer);
        i.setItem(26, czer);
        i.setItem(27, czer);
        i.setItem(28, czer);
        i.setItem(29, czer);
        i.setItem(30, czer);
        i.setItem(31, czer);
        i.setItem(32, czer);
        i.setItem(33, czer);
        i.setItem(34, czer);
        i.setItem(35, czer);
        i.setItem(10, zelm);
        i.setItem(11, zelk);
        i.setItem(12, zels);
        i.setItem(13, zell);
        i.setItem(14, zelma);
        i.setItem(19, zelh);
        i.setItem(20, zeln);
        i.setItem(21, zelno);
        i.setItem(22, zelb);
        i.setItem(25, pow);
        p.openInventory(i);
    }
}
