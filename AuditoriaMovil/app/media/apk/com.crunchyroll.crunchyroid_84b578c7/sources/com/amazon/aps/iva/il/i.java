package com.amazon.aps.iva.il;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qj.r;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.ve0.f<r> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
    public final /* synthetic */ k c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
        public final /* synthetic */ k c;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.skipsegment.SkipSegmentButtonViewModelImpl$special$$inlined$map$2$2", f = "SkipSegmentButtonViewModel.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.il.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0382a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0382a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar, k kVar) {
            this.b = gVar;
            this.c = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r13, com.amazon.aps.iva.ob0.d r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.il.i.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public i(com.amazon.aps.iva.ve0.f fVar, k kVar) {
        this.b = fVar;
        this.c = kVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super r> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
