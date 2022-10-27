package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class inne implements CommandExecutor {
    private Main plugin;

    public inne(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("inne").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&6/pay (nick gracza) (kwota) &8- &bWysyła hajs do gracza "));
            p.sendMessage(Utilities.chat("&6/trade (nick gracza) &8- &bWymieniasz  sie z innym graczem lecz pamientaj musisz być blisko niego"));
            p.sendMessage(Utilities.chat("&6/gc &8- &bGlobalny Chat"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
