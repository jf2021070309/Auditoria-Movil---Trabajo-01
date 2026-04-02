package com.kwad.components.ad.h;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e {
    private final AtomicBoolean op;
    private final List<com.kwad.components.ad.b.a.b> oq;

    /* loaded from: classes.dex */
    static class a {
        private static final e or = new e((byte) 0);
    }

    private e() {
        this.op = new AtomicBoolean();
        this.oq = new CopyOnWriteArrayList();
    }

    /* synthetic */ e(byte b) {
        this();
    }

    public static e fp() {
        return a.or;
    }

    public final boolean S() {
        return this.op.get();
    }

    public final void a(com.kwad.components.ad.b.a.b bVar) {
        if (bVar != null) {
            this.oq.add(bVar);
        }
    }

    public final void b(com.kwad.components.ad.b.a.b bVar) {
        if (bVar != null) {
            this.oq.remove(bVar);
        }
    }

    public final void fl() {
        this.op.set(true);
        for (com.kwad.components.ad.b.a.b bVar : this.oq) {
            bVar.T();
        }
    }

    public final void fn() {
        this.op.set(false);
        for (com.kwad.components.ad.b.a.b bVar : this.oq) {
            bVar.U();
        }
    }
}
