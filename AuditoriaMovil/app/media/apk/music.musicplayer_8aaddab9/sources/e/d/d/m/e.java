package e.d.d.m;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import e.d.d.k.a.a;
import e.d.d.l.e0;
import e.d.d.t.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class e {
    public final e.d.d.t.a<e.d.d.k.a.a> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile e.d.d.m.j.h.a f7132b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e.d.d.m.j.i.b f7133c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e.d.d.m.j.i.a> f7134d;

    public e(e.d.d.t.a<e.d.d.k.a.a> aVar) {
        e.d.d.m.j.i.c cVar = new e.d.d.m.j.i.c();
        e.d.d.m.j.h.f fVar = new e.d.d.m.j.h.f();
        this.a = aVar;
        this.f7133c = cVar;
        this.f7134d = new ArrayList();
        this.f7132b = fVar;
        ((e0) aVar).d(new a.InterfaceC0163a() { // from class: e.d.d.m.a
            @Override // e.d.d.t.a.InterfaceC0163a
            public final void a(e.d.d.t.b bVar) {
                e eVar = e.this;
                Objects.requireNonNull(eVar);
                e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
                fVar2.a(3);
                e.d.d.k.a.a aVar2 = (e.d.d.k.a.a) bVar.get();
                e.d.d.m.j.h.e eVar2 = new e.d.d.m.j.h.e(aVar2);
                f fVar3 = new f();
                a.InterfaceC0148a g2 = aVar2.g("clx", fVar3);
                if (g2 == null) {
                    fVar2.a(3);
                    g2 = aVar2.g(AppMeasurement.CRASH_ORIGIN, fVar3);
                    if (g2 != null) {
                        fVar2.d("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                    }
                }
                if (g2 == null) {
                    fVar2.d("Could not register Firebase Analytics listener; a listener is already registered.");
                    return;
                }
                fVar2.a(3);
                e.d.d.m.j.h.d dVar = new e.d.d.m.j.h.d();
                e.d.d.m.j.h.c cVar2 = new e.d.d.m.j.h.c(eVar2, 500, TimeUnit.MILLISECONDS);
                synchronized (eVar) {
                    for (e.d.d.m.j.i.a aVar3 : eVar.f7134d) {
                        dVar.a(aVar3);
                    }
                    fVar3.f7135b = dVar;
                    fVar3.a = cVar2;
                    eVar.f7133c = dVar;
                    eVar.f7132b = cVar2;
                }
            }
        });
    }

    public e.d.d.m.j.h.a a() {
        return new e.d.d.m.j.h.a() { // from class: e.d.d.m.b
            @Override // e.d.d.m.j.h.a
            public final void a(String str, Bundle bundle) {
                e.this.f7132b.a(str, bundle);
            }
        };
    }

    public e.d.d.m.j.i.b b() {
        return new e.d.d.m.j.i.b() { // from class: e.d.d.m.c
            @Override // e.d.d.m.j.i.b
            public final void a(e.d.d.m.j.i.a aVar) {
                e eVar = e.this;
                synchronized (eVar) {
                    if (eVar.f7133c instanceof e.d.d.m.j.i.c) {
                        eVar.f7134d.add(aVar);
                    }
                    eVar.f7133c.a(aVar);
                }
            }
        };
    }
}
