package com.amazon.aps.iva.gp;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: OfflineWatchScreenModuleImpl.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<String, PlayableAsset> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final PlayableAsset invoke(String str) {
        String str2 = str;
        j.f(str2, "it");
        com.amazon.aps.iva.vo.c V0 = a.k(this.h).V0();
        if (V0 != null) {
            return V0.b(str2);
        }
        return null;
    }
}
