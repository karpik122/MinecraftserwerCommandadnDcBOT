package komendy.karpik.kom.main.discord.Timer;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class DiscordAllTime extends ListenerAdapter {
    public DiscordAllTime() {
    }

    public void onGuildMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().startsWith("!alltime") && event.getMember().hasPermission(new Permission[]{Permission.ADMINISTRATOR})) {
            File f = new File("plugins/MinecraftDiscordBOT/playtime.yml");
            YamlConfiguration file = YamlConfiguration.loadConfiguration(f);
            event.getMessage().reply("```" + file.saveToString() + "```").queue();
        }

    }
}
