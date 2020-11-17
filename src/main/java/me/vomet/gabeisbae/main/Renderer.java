package me.vomet.gabeisbae.main;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Renderer extends MapRenderer {
    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        try {
            BufferedImage image = ImageIO.read(new URL("https://cdn.discordapp.com/attachments/772938887445741649/778247068123922472/Gabe_Newell_1484763796244.png"));
            canvas.drawImage(0,0, image);
        }catch (IOException x) {
            x.printStackTrace();
        }

    }
}
