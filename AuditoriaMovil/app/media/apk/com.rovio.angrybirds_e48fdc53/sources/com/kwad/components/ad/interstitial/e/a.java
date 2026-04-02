package com.kwad.components.ad.interstitial.e;

import android.app.Activity;
import android.content.DialogInterface;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.page.widget.a;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public static boolean c(final c cVar) {
        Activity ownerActivity;
        if (cVar.hI != null && (ownerActivity = cVar.hI.getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            AdInfo ck = d.ck(cVar.mAdTemplate);
            int cJ = com.kwad.components.ad.interstitial.b.b.cJ();
            int cK = com.kwad.components.ad.interstitial.b.b.cK();
            if (cJ > com.kwad.sdk.core.response.b.a.bW(ck) && cK < com.kwad.sdk.core.response.b.a.bX(ck)) {
                if (com.kwad.sdk.core.response.b.a.bY(ck) == 2) {
                    com.kwad.components.ad.interstitial.f.b.d(cVar);
                    return true;
                } else if (com.kwad.sdk.core.response.b.a.bY(ck) == 1) {
                    new com.kwad.components.core.page.widget.a(ownerActivity, com.kwad.sdk.core.response.b.a.cb(ck), new a.InterfaceC0209a() { // from class: com.kwad.components.ad.interstitial.e.a.1
                        @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                        public final void a(DialogInterface dialogInterface) {
                            dialogInterface.dismiss();
                            com.kwad.sdk.core.report.a.c(c.this.mAdTemplate, (JSONObject) null, new j().ck(8));
                        }

                        @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                        public final void b(DialogInterface dialogInterface) {
                            c cVar2 = c.this;
                            cVar2.a(false, -1, cVar2.ex);
                            dialogInterface.dismiss();
                            com.kwad.sdk.core.report.a.a(c.this.mAdTemplate, new j().ci(151).ck(8));
                            c.this.hI.dismiss();
                        }

                        @Override // com.kwad.components.core.page.widget.a.InterfaceC0209a
                        public final void c(DialogInterface dialogInterface) {
                        }
                    }).show();
                    com.kwad.sdk.core.report.a.d(cVar.mAdTemplate, new JSONObject(), new j().ci(149).ck(8));
                    return true;
                }
            }
        }
        return false;
    }
}
