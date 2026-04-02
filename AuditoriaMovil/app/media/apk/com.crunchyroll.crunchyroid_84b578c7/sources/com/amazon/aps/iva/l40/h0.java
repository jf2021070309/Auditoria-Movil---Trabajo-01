package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Images;
import java.util.List;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Images, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Images images) {
        List<Image> postersTall;
        Images images2 = images;
        com.amazon.aps.iva.yb0.j.f(images2, "images");
        v vVar = this.h;
        i1 q6 = v.q6(vVar);
        com.amazon.aps.iva.rv.a aVar = vVar.g;
        if (aVar.c()) {
            postersTall = images2.getPostersWide();
        } else {
            postersTall = images2.getPostersTall();
        }
        q6.b4(postersTall);
        if (aVar.c() && aVar.S0()) {
            v.q6(vVar).Ob();
        } else {
            v.q6(vVar).y7();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
