package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class miasto implements CommandExecutor {
    private Main plugin;

    public miasto(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("miasto").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&6/t &8- &bPokazuje wszystko o twoim mieście"));
            p.sendMessage(Utilities.chat("&6/t new (nazwa miasta) &8- &bTworzy nowe miasto"));
            p.sendMessage(Utilities.chat("&6/t claim &8-  &bPrzejmuje chunki dla twojego miasta"));
            p.sendMessage(Utilities.chat("&6/t unclaim &8- &bUsuwa chunki dla twojego miasta"));
            p.sendMessage(Utilities.chat("&6/t deposit (kwota) &8- &bWpłaca pieniądze do banku miasta"));
            p.sendMessage(Utilities.chat("&6/t withdraw (kwota) &8- &bZabiera pieniądze z banku miasta"));
            p.sendMessage(Utilities.chat("&6/t add (nick gracza) &8- &bWysyła zaproszenie dla gracza by dołoczył do miasta"));
            p.sendMessage(Utilities.chat("&6/t kick (nick gracza) &8- &bUsuwa gracza z miasta"));
            p.sendMessage(Utilities.chat("&6/tc &8- &bChat miasta"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
