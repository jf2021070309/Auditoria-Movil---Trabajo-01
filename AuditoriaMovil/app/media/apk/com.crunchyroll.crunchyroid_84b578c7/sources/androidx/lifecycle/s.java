package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;
/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class s {
    public final k a;
    public final Handler b;
    public a c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final k b;
        public final g.a c;
        public boolean d;

        public a(k kVar, g.a aVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "registry");
            com.amazon.aps.iva.yb0.j.f(aVar, "event");
            this.b = kVar;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.d) {
                this.b.c(this.c);
                this.d = true;
            }
        }
    }

    public s(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "provider");
        this.a = new k(oVar);
        this.b = new Handler();
    }

    public final void a(g.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.b.postAtFrontOfQueue(aVar3);
    }
}
