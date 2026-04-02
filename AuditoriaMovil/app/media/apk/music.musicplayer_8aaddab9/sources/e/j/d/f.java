package e.j.d;

import android.content.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import e.j.d.c0.a0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class f {
    public final e.a.a.a.c a;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.BillingConnection", f = "BillingConnection.kt", l = {28}, m = "connect$premium_helper_regularRelease")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8796b;

        /* renamed from: d  reason: collision with root package name */
        public int f8798d;

        public a(h.m.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8796b = obj;
            this.f8798d |= Level.ALL_INT;
            return f.this.a(this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.BillingConnection$connect$result$1", f = "BillingConnection.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.h implements h.o.b.l<h.m.d<? super a0<? extends Integer>>, Object> {
        public int a;

        public b(h.m.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(h.m.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h.o.b.l
        public Object invoke(h.m.d<? super a0<? extends Integer>> dVar) {
            return new b(dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                f fVar = f.this;
                this.a = 1;
                Objects.requireNonNull(fVar);
                i.a.k kVar = new i.a.k(w.P(this), 1);
                kVar.p();
                fVar.a.g(new g(kVar));
                obj = kVar.o();
                if (obj == aVar) {
                    h.o.c.j.e(this, "frame");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return obj;
        }
    }

    public f(Context context, e.a.a.a.p pVar) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(pVar, "purchaseUpdateListener");
        e.a.a.a.d dVar = new e.a.a.a.d(null, true, context, pVar);
        h.o.c.j.d(dVar, "newBuilder(context)\n    …chases()\n        .build()");
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.m.d<? super e.a.a.a.c> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof e.j.d.f.a
            if (r0 == 0) goto L13
            r0 = r13
            e.j.d.f$a r0 = (e.j.d.f.a) r0
            int r1 = r0.f8798d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8798d = r1
            goto L18
        L13:
            e.j.d.f$a r0 = new e.j.d.f$a
            r0.<init>(r13)
        L18:
            r10 = r0
            java.lang.Object r13 = r10.f8796b
            h.m.h.a r0 = h.m.h.a.COROUTINE_SUSPENDED
            int r1 = r10.f8798d
            r11 = 0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r0 = r10.a
            e.j.d.f r0 = (e.j.d.f) r0
            e.j.d.w.E0(r13)
            goto L5e
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            e.j.d.w.E0(r13)
            e.a.a.a.c r13 = r12.a
            boolean r13 = r13.b()
            if (r13 == 0) goto L43
            e.a.a.a.c r13 = r12.a
            return r13
        L43:
            e.j.d.c0.b0 r1 = e.j.d.c0.b0.a
            e.j.d.f$b r9 = new e.j.d.f$b
            r9.<init>(r11)
            r10.a = r12
            r10.f8798d = r2
            r2 = 10
            r3 = 100
            r5 = 500(0x1f4, double:2.47E-321)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Object r13 = r1.p(r2, r3, r5, r7, r9, r10)
            if (r13 != r0) goto L5d
            return r0
        L5d:
            r0 = r12
        L5e:
            e.j.d.c0.a0 r13 = (e.j.d.c0.a0) r13
            boolean r1 = r13 instanceof e.j.d.c0.a0.b
            if (r1 == 0) goto L7f
            e.j.d.c0.a0$b r13 = (e.j.d.c0.a0.b) r13
            java.lang.Exception r13 = r13.f8618b
            if (r13 != 0) goto L6b
            goto L6f
        L6b:
            java.lang.String r11 = r13.getMessage()
        L6f:
            java.lang.String r13 = "Connect failure: "
            java.lang.String r13 = h.o.c.j.i(r13, r11)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L7f:
            e.a.a.a.c r13 = r0.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.f.a(h.m.d):java.lang.Object");
    }
}
