package netherless;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;

@Mod(modid = "Netherless", name = "Netherless", version = "0.9.0")
public class Netherless {
  @Instance("Netherless")
  public static Netherless instance = new Netherless();
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
  	PlayerDimHandler dimHandler = new PlayerDimHandler();

    BlockHandler.replaceBlock((Block)Blocks.portal, (Class)BlockNullPortal.class, ItemBlock.class);
  }
}
