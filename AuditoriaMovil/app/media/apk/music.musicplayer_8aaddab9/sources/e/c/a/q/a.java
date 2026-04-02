package e.c.a.q;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.util.FileUtil;
import com.google.android.gms.ads.AdRequest;
import e.c.a.m.k;
import e.c.a.m.m;
import e.c.a.m.q;
import e.c.a.m.u.c.l;
import e.c.a.m.u.c.o;
import e.c.a.q.a;
import e.c.a.s.j;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public int a;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f5985e;

    /* renamed from: f  reason: collision with root package name */
    public int f5986f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f5987g;

    /* renamed from: h  reason: collision with root package name */
    public int f5988h;

    /* renamed from: l  reason: collision with root package name */
    public k f5992l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5993m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5994n;
    public Drawable o;
    public int p;
    public m q;
    public Map<Class<?>, q<?>> r;
    public Class<?> s;
    public boolean t;
    public Resources.Theme u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* renamed from: b  reason: collision with root package name */
    public float f5982b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public e.c.a.m.s.k f5983c = e.c.a.m.s.k.f5700d;

    /* renamed from: d  reason: collision with root package name */
    public e.c.a.f f5984d = e.c.a.f.NORMAL;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5989i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f5990j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f5991k = -1;

    public a() {
        e.c.a.r.a aVar = e.c.a.r.a.f6016b;
        this.f5992l = e.c.a.r.a.f6016b;
        this.f5994n = true;
        this.q = new m();
        this.r = new e.c.a.s.b();
        this.s = Object.class;
        this.y = true;
    }

    public static boolean g(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public T a(a<?> aVar) {
        if (this.v) {
            return (T) clone().a(aVar);
        }
        if (g(aVar.a, 2)) {
            this.f5982b = aVar.f5982b;
        }
        if (g(aVar.a, 262144)) {
            this.w = aVar.w;
        }
        if (g(aVar.a, 1048576)) {
            this.z = aVar.z;
        }
        if (g(aVar.a, 4)) {
            this.f5983c = aVar.f5983c;
        }
        if (g(aVar.a, 8)) {
            this.f5984d = aVar.f5984d;
        }
        if (g(aVar.a, 16)) {
            this.f5985e = aVar.f5985e;
            this.f5986f = 0;
            this.a &= -33;
        }
        if (g(aVar.a, 32)) {
            this.f5986f = aVar.f5986f;
            this.f5985e = null;
            this.a &= -17;
        }
        if (g(aVar.a, 64)) {
            this.f5987g = aVar.f5987g;
            this.f5988h = 0;
            this.a &= -129;
        }
        if (g(aVar.a, 128)) {
            this.f5988h = aVar.f5988h;
            this.f5987g = null;
            this.a &= -65;
        }
        if (g(aVar.a, 256)) {
            this.f5989i = aVar.f5989i;
        }
        if (g(aVar.a, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f5991k = aVar.f5991k;
            this.f5990j = aVar.f5990j;
        }
        if (g(aVar.a, 1024)) {
            this.f5992l = aVar.f5992l;
        }
        if (g(aVar.a, 4096)) {
            this.s = aVar.s;
        }
        if (g(aVar.a, Compressor.BUFFER_SIZE)) {
            this.o = aVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (g(aVar.a, 16384)) {
            this.p = aVar.p;
            this.o = null;
            this.a &= -8193;
        }
        if (g(aVar.a, FileUtil.BUF_SIZE)) {
            this.u = aVar.u;
        }
        if (g(aVar.a, 65536)) {
            this.f5994n = aVar.f5994n;
        }
        if (g(aVar.a, 131072)) {
            this.f5993m = aVar.f5993m;
        }
        if (g(aVar.a, ThrowableProxyConverter.BUILDER_CAPACITY)) {
            this.r.putAll(aVar.r);
            this.y = aVar.y;
        }
        if (g(aVar.a, 524288)) {
            this.x = aVar.x;
        }
        if (!this.f5994n) {
            this.r.clear();
            int i2 = this.a & (-2049);
            this.a = i2;
            this.f5993m = false;
            this.a = i2 & (-131073);
            this.y = true;
        }
        this.a |= aVar.a;
        this.q.d(aVar.q);
        m();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t = (T) super.clone();
            m mVar = new m();
            t.q = mVar;
            mVar.d(this.q);
            e.c.a.s.b bVar = new e.c.a.s.b();
            t.r = bVar;
            bVar.putAll(this.r);
            t.t = false;
            t.v = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public T c(Class<?> cls) {
        if (this.v) {
            return (T) clone().c(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.s = cls;
        this.a |= 4096;
        m();
        return this;
    }

    public T d(e.c.a.m.s.k kVar) {
        if (this.v) {
            return (T) clone().d(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f5983c = kVar;
        this.a |= 4;
        m();
        return this;
    }

    public T e(l lVar) {
        e.c.a.m.l lVar2 = l.f5867g;
        Objects.requireNonNull(lVar, "Argument must not be null");
        return n(lVar2, lVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f5982b, this.f5982b) == 0 && this.f5986f == aVar.f5986f && j.b(this.f5985e, aVar.f5985e) && this.f5988h == aVar.f5988h && j.b(this.f5987g, aVar.f5987g) && this.p == aVar.p && j.b(this.o, aVar.o) && this.f5989i == aVar.f5989i && this.f5990j == aVar.f5990j && this.f5991k == aVar.f5991k && this.f5993m == aVar.f5993m && this.f5994n == aVar.f5994n && this.w == aVar.w && this.x == aVar.x && this.f5983c.equals(aVar.f5983c) && this.f5984d == aVar.f5984d && this.q.equals(aVar.q) && this.r.equals(aVar.r) && this.s.equals(aVar.s) && j.b(this.f5992l, aVar.f5992l) && j.b(this.u, aVar.u);
        }
        return false;
    }

    public T f(Drawable drawable) {
        if (this.v) {
            return (T) clone().f(drawable);
        }
        this.f5985e = drawable;
        int i2 = this.a | 16;
        this.a = i2;
        this.f5986f = 0;
        this.a = i2 & (-33);
        m();
        return this;
    }

    public int hashCode() {
        float f2 = this.f5982b;
        char[] cArr = j.a;
        return j.f(this.u, j.f(this.f5992l, j.f(this.s, j.f(this.r, j.f(this.q, j.f(this.f5984d, j.f(this.f5983c, (((((((((((((j.f(this.o, (j.f(this.f5987g, (j.f(this.f5985e, ((Float.floatToIntBits(f2) + 527) * 31) + this.f5986f) * 31) + this.f5988h) * 31) + this.p) * 31) + (this.f5989i ? 1 : 0)) * 31) + this.f5990j) * 31) + this.f5991k) * 31) + (this.f5993m ? 1 : 0)) * 31) + (this.f5994n ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0))))))));
    }

    public final T j(l lVar, q<Bitmap> qVar) {
        if (this.v) {
            return (T) clone().j(lVar, qVar);
        }
        e(lVar);
        return q(qVar, false);
    }

    public T k(int i2, int i3) {
        if (this.v) {
            return (T) clone().k(i2, i3);
        }
        this.f5991k = i2;
        this.f5990j = i3;
        this.a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        m();
        return this;
    }

    public T l(e.c.a.f fVar) {
        if (this.v) {
            return (T) clone().l(fVar);
        }
        Objects.requireNonNull(fVar, "Argument must not be null");
        this.f5984d = fVar;
        this.a |= 8;
        m();
        return this;
    }

    public final T m() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public <Y> T n(e.c.a.m.l<Y> lVar, Y y) {
        if (this.v) {
            return (T) clone().n(lVar, y);
        }
        Objects.requireNonNull(lVar, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.q.f5559b.put(lVar, y);
        m();
        return this;
    }

    public T o(k kVar) {
        if (this.v) {
            return (T) clone().o(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f5992l = kVar;
        this.a |= 1024;
        m();
        return this;
    }

    public T p(boolean z) {
        if (this.v) {
            return (T) clone().p(true);
        }
        this.f5989i = !z;
        this.a |= 256;
        m();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T q(q<Bitmap> qVar, boolean z) {
        if (this.v) {
            return (T) clone().q(qVar, z);
        }
        o oVar = new o(qVar, z);
        r(Bitmap.class, qVar, z);
        r(Drawable.class, oVar, z);
        r(BitmapDrawable.class, oVar, z);
        r(e.c.a.m.u.g.c.class, new e.c.a.m.u.g.f(qVar), z);
        m();
        return this;
    }

    public <Y> T r(Class<Y> cls, q<Y> qVar, boolean z) {
        if (this.v) {
            return (T) clone().r(cls, qVar, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(qVar, "Argument must not be null");
        this.r.put(cls, qVar);
        int i2 = this.a | ThrowableProxyConverter.BUILDER_CAPACITY;
        this.a = i2;
        this.f5994n = true;
        int i3 = i2 | 65536;
        this.a = i3;
        this.y = false;
        if (z) {
            this.a = i3 | 131072;
            this.f5993m = true;
        }
        m();
        return this;
    }

    public T s(boolean z) {
        if (this.v) {
            return (T) clone().s(z);
        }
        this.z = z;
        this.a |= 1048576;
        m();
        return this;
    }
}
