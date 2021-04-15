package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RebootCommand extends BootstrappedCommand {
    public RebootCommand(final Basic basic) {
        super(basic);
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("vbasic.reboot")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (sender instanceof Player) {
            final Player player = (Player)sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <&bnow&c>"));
            }
            else if (args[0].equalsIgnoreCase("now")) {
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&c⚠ &4&m---------------------------&c ⚠"));
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&cServer is rebooting now!"));
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&c⚠ &4&m---------------------------&c ⚠"));
                Bukkit.shutdown();
            }
            else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <&bnow&c>"));
            }
        }
        return true;
    }
}
