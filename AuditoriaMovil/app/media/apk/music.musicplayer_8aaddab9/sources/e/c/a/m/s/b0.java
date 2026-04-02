package e.c.a.m.s;

import android.os.SystemClock;
import android.util.Log;
import e.c.a.m.s.g;
import e.c.a.m.t.n;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class b0 implements g, g.a {
    public final h<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f5593b;

    /* renamed from: c  reason: collision with root package name */
    public int f5594c;

    /* renamed from: d  reason: collision with root package name */
    public d f5595d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5596e;

    /* renamed from: f  reason: collision with root package name */
    public volatile n.a<?> f5597f;

    /* renamed from: g  reason: collision with root package name */
    public e f5598g;

    public b0(h<?> hVar, g.a aVar) {
        this.a = hVar;
        this.f5593b = aVar;
    }

    @Override // e.c.a.m.s.g.a
    public void a(e.c.a.m.k kVar, Exception exc, e.c.a.m.r.d<?> dVar, e.c.a.m.a aVar) {
        this.f5593b.a(kVar, exc, dVar, this.f5597f.f5806c.d());
    }

    @Override // e.c.a.m.s.g
    public boolean b() {
        Object obj = this.f5596e;
        if (obj != null) {
            this.f5596e = null;
            int i2 = e.c.a.s.f.f6026b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                e.c.a.m.d<X> e2 = this.a.e(obj);
                f fVar = new f(e2, obj, this.a.f5670i);
                e.c.a.m.k kVar = this.f5597f.a;
                h<?> hVar = this.a;
                this.f5598g = new e(kVar, hVar.f5675n);
                hVar.b().a(this.f5598g, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    String str = "Finished encoding source to cache, key: " + this.f5598g + ", data: " + obj + ", encoder: " + e2 + ", duration: " + e.c.a.s.f.a(elapsedRealtimeNanos);
                }
                this.f5597f.f5806c.b();
                this.f5595d = new d(Collections.singletonList(this.f5597f.a), this.a, this);
            } catch (Throwable th) {
                this.f5597f.f5806c.b();
                throw th;
            }
        }
        d dVar = this.f5595d;
        if (dVar == null || !dVar.b()) {
            this.f5595d = null;
            this.f5597f = null;
            boolean z = false;
            while (!z) {
                if (!(this.f5594c < this.a.c().size())) {
                    break;
                }
                List<n.a<?>> c2 = this.a.c();
                int i3 = this.f5594c;
                this.f5594c = i3 + 1;
                this.f5597f = c2.get(i3);
                if (this.f5597f != null && (this.a.p.c(this.f5597f.f5806c.d()) || this.a.g(this.f5597f.f5806c.a()))) {
                    this.f5597f.f5806c.e(this.a.o, new a0(this, this.f5597f));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // e.c.a.m.s.g.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // e.c.a.m.s.g
    public void cancel() {
        n.a<?> aVar = this.f5597f;
        if (aVar != null) {
            aVar.f5806c.cancel();
        }
    }

    @Override // e.c.a.m.s.g.a
    public void d(e.c.a.m.k kVar, Object obj, e.c.a.m.r.d<?> dVar, e.c.a.m.a aVar, e.c.a.m.k kVar2) {
        this.f5593b.d(kVar, obj, dVar, this.f5597f.f5806c.d(), kVar);
    }
}
