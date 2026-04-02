package com.amazon.aps.iva.yg;

import android.app.Application;
import com.google.gson.Gson;
/* compiled from: EmailVerificationStore.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.xe.a<k> {
    public i(Application application, Gson gson) {
        super(k.class, application, "email_verification_store", gson);
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(k kVar) {
        k kVar2 = kVar;
        com.amazon.aps.iva.yb0.j.f(kVar2, "<this>");
        return kVar2.a();
    }
}
