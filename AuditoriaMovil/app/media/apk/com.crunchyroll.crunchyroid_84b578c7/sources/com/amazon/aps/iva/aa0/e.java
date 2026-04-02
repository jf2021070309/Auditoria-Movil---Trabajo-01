package com.amazon.aps.iva.aa0;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.r;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: HttpRequests.kt */
/* loaded from: classes4.dex */
public abstract class e {
    public final String a;
    public final URL b;
    public final Map<String, List<String>> c;
    public final String d;
    public final byte[] e;

    public e(URL url, Map map, String str, byte[] bArr) {
        j.f(url, ImagesContract.URL);
        this.a = "POST";
        this.b = url;
        this.c = map;
        this.d = str;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !j.a(e0.a(obj.getClass()), e0.a(getClass())) || System.identityHashCode(this) != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Request(method='");
        sb.append(this.a);
        sb.append("', url=");
        sb.append(this.b);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", contentType=");
        sb.append(this.d);
        sb.append(", body=");
        byte[] bArr = this.e;
        if (bArr != null) {
            String arrays = Arrays.toString(bArr);
            j.e(arrays, "toString(this)");
            str = r.Q0(80, arrays);
        } else {
            str = null;
        }
        return t1.b(sb, str, ')');
    }
}
