package pvp.space.cmd;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pvp.space.spacepvp;

public class SpacePVPCommand implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            switch(s) {
                case "join": {
                    String s1 = strings[0];
                    if (commandSender instanceof Player) {
                        spacepvp sp = new spacepvp();
                        Player p = (Player) commandSender;
                        World w = (World) sp.getConfig().get("Arena");
                    }
                }
            }
            return true;
        }
}
