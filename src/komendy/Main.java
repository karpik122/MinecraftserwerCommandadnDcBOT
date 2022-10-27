package komendy;

import komendy.karpik.kom.main.Commands.*;
import komendy.karpik.kom.main.discord.Alert;
import komendy.karpik.kom.main.discord.AlertDisplayer;
import komendy.karpik.kom.main.discord.AutoMessages;
import komendy.karpik.kom.main.discord.Discord.StatusUpdater;
import komendy.karpik.kom.main.discord.Logi.CommandLogger;
import komendy.karpik.kom.main.discord.Reports;
import komendy.karpik.kom.main.discord.Timer.Counter;
import komendy.karpik.kom.main.events.onInventory;
import komendy.karpik.kom.main.events.onZestawvip;
import komendy.karpik.kom.main.events.onZestawvip_;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Objects;
import java.util.Timer;


public class Main extends JavaPlugin implements Listener {
    public static JDA jda;
    public static Main main;

    public Main() {
    }

    public void onEnable() {
        super.onEnable();

        saveDefaultConfig();

        String token = getConfig().getString("TOKEN");
        if (token == null) {
            getServer().getPluginManager().disablePlugin(this);
            getLogger().severe("Proszę podać Token w pliku config.yml");
            return;
        }
        jda = JDABuilder.createDefault(token)
                .build();

        Bukkit.getConsoleSender().sendMessage(" ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄ ");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌          ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌▐░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▀▀▀▀▀▀█░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌       ▐░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        Bukkit.getConsoleSender().sendMessage(" ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀ ");
        Bukkit.getConsoleSender().sendMessage("");
        try {
            System.out.println(ChatColor.RED + "MinecraftDiscordBOT - Ładowanie");
            System.out.println(ChatColor.GREEN + "MinecraftDiscordBOT - Zalogowano jako " + jda.getSelfUser().getName() + "#" + jda.getSelfUser().getDiscriminator() + " (" + jda.getSelfUser().getId() + ")");
            this.getServer().getPluginManager().registerEvents(this, this);
            this.getServer().getPluginManager().registerEvents(new CommandLogger(), this);
            this.getServer().getPluginManager().registerEvents(new AutoMessages(), this);
            Objects.requireNonNull(this.getCommand("report")).setExecutor(new Reports());
            Objects.requireNonNull(this.getCommand("alert")).setExecutor(new Alert());
            Timer timer = new Timer();
            timer.schedule(new StatusUpdater(), 0L, 30000L);
            timer.schedule(new AutoMessages(), 0L, 600000L);
            timer.schedule(new Counter(), 0L, 60000L);
            timer.schedule(new AlertDisplayer(), 0L, 1000L);
            File f = new File("plugins/MinecraftDiscordBOT/alerts.yml");
            YamlConfiguration file = YamlConfiguration.loadConfiguration(f);
            file.set("activealert", false);
            file.save(f);
        } catch (Throwable ignored) {

        }
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Komendy] " + ChatColor.AQUA + "Plugin zrobiony przez karpik122 został załadowany pomyślnie!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Ps. Jeśli to czytasz to nie opierdalaj się.");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(" ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄ ");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌          ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌▐░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▀▀▀▀▀▀█░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌       ▐░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        Bukkit.getConsoleSender().sendMessage(" ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀ ");
        new pomoc(this);
        new ceny(this);
        new discord(this);
        new regulamin(this);
        new dynmapa(this);
        new ac(this);
        new rangi(this);
        new itemshop(this);
        new komendy(this);
        new miasto(this);
        new panstwo(this);
        new inne(this);
        new opisrang(this);
        new opisrangm(this);
        new opisrangp(this);
        new tagi(this);

        Bukkit.getServer().getPluginManager().registerEvents(new chat(), this);
        this.getServer().getPluginManager().registerEvents(new onInventory(), this);
        this.getServer().getPluginManager().registerEvents(new onZestawvip(), this);
        this.getServer().getPluginManager().registerEvents(new onZestawvip_(), this);
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(" ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄ ");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌          ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌▐░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▀▀▀▀▀▀█░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌       ▐░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        Bukkit.getConsoleSender().sendMessage(" ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀ ");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Komendy] " + ChatColor.AQUA + "Plugin zrobiony przez karpik122 został wyłączony pomyślnie!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Ps. Jeśli to czytasz to nie opierdalaj się.");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(" ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄ ");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌          ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌▐░░░░░░░░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌ ▀▀▀▀▀▀█░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░▌       ▐░▌▐░▌       ▐░▌");
        Bukkit.getConsoleSender().sendMessage("▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌");
        Bukkit.getConsoleSender().sendMessage("▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌");
        Bukkit.getConsoleSender().sendMessage(" ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀ ");
    }


        public static Main getMain() {
            return main;

        }
        public static JDA getJda() {

        return jda;
        }
    }
