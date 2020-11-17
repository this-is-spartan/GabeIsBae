package me.vomet.gabeisbae.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteGabeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        List<String> quotes = new ArrayList<>();
        quotes.add("I think Windows 8 is a catastrophe for everyone in the PC space. I think we'll lose some of the top-tier PC/OEMs, who will exit the market. I think margins will be destroyed for a bunch of people. -- Gabe Newell");
        quotes.add("The programmers of tomorrow are the wizards of the future. You're going to look like you have magic powers compared to everybody else. -- Gabe Newell");
        quotes.add("I've always wanted to be a giant space crab. -- Gabe Newell");
        quotes.add("The internet is super smart. If you do something that is cool, that's actually worth people's time, then they'll adopt it. If you do something that's not cool and sucks, you can spend as many marketing dollars as you want, [they] just won't -- Gabe Newell");
        quotes.add("The PS3 is a total disaster on so many levels, I think It's really clear that Sony lost track of what customers and what developers wanted. -- Gabe Newell");
        quotes.add("Don't ever, ever try to lie to the internet.... -- Gabe Newell");

        p.sendMessage(quotes.get(new Random().nextInt(quotes.size())));
        return false;
    }
}
