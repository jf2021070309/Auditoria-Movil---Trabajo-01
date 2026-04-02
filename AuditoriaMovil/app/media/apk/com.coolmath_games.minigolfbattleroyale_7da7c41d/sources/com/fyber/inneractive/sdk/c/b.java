package com.fyber.inneractive.sdk.c;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {
    public final Set<a> a;

    /* loaded from: classes.dex */
    public interface a {
        com.fyber.inneractive.sdk.e.b a();

        boolean a(InneractiveAdSpot inneractiveAdSpot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fyber.inneractive.sdk.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039b {
        public static b a = new b((byte) 0);
    }

    /* synthetic */ b(byte b) {
        this();
    }

    private b() {
        this.a = new HashSet();
    }

    public final com.fyber.inneractive.sdk.e.b a(InneractiveAdSpot inneractiveAdSpot) {
        for (a aVar : this.a) {
            if (aVar.a(inneractiveAdSpot)) {
                return aVar.a();
            }
        }
        return null;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }
}
