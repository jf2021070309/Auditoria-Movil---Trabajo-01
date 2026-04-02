package i.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class g {
    public static final <T> Object a(long j2, h.o.b.p<? super e0, ? super h.m.d<? super T>, ? extends Object> pVar, h.m.d<? super T> dVar) {
        Object wVar;
        Object H;
        if (j2 > 0) {
            a2 a2Var = new a2(j2, dVar);
            boolean z = false;
            a2Var.u(false, true, new r0(e.j.d.w.L(a2Var.f9079c.getContext()).H(a2Var.f8968d, a2Var, a2Var.f8970b)));
            try {
                h.o.c.t.a(pVar, 2);
                wVar = pVar.i(a2Var, a2Var);
            } catch (Throwable th) {
                wVar = new w(th, false, 2);
            }
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            if (wVar == aVar || (H = a2Var.H(wVar)) == m1.f9146b) {
                wVar = aVar;
            } else if (H instanceof w) {
                Throwable th2 = ((w) H).f9177b;
                if (((th2 instanceof z1) && ((z1) th2).a == a2Var) ? true : true) {
                    throw th2;
                }
                if (wVar instanceof w) {
                    throw ((w) wVar).f9177b;
                }
            } else {
                wVar = m1.a(H);
            }
            if (wVar == aVar) {
                h.o.c.j.e(dVar, "frame");
            }
            return wVar;
        }
        throw new z1("Timed out immediately");
    }
}
