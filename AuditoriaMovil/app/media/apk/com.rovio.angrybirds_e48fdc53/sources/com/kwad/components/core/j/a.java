package com.kwad.components.core.j;

import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class a {
    private CopyOnWriteArrayList<b> Le = new CopyOnWriteArrayList<>();
    private volatile boolean Lf;

    /* renamed from: com.kwad.components.core.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0203a {
        private static final a Lg = new a();
    }

    /* loaded from: classes.dex */
    public static class b {
        private final c Lh;
        public boolean Li;

        public b(c cVar) {
            this.Lh = cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void bi();
    }

    public static boolean b(b bVar) {
        if (bVar == null) {
            return true;
        }
        return bVar.Li;
    }

    public static a oe() {
        return C0203a.Lg;
    }

    public final void a(b bVar) {
        if (this.Le.contains(bVar)) {
            return;
        }
        if (!this.Lf) {
            this.Lf = true;
            bVar.Li = true;
        }
        this.Le.add(bVar);
    }

    public final void c(b bVar) {
        if (bVar == null) {
            return;
        }
        if (bVar.Li) {
            bVar.Li = false;
            this.Lf = false;
        }
        this.Le.remove(bVar);
        if (this.Le.size() == 0 || this.Lf) {
            return;
        }
        this.Le.get(0).Li = true;
        this.Lf = true;
        this.Le.get(0).Lh.bi();
    }
}
