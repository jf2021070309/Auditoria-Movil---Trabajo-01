package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.Observable;
import rx.functions.Func1;
/* loaded from: classes4.dex */
final /* synthetic */ class ye implements Func1 {
    private final yd a;
    private final int b;
    private final String c;

    private ye(yd ydVar, int i, String str) {
        this.a = ydVar;
        this.b = i;
        this.c = str;
    }

    public static Func1 a(yd ydVar, int i, String str) {
        return new ye(ydVar, i, str);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return this.a.a(this.b, this.c, (Observable) obj);
    }
}
