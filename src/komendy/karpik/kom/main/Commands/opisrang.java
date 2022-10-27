package komendy.karpik.kom.main.Commands;


import komendy.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class opisrang implements CommandExecutor {
    private Main plugin;

    public opisrang(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("opisrang").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(ChatColor.GOLD + "/opisrangm" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Opis podstawowych rang w mieście");
            p.sendMessage(ChatColor.GOLD + "/opisrangp" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Opis podstawowych rang w państwie");
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
