# Netherless
Fork of [_ForgeUser16618358's](https://www.curseforge.com/members/_ForgeUser16618358) [Netherless](https://www.curseforge.com/minecraft/mc-mods/netherless) mod.

The original Netherless falls under the DBaJ License found [here](https://github.com/jakimfett/DBaJ/blob/master/LICENSE.md), as does this repository.

The original mod had some issues, where in some (extreme) circumstances a portal could still be created, this modifies it so if a portal is ever created, it will instantly destroy it. It also catches PlayerChangedDimensionEvent, and if they are traveling to the nether (dimension -1), it will take them to the dimension they were traveling from.
