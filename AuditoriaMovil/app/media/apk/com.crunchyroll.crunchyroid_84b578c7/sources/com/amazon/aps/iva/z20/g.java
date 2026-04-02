package com.amazon.aps.iva.z20;

import android.content.DialogInterface;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
/* compiled from: OfflineAccessUpsellDialogRouterImpl.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.vh.b {
    public final androidx.fragment.app.h a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    public g(androidx.fragment.app.h hVar, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        j.f(hVar, "activity");
        j.f(aVar, "isAppLaunchedInOnline");
        this.a = hVar;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.vh.b
    public final void a(PlayableAsset playableAsset, com.amazon.aps.iva.vh.a aVar) {
        j.f(playableAsset, "asset");
        j.f(aVar, "accessReason");
        boolean booleanValue = this.b.invoke().booleanValue();
        androidx.fragment.app.h hVar = this.a;
        if (booleanValue) {
            d.k.getClass();
            d dVar = new d();
            l<?>[] lVarArr = d.l;
            dVar.d.b(dVar, lVarArr[2], playableAsset);
            dVar.e.b(dVar, lVarArr[3], aVar);
            dVar.show(hVar.getSupportFragmentManager(), "offline_access_upsell");
            return;
        }
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(hVar);
        int i = a.a;
        j.f(hVar, "context");
        b bVar = new b(hVar);
        int i2 = i.a;
        i iVar = i.a.a;
        if (iVar != null) {
            materialAlertDialogBuilder.setMessage((CharSequence) bVar.a(aVar, iVar.c().c())).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
        } else {
            j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.vh.b
    public final void b(com.amazon.aps.iva.xb0.a<q> aVar) {
        androidx.fragment.app.h hVar = this.a;
        hVar.getSupportFragmentManager().b0("offline_access_upsell", hVar, new f0(aVar, 1));
    }
}
