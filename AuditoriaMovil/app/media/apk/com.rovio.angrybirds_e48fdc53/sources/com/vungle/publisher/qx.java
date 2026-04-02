package com.vungle.publisher;

import com.google.gson.JsonObject;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class qx implements Action1 {
    private static final qx a = new qx();

    private qx() {
    }

    public static Action1 a() {
        return a;
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        qw.d((JsonObject) obj);
    }
}
