package com.fyber.inneractive.sdk.c;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {
    public final Set<a> a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(InneractiveAdSpot inneractiveAdSpot);

        com.fyber.inneractive.sdk.e.c b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public static d a = new d((byte) 0);
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    private d() {
        this.a = new HashSet();
    }

    public final com.fyber.inneractive.sdk.e.c a(InneractiveAdSpot inneractiveAdSpot) {
        for (a aVar : this.a) {
            if (aVar.a(inneractiveAdSpot)) {
                return aVar.b(inneractiveAdSpot);
            }
        }
        return null;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }
}
