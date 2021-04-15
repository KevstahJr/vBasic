package ga.atlasorb.basic;

import ga.atlasorb.basic.commands.*;
import ga.atlasorb.basic.commands.anticheataddon.ForceBanCommand;
import ga.atlasorb.basic.commands.chatcontrol.ClearChatCommand;
import ga.atlasorb.basic.hear.BasicListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Random;

public class Basic<interval> extends JavaPlugin {

    public static Basic instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new BasicListener(this), this);
        this.getCommand("forceban").setExecutor(new ForceBanCommand(this));
        this.getCommand("clearchat").setExecutor(new ClearChatCommand(this));
        this.getCommand("reboot").setExecutor(new RebootCommand(this));
        this.getCommand("tp").setExecutor(new TeleportCommand(this));
        this.getCommand("tppos").setExecutor(new TeleportCoordsCommand(this));
        this.getCommand("enderchest").setExecutor(new EnderChestCommand(this));
        this.getCommand("tphere").setExecutor(new TeleportHereCommand(this));
        this.getCommand("clear").setExecutor(new ClearCommand(this));
        this.getCommand("kill").setExecutor(new KillCommand(this));
        this.getCommand("fly").setExecutor(new FlyCommand(this));
        this.getCommand("gamemode").setExecutor(new GamemodeCommand(this));
        this.getCommand("checkrank").setExecutor(new CheckRankCommand(this));
        this.getCommand("invsee").setExecutor(new InvseeCommand(this));
        this.getCommand("heal").setExecutor(new HealCommand(this));
        this.getCommand("showmethedoor").setExecutor(new ShowMeTheDoorCommand(this));
        this.getCommand("invsee").setExecutor(new InvseeCommand(this));
        this.getCommand("prefix").setExecutor(new TagCommand(this));
        this.getCommand("broadcast").setExecutor(new BroadcastCommand(this));
        this.getCommand("bal").setExecutor(new BalanceCommand(this));
        this.getCommand("rank").setExecutor(new RankCommand(this));
        this.getCommand("discord").setExecutor(new DiscordCommand(this));
        this.getCommand("donate").setExecutor(new DonateCommand(this));
        this.getCommand("help").setExecutor(new HelpCommand(this));
        this.getCommand("list").setExecutor(new ListCommand(this));
        this.getCommand("ping").setExecutor(new PingCommand(this));
        this.getCommand("vote").setExecutor(new VoteCommand(this));


    }

    @Override
    public void onDisable() {

    }
}

