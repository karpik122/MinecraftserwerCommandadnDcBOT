package komendy.karpik.kom.main.events;

import komendy.karpik.kom.main.gui.gui;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class onZestawvip_ implements Listener {
    public onZestawvip_() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().contains("§2Zestaw VIP+")) {
            if (e.getCurrentItem() != null) {
                if (e.getCurrentItem().getItemMeta() != null) {
                    Player p = (Player)e.getWhoClicked();
                    e.setCancelled(true);
                    if (e.getClickedInventory().getType() != InventoryType.PLAYER) {
                        if (e.getSlot() == 25) {
                            gui.OpenGUI(p);
                        }
                    }
                }
            }
        }
    }
}
