package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.lang.invoke.LambdaForm;
import rx.functions.Action1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class xs implements Action1 {
    private static final xs a = new xs();

    private xs() {
    }

    public static Action1 a() {
        return a;
    }

    @Override // rx.functions.Action1
    @LambdaForm.Hidden
    public void call(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.w(Logger.PREPARE_TAG, "could not prepare viewable after multiple retries");
    }
}
