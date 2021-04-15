package ga.atlasorb.basic.listeners;

import ga.atlasorb.basic.Basic;
import org.bukkit.event.Listener;

public abstract class BootStrappedListener extends BootStrapped implements Listener {
    public BootStrappedListener(Basic basic) {
        super(basic);
    }

}
