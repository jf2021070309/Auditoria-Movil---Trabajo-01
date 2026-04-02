package com.amazon.aps.iva.vq;

import android.content.Context;
import com.amazon.aps.iva.sp.f;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.vp.e;
import com.amazon.aps.iva.vp.h;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.ExecutorService;
/* compiled from: RumFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public final class c extends h<Object> {
    public final File g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.xp.a aVar, Context context, com.amazon.aps.iva.gq.a aVar2, ExecutorService executorService, com.amazon.aps.iva.iq.a aVar3, File file) {
        super(new com.amazon.aps.iva.up.c(aVar, context, "rum", executorService, aVar3), executorService, new com.amazon.aps.iva.gq.b(aVar2, new com.amazon.aps.iva.wq.c()), f.h, aVar3, new e(aVar3));
        j.f(aVar, "consentProvider");
        j.f(aVar2, "eventMapper");
        j.f(aVar3, "internalLogger");
        this.g = file;
    }

    @Override // com.amazon.aps.iva.vp.h
    public final com.amazon.aps.iva.up.f a(m mVar, ExecutorService executorService, com.amazon.aps.iva.sp.h hVar, f fVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(mVar, "fileOrchestrator");
        j.f(executorService, "executorService");
        j.f(hVar, "serializer");
        j.f(fVar, "payloadDecoration");
        j.f(aVar, "internalLogger");
        return new com.amazon.aps.iva.up.f(new b(mVar, hVar, fVar, this.d, aVar, this.g), executorService, aVar);
    }
}
