package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: DragGestureDetector.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {176, 890, 940, 193}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.p1.y i;
    public com.amazon.aps.iva.yb0.c0 j;
    public com.amazon.aps.iva.p1.c k;
    public g0 l;
    public com.amazon.aps.iva.yb0.c0 m;
    public com.amazon.aps.iva.p1.y n;
    public int o;
    public float p;
    public float q;
    public float r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> u;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> v;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> w;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> x;

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.p1.y, ? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> pVar) {
            super(1);
            this.h = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p1.y yVar) {
            com.amazon.aps.iva.p1.y yVar2 = yVar;
            com.amazon.aps.iva.yb0.j.f(yVar2, "it");
            this.h.invoke(yVar2, new com.amazon.aps.iva.e1.c(f1.P(yVar2, false)));
            yVar2.a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.p pVar) {
        super(dVar);
        this.u = lVar;
        this.v = pVar;
        this.w = aVar;
        this.x = aVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        i iVar = new i(dVar, this.w, this.x, this.u, this.v);
        iVar.t = obj;
        return iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((i) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b1 -> B:58:0x0177). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0171 -> B:58:0x0177). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01db -> B:70:0x01eb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:81:0x0240). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x02a4 -> B:29:0x00e4). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
