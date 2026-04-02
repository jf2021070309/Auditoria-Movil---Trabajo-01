package com.amazon.aps.iva.nm;

import android.content.Context;
import com.amazon.aps.iva.gm.b0;
import com.amazon.aps.iva.gm.c0;
import com.amazon.aps.iva.gm.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
/* compiled from: ProfilesDestinations.kt */
/* loaded from: classes2.dex */
public final class f extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ com.amazon.aps.iva.ui.c<c> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, com.amazon.aps.iva.ui.c<c> cVar) {
        super(2);
        this.h = context;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            c0 c0Var = c0.a;
            Context context = this.h;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.fm.f fVar = com.amazon.aps.iva.fm.g.e;
            if (fVar != null) {
                DigitalAssetManagementService assetsService = fVar.getAssetsService();
                com.amazon.aps.iva.p60.g a = f.a.a(context, GsonHolder.getInstance());
                com.amazon.aps.iva.yb0.j.f(assetsService, "assetsService");
                b0 b0Var = new b0(assetsService, a);
                AssetType assetType = AssetType.AVATAR;
                com.amazon.aps.iva.yb0.j.f(assetType, "assetType");
                com.amazon.aps.iva.ui.c<c> cVar = this.i;
                com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
                x.a(R.string.multiple_profiles_edit_avatar, c0Var, new com.amazon.aps.iva.gm.c(b0Var, assetType, cVar), iVar2, 48);
            } else {
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
        }
        return q.a;
    }
}
