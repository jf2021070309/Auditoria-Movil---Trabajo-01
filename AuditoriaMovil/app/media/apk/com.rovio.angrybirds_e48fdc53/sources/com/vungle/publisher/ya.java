package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements Func1 {
    private static final ya a = new ya();

    private ya() {
    }

    public static Func1 a() {
        return a;
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return xy.c((gd) obj);
    }
}
