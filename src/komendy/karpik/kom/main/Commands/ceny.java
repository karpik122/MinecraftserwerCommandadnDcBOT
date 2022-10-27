package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ceny implements CommandExecutor {
    private Main plugin;

    public ceny(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("ceny").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&2Cena założenia Miasta: &a2000$"));
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&2Cena utrzymania Miasta: &a50$"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}