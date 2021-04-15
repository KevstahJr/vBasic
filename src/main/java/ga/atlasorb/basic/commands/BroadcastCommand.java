package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand extends BootstrappedCommand {
    public BroadcastCommand(final Basic basic) {
        super(basic);
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("vbasic.broadcast")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <message>"));
            return true;
        }
        final Player player = (Player) sender;
        final String replaced = PlaceholderAPI.setPlaceholders(player, "%vault_prefix_color%");
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&d[" + replaced + sender.getName() + "&d] " + String.join(" ", args)));
        return true;
    }
}