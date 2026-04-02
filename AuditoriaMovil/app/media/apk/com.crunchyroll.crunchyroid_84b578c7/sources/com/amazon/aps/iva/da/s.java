package com.amazon.aps.iva.da;

import com.amazon.aps.iva.ab.x;
/* compiled from: rememberLottieComposition.kt */
@com.amazon.aps.iva.qb0.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<Integer, Throwable, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public s(com.amazon.aps.iva.ob0.d<? super s> dVar) {
        super(3, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(Integer num, Throwable th, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        num.intValue();
        return new s(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        return Boolean.FALSE;
    }
}
