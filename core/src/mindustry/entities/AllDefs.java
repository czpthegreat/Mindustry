package mindustry.entities;

import mindustry.annotations.Annotations.*;
import mindustry.gen.*;

class AllDefs{

    @GroupDef(value = Entityc.class, mapping = true)
    class gall{

    }

    @GroupDef(value = Playerc.class, mapping = true)
    class gplayer{

    }

    @GroupDef(value = Bulletc.class, spatial = true)
    class gbullet{

    }

    @GroupDef(value = Collisionc.class)
    class gcollision{

    }

    @GroupDef(value = Unitc.class, spatial = true, mapping = true)
    class gunit{

    }

    @GroupDef(Tilec.class)
    class gtile{

    }

    @GroupDef(value = Syncc.class, mapping = true)
    class gsync{

    }

    @GroupDef(Drawc.class)
    class gdraw{

    }
}
