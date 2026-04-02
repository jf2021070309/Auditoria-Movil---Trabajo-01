package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.File;
/* compiled from: BifDownloader.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.BifDownloaderImpl$download$1$1$1", f = "BifDownloader.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ b i;
    public final /* synthetic */ String j;
    public final /* synthetic */ PlayableAsset k;
    public final /* synthetic */ File l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, PlayableAsset playableAsset, File file, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = str;
        this.k = playableAsset;
        this.l = file;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.wv.d dVar = this.i.b;
            String id = this.k.getId();
            String path = this.l.getPath();
            com.amazon.aps.iva.yb0.j.e(path, "file.path");
            com.amazon.aps.iva.xv.b bVar = new com.amazon.aps.iva.xv.b(this.j, id, path);
            this.h = 1;
            if (dVar.saveItem(bVar, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
