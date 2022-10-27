package komendy.karpik.kom.main.Commands;

import komendy.karpik.kom.main.Utilities.Utilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chat implements CommandExecutor, Listener {
    public static boolean chat = true;

    public chat() {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String lab, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("Chat")) {
            return false;
        } else if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Jedynie gracz może używać tej komendy");
            return true;
        } else {
            Player p = (Player)sender;
            if (!sender.hasPermission("chat.adm")) {
                p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cNie masz uprawnień do tej komendy!"));
                return true;
            } else if (args.length != 1) {
                sender.sendMessage(Utilities.chat("&8--------------------[&b&lMine&e&lMedievalRP&8]--------------------"));
                sender.sendMessage(Utilities.chat("&c "));
                sender.sendMessage(Utilities.chat("&6/chat on &8- &aWłącza Chat&8."));
                sender.sendMessage(Utilities.chat("&6/chat off &8- &aWyłącza Chat&8."));
                sender.sendMessage(Utilities.chat("&6/chat clear&8/&6c &8- &aCzyści Chat&8."));
                sender.sendMessage(Utilities.chat("&c "));
                sender.sendMessage(Utilities.chat("&8-----------------------------------------------------"));
                return true;
            } else if (args[0].equalsIgnoreCase("on")) {
                if (!chat) {
                    chat = true;
                    p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &aWłączyłeś Chat!"));
                    Bukkit.broadcastMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &aChat został włączony przez &6" + p.getName() + ChatColor.DARK_GRAY + "."));
                    return true;
                } else {
                    p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &aChat jest już włączony!"));
                    return true;
                }
            } else if (args[0].equalsIgnoreCase("off")) {
                if (chat) {
                    chat = false;
                    p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cWyłączyłeś Chat!"));
                    Bukkit.broadcastMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cChat został wyłączony przez &6" + p.getName() + ChatColor.DARK_GRAY + "."));
                    return true;
                } else {
                    p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cChat jest już wyłączony!"));
                    return true;
                }
            } else if (!args[0].equalsIgnoreCase("clear") && !args[0].equalsIgnoreCase("c")) {
                sender.sendMessage(Utilities.chat("&8--------------------[&b&lMine&e&lMedievalRP&8]--------------------"));
                sender.sendMessage(Utilities.chat("&c "));
                sender.sendMessage(Utilities.chat("&cPoprawne użycie:"));
                sender.sendMessage(Utilities.chat("&c "));
                sender.sendMessage(Utilities.chat("&6/chat on &8- &aWłącza Chat&8."));
                sender.sendMessage(Utilities.chat("&6/chat off &8- &aWyłącza Chat&8."));
                sender.sendMessage(Utilities.chat("&6/chat clear&8/&6c &8- &aCzyści Chat&8."));
                sender.sendMessage(Utilities.chat("&c "));
                sender.sendMessage(Utilities.chat("&8-----------------------------------------------------"));
                return true;
            } else {
                for(int i = 0; i < 150; ++i) {
                    Bukkit.broadcastMessage(" ");
                }

                Bukkit.broadcastMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &bChat został wyczyszczony przez &6" + p.getName() + ChatColor.DARK_GRAY + "."));
                return true;
            }
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPermission("chat.pisanie") && !chat) {
            p.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cChat jest aktualnie wyłączony&8."));
            e.setCancelled(true);
        }

    }
}
