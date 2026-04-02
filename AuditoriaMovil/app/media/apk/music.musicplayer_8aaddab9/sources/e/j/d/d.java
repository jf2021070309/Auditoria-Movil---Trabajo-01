package e.j.d;

import android.os.Handler;
import c.p.b0;
import c.p.j;
import c.p.y;
import e.j.b.c;
import e.j.b.h;
import i.a.e0;
import java.util.Objects;
import n.a.a;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.Analytics$init$2", f = "Analytics.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public d(h.m.d<? super d> dVar) {
        super(2, dVar);
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new d(dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        d dVar2 = new d(dVar);
        h.k kVar = h.k.a;
        dVar2.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        w.E0(obj);
        final e.j.b.c cVar = e.j.b.b.a.f8503b;
        Objects.requireNonNull(cVar);
        b0 b0Var = b0.a;
        if (cVar.f8510h == null) {
            cVar.f8510h = new c.p.o() { // from class: com.zipoapps.blytics.BLyticsEngine$1
                public boolean a = false;

                @y(j.a.ON_STOP)
                public void onEnterBackground() {
                    if (this.a) {
                        a.b("BLytics").g("App is BACKGROUND", new Object[0]);
                        try {
                            c cVar2 = c.this;
                            h hVar = cVar2.f8507e;
                            Handler handler = hVar.f8511b;
                            if (handler != null) {
                                handler.removeMessages(2);
                            }
                            hVar.quitSafely();
                            cVar2.f8507e = null;
                            for (e.j.b.a aVar2 : cVar2.f8508f) {
                                aVar2.d(cVar2.f8506d);
                            }
                        } catch (Throwable th) {
                            a.b("Blytics").d(th, "Stop session failed", new Object[0]);
                        }
                        this.a = false;
                    }
                }

                @y(j.a.ON_START)
                public void onEnterForeground() {
                    if (this.a) {
                        return;
                    }
                    a.b("BLytics").g("App is FOREGROUND", new Object[0]);
                    try {
                        c.this.d(r2);
                    } catch (Throwable th) {
                        a.b("Blytics").d(th, "Start session failed", new Object[0]);
                    }
                    this.a = true;
                }
            };
            b0Var.getLifecycle().a(cVar.f8510h);
        }
        return h.k.a;
    }
}
