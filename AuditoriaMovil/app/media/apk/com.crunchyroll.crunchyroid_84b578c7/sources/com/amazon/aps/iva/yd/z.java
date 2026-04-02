package com.amazon.aps.iva.yd;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
import com.google.android.gms.common.Scopes;
/* compiled from: EmailMandatoryViewModel.kt */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.ez.b implements x {
    public final h b;
    public final com.amazon.aps.iva.pm.b c;
    public final NotificationSettingsInteractor d;
    public final e e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<String, Boolean>>>> f;
    public final com.amazon.aps.iva.i5.v<Boolean> g;

    /* compiled from: EmailMandatoryViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.auth.emailmandatory.EmailMandatoryViewModelImpl$setUserEmail$1", f = "EmailMandatoryViewModel.kt", l = {46, 48, 58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ boolean k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                com.amazon.aps.iva.pb0.a r2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r0 = r1.h
                r3 = 0
                boolean r4 = r1.k
                java.lang.String r5 = r1.j
                r6 = 3
                r7 = 1
                r8 = 2
                com.amazon.aps.iva.yd.z r9 = com.amazon.aps.iva.yd.z.this
                if (r0 == 0) goto L2e
                if (r0 == r7) goto L2a
                if (r0 == r8) goto L24
                if (r0 != r6) goto L1c
                com.amazon.aps.iva.ab.x.i0(r18)     // Catch: java.io.IOException -> L7f
                goto L66
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L24:
                com.amazon.aps.iva.ab.x.i0(r18)     // Catch: java.io.IOException -> L28
                goto L5b
            L28:
                r0 = move-exception
                goto L47
            L2a:
                com.amazon.aps.iva.ab.x.i0(r18)     // Catch: java.io.IOException -> L7f
                goto L3c
            L2e:
                com.amazon.aps.iva.ab.x.i0(r18)
                com.amazon.aps.iva.yd.h r0 = r9.b     // Catch: java.io.IOException -> L7f
                r1.h = r7     // Catch: java.io.IOException -> L7f
                java.lang.Object r0 = r0.O(r5, r1)     // Catch: java.io.IOException -> L7f
                if (r0 != r2) goto L3c
                return r2
            L3c:
                com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor r0 = r9.d     // Catch: java.io.IOException -> L28
                r1.h = r8     // Catch: java.io.IOException -> L28
                java.lang.Object r0 = r0.optInMarketingNotifications(r4, r1)     // Catch: java.io.IOException -> L28
                if (r0 != r2) goto L5b
                return r2
            L47:
                com.amazon.aps.iva.yd.e r7 = r9.e     // Catch: java.io.IOException -> L7f
                com.amazon.aps.iva.es.w r8 = new com.amazon.aps.iva.es.w     // Catch: java.io.IOException -> L7f
                java.lang.String r11 = "Failed to update account notification settings"
                com.amazon.aps.iva.ls.a r12 = com.amazon.aps.iva.ls.a.EMAIL_ADDRESS_NEEDED     // Catch: java.io.IOException -> L7f
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 60
                r10 = r8
                r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.io.IOException -> L7f
                r7.b(r0, r8)     // Catch: java.io.IOException -> L7f
            L5b:
                com.amazon.aps.iva.pm.b r0 = r9.c     // Catch: java.io.IOException -> L7f
                r1.h = r6     // Catch: java.io.IOException -> L7f
                java.lang.Object r0 = r0.r1(r1)     // Catch: java.io.IOException -> L7f
                if (r0 != r2) goto L66
                return r2
            L66:
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<java.lang.String, java.lang.Boolean>>>> r0 = r9.f     // Catch: java.io.IOException -> L7f
                com.amazon.aps.iva.ez.d r2 = new com.amazon.aps.iva.ez.d     // Catch: java.io.IOException -> L7f
                com.amazon.aps.iva.ez.g$c r6 = new com.amazon.aps.iva.ez.g$c     // Catch: java.io.IOException -> L7f
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.io.IOException -> L7f
                com.amazon.aps.iva.kb0.j r7 = new com.amazon.aps.iva.kb0.j     // Catch: java.io.IOException -> L7f
                r7.<init>(r5, r4)     // Catch: java.io.IOException -> L7f
                r6.<init>(r7, r3)     // Catch: java.io.IOException -> L7f
                r2.<init>(r6)     // Catch: java.io.IOException -> L7f
                r0.k(r2)     // Catch: java.io.IOException -> L7f
                goto L8f
            L7f:
                r0 = move-exception
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.j<java.lang.String, java.lang.Boolean>>>> r2 = r9.f
                com.amazon.aps.iva.ez.d r4 = new com.amazon.aps.iva.ez.d
                com.amazon.aps.iva.ez.g$a r5 = new com.amazon.aps.iva.ez.g$a
                r5.<init>(r3, r0)
                r4.<init>(r5)
                r2.k(r4)
            L8f:
                com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.yd.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i iVar, com.amazon.aps.iva.pm.b bVar, NotificationSettingsInteractor notificationSettingsInteractor, f fVar) {
        super(iVar, bVar);
        com.amazon.aps.iva.wu.b bVar2 = com.amazon.aps.iva.wu.b.a;
        com.amazon.aps.iva.yb0.j.f(bVar, "userProfileInteractor");
        com.amazon.aps.iva.yb0.j.f(notificationSettingsInteractor, "notificationSettingsInteractor");
        com.amazon.aps.iva.yb0.j.f(fVar, "analytics");
        this.b = iVar;
        this.c = bVar;
        this.d = notificationSettingsInteractor;
        this.e = fVar;
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = new com.amazon.aps.iva.i5.v<>();
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), com.amazon.aps.iva.wu.b.b, null, new y(this, null), 2);
    }

    @Override // com.amazon.aps.iva.yd.x
    public final com.amazon.aps.iva.i5.v C8() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.yd.x
    public final void F3(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.ez.h.d(this.f);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(str, z, null), 3);
    }

    @Override // com.amazon.aps.iva.yd.x
    public final com.amazon.aps.iva.i5.v e2() {
        return this.g;
    }
}
