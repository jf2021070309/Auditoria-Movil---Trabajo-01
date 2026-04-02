package com.amazon.aps.iva.o0;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: SnapshotFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {133, 137, 159}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ve0.g<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public Set h;
    public com.amazon.aps.iva.xb0.l i;
    public com.amazon.aps.iva.ue0.f j;
    public com.amazon.aps.iva.y0.e k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<Object> o;

    /* compiled from: SnapshotFlow.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Set<Object> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkedHashSet linkedHashSet) {
            super(1);
            this.h = linkedHashSet;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            this.h.add(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Set<? extends Object>, com.amazon.aps.iva.y0.h, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ue0.f<Set<Object>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.ue0.a aVar) {
            super(2);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Set<? extends Object> set, com.amazon.aps.iva.y0.h hVar) {
            Set<? extends Object> set2 = set;
            com.amazon.aps.iva.yb0.j.f(set2, "changed");
            com.amazon.aps.iva.yb0.j.f(hVar, "<anonymous parameter 1>");
            this.h.h(set2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.amazon.aps.iva.xb0.a<Object> aVar, com.amazon.aps.iva.ob0.d<? super m3> dVar) {
        super(2, dVar);
        this.o = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        m3 m3Var = new m3(this.o, dVar);
        m3Var.n = obj;
        return m3Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ve0.g<Object> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((m3) create(gVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #4 {all -> 0x013d, blocks: (B:35:0x00cf, B:37:0x00d5, B:42:0x00df, B:45:0x00ed, B:49:0x0105, B:51:0x010e, B:46:0x00fa, B:48:0x0102, B:47:0x00fe), top: B:81:0x00cf }] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.amazon.aps.iva.ue0.f] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.amazon.aps.iva.ue0.f] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0133 -> B:31:0x00ad). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
