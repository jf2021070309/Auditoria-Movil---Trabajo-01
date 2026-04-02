package com.amazon.aps.iva.rc;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.kc.f {
    public final h b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public g(URL url) {
        j jVar = h.a;
        defpackage.i.l(url);
        this.c = url;
        this.d = null;
        defpackage.i.l(jVar);
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(com.amazon.aps.iva.kc.f.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str == null) {
            URL url = this.c;
            defpackage.i.l(url);
            return url.toString();
        }
        return str;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                defpackage.i.l(url);
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.b.equals(gVar.b)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public g(String str) {
        j jVar = h.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            defpackage.i.l(jVar);
            this.b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
