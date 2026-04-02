package com.amazon.aps.iva.aa0;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.r;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: HttpRequests.kt */
/* loaded from: classes4.dex */
public final class f {
    public final e a;
    public final a b;
    public final Map<String, List<String>> c;
    public final byte[] d;
    public final boolean e;

    /* compiled from: HttpRequests.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.a) * 31;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusLine(code=");
            sb.append(this.a);
            sb.append(", message=");
            return t1.b(sb, this.b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(e eVar, a aVar, Map<String, ? extends List<String>> map, byte[] bArr) {
        boolean z;
        j.f(eVar, "originalRequest");
        this.a = eVar;
        this.b = aVar;
        this.c = map;
        this.d = bArr;
        int i = aVar.a;
        if (200 <= i && i < 300) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            int identityHashCode = System.identityHashCode(this);
            f fVar = (f) obj;
            fVar.getClass();
            if (identityHashCode == System.identityHashCode(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Response(originalRequest=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", body=");
        byte[] bArr = this.d;
        if (bArr != null) {
            String arrays = Arrays.toString(bArr);
            j.e(arrays, "toString(this)");
            str = r.Q0(80, arrays);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", successful=");
        return defpackage.a.b(sb, this.e, ')');
    }
}
