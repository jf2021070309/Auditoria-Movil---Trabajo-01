package com.amazon.aps.iva.da;

import android.content.Context;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.se0.g0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: rememberLottieComposition.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {90, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public Throwable h;
    public int i;
    public int j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<Integer, Throwable, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ l m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ q1<k> r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(com.amazon.aps.iva.xb0.q<? super Integer, ? super Throwable, ? super com.amazon.aps.iva.ob0.d<? super Boolean>, ? extends Object> qVar, Context context, l lVar, String str, String str2, String str3, String str4, q1<k> q1Var, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.k = qVar;
        this.l = context;
        this.m = lVar;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = q1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new t(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((t) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:5|(3:6|7|8)|9|10|b4|14|15|16|17|(0)|37|(2:40|103)|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
        r7 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[Catch: all -> 0x00d7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00da, blocks: (B:34:0x00aa, B:35:0x00b4, B:38:0x00c8, B:24:0x0074, B:31:0x009a, B:27:0x008d, B:30:0x0096, B:41:0x00d4, B:36:0x00b5, B:40:0x00ca), top: B:69:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:69:0x00aa). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.da.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
