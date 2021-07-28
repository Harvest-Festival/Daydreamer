package uk.joshiejack.daydreamer;

import net.minecraftforge.event.entity.player.SleepingTimeCheckEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
@Mod("daydreamer")
public class Daydreamer {
    public Daydreamer() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY, (n, s) -> true));
    }

    @SubscribeEvent
    public static void onSleep(SleepingTimeCheckEvent event) {
        event.setResult(Event.Result.ALLOW);
    }
}