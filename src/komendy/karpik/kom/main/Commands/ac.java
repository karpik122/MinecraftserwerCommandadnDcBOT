package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Iterator;

public class ac implements CommandExecutor {
    private Main plugin;

    public ac(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("ac").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            if (p.hasPermission("admin.chat")) {
                if (args.length > 0) {
                    StringBuilder sb = new StringBuilder();

                    for(int i = 0; i < args.length; ++i) {
                        sb.append(args[i]).append(" ");
                    }

                    String msg = sb.toString().replace("&", "§");
                    Iterator var9 = Bukkit.getOnlinePlayers().iterator();

                    while(var9.hasNext()) {
                        Player players = (Player)var9.next();
                        if (players.hasPermission("admin.chat")) {
                            players.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "AC" + ChatColor.DARK_GRAY + "] " + ChatColor.RED + p.getDisplayName() + ChatColor.DARK_GRAY + " >> " + ChatColor.RED + msg);
                        }
                    }
                } else {
                    p.sendMessage(Utilities.chat("&8[&b&lMinel&e&lMedivalRP&8] &cPoprawne użycie: /ac <tekst>"));
                }
            } else {
                p.sendMessage(Utilities.chat("&8[&b&lMinel&e&lMedivalRP&8] &cNie masz uprawnień do tej komendy!"));
            }

            return false;
        }
    }
}