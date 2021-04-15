package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.listeners.*;
import ga.atlasorb.basic.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;

public class GamemodeCommand extends BootstrappedCommand
{
    public GamemodeCommand(final Basic basic) {
        super(basic);
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("vbasic.gamemode")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        final Player player = (Player)sender;
        if (args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <mode>"));
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("c")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fCREATIVE &6mode."));
                return true;
            }
            if (args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fCREATIVE &6mode."));
                return true;
            }
            if (args[0].equalsIgnoreCase("s")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fSURVIVAL &6mode."));
                return true;
            }
            if (args[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fSURVIVAL &6mode."));
                return true;
            }
            if (args.length > 1) {
                if (args[0].equalsIgnoreCase("creative")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fCREATIVE &6mode."));
                    return true;
                }
                if (args[0].equalsIgnoreCase("survival")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You are now in &fSURVIVAL &6mode."));
                    return true;
                }
                return true;
            }
        }
        return true;
    }
}
