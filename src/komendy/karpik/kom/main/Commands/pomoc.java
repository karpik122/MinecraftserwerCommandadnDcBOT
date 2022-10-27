package komendy.karpik.kom.main.Commands;

import komendy.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class pomoc implements CommandExecutor {
    private Main plugin;

    public pomoc(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("pomoc").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(ChatColor.GOLD + "/komendy" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Komendy miast, państw, Slimefun'a oraz inne");
            p.sendMessage(ChatColor.GOLD + "/opisrang" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Opisy rang w mieście oraz w państwie");
            p.sendMessage(ChatColor.GOLD + "/tagi" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Opisy TAG'ów przed nickiem gdy należysz do jakiegoś miasta");
            p.sendMessage(ChatColor.GOLD + "/ceny" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Informacje o cenach miast");
            p.sendMessage(ChatColor.GOLD + "/discord" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Link zaproszeniowy do naszego discord'a");
            p.sendMessage(ChatColor.GOLD + "/regulamin" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Regulamin serwera");
            p.sendMessage(ChatColor.GOLD + "/dynmapa" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Link do dynmapy serwera");
            p.sendMessage(ChatColor.GOLD + "/rangi" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Informacje o rangach VIP");
            p.sendMessage(ChatColor.GOLD + "/itemshop" + ChatColor.DARK_GRAY + " - " + ChatColor.AQUA + "Link do itemshop'u");
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}

