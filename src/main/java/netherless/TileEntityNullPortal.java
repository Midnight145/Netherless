package netherless;

import net.minecraft.tileentity.TileEntity;

public class TileEntityNullPortal extends TileEntity {

	TileEntityNullPortal() {}
	
	@Override
	public void updateEntity() {
		this.getWorldObj().setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
		this.getWorldObj().removeTileEntity(this.xCoord, this.yCoord, this.zCoord);
	}
	
}
