package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class DonateCommand extends BootstrappedCommand {
    public DonateCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            Arrays.asList(
                    "&eYou can purchase a rank at: &dwww.vexirmc.ga/store&e."
            ).forEach(it -> sender.sendMessage(ChatColor.translateAlternateColorCodes('&', it)));
            return true;
        }
        return true;
    }
}
