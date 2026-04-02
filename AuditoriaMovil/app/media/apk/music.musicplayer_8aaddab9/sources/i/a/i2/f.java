package i.a.i2;

import e.j.d.w;
import i.a.a0;
import i.a.c2;
import i.a.g1;
import i.a.t0;
import i.a.x;
import i.a.y1;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public final class f {
    public static final q a = new q("UNDEFINED");

    /* renamed from: b */
    public static final q f9065b = new q("REUSABLE_CLAIMED");

    public static final <T> void a(h.m.d<? super T> dVar, Object obj, h.o.b.l<? super Throwable, h.k> lVar) {
        boolean z;
        if (!(dVar instanceof e)) {
            dVar.resumeWith(obj);
            return;
        }
        e eVar = (e) dVar;
        Object I0 = w.I0(obj, lVar);
        if (eVar.f9061e.g0(eVar.getContext())) {
            eVar.f9063g = I0;
            eVar.f9153c = 1;
            eVar.f9061e.e0(eVar.getContext(), eVar);
            return;
        }
        y1 y1Var = y1.a;
        t0 a2 = y1.a();
        if (a2.l0()) {
            eVar.f9063g = I0;
            eVar.f9153c = 1;
            a2.j0(eVar);
            return;
        }
        a2.k0(true);
        try {
            g1 g1Var = (g1) eVar.getContext().get(g1.a.a);
            if (g1Var == null || g1Var.a()) {
                z = false;
            } else {
                CancellationException v = g1Var.v();
                if (I0 instanceof x) {
                    ((x) I0).f9179b.invoke(v);
                }
                eVar.resumeWith(w.y(v));
                z = true;
            }
            if (!z) {
                h.m.d<T> dVar2 = eVar.f9062f;
                Object obj2 = eVar.f9064h;
                h.m.f context = dVar2.getContext();
                Object b2 = s.b(context, obj2);
                c2<?> b3 = b2 != s.a ? a0.b(dVar2, context, b2) : null;
                eVar.f9062f.resumeWith(obj);
                if (b3 == null || b3.g0()) {
                    s.a(context, b2);
                }
            }
            do {
            } while (a2.m0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void b(h.m.d dVar, Object obj, h.o.b.l lVar, int i2) {
        int i3 = i2 & 2;
        a(dVar, obj, null);
    }
}
