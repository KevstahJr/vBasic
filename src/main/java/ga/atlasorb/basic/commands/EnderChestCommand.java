package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderChestCommand extends BootstrappedCommand {
    public EnderChestCommand(Basic basic) {super(basic);}

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.enderchest")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (args.length == 0) {
            final Player player = (Player) sender;
            player.openInventory(player.getEnderChest());
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Opening your Enderchest!"));
            return true;
        } else {
            if (sender.hasPermission("vbasic.enderchest.other")) {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    Player player = (Player) sender;
                    player.openInventory(target.getEnderChest());
                    final String replaced = PlaceholderAPI.setPlaceholders(target, "%vault_prefix_color%");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Opening " + replaced + args[0] + "&6's Enderchest!"));
                } else {
                    final Player player = (Player) sender;
                    player.openInventory(player.getEnderChest());
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Opening your Enderchest!"));
                }
            }
        }
        return true;
    }
}
