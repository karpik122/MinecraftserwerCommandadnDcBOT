package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class panstwo implements CommandExecutor {
    private Main plugin;

    public panstwo(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("panstwo").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&6/n &8- &bpokazuje wszystko o twoim państwie"));
            p.sendMessage(Utilities.chat("&6/n new (nazwa państwa) &8- &btworzy państwo"));
            p.sendMessage(Utilities.chat("&6/n deposit (kwota) &8- &bWpłaca pieniądze do banku państwa"));
            p.sendMessage(Utilities.chat("&6/n withdraw (kwota) &8- &bZabiera pieniądze z banku państwa"));
            p.sendMessage(Utilities.chat("&6/n add (nazwa miasta) &8- &bZaprasza / Dodaje miasto do twojego narodu"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
