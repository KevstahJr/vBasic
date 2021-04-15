package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCoordsCommand extends BootstrappedCommand {
    public TeleportCoordsCommand(Basic basic) {
        super(basic);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.teleportcoords")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            final Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <x> <y> <z>"));
            return true;
        }
        if (args.length > 3) {
            final Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <x> <y> <z>"));
            return true;
        }
        if (args.length < 3) {
            final Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <x> <y> <z>"));
            return true;
        }
        if (args.length == 3) {
            final Player player = (Player) sender;
            Location targetPos1 = new Location(player.getWorld(), Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
            player.teleport(targetPos1);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Teleported to coordinates&7: &f" + args[0] + ".0, " + args[1] + ".0, " + args[2]+ ".0"));
            return true;
        }
        return true;
    }
}
