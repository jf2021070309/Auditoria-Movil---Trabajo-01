package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import java.util.AbstractMap;
import rx.functions.Func2;
/* loaded from: classes4.dex */
final /* synthetic */ class xn implements Func2 {
    private static final xn a = new xn();

    private xn() {
    }

    public static Func2 a() {
        return a;
    }

    @Override // rx.functions.Func2
    @LambdaForm.Hidden
    public Object call(Object obj, Object obj2) {
        return new AbstractMap.SimpleEntry((dr) obj, (String) obj2);
    }
}
