package bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class i6 extends g6 {
    private Map h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.amazon.aps.iva.if0.c cVar) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "json");
        this.h = new LinkedHashMap();
    }

    @Override // bo.app.q2
    public void a(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "remoteAssetToLocalAssetPaths");
        this.h = new HashMap(map);
    }

    public Map y() {
        return com.amazon.aps.iva.lb0.i0.a0(this.h);
    }
}
