package com.amazon.aps.iva.rr;

import android.content.Context;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.sp.f;
import com.amazon.aps.iva.up.c;
import com.amazon.aps.iva.vp.e;
import com.amazon.aps.iva.vp.h;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonObject;
import java.util.concurrent.ExecutorService;
/* compiled from: WebViewLogFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public final class a extends h<JsonObject> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.xp.a aVar, Context context, ExecutorService executorService, com.amazon.aps.iva.iq.a aVar2) {
        super(new c(aVar, context, "web-logs", executorService, aVar2), executorService, new r(), f.g, com.amazon.aps.iva.dq.c.a, new e(aVar2));
        j.f(aVar, "consentProvider");
        j.f(aVar2, "internalLogger");
    }
}
