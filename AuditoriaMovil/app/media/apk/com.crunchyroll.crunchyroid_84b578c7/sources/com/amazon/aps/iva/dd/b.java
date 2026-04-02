package com.amazon.aps.iva.dd;

import com.amazon.aps.iva.dd.e;
/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes.dex */
public final class b implements e, d {
    public final Object a;
    public final e b;
    public volatile d c;
    public volatile d d;
    public e.a e;
    public e.a f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.dd.e, com.amazon.aps.iva.dd.d
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            if (!this.c.a() && !this.d.a()) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final void b(d dVar) {
        synchronized (this.a) {
            if (dVar.equals(this.c)) {
                this.e = e.a.SUCCESS;
            } else if (dVar.equals(this.d)) {
                this.f = e.a.SUCCESS;
            }
            e eVar = this.b;
            if (eVar != null) {
                eVar.b(this);
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean c(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        if (!this.c.c(bVar.c) || !this.d.c(bVar.d)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void clear() {
        synchronized (this.a) {
            e.a aVar = e.a.CLEARED;
            this.e = aVar;
            this.c.clear();
            if (this.f != aVar) {
                this.f = aVar;
                this.d.clear();
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            e.a aVar = this.e;
            e.a aVar2 = e.a.CLEARED;
            if (aVar == aVar2 && this.f == aVar2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final void e(d dVar) {
        synchronized (this.a) {
            if (!dVar.equals(this.d)) {
                this.e = e.a.FAILED;
                e.a aVar = this.f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f = aVar2;
                    this.d.j();
                }
                return;
            }
            this.f = e.a.FAILED;
            e eVar = this.b;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            e.a aVar = this.e;
            e.a aVar2 = e.a.SUCCESS;
            if (aVar != aVar2 && this.f != aVar2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x003c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:12:0x0015, B:14:0x001b, B:15:0x0022, B:17:0x002a, B:24:0x0038), top: B:30:0x0003 }] */
    @Override // com.amazon.aps.iva.dd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.amazon.aps.iva.dd.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            com.amazon.aps.iva.dd.e r1 = r5.b     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r1 = r1.g(r5)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 == 0) goto L38
            com.amazon.aps.iva.dd.e$a r1 = r5.e     // Catch: java.lang.Throwable -> L3c
            com.amazon.aps.iva.dd.e$a r4 = com.amazon.aps.iva.dd.e.a.FAILED     // Catch: java.lang.Throwable -> L3c
            if (r1 == r4) goto L22
            com.amazon.aps.iva.dd.d r1 = r5.c     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3c
            goto L35
        L22:
            com.amazon.aps.iva.dd.d r1 = r5.d     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L34
            com.amazon.aps.iva.dd.e$a r6 = r5.f     // Catch: java.lang.Throwable -> L3c
            com.amazon.aps.iva.dd.e$a r1 = com.amazon.aps.iva.dd.e.a.SUCCESS     // Catch: java.lang.Throwable -> L3c
            if (r6 == r1) goto L32
            if (r6 != r4) goto L34
        L32:
            r6 = r3
            goto L35
        L34:
            r6 = r2
        L35:
            if (r6 == 0) goto L38
            r2 = r3
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r2
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r6
        L3c:
            r6 = move-exception
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dd.b.g(com.amazon.aps.iva.dd.d):boolean");
    }

    @Override // com.amazon.aps.iva.dd.e
    public final e getRoot() {
        e eVar;
        synchronized (this.a) {
            e eVar2 = this.b;
            if (eVar2 != null) {
                eVar = eVar2.getRoot();
            } else {
                eVar = this;
            }
        }
        return eVar;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final boolean h(d dVar) {
        boolean z;
        synchronized (this.a) {
            e eVar = this.b;
            if (eVar != null && !eVar.h(this)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final boolean i(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            e eVar = this.b;
            z = false;
            if (eVar != null && !eVar.i(this)) {
                z2 = false;
                if (z2 && dVar.equals(this.c)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            e.a aVar = this.e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2 && this.f != aVar2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void j() {
        synchronized (this.a) {
            e.a aVar = this.e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.e = aVar2;
                this.c.j();
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void pause() {
        synchronized (this.a) {
            e.a aVar = this.e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.e = e.a.PAUSED;
                this.c.pause();
            }
            if (this.f == aVar2) {
                this.f = e.a.PAUSED;
                this.d.pause();
            }
        }
    }
}
