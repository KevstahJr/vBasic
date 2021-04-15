package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class DiscordCommand extends BootstrappedCommand {
    public DiscordCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            Arrays.asList(
                    "&eYou can join our Discord at: &dwww.vexirmc.ga/discord&e."
            ).forEach(it -> sender.sendMessage(ChatColor.translateAlternateColorCodes('&', it)));
            return true;
        }
        return true;
    }
}
