package com.amazon.aps.iva.se0;
/* compiled from: CoroutineStart.kt */
/* loaded from: classes4.dex */
public enum h0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h0.values().length];
            iArr[h0.DEFAULT.ordinal()] = 1;
            iArr[h0.ATOMIC.ordinal()] = 2;
            iArr[h0.UNDISPATCHED.ordinal()] = 3;
            iArr[h0.LAZY.ordinal()] = 4;
            a = iArr;
        }
    }

    public final <T> void invoke(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        int i = a.a[ordinal()];
        if (i == 1) {
            try {
                com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.kb0.q.a, com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.n(lVar, dVar)), null);
            } finally {
                dVar.resumeWith(com.amazon.aps.iva.ab.x.H(th));
            }
        } else if (i == 2) {
            com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(dVar, "completion");
            com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.n(lVar, dVar)).resumeWith(com.amazon.aps.iva.kb0.q.a);
        } else if (i != 3) {
            if (i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            com.amazon.aps.iva.yb0.j.f(dVar, "completion");
            try {
                com.amazon.aps.iva.ob0.g context = dVar.getContext();
                Object c = com.amazon.aps.iva.xe0.u.c(context, null);
                com.amazon.aps.iva.yb0.h0.e(1, lVar);
                Object invoke = lVar.invoke(dVar);
                com.amazon.aps.iva.xe0.u.a(context, c);
                if (invoke != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    dVar.resumeWith(invoke);
                }
            } catch (Throwable th) {
            }
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(com.amazon.aps.iva.xb0.p<? super R, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> pVar, R r, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        int i = a.a[ordinal()];
        if (i == 1) {
            try {
                com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.kb0.q.a, com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.o(pVar, r, dVar)), null);
            } finally {
                dVar.resumeWith(com.amazon.aps.iva.ab.x.H(th));
            }
        } else if (i == 2) {
            com.amazon.aps.iva.yb0.j.f(pVar, "<this>");
            com.amazon.aps.iva.yb0.j.f(dVar, "completion");
            com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.o(pVar, r, dVar)).resumeWith(com.amazon.aps.iva.kb0.q.a);
        } else if (i != 3) {
            if (i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            com.amazon.aps.iva.yb0.j.f(dVar, "completion");
            try {
                com.amazon.aps.iva.ob0.g context = dVar.getContext();
                Object c = com.amazon.aps.iva.xe0.u.c(context, null);
                com.amazon.aps.iva.yb0.h0.e(2, pVar);
                Object invoke = pVar.invoke(r, dVar);
                com.amazon.aps.iva.xe0.u.a(context, c);
                if (invoke != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    dVar.resumeWith(invoke);
                }
            } catch (Throwable th) {
            }
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
