package com.amazon.aps.iva.kp;

import android.os.Build;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.gr.l;
import com.amazon.aps.iva.gr.o;
import com.amazon.aps.iva.gr.p;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.Authenticator;
/* compiled from: Configuration.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final C0452b g;
    public static final c h;
    public static final d.C0453b i;
    public static final d.a j;
    public static final d.C0454d k;
    public static final d.c l;
    public final c a;
    public final d.C0453b b;
    public final d.C0454d c;
    public final d.a d;
    public final d.c e;
    public final Map<String, Object> f;

    /* compiled from: Configuration.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public d.C0453b a = b.i;
        public d.C0454d b = b.k;
        public d.a c = b.j;
        public d.c d = b.l;
        public final a0 e = a0.b;
        public c f = b.h;

        /* compiled from: Configuration.kt */
        /* renamed from: com.amazon.aps.iva.kp.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0451a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.qq.d.values().length];
                iArr[com.amazon.aps.iva.qq.d.LOG.ordinal()] = 1;
                iArr[com.amazon.aps.iva.qq.d.TRACE.ordinal()] = 2;
                iArr[com.amazon.aps.iva.qq.d.CRASH.ordinal()] = 3;
                iArr[com.amazon.aps.iva.qq.d.RUM.ordinal()] = 4;
                a = iArr;
            }
        }

        public final void a(com.amazon.aps.iva.qq.d dVar, String str, com.amazon.aps.iva.xb0.a<q> aVar) {
            int i = C0451a.a[dVar.ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            aVar.invoke();
        }
    }

    /* compiled from: Configuration.kt */
    /* renamed from: com.amazon.aps.iva.kp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0452b {
        public static final com.amazon.aps.iva.dr.e a(C0452b c0452b, p[] pVarArr, l lVar) {
            int length = pVarArr.length;
            Object[] copyOf = Arrays.copyOf(pVarArr, length + 1);
            System.arraycopy(new com.amazon.aps.iva.dr.c[]{new com.amazon.aps.iva.dr.c()}, 0, copyOf, length, 1);
            j.e(copyOf, "result");
            com.amazon.aps.iva.zq.a aVar = new com.amazon.aps.iva.zq.a((p[]) copyOf, lVar);
            if (Build.VERSION.SDK_INT >= 29) {
                return new com.amazon.aps.iva.yq.b(aVar);
            }
            return new com.amazon.aps.iva.yq.c(aVar);
        }
    }

    /* compiled from: Configuration.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final List<String> c;
        public final com.amazon.aps.iva.kp.a d;
        public final h e;
        public final Proxy f;
        public final Authenticator g;
        public final g h;
        public final List<String> i;

        public c(boolean z, boolean z2, List<String> list, com.amazon.aps.iva.kp.a aVar, h hVar, Proxy proxy, Authenticator authenticator, g gVar, List<String> list2) {
            j.f(aVar, "batchSize");
            j.f(hVar, "uploadFrequency");
            this.a = z;
            this.b = z2;
            this.c = list;
            this.d = aVar;
            this.e = hVar;
            this.f = proxy;
            this.g = authenticator;
            this.h = gVar;
            this.i = list2;
        }

        public static c a(c cVar, com.amazon.aps.iva.kp.a aVar, h hVar, int i) {
            boolean z;
            List<String> list;
            Proxy proxy;
            Authenticator authenticator;
            g gVar;
            List<String> list2;
            boolean z2 = false;
            if ((i & 1) != 0) {
                z = cVar.a;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = cVar.b;
            }
            boolean z3 = z2;
            if ((i & 4) != 0) {
                list = cVar.c;
            } else {
                list = null;
            }
            if ((i & 8) != 0) {
                aVar = cVar.d;
            }
            com.amazon.aps.iva.kp.a aVar2 = aVar;
            if ((i & 16) != 0) {
                hVar = cVar.e;
            }
            h hVar2 = hVar;
            if ((i & 32) != 0) {
                proxy = cVar.f;
            } else {
                proxy = null;
            }
            if ((i & 64) != 0) {
                authenticator = cVar.g;
            } else {
                authenticator = null;
            }
            if ((i & 128) != 0) {
                gVar = cVar.h;
            } else {
                gVar = null;
            }
            if ((i & 256) != 0) {
                list2 = cVar.i;
            } else {
                list2 = null;
            }
            cVar.getClass();
            j.f(list, "firstPartyHosts");
            j.f(aVar2, "batchSize");
            j.f(hVar2, "uploadFrequency");
            j.f(authenticator, "proxyAuth");
            j.f(gVar, "securityConfig");
            j.f(list2, "webViewTrackingHosts");
            return new c(z, z3, list, aVar2, hVar2, proxy, authenticator, gVar, list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b && j.a(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && j.a(this.f, cVar.f) && j.a(this.g, cVar.g) && j.a(this.h, cVar.h) && j.a(this.i, cVar.i)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int i = 1;
            boolean z = this.a;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = i2 * 31;
            boolean z2 = this.b;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + defpackage.a.a(this.c, (i3 + i) * 31, 31)) * 31)) * 31;
            Proxy proxy = this.f;
            if (proxy == null) {
                hashCode = 0;
            } else {
                hashCode = proxy.hashCode();
            }
            int hashCode3 = this.g.hashCode();
            this.h.getClass();
            return this.i.hashCode() + ((((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31) + 0) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Core(needsClearTextHttp=");
            sb.append(this.a);
            sb.append(", enableDeveloperModeWhenDebuggable=");
            sb.append(this.b);
            sb.append(", firstPartyHosts=");
            sb.append(this.c);
            sb.append(", batchSize=");
            sb.append(this.d);
            sb.append(", uploadFrequency=");
            sb.append(this.e);
            sb.append(", proxy=");
            sb.append(this.f);
            sb.append(", proxyAuth=");
            sb.append(this.g);
            sb.append(", securityConfig=");
            sb.append(this.h);
            sb.append(", webViewTrackingHosts=");
            return com.amazon.aps.iva.oa.a.b(sb, this.i, ")");
        }
    }

    /* compiled from: Configuration.kt */
    /* loaded from: classes2.dex */
    public static abstract class d {

        /* compiled from: Configuration.kt */
        /* loaded from: classes2.dex */
        public static final class a extends d {
            public final String a;
            public final List<com.amazon.aps.iva.qq.b> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, List<? extends com.amazon.aps.iva.qq.b> list) {
                this.a = str;
                this.b = list;
            }

            @Override // com.amazon.aps.iva.kp.b.d
            public final List<com.amazon.aps.iva.qq.b> a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "CrashReport(endpointUrl=" + this.a + ", plugins=" + this.b + ")";
            }
        }

        /* compiled from: Configuration.kt */
        /* renamed from: com.amazon.aps.iva.kp.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0453b extends d {
            public final String a;
            public final List<com.amazon.aps.iva.qq.b> b;
            public final com.amazon.aps.iva.gq.a<com.amazon.aps.iva.pq.a> c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0453b(String str, List<? extends com.amazon.aps.iva.qq.b> list, com.amazon.aps.iva.gq.a<com.amazon.aps.iva.pq.a> aVar) {
                this.a = str;
                this.b = list;
                this.c = aVar;
            }

            @Override // com.amazon.aps.iva.kp.b.d
            public final List<com.amazon.aps.iva.qq.b> a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0453b)) {
                    return false;
                }
                C0453b c0453b = (C0453b) obj;
                if (j.a(this.a, c0453b.a) && j.a(this.b, c0453b.b) && j.a(this.c, c0453b.c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode() + defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "Logs(endpointUrl=" + this.a + ", plugins=" + this.b + ", logsEventMapper=" + this.c + ")";
            }
        }

        /* compiled from: Configuration.kt */
        /* loaded from: classes2.dex */
        public static final class c extends d {
            public final String a;
            public final List<com.amazon.aps.iva.qq.b> b;
            public final float c;
            public final float d;
            public final com.amazon.aps.iva.dr.e e;
            public final com.amazon.aps.iva.gr.q f;
            public final o g;
            public final com.amazon.aps.iva.gq.a<Object> h;
            public final boolean i;
            public final i j;

            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, List<? extends com.amazon.aps.iva.qq.b> list, float f, float f2, com.amazon.aps.iva.dr.e eVar, com.amazon.aps.iva.gr.q qVar, o oVar, com.amazon.aps.iva.gq.a<Object> aVar, boolean z, i iVar) {
                j.f(iVar, "vitalsMonitorUpdateFrequency");
                this.a = str;
                this.b = list;
                this.c = f;
                this.d = f2;
                this.e = eVar;
                this.f = qVar;
                this.g = oVar;
                this.h = aVar;
                this.i = z;
                this.j = iVar;
            }

            public static c b(c cVar, String str, float f, com.amazon.aps.iva.dr.e eVar, com.amazon.aps.iva.gr.q qVar, boolean z, int i) {
                String str2;
                List<com.amazon.aps.iva.qq.b> list;
                float f2;
                float f3;
                com.amazon.aps.iva.dr.e eVar2;
                com.amazon.aps.iva.gr.q qVar2;
                o oVar;
                com.amazon.aps.iva.gq.a<Object> aVar;
                boolean z2;
                i iVar;
                if ((i & 1) != 0) {
                    str2 = cVar.a;
                } else {
                    str2 = str;
                }
                if ((i & 2) != 0) {
                    list = cVar.b;
                } else {
                    list = null;
                }
                if ((i & 4) != 0) {
                    f2 = cVar.c;
                } else {
                    f2 = f;
                }
                if ((i & 8) != 0) {
                    f3 = cVar.d;
                } else {
                    f3 = 0.0f;
                }
                float f4 = f3;
                if ((i & 16) != 0) {
                    eVar2 = cVar.e;
                } else {
                    eVar2 = eVar;
                }
                if ((i & 32) != 0) {
                    qVar2 = cVar.f;
                } else {
                    qVar2 = qVar;
                }
                if ((i & 64) != 0) {
                    oVar = cVar.g;
                } else {
                    oVar = null;
                }
                if ((i & 128) != 0) {
                    aVar = cVar.h;
                } else {
                    aVar = null;
                }
                if ((i & 256) != 0) {
                    z2 = cVar.i;
                } else {
                    z2 = z;
                }
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    iVar = cVar.j;
                } else {
                    iVar = null;
                }
                cVar.getClass();
                j.f(str2, "endpointUrl");
                j.f(list, "plugins");
                j.f(aVar, "rumEventMapper");
                j.f(iVar, "vitalsMonitorUpdateFrequency");
                return new c(str2, list, f2, f4, eVar2, qVar2, oVar, aVar, z2, iVar);
            }

            @Override // com.amazon.aps.iva.kp.b.d
            public final List<com.amazon.aps.iva.qq.b> a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(Float.valueOf(this.c), Float.valueOf(cVar.c)) && j.a(Float.valueOf(this.d), Float.valueOf(cVar.d)) && j.a(this.e, cVar.e) && j.a(this.f, cVar.f) && j.a(this.g, cVar.g) && j.a(this.h, cVar.h) && this.i == cVar.i && this.j == cVar.j) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int hashCode() {
                int hashCode;
                int hashCode2;
                int b = t0.b(this.d, t0.b(this.c, defpackage.a.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
                int i = 0;
                com.amazon.aps.iva.dr.e eVar = this.e;
                if (eVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = eVar.hashCode();
                }
                int i2 = (b + hashCode) * 31;
                com.amazon.aps.iva.gr.q qVar = this.f;
                if (qVar == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = qVar.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                o oVar = this.g;
                if (oVar != null) {
                    i = oVar.hashCode();
                }
                int hashCode3 = (this.h.hashCode() + ((i3 + i) * 31)) * 31;
                boolean z = this.i;
                int i4 = z;
                if (z != 0) {
                    i4 = 1;
                }
                return this.j.hashCode() + ((hashCode3 + i4) * 31);
            }

            public final String toString() {
                return "RUM(endpointUrl=" + this.a + ", plugins=" + this.b + ", samplingRate=" + this.c + ", telemetrySamplingRate=" + this.d + ", userActionTrackingStrategy=" + this.e + ", viewTrackingStrategy=" + this.f + ", longTaskTrackingStrategy=" + this.g + ", rumEventMapper=" + this.h + ", backgroundEventTracking=" + this.i + ", vitalsMonitorUpdateFrequency=" + this.j + ")";
            }
        }

        /* compiled from: Configuration.kt */
        /* renamed from: com.amazon.aps.iva.kp.b$d$d  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0454d extends d {
            public final String a;
            public final List<com.amazon.aps.iva.qq.b> b;
            public final com.amazon.aps.iva.gq.c c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0454d(String str, List<? extends com.amazon.aps.iva.qq.b> list, com.amazon.aps.iva.gq.c cVar) {
                this.a = str;
                this.b = list;
                this.c = cVar;
            }

            @Override // com.amazon.aps.iva.kp.b.d
            public final List<com.amazon.aps.iva.qq.b> a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0454d)) {
                    return false;
                }
                C0454d c0454d = (C0454d) obj;
                if (j.a(this.a, c0454d.a) && j.a(this.b, c0454d.b) && j.a(this.c, c0454d.c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode() + defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "Tracing(endpointUrl=" + this.a + ", plugins=" + this.b + ", spanEventMapper=" + this.c + ")";
            }
        }

        public abstract List<com.amazon.aps.iva.qq.b> a();
    }

    static {
        C0452b c0452b = new C0452b();
        g = c0452b;
        z zVar = z.b;
        com.amazon.aps.iva.kp.a aVar = com.amazon.aps.iva.kp.a.MEDIUM;
        h hVar = h.AVERAGE;
        Authenticator authenticator = Authenticator.NONE;
        j.e(authenticator, "NONE");
        h = new c(false, false, zVar, aVar, hVar, null, authenticator, g.a, zVar);
        i = new d.C0453b("https://logs.browser-intake-datadoghq.com", zVar, new com.amazon.aps.iva.op.a());
        j = new d.a("https://logs.browser-intake-datadoghq.com", zVar);
        k = new d.C0454d("https://trace.browser-intake-datadoghq.com", zVar, new com.amazon.aps.iva.dg.b());
        l = new d.c("https://rum.browser-intake-datadoghq.com", zVar, 100.0f, 20.0f, C0452b.a(c0452b, new p[0], new l1()), new com.amazon.aps.iva.gr.e(false, new com.amazon.aps.iva.gr.a()), new com.amazon.aps.iva.yq.a(), new com.amazon.aps.iva.op.a(), false, i.AVERAGE);
    }

    public b(c cVar, d.C0453b c0453b, d.C0454d c0454d, d.a aVar, d.c cVar2, Map<String, ? extends Object> map) {
        j.f(cVar, "coreConfig");
        j.f(map, "additionalConfig");
        this.a = cVar;
        this.b = c0453b;
        this.c = c0454d;
        this.d = aVar;
        this.e = cVar2;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && j.a(this.d, bVar.d) && j.a(this.e, bVar.e) && j.a(this.f, bVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i2 = 0;
        d.C0453b c0453b = this.b;
        if (c0453b == null) {
            hashCode = 0;
        } else {
            hashCode = c0453b.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        d.C0454d c0454d = this.c;
        if (c0454d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0454d.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        d.a aVar = this.d;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        d.c cVar = this.e;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return this.f.hashCode() + ((i5 + i2) * 31);
    }

    public final String toString() {
        return "Configuration(coreConfig=" + this.a + ", logsConfig=" + this.b + ", tracesConfig=" + this.c + ", crashReportConfig=" + this.d + ", rumConfig=" + this.e + ", additionalConfig=" + this.f + ")";
    }
}
