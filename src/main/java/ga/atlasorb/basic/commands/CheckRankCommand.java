package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CheckRankCommand extends BootstrappedCommand {
    public CheckRankCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.checkrank")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <player>"));
            return true;
        } else {
            final Player target = Bukkit.getPlayerExact(args[0]);
            final Player player = (Player) sender;
            if (target instanceof Player) {
                final String rankcolor = PlaceholderAPI.setPlaceholders(target, "%vault_prefix_color%");
                final String rank = PlaceholderAPI.setPlaceholders(target, "%vault_rank%");
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7" + rankcolor + target.getDisplayName() + "&e's Current Network Rank is: " + rankcolor + rank + " &7&o[Forever]"));
                return true;
            }
        }
        return true;
    }
}
