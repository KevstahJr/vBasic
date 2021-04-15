package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    public HealCommand(final Basic basic) {
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("vbasic.heal")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            final Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You have been Healed!"));
            player.setHealth(20.0);
            player.setFoodLevel(20);
            return true;
        } else {
            final Player target = Bukkit.getPlayerExact(args[0]);
            if (target instanceof Player) {
                Player player = (Player) sender;
                final String replaced = PlaceholderAPI.setPlaceholders(target, "%vault_prefix_color%");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6You have Healed " + replaced + args[0] + "&6."));
                target.setHealth(20.0);
                target.setFoodLevel(20);
            }

        }
        return true;
    }
}
