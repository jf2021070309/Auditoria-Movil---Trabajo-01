package com.amazon.aps.iva.b30;

import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: CrPlusSubscriptionInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.b30.a {
    public final com.amazon.aps.iva.rs.f b;
    public final com.amazon.aps.iva.xb0.l<List<Product>, List<com.amazon.aps.iva.a30.b>> c;
    public final e d;
    public List<Product> e;

    /* compiled from: CrPlusSubscriptionInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.ss.a.values().length];
            try {
                iArr[com.amazon.aps.iva.ss.a.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.ss.a.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.ss.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: CrPlusSubscriptionInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.CrPlusSubscriptionInteractorImpl", f = "CrPlusSubscriptionInteractor.kt", l = {44, 47}, m = "loadSubscriptionProducts")
    /* renamed from: com.amazon.aps.iva.b30.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0128b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public Collection i;
        public Iterator j;
        public com.amazon.aps.iva.a30.b k;
        public Collection l;
        public /* synthetic */ Object m;
        public int o;

        public C0128b(com.amazon.aps.iva.ob0.d<? super C0128b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return b.this.e0(this);
        }
    }

    public b(com.amazon.aps.iva.rs.f fVar, com.amazon.aps.iva.a30.c cVar, g gVar) {
        this.b = fVar;
        this.c = cVar;
        this.d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a7 -> B:31:0x00a8). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.b30.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(com.amazon.aps.iva.ob0.d<? super java.util.List<com.amazon.aps.iva.b30.c>> r30) throws com.amazon.aps.iva.rs.h {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b30.b.e0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
