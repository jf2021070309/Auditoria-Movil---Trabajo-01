package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.commenting.model.Guestbook;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ShowContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getAllAssets$2", f = "ShowContentInteractor.kt", l = {161, 167, 168}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a>, Object> {
    public Object h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l<com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>>, Object> k;
    public final /* synthetic */ h l;

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getAllAssets$2$guestbooksJob$1", f = "ShowContentInteractor.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Guestbook>>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ h j;
        public final /* synthetic */ String[] k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, String[] strArr, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = hVar;
            this.k = strArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Guestbook>> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    h hVar = this.j;
                    String[] strArr = this.k;
                    this.h = 1;
                    obj = h.m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                H = (Map) obj;
            } catch (Throwable th) {
                H = x.H(th);
            }
            a0 a0Var = a0.b;
            if (H instanceof k.a) {
                return a0Var;
            }
            return H;
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getAllAssets$2$playheadJob$1", f = "ShowContentInteractor.kt", l = {166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>>, Object> {
        public int h;
        public final /* synthetic */ h i;
        public final /* synthetic */ String[] j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, String[] strArr, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = hVar;
            this.j = strArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                String[] strArr = this.j;
                this.h = 1;
                obj = this.i.o((String[]) Arrays.copyOf(strArr, strArr.length), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(l<? super com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>>, ? extends Object> lVar, h hVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.k = lVar;
        this.l = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.k, this.l, dVar);
        fVar.j = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.amazon.aps.iva.se0.m0] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r10.i
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r10.h
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r10.j
            java.util.List r1 = (java.util.List) r1
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L8d
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            java.lang.Object r1 = r10.h
            com.amazon.aps.iva.se0.m0 r1 = (com.amazon.aps.iva.se0.m0) r1
            java.lang.Object r3 = r10.j
            java.util.List r3 = (java.util.List) r3
            com.amazon.aps.iva.ab.x.i0(r11)
            r9 = r3
            r3 = r1
            r1 = r9
            goto L7c
        L33:
            java.lang.Object r1 = r10.j
            com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L50
        L3b:
            com.amazon.aps.iva.ab.x.i0(r11)
            java.lang.Object r11 = r10.j
            r1 = r11
            com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
            r10.j = r1
            r10.i = r4
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset>>, java.lang.Object> r11 = r10.k
            java.lang.Object r11 = r11.invoke(r10)
            if (r11 != r0) goto L50
            return r0
        L50:
            java.util.List r11 = (java.util.List) r11
            java.lang.String[] r4 = com.amazon.aps.iva.aq.k.L(r11)
            com.amazon.aps.iva.o40.f$a r5 = new com.amazon.aps.iva.o40.f$a
            com.amazon.aps.iva.o40.h r6 = r10.l
            r7 = 0
            r5.<init>(r6, r4, r7)
            com.amazon.aps.iva.se0.n0 r5 = com.amazon.aps.iva.se0.i.b(r1, r7, r7, r5, r2)
            com.amazon.aps.iva.o40.f$b r8 = new com.amazon.aps.iva.o40.f$b
            r8.<init>(r6, r4, r7)
            com.amazon.aps.iva.se0.n0 r1 = com.amazon.aps.iva.se0.i.b(r1, r7, r7, r8, r2)
            r10.j = r11
            r10.h = r1
            r10.i = r3
            java.lang.Object r3 = r5.K(r10)
            if (r3 != r0) goto L78
            return r0
        L78:
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r9
        L7c:
            java.util.Map r11 = (java.util.Map) r11
            r10.j = r1
            r10.h = r11
            r10.i = r2
            java.lang.Object r2 = r3.K(r10)
            if (r2 != r0) goto L8b
            return r0
        L8b:
            r0 = r11
            r11 = r2
        L8d:
            java.util.Map r11 = (java.util.Map) r11
            com.amazon.aps.iva.e00.a r2 = new com.amazon.aps.iva.e00.a
            r2.<init>(r1, r11, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
