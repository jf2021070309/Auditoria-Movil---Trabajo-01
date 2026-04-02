package e.c.a.m.s;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class o implements e.c.a.m.k {

    /* renamed from: b  reason: collision with root package name */
    public final Object f5736b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5737c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5738d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f5739e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f5740f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c.a.m.k f5741g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, e.c.a.m.q<?>> f5742h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.m.m f5743i;

    /* renamed from: j  reason: collision with root package name */
    public int f5744j;

    public o(Object obj, e.c.a.m.k kVar, int i2, int i3, Map<Class<?>, e.c.a.m.q<?>> map, Class<?> cls, Class<?> cls2, e.c.a.m.m mVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f5736b = obj;
        Objects.requireNonNull(kVar, "Signature must not be null");
        this.f5741g = kVar;
        this.f5737c = i2;
        this.f5738d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f5742h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f5739e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f5740f = cls2;
        Objects.requireNonNull(mVar, "Argument must not be null");
        this.f5743i = mVar;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f5736b.equals(oVar.f5736b) && this.f5741g.equals(oVar.f5741g) && this.f5738d == oVar.f5738d && this.f5737c == oVar.f5737c && this.f5742h.equals(oVar.f5742h) && this.f5739e.equals(oVar.f5739e) && this.f5740f.equals(oVar.f5740f) && this.f5743i.equals(oVar.f5743i);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        if (this.f5744j == 0) {
            int hashCode = this.f5736b.hashCode();
            this.f5744j = hashCode;
            int hashCode2 = this.f5741g.hashCode() + (hashCode * 31);
            this.f5744j = hashCode2;
            int i2 = (hashCode2 * 31) + this.f5737c;
            this.f5744j = i2;
            int i3 = (i2 * 31) + this.f5738d;
            this.f5744j = i3;
            int hashCode3 = this.f5742h.hashCode() + (i3 * 31);
            this.f5744j = hashCode3;
            int hashCode4 = this.f5739e.hashCode() + (hashCode3 * 31);
            this.f5744j = hashCode4;
            int hashCode5 = this.f5740f.hashCode() + (hashCode4 * 31);
            this.f5744j = hashCode5;
            this.f5744j = this.f5743i.hashCode() + (hashCode5 * 31);
        }
        return this.f5744j;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("EngineKey{model=");
        y.append(this.f5736b);
        y.append(", width=");
        y.append(this.f5737c);
        y.append(", height=");
        y.append(this.f5738d);
        y.append(", resourceClass=");
        y.append(this.f5739e);
        y.append(", transcodeClass=");
        y.append(this.f5740f);
        y.append(", signature=");
        y.append(this.f5741g);
        y.append(", hashCode=");
        y.append(this.f5744j);
        y.append(", transformations=");
        y.append(this.f5742h);
        y.append(", options=");
        y.append(this.f5743i);
        y.append('}');
        return y.toString();
    }
}
