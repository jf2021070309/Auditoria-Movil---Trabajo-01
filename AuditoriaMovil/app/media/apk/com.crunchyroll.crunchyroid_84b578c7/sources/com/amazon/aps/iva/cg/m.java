package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.b0;
import com.amazon.aps.iva.cg.p;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareDataForMusicAsset$1", f = "DeepLinkDataManager.kt", l = {140, 142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super p>, Object> {
    public int h;
    public final /* synthetic */ b0 i;
    public final /* synthetic */ i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b0 b0Var, i iVar, com.amazon.aps.iva.ob0.d<? super m> dVar) {
        super(1, dVar);
        this.i = b0Var;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new m(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return ((m) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        MusicAsset musicAsset;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        b0 b0Var = this.i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    musicAsset = (MusicAsset) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                musicAsset = (MusicAsset) obj;
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            boolean z = b0Var instanceof b0.b;
            i iVar = this.j;
            if (z) {
                f fVar = iVar.a;
                String b = b0Var.b();
                this.h = 1;
                obj = fVar.T0(b, this);
                if (obj == aVar) {
                    return aVar;
                }
                musicAsset = (MusicAsset) obj;
            } else {
                f fVar2 = iVar.a;
                String b2 = b0Var.b();
                this.h = 2;
                obj = fVar2.w0(b2, this);
                if (obj == aVar) {
                    return aVar;
                }
                musicAsset = (MusicAsset) obj;
            }
        }
        return new p.g(b0Var.getUri(), musicAsset);
    }
}
