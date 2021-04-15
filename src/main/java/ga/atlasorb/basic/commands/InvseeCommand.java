package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand extends BootstrappedCommand {
    public InvseeCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.invsee")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            final Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <player>"));
            return true;
        } else {
            final Player player = (Player) sender;
            final Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {
                player.openInventory(target.getInventory());
                final String replaced = PlaceholderAPI.setPlaceholders(target, "%vault_prefix_color%");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Opening Inventory of: " + replaced + args[0] + "&6!"));
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo player with the name '" + args[0] + "' found!"));

            }
        }
        return true;
    }
}