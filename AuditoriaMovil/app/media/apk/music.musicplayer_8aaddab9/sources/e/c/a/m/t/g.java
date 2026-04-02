package e.c.a.m.t;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public class g implements e.c.a.m.k {

    /* renamed from: b  reason: collision with root package name */
    public final h f5789b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f5790c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5791d;

    /* renamed from: e  reason: collision with root package name */
    public String f5792e;

    /* renamed from: f  reason: collision with root package name */
    public URL f5793f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f5794g;

    /* renamed from: h  reason: collision with root package name */
    public int f5795h;

    public g(String str) {
        h hVar = h.a;
        this.f5790c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f5791d = str;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f5789b = hVar;
    }

    public g(URL url) {
        h hVar = h.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f5790c = url;
        this.f5791d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f5789b = hVar;
    }

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        if (this.f5794g == null) {
            this.f5794g = c().getBytes(e.c.a.m.k.a);
        }
        messageDigest.update(this.f5794g);
    }

    public String c() {
        String str = this.f5791d;
        if (str != null) {
            return str;
        }
        URL url = this.f5790c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() throws MalformedURLException {
        if (this.f5793f == null) {
            if (TextUtils.isEmpty(this.f5792e)) {
                String str = this.f5791d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f5790c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f5792e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f5793f = new URL(this.f5792e);
        }
        return this.f5793f;
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.f5789b.equals(gVar.f5789b);
        }
        return false;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        if (this.f5795h == 0) {
            int hashCode = c().hashCode();
            this.f5795h = hashCode;
            this.f5795h = this.f5789b.hashCode() + (hashCode * 31);
        }
        return this.f5795h;
    }

    public String toString() {
        return c();
    }
}
