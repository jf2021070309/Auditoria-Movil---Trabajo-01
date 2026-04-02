package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
/* loaded from: classes.dex */
public final class y {
    final s a;
    final String b;
    final r c;
    final z d;
    final Object e;
    private volatile d f;

    /* loaded from: classes.dex */
    public static class a {
        s a;
        String b;
        r.a c;
        z d;
        Object e;

        public a() {
            this.b = "GET";
            this.c = new r.a();
        }

        a(y yVar) {
            this.a = yVar.a;
            this.b = yVar.b;
            this.d = yVar.d;
            this.e = yVar.e;
            this.c = yVar.c.a();
        }

        public a a(d dVar) {
            String dVar2 = dVar.toString();
            return dVar2.isEmpty() ? a(DownloadUtils.CACHE_CONTROL) : b(DownloadUtils.CACHE_CONTROL, dVar2);
        }

        public a a(r rVar) {
            this.c = rVar.a();
            return this;
        }

        public a a(s sVar) {
            if (sVar != null) {
                this.a = sVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(z zVar) {
            return a("POST", zVar);
        }

        public a a(Object obj) {
            this.e = obj;
            return this;
        }

        public a a(String str) {
            this.c.b(str);
            return this;
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.f.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    } else if (zVar != null || !bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12.f.e(str)) {
                        this.b = str;
                        this.d = zVar;
                        return this;
                    } else {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public y a() {
            if (this.a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b() {
            return a("GET", (z) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y.a b(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L61
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
            L1a:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L3f
            L26:
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 4
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L3f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                goto L1a
            L3f:
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s r0 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s.d(r7)
                if (r0 == 0) goto L4a
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y$a r7 = r6.a(r0)
                return r7
            L4a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L61:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y.a.b(java.lang.String):bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y$a");
        }

        public a b(String str, String str2) {
            this.c.c(str, str2);
            return this;
        }
    }

    y(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        Object obj = aVar.e;
        this.e = obj == null ? this : obj;
    }

    public z a() {
        return this.d;
    }

    public String a(String str) {
        return this.c.a(str);
    }

    public d b() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.c);
        this.f = a2;
        return a2;
    }

    public r c() {
        return this.c;
    }

    public boolean d() {
        return this.a.h();
    }

    public String e() {
        return this.b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tag=");
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
