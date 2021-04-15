package ga.atlasorb.basic.commands.anticheataddon;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ForceBanCommand extends BootstrappedCommand {
    public ForceBanCommand(final Basic basic) {
        super(basic);
    }

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!sender.hasPermission("crimson.forceban")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;
        }
        if (sender instanceof Player) {
            final Player player = (Player)sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUsage: /" + label + " <player>"));
            }
            else {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aSuccessfully Forcebanned " + args[0] + "!"));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', ""));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&5Crimson &fhas removed &5" + args[0] + " &ffrom the network!"));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', " &fReason: &cUnfair Advantage"));
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', ""));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban -s " + args[0] + " [AC] Unfair Advantage");

                }
                else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo player with the name " + args[0] + " found!"));
                }
            }
        }
        return true;
    }
}