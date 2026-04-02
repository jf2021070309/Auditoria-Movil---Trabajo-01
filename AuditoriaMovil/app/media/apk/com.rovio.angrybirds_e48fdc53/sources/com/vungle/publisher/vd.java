package com.vungle.publisher;

import com.google.gson.JsonObject;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class vd implements Action1 {
    private final vc a;
    private final cz b;

    private vd(vc vcVar, cz czVar) {
        this.a = vcVar;
        this.b = czVar;
    }

    public static Action1 a(vc vcVar, cz czVar) {
        return new vd(vcVar, czVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a(this.b, (JsonObject) obj);
    }
}
