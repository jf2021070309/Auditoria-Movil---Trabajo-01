package com.amazon.aps.iva.sv;

import java.io.File;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: FileDownloader.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.FileDownloaderImpl$writeToFile$1", f = "FileDownloader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d2 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Long>, Object> {
    public final /* synthetic */ File h;
    public final /* synthetic */ Response i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(File file, Response response, com.amazon.aps.iva.ob0.d<? super d2> dVar) {
        super(2, dVar);
        this.h = file;
        this.i = response;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new d2(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Long> dVar) {
        return ((d2) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ef0.h source;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        File file = this.h;
        File parentFile = file.getParentFile();
        com.amazon.aps.iva.yb0.j.c(parentFile);
        parentFile.mkdirs();
        ResponseBody body = this.i.body();
        if (body == null || (source = body.source()) == null) {
            return null;
        }
        try {
            com.amazon.aps.iva.ef0.w a = com.amazon.aps.iva.ef0.r.a(com.amazon.aps.iva.ef0.r.e(file));
            long r = a.r(source);
            com.amazon.aps.iva.a60.b.k(a, null);
            Long l = new Long(r);
            com.amazon.aps.iva.a60.b.k(source, null);
            return l;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.amazon.aps.iva.a60.b.k(source, th);
                throw th2;
            }
        }
    }
}
