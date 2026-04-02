package h.n.c;

import h.o.c.j;
/* loaded from: classes2.dex */
public class a extends h.n.a {
    @Override // h.n.a
    public void a(Throwable th, Throwable th2) {
        j.e(th, "cause");
        j.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
