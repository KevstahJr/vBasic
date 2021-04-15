package ga.atlasorb.basic.hear;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootStrappedListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class BasicListener extends BootStrappedListener {

    public BasicListener(Basic basic) {
        super(basic);
    }

    @EventHandler
    public void onEvent(PlayerJoinEvent event){
        event.setJoinMessage("");

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){

        event.setQuitMessage("");
    }
}
