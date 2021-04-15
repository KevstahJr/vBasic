package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BalanceCommand extends BootstrappedCommand {
    public BalanceCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            final Player player = (Player) sender;
            final String eco = PlaceholderAPI.setPlaceholders(player, "%vault_eco_balance_formatted%");
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Balance: &f" + eco));
            return true;
        } else {
            final Player target = Bukkit.getPlayerExact(args[0]);
            if (target instanceof Player) {
                Player player = (Player) target;
                final String eco = PlaceholderAPI.setPlaceholders(player, "%vault_eco_balance_formatted%");
                final String rankcolor = PlaceholderAPI.setPlaceholders(player, "%vault_prefix_color%");
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Balance of " + rankcolor + args[0] + ": &f" + eco));
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo player with the name " + args[0] + " found."));
            }
        }
        return true;
    }
}
