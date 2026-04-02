package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class k {
    private static final h[] e;
    public static final k f;
    public static final k g;
    final boolean a;
    final boolean b;
    final String[] c;
    final String[] d;

    /* loaded from: classes.dex */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        public a(k kVar) {
            this.a = kVar.a;
            this.b = kVar.c;
            this.c = kVar.d;
            this.d = kVar.b;
        }

        a(boolean z) {
            this.a = z;
        }

        public a a(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i = 0; i < d0VarArr.length; i++) {
                    strArr[i] = d0VarArr[i].a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(h... hVarArr) {
            if (this.a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].a;
                }
                return a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public k a() {
            return new k(this);
        }

        public a b(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        h[] hVarArr = {h.m, h.o, h.n, h.p, h.r, h.q, h.i, h.k, h.j, h.l, h.g, h.h, h.e, h.f, h.d};
        e = hVarArr;
        k a2 = new a(true).a(hVarArr).a(d0.TLS_1_3, d0.TLS_1_2, d0.TLS_1_1, d0.TLS_1_0).a(true).a();
        f = a2;
        new a(a2).a(d0.TLS_1_0).a(true).a();
        g = new a(false).a();
    }

    k(a aVar) {
        this.a = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.b = aVar.d;
    }

    private k b(SSLSocket sSLSocket, boolean z) {
        String[] a2 = this.c != null ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(h.b, sSLSocket.getEnabledCipherSuites(), this.c) : sSLSocket.getEnabledCipherSuites();
        String[] a3 = this.d != null ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.o, sSLSocket.getEnabledProtocols(), this.d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a4 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(h.b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a4 != -1) {
            a2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(a2, supportedCipherSuites[a4]);
        }
        return new a(this).a(a2).b(a3).a();
    }

    public List<h> a() {
        String[] strArr = this.c;
        if (strArr != null) {
            return h.a(strArr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        k b = b(sSLSocket, z);
        String[] strArr = b.d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        return this.a && ((strArr = this.d) == null || bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.o, strArr, sSLSocket.getEnabledProtocols())) && ((strArr2 = this.c) == null || bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.b(h.b, strArr2, sSLSocket.getEnabledCipherSuites()));
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public List<d0> d() {
        String[] strArr = this.d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            if (obj == this) {
                return true;
            }
            k kVar = (k) obj;
            boolean z = this.a;
            if (z == kVar.a) {
                if (!z) {
                    return true;
                }
                if (Arrays.equals(this.c, kVar.c) && Arrays.equals(this.d, kVar.d) && this.b == kVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.a) {
            return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.a) {
            String obj = this.c != null ? a().toString() : "[all enabled]";
            String obj2 = this.d != null ? d().toString() : "[all enabled]";
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + obj2 + ", supportsTlsExtensions=" + this.b + ")";
        }
        return "ConnectionSpec()";
    }
}
