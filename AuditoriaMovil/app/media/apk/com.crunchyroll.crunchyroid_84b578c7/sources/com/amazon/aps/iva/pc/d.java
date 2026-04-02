package com.amazon.aps.iva.pc;

import android.util.Log;
import com.amazon.aps.iva.fc.a;
import com.amazon.aps.iva.pc.b;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public final class d implements a {
    public final File b;
    public final long c;
    public com.amazon.aps.iva.fc.a e;
    public final b d = new b();
    public final j a = new j();

    @Deprecated
    public d(File file, long j) {
        this.b = file;
        this.c = j;
    }

    @Override // com.amazon.aps.iva.pc.a
    public final File b(com.amazon.aps.iva.kc.f fVar) {
        com.amazon.aps.iva.fc.a aVar;
        String a = this.a.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(fVar);
        }
        try {
            synchronized (this) {
                if (this.e == null) {
                    this.e = com.amazon.aps.iva.fc.a.n(this.b, this.c);
                }
                aVar = this.e;
            }
            a.e k = aVar.k(a);
            if (k != null) {
                return k.a[0];
            }
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.pc.a
    public final void c(com.amazon.aps.iva.kc.f fVar, com.amazon.aps.iva.nc.g gVar) {
        b.a aVar;
        com.amazon.aps.iva.fc.a aVar2;
        boolean z;
        String a = this.a.a(fVar);
        b bVar = this.d;
        synchronized (bVar) {
            aVar = (b.a) bVar.a.get(a);
            if (aVar == null) {
                b.C0608b c0608b = bVar.b;
                synchronized (c0608b.a) {
                    aVar = (b.a) c0608b.a.poll();
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                bVar.a.put(a, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(fVar);
            }
            try {
                synchronized (this) {
                    if (this.e == null) {
                        this.e = com.amazon.aps.iva.fc.a.n(this.b, this.c);
                    }
                    aVar2 = this.e;
                }
                if (aVar2.k(a) == null) {
                    a.c h = aVar2.h(a);
                    if (h != null) {
                        try {
                            if (gVar.a.c(gVar.b, h.b(), gVar.c)) {
                                com.amazon.aps.iva.fc.a.a(com.amazon.aps.iva.fc.a.this, h, true);
                                h.c = true;
                            }
                            if (!z) {
                                try {
                                    h.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!h.c) {
                                try {
                                    h.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a));
                    }
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.d.a(a);
        }
    }
}
