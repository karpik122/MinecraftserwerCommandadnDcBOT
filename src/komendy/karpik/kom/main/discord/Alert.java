package komendy.karpik.kom.main.discord;

import lombok.SneakyThrows;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class Alert implements CommandExecutor {
    public Alert() {
    }

    @SneakyThrows
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        try {
            File f = new File("plugins/MinecraftDiscordBOT/alerts.yml");
            YamlConfiguration file = YamlConfiguration.loadConfiguration(f);
            if (!(sender instanceof Player)) {
                String content = "";

                for(int i = 0; i < args.length; ++i) {
                    content = content + " " + args[i];
                }

                file.set("activealert", true);
                file.set("alert", content);
                file.save(f);
            }

            return false;
        } catch (Throwable var9) {
            throw var9;
        }
    }
}
