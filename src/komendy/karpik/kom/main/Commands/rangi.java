package komendy.karpik.kom.main.Commands;

import komendy.Main;
import komendy.karpik.kom.main.Utilities.Utilities;
import komendy.karpik.kom.main.gui.gui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rangi implements CommandExecutor {
    Main plugin;

    public rangi(Main m) {
        this.plugin = m;
        m.getCommand("rangi").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
        if (sender instanceof Player) {
            gui.OpenGUI((Player)sender);
        } else {
            sender.sendMessage(Utilities.chat("&8[&b&lMine&e&lMedievalRP&8] &cJedynie gracz może używać tej komendy"));
        }

        return false;
    }
}