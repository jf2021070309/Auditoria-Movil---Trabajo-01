package e.d.b.b.j;

import android.content.Context;
import e.d.b.b.j.d0.b;
import e.d.b.b.j.j;
import e.d.b.b.j.r;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class v implements u {
    public static volatile w a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6287b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6288c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.b.j.c0.e f6289d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.b.j.c0.h.u f6290e;

    public v(e.d.b.b.j.e0.a aVar, e.d.b.b.j.e0.a aVar2, e.d.b.b.j.c0.e eVar, e.d.b.b.j.c0.h.u uVar, final e.d.b.b.j.c0.h.w wVar) {
        this.f6287b = aVar;
        this.f6288c = aVar2;
        this.f6289d = eVar;
        this.f6290e = uVar;
        wVar.a.execute(new Runnable() { // from class: e.d.b.b.j.c0.h.n
            @Override // java.lang.Runnable
            public final void run() {
                final w wVar2 = w.this;
                wVar2.f6202d.f(new b.a() { // from class: e.d.b.b.j.c0.h.m
                    @Override // e.d.b.b.j.d0.b.a
                    public final Object a() {
                        w wVar3 = w.this;
                        for (e.d.b.b.j.r rVar : wVar3.f6200b.s()) {
                            wVar3.f6201c.a(rVar, 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static v a() {
        w wVar = a;
        if (wVar != null) {
            return ((k) wVar).f6279m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (v.class) {
                if (a == null) {
                    Objects.requireNonNull(context);
                    a = new k(context, null);
                }
            }
        }
    }

    public e.d.b.b.g c(l lVar) {
        Set singleton;
        if (lVar instanceof l) {
            Objects.requireNonNull((e.d.b.b.i.c) lVar);
            singleton = Collections.unmodifiableSet(e.d.b.b.i.c.f6044d);
        } else {
            singleton = Collections.singleton(new e.d.b.b.b("proto"));
        }
        r.a a2 = r.a();
        Objects.requireNonNull(lVar);
        a2.b("cct");
        j.b bVar = (j.b) a2;
        bVar.f6266b = ((e.d.b.b.i.c) lVar).b();
        return new s(singleton, bVar.a(), this);
    }
}
