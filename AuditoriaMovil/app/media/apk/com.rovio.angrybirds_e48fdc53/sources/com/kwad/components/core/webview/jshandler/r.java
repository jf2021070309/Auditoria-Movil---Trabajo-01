package com.kwad.components.core.webview.jshandler;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class r implements com.kwad.sdk.core.webview.c.a {
    protected final com.kwad.sdk.core.webview.b TO;
    private int TP;
    private boolean TQ;
    private final boolean TR;
    private List<com.kwad.components.core.e.d.c> TS;
    private com.kwad.sdk.core.webview.d.a.a cH;
    private DialogInterface.OnDismissListener xV;

    public r(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar) {
        this(bVar, cVar, aVar, false, 0, false);
    }

    public r(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar, int i) {
        this(bVar, cVar, aVar, false, 1, false);
    }

    public r(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar, int i, boolean z) {
        this(bVar, cVar, null, false, 2, z);
    }

    public r(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar, DialogInterface.OnDismissListener onDismissListener) {
        this(bVar, cVar, aVar, false, 0, false);
        this.xV = onDismissListener;
    }

    public r(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.core.webview.d.a.a aVar, boolean z, int i, boolean z2) {
        this.TQ = false;
        this.TS = new ArrayList();
        this.TQ = z;
        this.TO = bVar;
        this.TP = i;
        if (cVar != null) {
            cVar.ar(1);
            this.TS.add(cVar);
        }
        this.cH = aVar;
        this.TR = z2;
    }

    public r(com.kwad.sdk.core.webview.b bVar, List<com.kwad.components.core.e.d.c> list, com.kwad.sdk.core.webview.d.a.a aVar) {
        this(bVar, null, aVar, false, 0, false);
        if (list != null) {
            this.TS.addAll(list);
        }
    }

    static /* synthetic */ boolean a(r rVar, com.kwad.sdk.core.webview.d.b.a aVar) {
        return b(aVar);
    }

    private static boolean ab(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.d.cf(adTemplate) == 13;
    }

    private static boolean b(com.kwad.sdk.core.webview.d.b.a aVar) {
        return aVar.Vc == 1;
    }

    protected final com.kwad.components.core.e.d.c C(long j) {
        List<com.kwad.components.core.e.d.c> list = this.TS;
        if (list == null) {
            return null;
        }
        if (j >= 0 || list.size() != 1) {
            for (com.kwad.components.core.e.d.c cVar : this.TS) {
                if (com.kwad.sdk.core.response.b.d.cu(cVar.nI()) == j) {
                    return cVar;
                }
            }
            return null;
        }
        return this.TS.get(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z.b a(com.kwad.sdk.core.webview.d.b.a aVar, AdTemplate adTemplate) {
        com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
        if (aVar.Vd != null && !TextUtils.isEmpty(aVar.Vd.US)) {
            jVar.dt(aVar.Vd.US);
        }
        if (aVar.Vd != null && aVar.Vd.azm != 0) {
            jVar.cp(aVar.Vd.azm);
        }
        if (!ab(adTemplate) || aVar.Vd == null || aVar.Vd.azn == null) {
            com.kwad.sdk.widget.e eVar = this.TO.aym;
            if (eVar != null) {
                jVar.c(eVar.getTouchCoords());
            }
        } else {
            ac.a aVar2 = new ac.a();
            aVar2.g((float) aVar.Vd.azn.x, (float) aVar.Vd.azn.y);
            aVar2.f((float) aVar.Vd.azn.x, (float) aVar.Vd.azn.y);
            aVar2.x(aVar.Vd.azn.width, aVar.Vd.azn.height);
            jVar.c(aVar2);
        }
        jVar.a(adTemplate, null, null, null);
        return jVar.BZ();
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        Runnable runnable;
        if (this.TO.DX()) {
            cVar.onError(-1, "native adTemplate is null");
            return;
        }
        final com.kwad.sdk.core.webview.d.b.a aVar = new com.kwad.sdk.core.webview.d.b.a();
        try {
            aVar.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (!this.TO.ayo) {
            if (this.cH != null) {
                runnable = new Runnable() { // from class: com.kwad.components.core.webview.jshandler.r.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (r.this.cH != null) {
                            r.this.cH.a(aVar);
                        }
                    }
                };
            }
            cVar.a(null);
        }
        runnable = new Runnable() { // from class: com.kwad.components.core.webview.jshandler.r.1
            @Override // java.lang.Runnable
            public final void run() {
                AdTemplate adTemplate;
                if (r.this.TO.ayp) {
                    if (aVar.creativeId >= 0) {
                        adTemplate = com.kwad.sdk.core.response.b.d.a(r.this.TO.DW(), aVar.creativeId, aVar.adStyle);
                    } else {
                        adTemplate = r.this.TO.getAdTemplate();
                        aVar.creativeId = com.kwad.sdk.core.response.b.d.cu(adTemplate);
                        aVar.adStyle = com.kwad.sdk.core.response.b.d.cf(adTemplate);
                    }
                    com.kwad.components.core.e.d.c C = r.this.C(aVar.creativeId);
                    if (r.this.xV != null && C != null) {
                        C.setOnDismissListener(r.this.xV);
                    }
                    String str2 = null;
                    if (!TextUtils.isEmpty(aVar.Ka)) {
                        try {
                            str2 = com.kwad.components.core.e.b.a.q(Long.parseLong(aVar.Ka));
                        } catch (Exception e2) {
                            str2 = aVar.Ka;
                        }
                    } else if (adTemplate != null && adTemplate.tkLiveShopItemInfo != null) {
                        str2 = adTemplate.tkLiveShopItemInfo.itemId;
                    }
                    r.this.J(com.kwad.components.core.e.d.a.a(new a.C0197a(r.this.TO.MZ.getContext()).S(adTemplate).b(C).an(str2).al(r.a(r.this, aVar)).am(r.this.TQ).d(r.this.TO.mReportExtData).ao(aVar.Vc).am(aVar.azl).an(aVar.jI).an(r.this.TR || aVar.JR).aq(r.this.TP).a(r.this.a(aVar, adTemplate)).a(new a.b() { // from class: com.kwad.components.core.webview.jshandler.r.1.1
                        @Override // com.kwad.components.core.e.d.a.b
                        public final void onAdClicked() {
                            r.this.jp();
                            if (r.this.cH != null) {
                                r.this.cH.a(aVar);
                            }
                        }
                    })));
                }
            }
        };
        bj.runOnUiThread(runnable);
        cVar.a(null);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "clickAction";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void jp() {
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.cH = null;
    }
}
