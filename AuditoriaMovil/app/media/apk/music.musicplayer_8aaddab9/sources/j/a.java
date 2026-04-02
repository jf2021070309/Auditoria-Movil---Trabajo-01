package j;

import j.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class a {
    public final s a;

    /* renamed from: b  reason: collision with root package name */
    public final m f9181b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f9182c;

    /* renamed from: d  reason: collision with root package name */
    public final b f9183d;

    /* renamed from: e  reason: collision with root package name */
    public final List<x> f9184e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i> f9185f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f9186g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f9187h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f9188i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f9189j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final f f9190k;

    public a(String str, int i2, m mVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<x> list, List<i> list2, ProxySelector proxySelector) {
        s.a aVar = new s.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else if (!str2.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException(e.a.d.a.a.k("unexpected scheme: ", str2));
        } else {
            aVar.a = "https";
        }
        Objects.requireNonNull(str, "host == null");
        String b2 = j.i0.c.b(s.l(str, 0, str.length(), false));
        if (b2 == null) {
            throw new IllegalArgumentException(e.a.d.a.a.k("unexpected host: ", str));
        }
        aVar.f9547d = b2;
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException(e.a.d.a.a.e("unexpected port: ", i2));
        }
        aVar.f9548e = i2;
        this.a = aVar.a();
        Objects.requireNonNull(mVar, "dns == null");
        this.f9181b = mVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f9182c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f9183d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f9184e = j.i0.c.o(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f9185f = j.i0.c.o(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f9186g = proxySelector;
        this.f9187h = null;
        this.f9188i = sSLSocketFactory;
        this.f9189j = hostnameVerifier;
        this.f9190k = fVar;
    }

    public boolean a(a aVar) {
        return this.f9181b.equals(aVar.f9181b) && this.f9183d.equals(aVar.f9183d) && this.f9184e.equals(aVar.f9184e) && this.f9185f.equals(aVar.f9185f) && this.f9186g.equals(aVar.f9186g) && j.i0.c.l(this.f9187h, aVar.f9187h) && j.i0.c.l(this.f9188i, aVar.f9188i) && j.i0.c.l(this.f9189j, aVar.f9189j) && j.i0.c.l(this.f9190k, aVar.f9190k) && this.a.f9540f == aVar.a.f9540f;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9181b.hashCode();
        int hashCode2 = this.f9183d.hashCode();
        int hashCode3 = this.f9184e.hashCode();
        int hashCode4 = (this.f9186g.hashCode() + ((this.f9185f.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f9187h;
        int hashCode5 = (hashCode4 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f9188i;
        int hashCode6 = (hashCode5 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f9189j;
        int hashCode7 = (hashCode6 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f9190k;
        return hashCode7 + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Address{");
        y.append(this.a.f9539e);
        y.append(":");
        y.append(this.a.f9540f);
        if (this.f9187h != null) {
            y.append(", proxy=");
            y.append(this.f9187h);
        } else {
            y.append(", proxySelector=");
            y.append(this.f9186g);
        }
        y.append("}");
        return y.toString();
    }
}
