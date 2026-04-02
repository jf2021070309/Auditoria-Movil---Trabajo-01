package com.kwad.sdk.core.network;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class i {
    private static volatile i apm;
    private List<a> apl = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar, int i);
    }

    private i() {
    }

    public static i Bf() {
        if (apm == null) {
            synchronized (i.class) {
                if (apm == null) {
                    apm = new i();
                }
            }
        }
        return apm;
    }

    public final void a(a aVar) {
        this.apl.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(g gVar, int i) {
        for (a aVar : this.apl) {
            aVar.a(gVar, i);
        }
    }
}
