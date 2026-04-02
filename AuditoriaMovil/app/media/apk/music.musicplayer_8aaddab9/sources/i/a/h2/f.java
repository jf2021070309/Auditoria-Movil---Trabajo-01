package i.a.h2;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class f<T> implements c<T> {
    public final /* synthetic */ h.o.b.p a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.o.c.q f9005b;

    @h.m.i.a.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f9006b;

        /* renamed from: c  reason: collision with root package name */
        public int f9007c;

        /* renamed from: e  reason: collision with root package name */
        public Object f9009e;

        public a(h.m.d dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f9006b = obj;
            this.f9007c |= Level.ALL_INT;
            return f.this.b(null, this);
        }
    }

    public f(h.o.b.p pVar, h.o.c.q qVar) {
        this.a = pVar;
        this.f9005b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // i.a.h2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(T r5, h.m.d<? super h.k> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i.a.h2.f.a
            if (r0 == 0) goto L13
            r0 = r6
            i.a.h2.f$a r0 = (i.a.h2.f.a) r0
            int r1 = r0.f9007c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9007c = r1
            goto L18
        L13:
            i.a.h2.f$a r0 = new i.a.h2.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9006b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f9007c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f9009e
            java.lang.Object r0 = r0.a
            i.a.h2.f r0 = (i.a.h2.f) r0
            e.j.d.w.E0(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            e.j.d.w.E0(r6)
            h.o.b.p r6 = r4.a
            r0.a = r4
            r0.f9009e = r5
            r0.f9007c = r3
            java.lang.Object r6 = r6.i(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            h.o.c.q r6 = r0.f9005b
            r6.a = r5
            r3 = 0
        L55:
            if (r3 == 0) goto L5a
            h.k r5 = h.k.a
            return r5
        L5a:
            i.a.h2.w.a r5 = new i.a.h2.w.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.h2.f.b(java.lang.Object, h.m.d):java.lang.Object");
    }
}
