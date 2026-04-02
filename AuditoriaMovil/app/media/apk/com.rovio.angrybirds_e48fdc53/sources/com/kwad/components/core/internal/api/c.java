package com.kwad.components.core.internal.api;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class c {
    private List<b> Lb = new CopyOnWriteArrayList();
    private boolean Lc = false;
    private boolean Ld = false;

    public final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        this.Lb.add(bVar);
    }

    public final void b(b bVar) {
        if (bVar == null) {
            return;
        }
        this.Lb.remove(bVar);
    }

    public final void h(a aVar) {
        com.kwad.sdk.core.e.c.d("KsAdListenerHolder", "notifyAdEnter: " + aVar + ", hadNotifiedEnter: " + this.Ld);
        if (this.Ld) {
            return;
        }
        for (b bVar : this.Lb) {
            bVar.c(aVar);
        }
        this.Ld = true;
    }

    public final void i(a aVar) {
        com.kwad.sdk.core.e.c.d("KsAdListenerHolder", "notifyAdExit: " + aVar + ", hadNotifiedExit: " + this.Lc);
        if (this.Lc) {
            return;
        }
        for (b bVar : this.Lb) {
            bVar.d(aVar);
        }
        this.Lc = true;
    }
}
