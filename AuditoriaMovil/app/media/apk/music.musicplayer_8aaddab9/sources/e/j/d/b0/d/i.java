package e.j.d.b0.d;

import android.app.Activity;
/* loaded from: classes2.dex */
public final class i extends e.j.d.c0.d {
    public final /* synthetic */ e a;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.l<c.b.c.l, h.k> {
        public final /* synthetic */ Activity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f8594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, e eVar) {
            super(1);
            this.a = activity;
            this.f8594b = eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r1 != 2) goto L7;
         */
        @Override // h.o.b.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h.k invoke(c.b.c.l r7) {
            /*
                r6 = this;
                c.b.c.l r7 = (c.b.c.l) r7
                java.lang.String r0 = "it"
                h.o.c.j.e(r7, r0)
                e.j.d.k$a r0 = e.j.d.k.a
                e.j.d.k r1 = r0.a()
                e.j.d.b0.c.g r1 = r1.f8817n
                e.j.d.b0.c.g$c r1 = r1.b()
                int r1 = r1.ordinal()
                if (r1 == 0) goto L39
                r2 = 1
                if (r1 == r2) goto L20
                r0 = 2
                if (r1 == r0) goto L39
                goto L49
            L20:
                e.j.d.k r0 = r0.a()
                e.j.d.b0.c.g r0 = r0.f8817n
                android.app.Activity r1 = r6.a
                int r1 = e.j.d.w.K(r1)
                e.j.d.b0.d.g r3 = new e.j.d.b0.d.g
                e.j.d.b0.d.e r4 = r6.f8594b
                android.app.Activity r5 = r6.a
                r3.<init>(r4, r5)
                r0.f(r7, r1, r2, r3)
                goto L49
            L39:
                e.j.d.b0.d.e r0 = r6.f8594b
                android.app.Activity r1 = r6.a
                e.j.d.b0.d.h r2 = new e.j.d.b0.d.h
                r2.<init>(r0, r7)
                e.j.d.b0.d.e$a r7 = e.j.d.b0.d.e.a
                java.lang.String r7 = "relaunch"
                r0.h(r1, r7, r2)
            L49:
                h.k r7 = h.k.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.b0.d.i.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public i(e eVar) {
        this.a = eVar;
    }

    @Override // e.j.d.c0.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        h.o.c.j.e(activity, "activity");
        if (e.d.b.d.a.J(activity)) {
            return;
        }
        this.a.f8585c.unregisterActivityLifecycleCallbacks(this);
        a aVar = new a(activity, this.a);
        h.o.c.j.e(activity, "<this>");
        h.o.c.j.e(aVar, "action");
        if (activity instanceof c.b.c.l) {
            aVar.invoke(activity);
            return;
        }
        String i2 = h.o.c.j.i("Please use AppCompatActivity for ", activity.getClass().getName());
        h.o.c.j.e(i2, "message");
        if (e.j.d.k.a.a().f8812i.j()) {
            throw new IllegalStateException(i2.toString());
        }
        n.a.a.f9946d.b(i2, new Object[0]);
    }
}
