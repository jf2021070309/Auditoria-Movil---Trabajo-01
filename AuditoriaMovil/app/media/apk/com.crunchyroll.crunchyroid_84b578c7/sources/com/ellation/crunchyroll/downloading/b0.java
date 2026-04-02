package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.mf0.a;
import com.ellation.crunchyroll.downloading.z;
import java.io.File;
/* compiled from: ImageDownloader.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.ImageDownloaderImpl$downloadToFile$1$1", f = "ImageDownloader.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ a0 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ File l;
    public final /* synthetic */ z.a m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, String str, String str2, File file, z.a aVar, String str3, com.amazon.aps.iva.ob0.d<? super b0> dVar) {
        super(2, dVar);
        this.i = a0Var;
        this.j = str;
        this.k = str2;
        this.l = file;
        this.m = aVar;
        this.n = str3;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b0(this.i, this.j, this.k, this.l, this.m, this.n, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((b0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.wv.o oVar = this.i.b;
            String path = this.l.getPath();
            com.amazon.aps.iva.yb0.j.e(path, "file.path");
            com.amazon.aps.iva.xv.c cVar = new com.amazon.aps.iva.xv.c(this.j, this.k, path);
            this.h = 1;
            if (oVar.saveItem(cVar, this) == aVar) {
                return aVar;
            }
        }
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        StringBuilder c = com.amazon.aps.iva.k.q.c("Saved ", this.m.c, " for ");
        c.append(this.n);
        c0515a.a(c.toString(), new Object[0]);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
