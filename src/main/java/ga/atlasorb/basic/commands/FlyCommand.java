package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.listeners.*;
import ga.atlasorb.basic.*;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class FlyCommand extends BootstrappedCommand
{
    public FlyCommand(final Basic basic) {
        super(basic);
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("vbasic.fly")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        final Player player = (Player)sender;
        if (player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Your fly mode was set to &fFALSE"));
            return true;
        }
        if (!player.getAllowFlight()) {
            player.setAllowFlight(true);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Your fly mode was set to &fTRUE"));
            return true;
        }
        return true;
    }
}
