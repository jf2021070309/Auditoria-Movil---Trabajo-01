package com.kwad.components.ad.reward.j.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.kwad.components.ad.reward.j;
import com.kwad.components.core.webview.b.c.d;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.webview.b.c.d {
    private static WeakReference<b> xN;
    private j xK;
    private long xM;

    public static b a(b bVar, Activity activity, long j, com.kwad.components.core.webview.b.e.c cVar, d.a aVar) {
        if (activity == null || activity.isFinishing() || jr()) {
            return null;
        }
        bVar.QN = cVar;
        bVar.Xv = aVar;
        bVar.show(activity.getFragmentManager(), "tkCloseDialog");
        if (j > 0) {
            bVar.k(j);
        }
        xN = new WeakReference<>(bVar);
        return bVar;
    }

    public static b a(j jVar, Activity activity, long j, DialogInterface.OnDismissListener onDismissListener, com.kwad.components.core.webview.b.e.c cVar) {
        if (activity == null || activity.isFinishing() || jr()) {
            return null;
        }
        d.b bVar = new d.b();
        bVar.setAdTemplate(jVar.mAdTemplate);
        bVar.aP("ksad-video-secondclick-card");
        b a = a(jVar, bVar);
        a.QN = cVar;
        a.d(onDismissListener);
        a.k(j);
        a.show(activity.getFragmentManager(), "tkExtraReward");
        xN = new WeakReference<>(a);
        return a;
    }

    public static b a(j jVar, d.b bVar) {
        b bVar2 = new b();
        bVar2.xK = jVar;
        bVar2.mAdTemplate = bVar.getAdTemplate();
        bVar2.xH = bVar.getTemplateId();
        bVar2.Xu = bVar.sc();
        bVar2.XC = bVar.sd();
        Bundle bundle = new Bundle();
        bundle.putString("templateId", bVar.getTemplateId());
        bVar2.setArguments(bundle);
        return bVar2;
    }

    private static boolean jr() {
        WeakReference<b> weakReference = xN;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private void k(long j) {
        this.xM = j;
        if (this.Xr != null) {
            this.Xr.xM = j;
        }
    }

    @Override // com.kwad.components.core.webview.b.c.d
    public final com.kwad.components.core.webview.b.c.b js() {
        return new a(this.xK);
    }

    @Override // com.kwad.components.core.webview.b.c.d
    public final com.kwad.components.core.webview.b.c.c jt() {
        return new c();
    }

    @Override // com.kwad.components.core.webview.b.c.d
    public final void ju() {
        super.ju();
        this.Xr.xM = this.xM;
    }

    @Override // com.kwad.components.core.webview.b.c.d, android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.xK = null;
        xN = null;
    }
}
