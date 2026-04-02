package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.d.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class InneractiveAdSpotManager {
    Map<String, InneractiveAdSpot> a;

    /* synthetic */ InneractiveAdSpotManager(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private static InneractiveAdSpotManager a = new InneractiveAdSpotManager((byte) 0);
    }

    private InneractiveAdSpotManager() {
        this.a = new ConcurrentHashMap();
    }

    public static InneractiveAdSpotManager get() {
        return a.a;
    }

    public InneractiveAdSpot createSpot() {
        i iVar = new i();
        this.a.put(iVar.getLocalUniqueId(), iVar);
        return iVar;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.a.get(str);
    }
}
