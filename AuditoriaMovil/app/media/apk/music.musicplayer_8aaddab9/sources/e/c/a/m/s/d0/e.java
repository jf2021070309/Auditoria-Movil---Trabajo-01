package e.c.a.m.s.d0;

import android.util.Log;
import e.c.a.k.a;
import e.c.a.m.s.d0.a;
import e.c.a.m.s.d0.c;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b  reason: collision with root package name */
    public final File f5639b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5640c;

    /* renamed from: e  reason: collision with root package name */
    public e.c.a.k.a f5642e;

    /* renamed from: d  reason: collision with root package name */
    public final c f5641d = new c();
    public final k a = new k();

    @Deprecated
    public e(File file, long j2) {
        this.f5639b = file;
        this.f5640c = j2;
    }

    @Override // e.c.a.m.s.d0.a
    public void a(e.c.a.m.k kVar, a.b bVar) {
        c.a aVar;
        boolean z;
        String a = this.a.a(kVar);
        c cVar = this.f5641d;
        synchronized (cVar) {
            aVar = cVar.a.get(a);
            if (aVar == null) {
                c.b bVar2 = cVar.f5636b;
                synchronized (bVar2.a) {
                    aVar = bVar2.a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.a.put(a, aVar);
            }
            aVar.f5637b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String str = "Put: Obtained: " + a + " for for Key: " + kVar;
            }
            try {
                e.c.a.k.a c2 = c();
                if (c2.u(a) == null) {
                    a.c m2 = c2.m(a);
                    if (m2 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a);
                    }
                    try {
                        e.c.a.m.s.f fVar = (e.c.a.m.s.f) bVar;
                        if (fVar.a.a(fVar.f5661b, m2.b(0), fVar.f5662c)) {
                            e.c.a.k.a.a(e.c.a.k.a.this, m2, true);
                            m2.f5504c = true;
                        }
                        if (!z) {
                            try {
                                m2.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!m2.f5504c) {
                            try {
                                m2.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f5641d.a(a);
        }
    }

    @Override // e.c.a.m.s.d0.a
    public File b(e.c.a.m.k kVar) {
        String a = this.a.a(kVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String str = "Get: Obtained: " + a + " for for Key: " + kVar;
        }
        try {
            a.e u = c().u(a);
            if (u != null) {
                return u.a[0];
            }
            return null;
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
                return null;
            }
            return null;
        }
    }

    public final synchronized e.c.a.k.a c() throws IOException {
        if (this.f5642e == null) {
            this.f5642e = e.c.a.k.a.y(this.f5639b, 1, 1, this.f5640c);
        }
        return this.f5642e;
    }
}
