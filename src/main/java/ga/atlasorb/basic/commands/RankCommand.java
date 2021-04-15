package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankCommand extends BootstrappedCommand {
    public RankCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            final Player player = (Player) sender;
            final String rankcolor = PlaceholderAPI.setPlaceholders(player, "%vault_prefix_color%");
            final String rank = PlaceholderAPI.setPlaceholders(player, "%vault_rank%");
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Your Rank is: " + rankcolor + rank));
            return true;
        }
        return true;
    }
}
