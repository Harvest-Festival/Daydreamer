package uk.joshiejack.daydreamer;

import net.minecraftforge.event.entity.player.SleepingTimeCheckEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
@Mod("daydreamer")
public class Daydreamer {
    public Daydreamer() {
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, ()-> Pair.of(()-> FMLNetworkConstants.IGNORESERVERONLY, (net, save)->true));
    }

    @SubscribeEvent
    public static void onSleep(SleepingTimeCheckEvent event) {
        event.setResult(Event.Result.ALLOW);
    }
}