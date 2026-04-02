package com.amazon.aps.iva.dd;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.dd.a;
import com.amazon.aps.iva.nc.l;
import com.amazon.aps.iva.uc.m;
import com.amazon.aps.iva.uc.p;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import okhttp3.internal.http2.Http2;
/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public int b;
    public Drawable f;
    public int g;
    public Drawable h;
    public int i;
    public boolean n;
    public Drawable p;
    public int q;
    public boolean u;
    public Resources.Theme v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float c = 1.0f;
    public l d = l.d;
    public com.amazon.aps.iva.ec.c e = com.amazon.aps.iva.ec.c.NORMAL;
    public boolean j = true;
    public int k = -1;
    public int l = -1;
    public com.amazon.aps.iva.kc.f m = com.amazon.aps.iva.gd.a.b;
    public boolean o = true;
    public com.amazon.aps.iva.kc.h r = new com.amazon.aps.iva.kc.h();
    public com.amazon.aps.iva.hd.b s = new com.amazon.aps.iva.hd.b();
    public Class<?> t = Object.class;
    public boolean z = true;

    public static boolean h(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public T a(a<?> aVar) {
        if (this.w) {
            return (T) clone().a(aVar);
        }
        if (h(aVar.b, 2)) {
            this.c = aVar.c;
        }
        if (h(aVar.b, 262144)) {
            this.x = aVar.x;
        }
        if (h(aVar.b, 1048576)) {
            this.A = aVar.A;
        }
        if (h(aVar.b, 4)) {
            this.d = aVar.d;
        }
        if (h(aVar.b, 8)) {
            this.e = aVar.e;
        }
        if (h(aVar.b, 16)) {
            this.f = aVar.f;
            this.g = 0;
            this.b &= -33;
        }
        if (h(aVar.b, 32)) {
            this.g = aVar.g;
            this.f = null;
            this.b &= -17;
        }
        if (h(aVar.b, 64)) {
            this.h = aVar.h;
            this.i = 0;
            this.b &= -129;
        }
        if (h(aVar.b, 128)) {
            this.i = aVar.i;
            this.h = null;
            this.b &= -65;
        }
        if (h(aVar.b, 256)) {
            this.j = aVar.j;
        }
        if (h(aVar.b, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.l = aVar.l;
            this.k = aVar.k;
        }
        if (h(aVar.b, 1024)) {
            this.m = aVar.m;
        }
        if (h(aVar.b, 4096)) {
            this.t = aVar.t;
        }
        if (h(aVar.b, 8192)) {
            this.p = aVar.p;
            this.q = 0;
            this.b &= -16385;
        }
        if (h(aVar.b, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.q = aVar.q;
            this.p = null;
            this.b &= -8193;
        }
        if (h(aVar.b, 32768)) {
            this.v = aVar.v;
        }
        if (h(aVar.b, Cast.MAX_MESSAGE_LENGTH)) {
            this.o = aVar.o;
        }
        if (h(aVar.b, 131072)) {
            this.n = aVar.n;
        }
        if (h(aVar.b, 2048)) {
            this.s.putAll(aVar.s);
            this.z = aVar.z;
        }
        if (h(aVar.b, 524288)) {
            this.y = aVar.y;
        }
        if (!this.o) {
            this.s.clear();
            this.n = false;
            this.b = this.b & (-2049) & (-131073);
            this.z = true;
        }
        this.b |= aVar.b;
        this.r.b.k(aVar.r.b);
        p();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t = (T) super.clone();
            com.amazon.aps.iva.kc.h hVar = new com.amazon.aps.iva.kc.h();
            t.r = hVar;
            hVar.b.k(this.r.b);
            com.amazon.aps.iva.hd.b bVar = new com.amazon.aps.iva.hd.b();
            t.s = bVar;
            bVar.putAll(this.s);
            t.u = false;
            t.w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final T c(Class<?> cls) {
        if (this.w) {
            return (T) clone().c(cls);
        }
        this.t = cls;
        this.b |= 4096;
        p();
        return this;
    }

    public final T d(l lVar) {
        if (this.w) {
            return (T) clone().d(lVar);
        }
        defpackage.i.l(lVar);
        this.d = lVar;
        this.b |= 4;
        p();
        return this;
    }

    public final T e(int i) {
        if (this.w) {
            return (T) clone().e(i);
        }
        this.g = i;
        this.f = null;
        this.b = (this.b | 32) & (-17);
        p();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return g((a) obj);
        }
        return false;
    }

    public final T f(Drawable drawable) {
        if (this.w) {
            return (T) clone().f(drawable);
        }
        this.f = drawable;
        this.g = 0;
        this.b = (this.b | 16) & (-33);
        p();
        return this;
    }

    public final boolean g(a<?> aVar) {
        if (Float.compare(aVar.c, this.c) == 0 && this.g == aVar.g && com.amazon.aps.iva.hd.l.b(this.f, aVar.f) && this.i == aVar.i && com.amazon.aps.iva.hd.l.b(this.h, aVar.h) && this.q == aVar.q && com.amazon.aps.iva.hd.l.b(this.p, aVar.p) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.n == aVar.n && this.o == aVar.o && this.x == aVar.x && this.y == aVar.y && this.d.equals(aVar.d) && this.e == aVar.e && this.r.equals(aVar.r) && this.s.equals(aVar.s) && this.t.equals(aVar.t) && com.amazon.aps.iva.hd.l.b(this.m, aVar.m) && com.amazon.aps.iva.hd.l.b(this.v, aVar.v)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float f = this.c;
        char[] cArr = com.amazon.aps.iva.hd.l.a;
        return com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.f(com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.g((((com.amazon.aps.iva.hd.l.g(com.amazon.aps.iva.hd.l.f((com.amazon.aps.iva.hd.l.f((com.amazon.aps.iva.hd.l.f(((Float.floatToIntBits(f) + 527) * 31) + this.g, this.f) * 31) + this.i, this.h) * 31) + this.q, this.p), this.j) * 31) + this.k) * 31) + this.l, this.n), this.o), this.x), this.y), this.d), this.e), this.r), this.s), this.t), this.m), this.v);
    }

    public final a i(m mVar, com.amazon.aps.iva.uc.f fVar) {
        if (this.w) {
            return clone().i(mVar, fVar);
        }
        com.amazon.aps.iva.kc.g gVar = m.f;
        defpackage.i.l(mVar);
        q(gVar, mVar);
        return t(fVar, false);
    }

    public final T j(int i, int i2) {
        if (this.w) {
            return (T) clone().j(i, i2);
        }
        this.l = i;
        this.k = i2;
        this.b |= AdRequest.MAX_CONTENT_URL_LENGTH;
        p();
        return this;
    }

    public final T k(int i) {
        if (this.w) {
            return (T) clone().k(i);
        }
        this.i = i;
        this.h = null;
        this.b = (this.b | 128) & (-65);
        p();
        return this;
    }

    public final T l(Drawable drawable) {
        if (this.w) {
            return (T) clone().l(drawable);
        }
        this.h = drawable;
        this.i = 0;
        this.b = (this.b | 64) & (-129);
        p();
        return this;
    }

    public final T m(com.amazon.aps.iva.ec.c cVar) {
        if (this.w) {
            return (T) clone().m(cVar);
        }
        defpackage.i.l(cVar);
        this.e = cVar;
        this.b |= 8;
        p();
        return this;
    }

    public final a o(m mVar, com.amazon.aps.iva.uc.f fVar, boolean z) {
        a i;
        if (z) {
            i = u(mVar, fVar);
        } else {
            i = i(mVar, fVar);
        }
        i.z = true;
        return i;
    }

    public final void p() {
        if (!this.u) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final <Y> T q(com.amazon.aps.iva.kc.g<Y> gVar, Y y) {
        if (this.w) {
            return (T) clone().q(gVar, y);
        }
        defpackage.i.l(gVar);
        defpackage.i.l(y);
        this.r.b.put(gVar, y);
        p();
        return this;
    }

    public final a r(com.amazon.aps.iva.gd.b bVar) {
        if (this.w) {
            return clone().r(bVar);
        }
        this.m = bVar;
        this.b |= 1024;
        p();
        return this;
    }

    public final T s(boolean z) {
        if (this.w) {
            return (T) clone().s(true);
        }
        this.j = !z;
        this.b |= 256;
        p();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T t(com.amazon.aps.iva.kc.l<Bitmap> lVar, boolean z) {
        if (this.w) {
            return (T) clone().t(lVar, z);
        }
        p pVar = new p(lVar, z);
        v(Bitmap.class, lVar, z);
        v(Drawable.class, pVar, z);
        v(BitmapDrawable.class, pVar, z);
        v(com.amazon.aps.iva.yc.c.class, new com.amazon.aps.iva.yc.e(lVar), z);
        p();
        return this;
    }

    public final a u(m mVar, com.amazon.aps.iva.uc.f fVar) {
        if (this.w) {
            return clone().u(mVar, fVar);
        }
        com.amazon.aps.iva.kc.g gVar = m.f;
        defpackage.i.l(mVar);
        q(gVar, mVar);
        return t(fVar, true);
    }

    public final <Y> T v(Class<Y> cls, com.amazon.aps.iva.kc.l<Y> lVar, boolean z) {
        if (this.w) {
            return (T) clone().v(cls, lVar, z);
        }
        defpackage.i.l(lVar);
        this.s.put(cls, lVar);
        this.o = true;
        int i = this.b | 2048 | Cast.MAX_MESSAGE_LENGTH;
        this.b = i;
        this.z = false;
        if (z) {
            this.b = i | 131072;
            this.n = true;
        }
        p();
        return this;
    }

    public final a w() {
        if (this.w) {
            return clone().w();
        }
        this.A = true;
        this.b |= 1048576;
        p();
        return this;
    }
}
