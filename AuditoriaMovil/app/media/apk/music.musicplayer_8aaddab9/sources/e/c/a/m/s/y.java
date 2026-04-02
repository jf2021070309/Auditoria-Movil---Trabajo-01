package e.c.a.m.s;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class y implements e.c.a.m.k {

    /* renamed from: b  reason: collision with root package name */
    public static final e.c.a.s.g<Class<?>, byte[]> f5773b = new e.c.a.s.g<>(50);

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5774c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.m.k f5775d;

    /* renamed from: e  reason: collision with root package name */
    public final e.c.a.m.k f5776e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5777f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5778g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f5779h;

    /* renamed from: i  reason: collision with root package name */
    public final e.c.a.m.m f5780i;

    /* renamed from: j  reason: collision with root package name */
    public final e.c.a.m.q<?> f5781j;

    public y(e.c.a.m.s.c0.b bVar, e.c.a.m.k kVar, e.c.a.m.k kVar2, int i2, int i3, e.c.a.m.q<?> qVar, Class<?> cls, e.c.a.m.m mVar) {
        this.f5774c = bVar;
        this.f5775d = kVar;
        this.f5776e = kVar2;
        this.f5777f = i2;
        this.f5778g = i3;
        this.f5781j = qVar;
        this.f5779h = cls;
        this.f5780i = mVar;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f5774c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f5777f).putInt(this.f5778g).array();
        this.f5776e.a(messageDigest);
        this.f5775d.a(messageDigest);
        messageDigest.update(bArr);
        e.c.a.m.q<?> qVar = this.f5781j;
        if (qVar != null) {
            qVar.a(messageDigest);
        }
        this.f5780i.a(messageDigest);
        e.c.a.s.g<Class<?>, byte[]> gVar = f5773b;
        byte[] a = gVar.a(this.f5779h);
        if (a == null) {
            a = this.f5779h.getName().getBytes(e.c.a.m.k.a);
            gVar.d(this.f5779h, a);
        }
        messageDigest.update(a);
        this.f5774c.d(bArr);
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f5778g == yVar.f5778g && this.f5777f == yVar.f5777f && e.c.a.s.j.b(this.f5781j, yVar.f5781j) && this.f5779h.equals(yVar.f5779h) && this.f5775d.equals(yVar.f5775d) && this.f5776e.equals(yVar.f5776e) && this.f5780i.equals(yVar.f5780i);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        int hashCode = ((((this.f5776e.hashCode() + (this.f5775d.hashCode() * 31)) * 31) + this.f5777f) * 31) + this.f5778g;
        e.c.a.m.q<?> qVar = this.f5781j;
        if (qVar != null) {
            hashCode = (hashCode * 31) + qVar.hashCode();
        }
        int hashCode2 = this.f5779h.hashCode();
        return this.f5780i.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ResourceCacheKey{sourceKey=");
        y.append(this.f5775d);
        y.append(", signature=");
        y.append(this.f5776e);
        y.append(", width=");
        y.append(this.f5777f);
        y.append(", height=");
        y.append(this.f5778g);
        y.append(", decodedResourceClass=");
        y.append(this.f5779h);
        y.append(", transformation='");
        y.append(this.f5781j);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append(", options=");
        y.append(this.f5780i);
        y.append('}');
        return y.toString();
    }
}
