package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportHereCommand extends BootstrappedCommand {
    public TeleportHereCommand(Basic basic) {
        super(basic);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.teleporthere")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <player>"));
            return true;
        } else {
            final Player player = (Player) sender;
            final Player target = Bukkit.getPlayerExact(args[0]);
            if (target instanceof Player) {
                Location location = player.getLocation();
                target.teleport(location);
                final String replaced = PlaceholderAPI.setPlaceholders(target, "%vault_prefix_color%");
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Teleporting " + replaced + args[0] + " &6to you&f."));
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo player with the name " + args[0] + " found!"));
            }

        }
        return true;
    }
}