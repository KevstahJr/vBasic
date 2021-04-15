package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class HelpCommand extends BootstrappedCommand {
    public HelpCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            Arrays.asList(
                    "&6&m--------------------------------------------",
                    "&9Helpful Commands:",
                    "&e/report <player> <reason> &7- Report cheaters!",
                    "&e/request <message> &7- Request staff assistance!",
                    "",
                    "&9Other Information:",
                    "&eOfficial Discord &7- &6www.vexirmc.ga/discord",
                    "&eRules &7- &6www.vexirmc.ga/rules",
                    "&eStore &7- &6www.vexirmc.ga/store",
                    "&6&m--------------------------------------------"
            ).forEach(it -> sender.sendMessage(ChatColor.translateAlternateColorCodes('&', it)));
            return true;
        }
        return true;
    }
}
