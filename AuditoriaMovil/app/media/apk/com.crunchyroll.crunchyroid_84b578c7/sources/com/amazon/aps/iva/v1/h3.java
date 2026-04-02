package com.amazon.aps.iva.v1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
/* compiled from: WindowRecomposer.android.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ve0.g<? super Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.ue0.h h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ContentResolver k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ i3 m;
    public final /* synthetic */ com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> n;
    public final /* synthetic */ Context o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(ContentResolver contentResolver, Uri uri, i3 i3Var, com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> fVar, Context context, com.amazon.aps.iva.ob0.d<? super h3> dVar) {
        super(2, dVar);
        this.k = contentResolver;
        this.l = uri;
        this.m = i3Var;
        this.n = fVar;
        this.o = context;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h3 h3Var = new h3(this.k, this.l, this.m, this.n, this.o, dVar);
        h3Var.j = obj;
        return h3Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ve0.g<? super Float> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h3) create(gVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #1 {all -> 0x0088, blocks: (B:21:0x0058, B:23:0x0060), top: B:39:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:37:0x0045). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            com.amazon.aps.iva.ue0.h r1 = r9.h
            java.lang.Object r4 = r9.j
            com.amazon.aps.iva.ve0.g r4 = (com.amazon.aps.iva.ve0.g) r4
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L99
            goto L44
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            com.amazon.aps.iva.ue0.h r1 = r9.h
            java.lang.Object r4 = r9.j
            com.amazon.aps.iva.ve0.g r4 = (com.amazon.aps.iva.ve0.g) r4
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L99
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L58
        L2c:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.j
            r4 = r10
            com.amazon.aps.iva.ve0.g r4 = (com.amazon.aps.iva.ve0.g) r4
            android.content.ContentResolver r10 = r9.k
            android.net.Uri r1 = r9.l
            r5 = 0
            com.amazon.aps.iva.v1.i3 r6 = r9.m
            r10.registerContentObserver(r1, r5, r6)
            com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> r10 = r9.n     // Catch: java.lang.Throwable -> L99
            com.amazon.aps.iva.ue0.h r1 = r10.iterator()     // Catch: java.lang.Throwable -> L99
        L44:
            r10 = r9
        L45:
            r10.j = r4     // Catch: java.lang.Throwable -> L94
            r10.h = r1     // Catch: java.lang.Throwable -> L94
            r10.i = r3     // Catch: java.lang.Throwable -> L94
            java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L94
            if (r5 != r0) goto L52
            return r0
        L52:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L58:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r10 == 0) goto L8a
            r4.next()     // Catch: java.lang.Throwable -> L88
            android.content.Context r10 = r0.o     // Catch: java.lang.Throwable -> L88
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L88
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L88
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L88
            r0.j = r5     // Catch: java.lang.Throwable -> L88
            r0.h = r4     // Catch: java.lang.Throwable -> L88
            r0.i = r2     // Catch: java.lang.Throwable -> L88
            java.lang.Object r10 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L88
            if (r10 != r1) goto L83
            return r1
        L83:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L45
        L88:
            r10 = move-exception
            goto L9b
        L8a:
            android.content.ContentResolver r10 = r0.k
            com.amazon.aps.iva.v1.i3 r0 = r0.m
            r10.unregisterContentObserver(r0)
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        L94:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9b
        L99:
            r10 = move-exception
            r0 = r9
        L9b:
            android.content.ContentResolver r1 = r0.k
            com.amazon.aps.iva.v1.i3 r0 = r0.m
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.h3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
