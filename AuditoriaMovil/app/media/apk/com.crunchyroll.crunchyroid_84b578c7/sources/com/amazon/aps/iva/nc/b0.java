package com.amazon.aps.iva.nc;

import android.os.SystemClock;
import android.util.Log;
import com.amazon.aps.iva.nc.h;
import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.rc.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class b0 implements h, h.a {
    public final i<?> b;
    public final h.a c;
    public volatile int d;
    public volatile e e;
    public volatile Object f;
    public volatile o.a<?> g;
    public volatile f h;

    public b0(i<?> iVar, h.a aVar) {
        this.b = iVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void a(com.amazon.aps.iva.kc.f fVar, Object obj, com.amazon.aps.iva.lc.d<?> dVar, com.amazon.aps.iva.kc.a aVar, com.amazon.aps.iva.kc.f fVar2) {
        this.c.a(fVar, obj, dVar, this.g.c.e(), fVar);
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void b(com.amazon.aps.iva.kc.f fVar, Exception exc, com.amazon.aps.iva.lc.d<?> dVar, com.amazon.aps.iva.kc.a aVar) {
        this.c.b(fVar, exc, dVar, this.g.c.e());
    }

    public final boolean c(Object obj) throws IOException {
        int i = com.amazon.aps.iva.hd.h.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a f = this.b.c.a().f(obj);
            Object a = f.a();
            com.amazon.aps.iva.kc.d<X> e = this.b.e(a);
            g gVar = new g(e, a, this.b.i);
            com.amazon.aps.iva.kc.f fVar = this.g.a;
            i<?> iVar = this.b;
            f fVar2 = new f(fVar, iVar.n);
            com.amazon.aps.iva.pc.a a2 = ((m.c) iVar.h).a();
            a2.c(fVar2, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                fVar2.toString();
                obj.toString();
                e.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (a2.b(fVar2) != null) {
                this.h = fVar2;
                this.e = new e(Collections.singletonList(this.g.a), this.b, this);
                this.g.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.h);
                obj.toString();
            }
            try {
                this.c.a(this.g.a, f.a(), this.g.c, this.g.c.e(), this.g.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.g.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.amazon.aps.iva.nc.h
    public final void cancel() {
        o.a<?> aVar = this.g;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.amazon.aps.iva.nc.h
    public final boolean d() {
        boolean z;
        boolean z2;
        if (this.f != null) {
            Object obj = this.f;
            this.f = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.e != null && this.e.d()) {
            return true;
        }
        this.e = null;
        this.g = null;
        boolean z3 = false;
        while (!z3) {
            if (this.d < this.b.b().size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            ArrayList b = this.b.b();
            int i = this.d;
            this.d = i + 1;
            this.g = (o.a) b.get(i);
            if (this.g != null) {
                if (!this.b.p.c(this.g.c.e())) {
                    if (this.b.c(this.g.c.a()) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                this.g.c.d(this.b.o, new a0(this, this.g));
                z3 = true;
            }
        }
        return z3;
    }

    @Override // com.amazon.aps.iva.nc.h.a
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
