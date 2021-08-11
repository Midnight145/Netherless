package netherless;

import java.util.Random;
import net.minecraft.block.Block;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockNullPortal extends BlockPortal {
	@Override
  public void updateTick(World world, int x, int y, int z, Random p_149674_5_) {
	  world.setBlockToAir(x, y, z);
	  
  }
  
  @Override
  public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
	  return;
  }
  
  @Override
  public boolean func_150000_e(World p_150000_1_, int p_150000_2_, int p_150000_3_, int p_150000_4_) {
    return false;
  }
  @Override
  public boolean getTickRandomly() {
	    return true;
  } 
  
  @Override
  public boolean hasTileEntity(int meta)
  {
      return true;
  }

  @Override
  public TileEntity createTileEntity(World world, int meta)
  {
      return new TileEntityNullPortal();
  }
}
