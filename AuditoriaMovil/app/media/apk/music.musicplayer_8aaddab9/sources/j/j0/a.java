package j.j0;

import ch.qos.logback.core.CoreConstants;
import h.o.c.j;
import j.c0;
import j.d0;
import j.f0;
import j.i0.f.c;
import j.i0.g.e;
import j.i0.j.f;
import j.r;
import j.t;
import j.u;
import j.z;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k.d;
import k.g;
import k.l;
/* loaded from: classes2.dex */
public final class a implements t {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public final b f9524b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Set<String> f9525c;

    /* renamed from: d  reason: collision with root package name */
    public volatile EnumC0211a f9526d;

    /* renamed from: j.j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0211a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* loaded from: classes2.dex */
    public interface b {
        public static final b a = new C0212a();

        /* renamed from: j.j0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0212a implements b {
            public void a(String str) {
                f.a.l(4, str, null);
            }
        }
    }

    public a() {
        b bVar = b.a;
        this.f9525c = Collections.emptySet();
        this.f9526d = EnumC0211a.NONE;
        this.f9524b = bVar;
    }

    public static boolean b(r rVar) {
        String c2 = rVar.c("Content-Encoding");
        return (c2 == null || c2.equalsIgnoreCase("identity") || c2.equalsIgnoreCase("gzip")) ? false : true;
    }

    public static boolean c(d dVar) {
        try {
            d dVar2 = new d();
            long j2 = dVar.f9620b;
            dVar.m(dVar2, 0L, j2 < 64 ? j2 : 64L);
            for (int i2 = 0; i2 < 16; i2++) {
                if (dVar2.p()) {
                    return true;
                }
                int Q = dVar2.Q();
                if (Character.isISOControl(Q) && !Character.isWhitespace(Q)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Long] */
    @Override // j.t
    public d0 a(t.a aVar) throws IOException {
        String str;
        long j2;
        char c2;
        String sb;
        l lVar;
        EnumC0211a enumC0211a = this.f9526d;
        j.i0.g.f fVar = (j.i0.g.f) aVar;
        z zVar = fVar.f9329f;
        if (enumC0211a == EnumC0211a.NONE) {
            return fVar.a(zVar);
        }
        boolean z = enumC0211a == EnumC0211a.BODY;
        boolean z2 = z || enumC0211a == EnumC0211a.HEADERS;
        c0 c0Var = zVar.f9604d;
        boolean z3 = c0Var != null;
        c cVar = fVar.f9327d;
        StringBuilder y = e.a.d.a.a.y("--> ");
        y.append(zVar.f9602b);
        y.append(' ');
        y.append(zVar.a);
        if (cVar != null) {
            StringBuilder y2 = e.a.d.a.a.y(" ");
            y2.append(cVar.f9292g);
            str = y2.toString();
        } else {
            str = "";
        }
        y.append(str);
        String sb2 = y.toString();
        if (!z2 && z3) {
            StringBuilder A = e.a.d.a.a.A(sb2, " (");
            A.append(c0Var.a());
            A.append("-byte body)");
            sb2 = A.toString();
        }
        ((b.C0212a) this.f9524b).a(sb2);
        if (z2) {
            if (z3) {
                if (c0Var.b() != null) {
                    b bVar = this.f9524b;
                    StringBuilder y3 = e.a.d.a.a.y("Content-Type: ");
                    y3.append(c0Var.b());
                    ((b.C0212a) bVar).a(y3.toString());
                }
                if (c0Var.a() != -1) {
                    b bVar2 = this.f9524b;
                    StringBuilder y4 = e.a.d.a.a.y("Content-Length: ");
                    y4.append(c0Var.a());
                    ((b.C0212a) bVar2).a(y4.toString());
                }
            }
            r rVar = zVar.f9603c;
            int g2 = rVar.g();
            for (int i2 = 0; i2 < g2; i2++) {
                String d2 = rVar.d(i2);
                if (!"Content-Type".equalsIgnoreCase(d2) && !"Content-Length".equalsIgnoreCase(d2)) {
                    d(rVar, i2);
                }
            }
            if (!z || !z3) {
                b bVar3 = this.f9524b;
                StringBuilder y5 = e.a.d.a.a.y("--> END ");
                y5.append(zVar.f9602b);
                ((b.C0212a) bVar3).a(y5.toString());
            } else if (b(zVar.f9603c)) {
                ((b.C0212a) this.f9524b).a(e.a.d.a.a.r(e.a.d.a.a.y("--> END "), zVar.f9602b, " (encoded body omitted)"));
            } else {
                d dVar = new d();
                c0Var.c(dVar);
                Charset charset = a;
                u b2 = c0Var.b();
                if (b2 != null) {
                    charset = b2.a(charset);
                }
                ((b.C0212a) this.f9524b).a("");
                if (c(dVar)) {
                    b bVar4 = this.f9524b;
                    j.e(charset, "charset");
                    ((b.C0212a) bVar4).a(dVar.I(dVar.f9620b, charset));
                    b bVar5 = this.f9524b;
                    StringBuilder y6 = e.a.d.a.a.y("--> END ");
                    y6.append(zVar.f9602b);
                    y6.append(" (");
                    y6.append(c0Var.a());
                    y6.append("-byte body)");
                    ((b.C0212a) bVar5).a(y6.toString());
                } else {
                    b bVar6 = this.f9524b;
                    StringBuilder y7 = e.a.d.a.a.y("--> END ");
                    y7.append(zVar.f9602b);
                    y7.append(" (binary ");
                    y7.append(c0Var.a());
                    y7.append("-byte body omitted)");
                    ((b.C0212a) bVar6).a(y7.toString());
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            j.i0.g.f fVar2 = (j.i0.g.f) aVar;
            d0 b3 = fVar2.b(zVar, fVar2.f9325b, fVar2.f9326c, fVar2.f9327d);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            f0 f0Var = b3.f9212g;
            long a2 = f0Var.a();
            String str2 = a2 != -1 ? a2 + "-byte" : "unknown-length";
            b bVar7 = this.f9524b;
            StringBuilder y8 = e.a.d.a.a.y("<-- ");
            y8.append(b3.f9208c);
            if (b3.f9209d.isEmpty()) {
                sb = "";
                j2 = a2;
                c2 = ' ';
            } else {
                StringBuilder sb3 = new StringBuilder();
                j2 = a2;
                c2 = ' ';
                sb3.append(' ');
                sb3.append(b3.f9209d);
                sb = sb3.toString();
            }
            y8.append(sb);
            y8.append(c2);
            y8.append(b3.a.a);
            y8.append(" (");
            y8.append(millis);
            y8.append("ms");
            y8.append(!z2 ? e.a.d.a.a.l(", ", str2, " body") : "");
            y8.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            ((b.C0212a) bVar7).a(y8.toString());
            if (z2) {
                r rVar2 = b3.f9211f;
                int g3 = rVar2.g();
                for (int i3 = 0; i3 < g3; i3++) {
                    d(rVar2, i3);
                }
                if (!z || !e.b(b3)) {
                    ((b.C0212a) this.f9524b).a("<-- END HTTP");
                } else if (b(b3.f9211f)) {
                    ((b.C0212a) this.f9524b).a("<-- END HTTP (encoded body omitted)");
                } else {
                    g h2 = f0Var.h();
                    h2.G(Long.MAX_VALUE);
                    d b4 = h2.b();
                    l lVar2 = null;
                    if ("gzip".equalsIgnoreCase(rVar2.c("Content-Encoding"))) {
                        ?? valueOf = Long.valueOf(b4.f9620b);
                        try {
                            lVar = new l(b4.clone());
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            b4 = new d();
                            b4.g0(lVar);
                            lVar.f9628d.close();
                            lVar2 = valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            lVar2 = lVar;
                            if (lVar2 != null) {
                                lVar2.f9628d.close();
                            }
                            throw th;
                        }
                    }
                    Charset charset2 = a;
                    u f2 = f0Var.f();
                    if (f2 != null) {
                        charset2 = f2.a(charset2);
                    }
                    if (!c(b4)) {
                        ((b.C0212a) this.f9524b).a("");
                        ((b.C0212a) this.f9524b).a(e.a.d.a.a.q(e.a.d.a.a.y("<-- END HTTP (binary "), b4.f9620b, "-byte body omitted)"));
                        return b3;
                    }
                    if (j2 != 0) {
                        ((b.C0212a) this.f9524b).a("");
                        b bVar8 = this.f9524b;
                        d clone = b4.clone();
                        j.e(charset2, "charset");
                        ((b.C0212a) bVar8).a(clone.I(clone.f9620b, charset2));
                    }
                    if (lVar2 != null) {
                        b bVar9 = this.f9524b;
                        StringBuilder y9 = e.a.d.a.a.y("<-- END HTTP (");
                        y9.append(b4.f9620b);
                        y9.append("-byte, ");
                        y9.append(lVar2);
                        y9.append("-gzipped-byte body)");
                        ((b.C0212a) bVar9).a(y9.toString());
                    } else {
                        ((b.C0212a) this.f9524b).a(e.a.d.a.a.q(e.a.d.a.a.y("<-- END HTTP ("), b4.f9620b, "-byte body)"));
                    }
                }
            }
            return b3;
        } catch (Exception e2) {
            ((b.C0212a) this.f9524b).a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    public final void d(r rVar, int i2) {
        int i3 = i2 * 2;
        ((b.C0212a) this.f9524b).a(e.a.d.a.a.s(new StringBuilder(), rVar.a[i3], ": ", this.f9525c.contains(rVar.a[i3]) ? "██" : rVar.a[i3 + 1]));
    }
}
