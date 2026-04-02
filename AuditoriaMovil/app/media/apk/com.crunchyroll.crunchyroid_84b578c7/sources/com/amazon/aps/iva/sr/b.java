package com.amazon.aps.iva.sr;

import android.content.Context;
import com.amazon.aps.iva.sp.f;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.up.c;
import com.amazon.aps.iva.vp.e;
import com.amazon.aps.iva.vp.h;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* compiled from: WebViewRumFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public final class b extends h<Object> {
    public final File g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.xp.a aVar, Context context, ExecutorService executorService, com.amazon.aps.iva.iq.a aVar2, File file) {
        super(new c(aVar, context, "web-rum", executorService, aVar2), executorService, new com.amazon.aps.iva.wq.c(), f.h, aVar2, new e(aVar2));
        j.f(aVar, "consentProvider");
        j.f(aVar2, "internalLogger");
        this.g = file;
    }

    @Override // com.amazon.aps.iva.vp.h
    public final com.amazon.aps.iva.up.f a(m mVar, ExecutorService executorService, com.amazon.aps.iva.sp.h hVar, f fVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(mVar, "fileOrchestrator");
        j.f(executorService, "executorService");
        j.f(hVar, "serializer");
        j.f(fVar, "payloadDecoration");
        j.f(aVar, "internalLogger");
        return new com.amazon.aps.iva.up.f(new com.amazon.aps.iva.vq.b(mVar, hVar, fVar, this.d, aVar, this.g), executorService, aVar);
    }
}
