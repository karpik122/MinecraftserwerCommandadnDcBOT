package komendy.karpik.kom.main.discord.Timer;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class DiscordCheck extends ListenerAdapter {
    public DiscordCheck() {
    }

    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().startsWith("!playtime")) {
            File f = new File("plugins/MinecraftDiscordBOT/playtime.yml");
            YamlConfiguration file = YamlConfiguration.loadConfiguration(f);
            String query = event.getMessage().getContentRaw().replace("!playtime ", "");
            if (file.get(query) == null) {
                event.getMessage().reply("Nie ma takiego gracza!").queue();
                return;
            }

            int minutes = file.getInt(query);
            int h = minutes / 60;
            if (h == 0) {
                event.getMessage().reply("**" + query + "** ma **" + minutes + "** minut na serwerze minecraft.").queue();
                return;
            }

            event.getMessage().reply("**" + query + "** ma **" + h + "** godzin na serwerze minecraft *(" + minutes + ") minut*.").queue();
        }

    }
}
