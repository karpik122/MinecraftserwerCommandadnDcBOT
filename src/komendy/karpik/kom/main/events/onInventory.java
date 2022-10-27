package komendy.karpik.kom.main.events;

import komendy.karpik.kom.main.gui.zestawvip_gui;
import komendy.karpik.kom.main.gui.zestawvipgui;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class onInventory implements Listener {
    public onInventory() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().contains("§2Rangi VIP")) {
            if (e.getCurrentItem() != null) {
                if (e.getCurrentItem().getItemMeta() != null) {
                    Player p = (Player)e.getWhoClicked();
                    e.setCancelled(true);
                    if (e.getClickedInventory().getType() != InventoryType.PLAYER) {
                        if (e.getSlot() != 12) {
                            if (e.getSlot() != 14) {
                                if (e.getSlot() == 21) {
                                    zestawvipgui.OpenGUI(p);
                                } else if (e.getSlot() == 23) {
                                    zestawvip_gui.OpenGUI(p);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
