package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import java.util.AbstractMap;
import rx.functions.Func1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xl implements Func1 {
    private final xg a;
    private final String b;

    private xl(xg xgVar, String str) {
        this.a = xgVar;
        this.b = str;
    }

    public static Func1 a(xg xgVar, String str) {
        return new xl(xgVar, str);
    }

    @Override // rx.functions.Func1
    @LambdaForm.Hidden
    public Object call(Object obj) {
        return this.a.a(this.b, (AbstractMap.SimpleEntry) obj);
    }
}
