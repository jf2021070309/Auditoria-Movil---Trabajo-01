package com.kwad.components.core.t;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {
    private Set<b> Rl;

    /* loaded from: classes.dex */
    static class a {
        private static c Rm = new c((byte) 0);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onPageClose();
    }

    private c() {
        this.Rl = new HashSet();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public static c qm() {
        return a.Rm;
    }

    public final void a(b bVar) {
        this.Rl.add(bVar);
    }

    public final void b(b bVar) {
        this.Rl.remove(bVar);
    }

    public final void qn() {
        if (this.Rl.size() == 0) {
            return;
        }
        for (b bVar : this.Rl) {
            bVar.onPageClose();
        }
    }
}
