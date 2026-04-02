package com.amazon.aps.iva.y20;

import com.amazon.aps.iva.b30.h;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.rs.f;
import com.amazon.aps.iva.wh.d;
import com.amazon.aps.iva.yb0.j;
import java.util.Iterator;
/* compiled from: IntroductoryOfferProviderImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.uh.a {
    public final f a;
    public final d b;

    /* compiled from: IntroductoryOfferProviderImpl.kt */
    @e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.offers.IntroductoryOfferProviderImpl", f = "IntroductoryOfferProviderImpl.kt", l = {15}, m = "hasAnyIntroductoryOffers")
    /* renamed from: com.amazon.aps.iva.y20.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0883a extends c {
        public a h;
        public Iterator i;
        public /* synthetic */ Object j;
        public int l;

        public C0883a(com.amazon.aps.iva.ob0.d<? super C0883a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    /* compiled from: IntroductoryOfferProviderImpl.kt */
    @e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.offers.IntroductoryOfferProviderImpl", f = "IntroductoryOfferProviderImpl.kt", l = {20}, m = "hasIntroductoryOffer")
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public /* synthetic */ Object h;
        public int j;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public a(f fVar, h hVar) {
        j.f(fVar, "billingLifeCycleWrapper");
        this.a = fVar;
        this.b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:25:0x006c). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.uh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.y20.a.C0883a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.y20.a$a r0 = (com.amazon.aps.iva.y20.a.C0883a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.y20.a$a r0 = new com.amazon.aps.iva.y20.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.util.Iterator r2 = r0.i
            com.amazon.aps.iva.y20.a r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.wh.d r7 = r6.b
            java.util.List r7 = r7.c()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L4d
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4d
            goto L75
        L4d:
            java.util.Iterator r7 = r7.iterator()
            r5 = r6
            r2 = r7
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r2.next()
            com.ellation.crunchyroll.api.etp.subscription.model.Product r7 = (com.ellation.crunchyroll.api.etp.subscription.model.Product) r7
            r0.h = r5
            r0.i = r2
            r0.l = r4
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            r3 = r4
        L75:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y20.a.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.ellation.crunchyroll.api.etp.subscription.model.Product r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.y20.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.y20.a$b r0 = (com.amazon.aps.iva.y20.a.b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.y20.a$b r0 = new com.amazon.aps.iva.y20.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r5 = r5.getSku()
            r0.j = r3
            com.amazon.aps.iva.rs.f r6 = r4.a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.amazon.aps.iva.rs.o r6 = (com.amazon.aps.iva.rs.o) r6
            com.amazon.aps.iva.rs.m r5 = r6.e
            if (r5 == 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y20.a.b(com.ellation.crunchyroll.api.etp.subscription.model.Product, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
