package komendy.karpik.kom.main.discord.Discord;

import komendy.Main;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import org.bukkit.Bukkit;

import java.util.TimerTask;

public class StatusUpdater extends TimerTask {
    JDA jda = Main.getJda();

    public StatusUpdater() {
    }

    public void run() {
        int pn = Bukkit.getServer().getOnlinePlayers().size();
        int ps = Bukkit.getServer().getMaxPlayers();
        if (pn == 0) {
            this.jda.getPresence().setStatus(OnlineStatus.IDLE);
        } else if (pn == ps) {
            this.jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
        } else {
            this.jda.getPresence().setStatus(OnlineStatus.ONLINE);
        }

        this.jda.getPresence().setActivity(Activity.watching(pn + " graczy na serwerze Minecraft!"));
    }
}
