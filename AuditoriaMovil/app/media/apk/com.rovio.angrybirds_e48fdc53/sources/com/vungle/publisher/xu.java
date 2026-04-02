package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xu implements Action1 {
    private static final xu a = new xu();

    private xu() {
    }

    public static Action1 a() {
        return a;
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        gd gdVar = (gd) obj;
        Logger.d(Logger.PREPARE_TAG, "viewable prepared: " + gdVar.o() + ", has status: " + gdVar.j());
    }
}
