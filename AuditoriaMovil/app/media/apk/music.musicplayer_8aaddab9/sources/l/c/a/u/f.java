package l.c.a.u;

import e.j.d.w;
import java.util.Locale;
import l.c.a.p;
import l.c.a.q;
import l.c.a.t.m;
/* loaded from: classes2.dex */
public final class f {
    public l.c.a.w.e a;

    /* renamed from: b  reason: collision with root package name */
    public Locale f9795b;

    /* renamed from: c  reason: collision with root package name */
    public h f9796c;

    /* renamed from: d  reason: collision with root package name */
    public int f9797d;

    public f(l.c.a.w.e eVar, a aVar) {
        q qVar;
        l.c.a.x.f v;
        l.c.a.t.h hVar = aVar.f9768k;
        p pVar = aVar.f9769l;
        if (hVar != null || pVar != null) {
            l.c.a.t.h hVar2 = (l.c.a.t.h) eVar.query(l.c.a.w.j.f9809b);
            p pVar2 = (p) eVar.query(l.c.a.w.j.a);
            l.c.a.t.b bVar = null;
            hVar = w.C(hVar2, hVar) ? null : hVar;
            pVar = w.C(pVar2, pVar) ? null : pVar;
            if (hVar != null || pVar != null) {
                l.c.a.t.h hVar3 = hVar != null ? hVar : hVar2;
                pVar2 = pVar != null ? pVar : pVar2;
                if (pVar != null) {
                    if (eVar.isSupported(l.c.a.w.a.INSTANT_SECONDS)) {
                        eVar = (hVar3 == null ? m.f9736c : hVar3).G(l.c.a.d.v(eVar), pVar);
                    } else {
                        try {
                            v = pVar.v();
                        } catch (l.c.a.x.g unused) {
                        }
                        if (v.h()) {
                            qVar = v.a(l.c.a.d.a);
                            q qVar2 = (q) eVar.query(l.c.a.w.j.f9812e);
                            if ((qVar instanceof q) && qVar2 != null && !qVar.equals(qVar2)) {
                                throw new l.c.a.a("Invalid override zone for temporal: " + pVar + " " + eVar);
                            }
                        }
                        qVar = pVar;
                        q qVar22 = (q) eVar.query(l.c.a.w.j.f9812e);
                        if (qVar instanceof q) {
                            throw new l.c.a.a("Invalid override zone for temporal: " + pVar + " " + eVar);
                        }
                    }
                }
                if (hVar != null) {
                    if (eVar.isSupported(l.c.a.w.a.EPOCH_DAY)) {
                        bVar = hVar3.b(eVar);
                    } else if (hVar != m.f9736c || hVar2 != null) {
                        l.c.a.w.a[] values = l.c.a.w.a.values();
                        for (int i2 = 0; i2 < 30; i2++) {
                            l.c.a.w.a aVar2 = values[i2];
                            if (aVar2.isDateBased() && eVar.isSupported(aVar2)) {
                                throw new l.c.a.a("Invalid override chronology for temporal: " + hVar + " " + eVar);
                            }
                        }
                    }
                }
                eVar = new e(bVar, eVar, hVar3, pVar2);
            }
        }
        this.a = eVar;
        this.f9795b = aVar.f9764g;
        this.f9796c = aVar.f9765h;
    }

    public void a() {
        this.f9797d--;
    }

    public Long b(l.c.a.w.i iVar) {
        try {
            return Long.valueOf(this.a.getLong(iVar));
        } catch (l.c.a.a e2) {
            if (this.f9797d > 0) {
                return null;
            }
            throw e2;
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
