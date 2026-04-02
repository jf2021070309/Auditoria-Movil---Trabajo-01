package com.amazon.aps.iva.ni;

import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.util.Date;
import java.util.List;
/* compiled from: WatchMusicViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.WatchMusicViewModelImpl$watchMusicDataFlow$1", f = "WatchMusicViewModel.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<x, com.amazon.aps.iva.ob0.d<? super p>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ w j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, com.amazon.aps.iva.ob0.d<? super v> dVar) {
        super(2, dVar);
        this.j = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        v vVar = new v(this.j, dVar);
        vVar.i = obj;
        return vVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(x xVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return ((v) create(xVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        w wVar = this.j;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            x xVar = (x) this.i;
            com.amazon.aps.iva.ji.a aVar2 = wVar.b;
            String str = xVar.b;
            this.h = 1;
            obj = aVar2.v0(str, xVar.c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        MusicAsset musicAsset = (MusicAsset) obj;
        com.amazon.aps.iva.yh.c cVar = wVar.d;
        com.amazon.aps.iva.yb0.j.f(musicAsset, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "formatter");
        String id = musicAsset.getId();
        String b = cVar.b(musicAsset);
        String c = cVar.c(musicAsset);
        String a = cVar.a(musicAsset);
        List<com.amazon.aps.iva.kb0.j<String, String>> d = cVar.d(musicAsset);
        Date releaseDate = musicAsset.getReleaseDate();
        String description = musicAsset.getDescription();
        String copyright = musicAsset.getCopyright();
        return new p(musicAsset, new com.amazon.aps.iva.qi.g(id, b, c, a, d, releaseDate, com.amazon.aps.iva.oe0.q.O0(description + " " + copyright).toString(), LabelUiModelKt.toLabelUiModel$default(musicAsset, false, 1, null), musicAsset.getType()));
    }
}
