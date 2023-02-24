package pl.furry.hexcolor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HexColor extends JavaPlugin {

    public void onEnable() {
        Bukkit.getLogger().info("");
        Bukkit.getLogger().info("HexColors - Uruchomiono");
        Bukkit.getLogger().info("");
    }

    public static String fixHexColor(final String text) {
        return text.replaceAll("&#", "§#");
    }

    //Gradient mozna zobic na stronie https://rgb.birdflop.com
}
