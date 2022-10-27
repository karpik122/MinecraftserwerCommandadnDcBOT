package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class opisrangm implements CommandExecutor {
    private Main plugin;

    public opisrangm(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("opisrangm").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            p.sendMessage(ChatColor.DARK_GRAY + "-------------------[" + ChatColor.AQUA + ChatColor.BOLD + "Mine" + ChatColor.YELLOW + ChatColor.BOLD + "MedievalRP" + ChatColor.DARK_GRAY + "]---------------------");
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&a&lAsystent"));
            p.sendMessage(Utilities.chat(""));
            p.sendMessage(Utilities.chat("&bNie płaci podatków"));
            p.sendMessage(Utilities.chat("&bOminięcie zakazów budowania, niszczenia, używania itemów, przełączania w mieście"));
            p.sendMessage(Utilities.chat("&bMożliwość dodawania graczy do miasta"));
            p.sendMessage(Utilities.chat("&bMożliwość wyrzucania graczy z miasta"));
            p.sendMessage(Utilities.chat("&bMożliwość przejmowania chunk'ów do miata"));
            p.sendMessage(Utilities.chat("&bPełny dostęp do komendy /resident"));
            p.sendMessage(Utilities.chat("&bPełny dostęp do komendy /plot"));
            p.sendMessage("");
            p.sendMessage(Utilities.chat("&a&lPomocnik"));
            p.sendMessage(Utilities.chat(""));
            p.sendMessage(Utilities.chat("&bOminięcie zakazów budowania, niszczenia, używania itemów, przełączania w mieście"));
            p.sendMessage(Utilities.chat("&bMożliwość przejmowania chunk'ów do miata"));
            p.sendMessage("");
            p.sendMessage(ChatColor.DARK_GRAY + "-----------------------------------------------------");
            return false;
        }
    }
}
