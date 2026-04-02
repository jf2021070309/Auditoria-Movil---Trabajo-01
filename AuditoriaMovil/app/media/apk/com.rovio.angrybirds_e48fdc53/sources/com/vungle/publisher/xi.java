package com.vungle.publisher;

import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xi implements Action1 {
    private final xg a;
    private final String b;

    private xi(xg xgVar, String str) {
        this.a = xgVar;
        this.b = str;
    }

    public static Action1 a(xg xgVar, String str) {
        return new xi(xgVar, str);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a(this.b, (wd) obj);
    }
}
