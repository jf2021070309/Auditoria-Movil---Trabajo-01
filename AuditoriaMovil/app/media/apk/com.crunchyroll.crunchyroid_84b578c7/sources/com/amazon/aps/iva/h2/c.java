package com.amazon.aps.iva.h2;

import android.content.Context;
import android.graphics.Typeface;
/* compiled from: AndroidFontLoader.android.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Typeface>, Object> {
    public final /* synthetic */ h0 h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h0 h0Var, Context context, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.h = h0Var;
        this.i = context;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Typeface> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        return i0.a.a(this.i, this.h);
    }
}
