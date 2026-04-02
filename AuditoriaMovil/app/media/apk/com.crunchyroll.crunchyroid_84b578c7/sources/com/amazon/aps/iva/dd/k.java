package com.amazon.aps.iva.dd;

import com.amazon.aps.iva.dd.e;
/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public final class k implements e, d {
    public final e a;
    public final Object b;
    public volatile d c;
    public volatile d d;
    public e.a e;
    public e.a f;
    public boolean g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = eVar;
    }

    @Override // com.amazon.aps.iva.dd.e, com.amazon.aps.iva.dd.d
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            if (!this.d.a() && !this.c.a()) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final void b(d dVar) {
        synchronized (this.b) {
            if (dVar.equals(this.d)) {
                this.f = e.a.SUCCESS;
                return;
            }
            this.e = e.a.SUCCESS;
            e eVar = this.a;
            if (eVar != null) {
                eVar.b(this);
            }
            if (!this.f.isComplete()) {
                this.d.clear();
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean c(d dVar) {
        if (!(dVar instanceof k)) {
            return false;
        }
        k kVar = (k) dVar;
        if (this.c == null) {
            if (kVar.c != null) {
                return false;
            }
        } else if (!this.c.c(kVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (kVar.d != null) {
                return false;
            }
        } else if (!this.d.c(kVar.d)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            e.a aVar = e.a.CLEARED;
            this.e = aVar;
            this.f = aVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            if (this.e == e.a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final void e(d dVar) {
        synchronized (this.b) {
            if (!dVar.equals(this.c)) {
                this.f = e.a.FAILED;
                return;
            }
            this.e = e.a.FAILED;
            e eVar = this.a;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            if (this.e == e.a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.e
    public final boolean g(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            e eVar = this.a;
            z = false;
            if (eVar != null && !eVar.g(this)) {
                z2 = false;
                if (z2 && dVar.equals(this.c) && !a()) {
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

    @Override // com.amazon.aps.iva.dd.e
    public final e getRoot() {
        e eVar;
        synchronized (this.b) {
            e eVar2 = this.a;
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
        boolean z2;
        synchronized (this.b) {
            e eVar = this.a;
            z = false;
            if (eVar != null && !eVar.h(this)) {
                z2 = false;
                if (z2 && (dVar.equals(this.c) || this.e != e.a.SUCCESS)) {
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

    @Override // com.amazon.aps.iva.dd.e
    public final boolean i(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            e eVar = this.a;
            z = false;
            if (eVar != null && !eVar.i(this)) {
                z2 = false;
                if (z2 && dVar.equals(this.c) && this.e != e.a.PAUSED) {
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
        synchronized (this.b) {
            if (this.e == e.a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void j() {
        synchronized (this.b) {
            this.g = true;
            if (this.e != e.a.SUCCESS) {
                e.a aVar = this.f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f = aVar2;
                    this.d.j();
                }
            }
            if (this.g) {
                e.a aVar3 = this.e;
                e.a aVar4 = e.a.RUNNING;
                if (aVar3 != aVar4) {
                    this.e = aVar4;
                    this.c.j();
                }
            }
            this.g = false;
        }
    }

    @Override // com.amazon.aps.iva.dd.d
    public final void pause() {
        synchronized (this.b) {
            if (!this.f.isComplete()) {
                this.f = e.a.PAUSED;
                this.d.pause();
            }
            if (!this.e.isComplete()) {
                this.e = e.a.PAUSED;
                this.c.pause();
            }
        }
    }
}
