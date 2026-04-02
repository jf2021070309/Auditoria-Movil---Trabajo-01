package j.i0.g;

import e.j.d.w;
import j.c0;
import j.d0;
import j.j;
import j.k;
import j.r;
import j.t;
import j.u;
import j.z;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k.l;
/* loaded from: classes2.dex */
public final class a implements t {
    public final k a;

    public a(k kVar) {
        this.a = kVar;
    }

    @Override // j.t
    public d0 a(t.a aVar) throws IOException {
        boolean z;
        f fVar = (f) aVar;
        z zVar = fVar.f9329f;
        Objects.requireNonNull(zVar);
        z.a aVar2 = new z.a(zVar);
        c0 c0Var = zVar.f9604d;
        if (c0Var != null) {
            u b2 = c0Var.b();
            if (b2 != null) {
                aVar2.b("Content-Type", b2.f9553c);
            }
            long a = c0Var.a();
            if (a != -1) {
                aVar2.b("Content-Length", Long.toString(a));
                aVar2.f9608c.c("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.f9608c.c("Content-Length");
            }
        }
        if (zVar.f9603c.c("Host") == null) {
            aVar2.b("Host", j.i0.c.n(zVar.a, false));
        }
        if (zVar.f9603c.c("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (zVar.f9603c.c("Accept-Encoding") == null && zVar.f9603c.c("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        Objects.requireNonNull((k.a) this.a);
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                j jVar = (j) emptyList.get(i2);
                sb.append(jVar.f9515e);
                sb.append('=');
                sb.append(jVar.f9516f);
            }
            aVar2.b("Cookie", sb.toString());
        }
        if (zVar.f9603c.c("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/3.12.8");
        }
        d0 b3 = fVar.b(aVar2.a(), fVar.f9325b, fVar.f9326c, fVar.f9327d);
        e.d(this.a, zVar.a, b3.f9211f);
        d0.a aVar3 = new d0.a(b3);
        aVar3.a = zVar;
        if (z) {
            String c2 = b3.f9211f.c("Content-Encoding");
            if (c2 == null) {
                c2 = null;
            }
            if ("gzip".equalsIgnoreCase(c2) && e.b(b3)) {
                l lVar = new l(b3.f9212g.h());
                r.a e2 = b3.f9211f.e();
                e2.c("Content-Encoding");
                e2.c("Content-Length");
                List<String> list = e2.a;
                r.a aVar4 = new r.a();
                Collections.addAll(aVar4.a, (String[]) list.toArray(new String[list.size()]));
                aVar3.f9222f = aVar4;
                String c3 = b3.f9211f.c("Content-Type");
                aVar3.f9223g = new g(c3 != null ? c3 : null, -1L, w.l(lVar));
            }
        }
        return aVar3.a();
    }
}
