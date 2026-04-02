package com.vungle.publisher;

import com.google.gson.JsonObject;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class ve implements Action1 {
    private final vc a;

    private ve(vc vcVar) {
        this.a = vcVar;
    }

    public static Action1 a(vc vcVar) {
        return new ve(vcVar);
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        this.a.a((JsonObject) obj);
    }
}
