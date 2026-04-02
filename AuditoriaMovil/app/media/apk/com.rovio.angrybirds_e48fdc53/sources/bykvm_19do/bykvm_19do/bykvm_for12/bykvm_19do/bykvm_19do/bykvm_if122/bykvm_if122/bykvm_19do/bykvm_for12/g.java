package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.p;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.w;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import com.facebook.internal.AnalyticsEvents;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements t.a {
    private final List<t> a;
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g b;
    private final c c;
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c d;
    private final int e;
    private final y f;
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e g;
    private final p h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public g(List<t> list, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar, c cVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c cVar2, int i, y yVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e eVar, p pVar, int i2, int i3, int i4) {
        this.a = list;
        this.d = cVar2;
        this.b = gVar;
        this.c = cVar;
        this.e = i;
        this.f = yVar;
        this.g = eVar;
        this.h = pVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t.a
    public int a() {
        return this.k;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.b, this.c, this.d);
    }

    public a0 a(y yVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g gVar, c cVar, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c cVar2) throws IOException {
        if (this.e < this.a.size()) {
            this.l++;
            if (this.c != null && !this.d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must retain the same host and port");
            } else if (this.c != null && this.l > 1) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must call proceed() exactly once");
            } else {
                g gVar2 = new g(this.a, gVar, cVar, cVar2, this.e + 1, yVar, this.g, this.h, this.i, this.j, this.k);
                t tVar = this.a.get(this.e);
                try {
                    a0 a = tVar.a(gVar2);
                    if (cVar != null && this.e + 1 < this.a.size() && gVar2.l != 1) {
                        throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
                    } else if (a == null) {
                        return new a0.a().a(yVar).a((cVar2 == null || cVar2.d() == null) ? w.a(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN) : cVar2.d()).a(0).a("internal error").a();
                    } else if (a.i() != null) {
                        return a;
                    } else {
                        throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        throw new AssertionError();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t.a
    public y b() {
        return this.f;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t.a
    public int c() {
        return this.i;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t.a
    public int d() {
        return this.j;
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.e e() {
        return this.g;
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.i f() {
        return this.d;
    }

    public p g() {
        return this.h;
    }

    public c h() {
        return this.c;
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g i() {
        return this.b;
    }
}
