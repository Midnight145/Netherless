package netherless;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.common.MinecraftForge;

public class PlayerDimHandler {
	public PlayerDimHandler() {
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
	}
	
	@SubscribeEvent
	public void dimChangeEvent(PlayerChangedDimensionEvent event) {
		if (event.toDim == -1) {
			event.player.travelToDimension(event.fromDim);
		}
	}
}
