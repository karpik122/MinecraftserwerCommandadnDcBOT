package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tagi implements CommandExecutor {
    private Main plugin;

    public tagi(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("tagi").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&8<&aM&8> - &bGracz należy do tego samego miasta co ty"));
            p.sendMessage(Utilities.chat("&8<&bN&8> - &bGracz należy do tego samego państwa co ty"));
            p.sendMessage(Utilities.chat("&8<&aS&8> - &bGracz należy do państwa które jest sojusznikiem twojego państwa"));
            p.sendMessage(Utilities.chat("&8<&cW&8> - &bGracz należy do państwa które jest uznane za wroga twojego państwa"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
