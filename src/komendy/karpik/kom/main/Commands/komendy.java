

package komendy.karpik.kom.main.Commands;

import komendy.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class komendy implements CommandExecutor {
    private Main plugin;

    public komendy(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("komendy").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(ChatColor.GOLD + "/miasto" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Podstawowe komendy miast");
            p.sendMessage(ChatColor.GOLD + "/panstwo" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Podstawowe komendy państw");

            p.sendMessage(ChatColor.GOLD + "/abilities" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Klasy postaci i ich umiejętności");
            p.sendMessage(ChatColor.GOLD + "/inne" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Inne podstawowe komendy");
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}