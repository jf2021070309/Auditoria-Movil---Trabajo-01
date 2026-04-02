package i.a.h2;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class i<T> implements b<T> {
    public final /* synthetic */ b a;

    /* loaded from: classes2.dex */
    public static final class a implements c<T> {
        public final /* synthetic */ c a;

        @h.m.i.a.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "emit")
        /* renamed from: i.a.h2.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0206a extends h.m.i.a.c {
            public /* synthetic */ Object a;

            /* renamed from: b  reason: collision with root package name */
            public int f9017b;

            public C0206a(h.m.d dVar) {
                super(dVar);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.f9017b |= Level.ALL_INT;
                return a.this.b(null, this);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // i.a.h2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(java.lang.Object r5, h.m.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof i.a.h2.i.a.C0206a
                if (r0 == 0) goto L13
                r0 = r6
                i.a.h2.i$a$a r0 = (i.a.h2.i.a.C0206a) r0
                int r1 = r0.f9017b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9017b = r1
                goto L18
            L13:
                i.a.h2.i$a$a r0 = new i.a.h2.i$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.a
                h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
                int r2 = r0.f9017b
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                e.j.d.w.E0(r6)
                goto L3f
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                e.j.d.w.E0(r6)
                i.a.h2.c r6 = r4.a
                if (r5 == 0) goto L3f
                r0.f9017b = r3
                java.lang.Object r5 = r6.b(r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                h.k r5 = h.k.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i.a.h2.i.a.b(java.lang.Object, h.m.d):java.lang.Object");
        }
    }

    public i(b bVar) {
        this.a = bVar;
    }

    @Override // i.a.h2.b
    public Object a(c cVar, h.m.d dVar) {
        Object a2 = this.a.a(new a(cVar), dVar);
        return a2 == h.m.h.a.COROUTINE_SUSPENDED ? a2 : h.k.a;
    }
}
