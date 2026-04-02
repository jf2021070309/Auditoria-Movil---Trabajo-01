package com.kwad.components.core.r;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.kwad.components.core.webview.b.c.d;
/* loaded from: classes.dex */
public final class b extends d {
    protected com.kwad.components.core.webview.b.e.c QN;

    public static b a(b bVar, Activity activity, com.kwad.components.core.webview.b.e.c cVar) {
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        bVar.QN = cVar;
        bVar.show(activity.getFragmentManager(), "webTKCloseDialog");
        return bVar;
    }

    public static b a(d.b bVar) {
        b bVar2 = new b();
        bVar2.mAdTemplate = bVar.getAdTemplate();
        bVar2.xH = bVar.getTemplateId();
        Bundle bundle = new Bundle();
        bundle.putString("templateId", bVar.getTemplateId());
        bVar2.setArguments(bundle);
        return bVar2;
    }

    @Override // com.kwad.components.core.webview.b.c.d
    public final com.kwad.components.core.webview.b.c.b js() {
        return super.js();
    }

    @Override // com.kwad.components.core.webview.b.c.d
    public final com.kwad.components.core.webview.b.c.c jt() {
        return new c();
    }

    @Override // com.kwad.components.core.webview.b.c.d, android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.kwad.components.core.webview.b.e.c cVar = this.QN;
        if (cVar != null) {
            cVar.gq();
        }
    }

    @Override // com.kwad.components.core.webview.b.c.d, android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.kwad.components.core.webview.b.e.c cVar = this.QN;
        if (cVar != null) {
            cVar.gi();
        }
    }
}
