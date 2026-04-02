package j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class i {
    public static final g[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final g[] f9258b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f9259c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f9260d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f9261e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9262f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9263g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String[] f9264h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String[] f9265i;

    /* loaded from: classes.dex */
    public static final class a {
        public boolean a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f9266b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String[] f9267c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9268d;

        public a(i iVar) {
            this.a = iVar.f9262f;
            this.f9266b = iVar.f9264h;
            this.f9267c = iVar.f9265i;
            this.f9268d = iVar.f9263g;
        }

        public a(boolean z) {
            this.a = z;
        }

        public a a(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.f9266b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a b(g... gVarArr) {
            if (this.a) {
                String[] strArr = new String[gVarArr.length];
                for (int i2 = 0; i2 < gVarArr.length; i2++) {
                    strArr[i2] = gVarArr[i2].u;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(boolean z) {
            if (this.a) {
                this.f9268d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a d(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.f9267c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a e(h0... h0VarArr) {
            if (this.a) {
                String[] strArr = new String[h0VarArr.length];
                for (int i2 = 0; i2 < h0VarArr.length; i2++) {
                    strArr[i2] = h0VarArr[i2].javaName;
                }
                d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        g gVar = g.p;
        g gVar2 = g.q;
        g gVar3 = g.r;
        g gVar4 = g.s;
        g gVar5 = g.t;
        g gVar6 = g.f9245j;
        g gVar7 = g.f9247l;
        g gVar8 = g.f9246k;
        g gVar9 = g.f9248m;
        g gVar10 = g.o;
        g gVar11 = g.f9249n;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        a = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.f9243h, g.f9244i, g.f9241f, g.f9242g, g.f9239d, g.f9240e, g.f9238c};
        f9258b = gVarArr2;
        a aVar = new a(true);
        aVar.b(gVarArr);
        h0 h0Var = h0.TLS_1_3;
        h0 h0Var2 = h0.TLS_1_2;
        aVar.e(h0Var, h0Var2);
        aVar.c(true);
        a aVar2 = new a(true);
        aVar2.b(gVarArr2);
        h0 h0Var3 = h0.TLS_1_0;
        aVar2.e(h0Var, h0Var2, h0.TLS_1_1, h0Var3);
        aVar2.c(true);
        f9259c = new i(aVar2);
        a aVar3 = new a(true);
        aVar3.b(gVarArr2);
        aVar3.e(h0Var3);
        aVar3.c(true);
        f9260d = new i(aVar3);
        f9261e = new i(new a(false));
    }

    public i(a aVar) {
        this.f9262f = aVar.a;
        this.f9264h = aVar.f9266b;
        this.f9265i = aVar.f9267c;
        this.f9263g = aVar.f9268d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (this.f9262f) {
            String[] strArr = this.f9265i;
            if (strArr == null || j.i0.c.t(j.i0.c.o, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f9264h;
                return strArr2 == null || j.i0.c.t(g.a, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof i) {
            if (obj == this) {
                return true;
            }
            i iVar = (i) obj;
            boolean z = this.f9262f;
            if (z != iVar.f9262f) {
                return false;
            }
            return !z || (Arrays.equals(this.f9264h, iVar.f9264h) && Arrays.equals(this.f9265i, iVar.f9265i) && this.f9263g == iVar.f9263g);
        }
        return false;
    }

    public int hashCode() {
        if (this.f9262f) {
            return ((((527 + Arrays.hashCode(this.f9264h)) * 31) + Arrays.hashCode(this.f9265i)) * 31) + (!this.f9263g ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (this.f9262f) {
            String[] strArr = this.f9264h;
            if (strArr != null) {
                if (strArr != null) {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        arrayList.add(g.a(str2));
                    }
                    list = Collections.unmodifiableList(arrayList);
                } else {
                    list = null;
                }
                str = list.toString();
            } else {
                str = "[all enabled]";
            }
            String[] strArr2 = this.f9265i;
            return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + (strArr2 != null ? (strArr2 != null ? h0.forJavaNames(strArr2) : null).toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f9263g + ")";
        }
        return "ConnectionSpec()";
    }
}
