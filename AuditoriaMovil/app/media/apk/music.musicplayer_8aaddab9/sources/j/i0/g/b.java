package j.i0.g;

import h.o.c.j;
import j.t;
import java.io.IOException;
import k.v;
/* loaded from: classes2.dex */
public final class b implements t {
    public final boolean a;

    /* loaded from: classes2.dex */
    public static final class a extends k.i {

        /* renamed from: b  reason: collision with root package name */
        public long f9322b;

        public a(v vVar) {
            super(vVar);
        }

        @Override // k.v
        public void E(k.d dVar, long j2) throws IOException {
            j.e(dVar, "source");
            this.a.E(dVar, j2);
            this.f9322b += j2;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
        if ("close".equalsIgnoreCase(r0 != null ? r0 : null) != false) goto L38;
     */
    @Override // j.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j.d0 a(j.t.a r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.g.b.a(j.t$a):j.d0");
    }
}
