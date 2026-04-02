package i.a;
/* loaded from: classes2.dex */
public enum f0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(h.o.b.l<? super h.m.d<? super T>, ? extends Object> lVar, h.m.d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            try {
                i.a.i2.f.b(e.j.d.w.P(e.j.d.w.w(lVar, dVar)), h.k.a, null, 2);
            } catch (Throwable th) {
                e.j.d.w.d(dVar, th);
                throw null;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                h.o.c.j.e(lVar, "<this>");
                h.o.c.j.e(dVar, "completion");
                e.j.d.w.P(e.j.d.w.w(lVar, dVar)).resumeWith(h.k.a);
            } else if (ordinal != 3) {
                throw new h.e();
            } else {
                h.o.c.j.e(dVar, "completion");
                try {
                    h.m.f context = dVar.getContext();
                    Object b2 = i.a.i2.s.b(context, null);
                    if (lVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    h.o.c.t.a(lVar, 1);
                    Object invoke = lVar.invoke(dVar);
                    i.a.i2.s.a(context, b2);
                    if (invoke != h.m.h.a.COROUTINE_SUSPENDED) {
                        dVar.resumeWith(invoke);
                    }
                } catch (Throwable th2) {
                    dVar.resumeWith(e.j.d.w.y(th2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(h.o.b.p<? super R, ? super h.m.d<? super T>, ? extends Object> pVar, R r, h.m.d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            e.j.d.w.x0(pVar, r, dVar, null, 4);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                h.o.c.j.e(pVar, "<this>");
                h.o.c.j.e(dVar, "completion");
                e.j.d.w.P(e.j.d.w.x(pVar, r, dVar)).resumeWith(h.k.a);
            } else if (ordinal != 3) {
                throw new h.e();
            } else {
                h.o.c.j.e(dVar, "completion");
                try {
                    h.m.f context = dVar.getContext();
                    Object b2 = i.a.i2.s.b(context, null);
                    if (pVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    h.o.c.t.a(pVar, 2);
                    Object i2 = pVar.i(r, dVar);
                    i.a.i2.s.a(context, b2);
                    if (i2 != h.m.h.a.COROUTINE_SUSPENDED) {
                        dVar.resumeWith(i2);
                    }
                } catch (Throwable th) {
                    dVar.resumeWith(e.j.d.w.y(th));
                }
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
