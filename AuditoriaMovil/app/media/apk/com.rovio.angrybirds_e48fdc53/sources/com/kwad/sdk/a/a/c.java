package com.kwad.sdk.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.a.a.b;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.g;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    private e ahM;
    private final Map<String, Integer> ahN;
    private final Map<String, Integer> ahO;
    private final Stack<AdTemplate> ahP;
    private volatile boolean ahQ;
    public volatile boolean ahR;
    public volatile boolean ahS;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        static final c ahX = new c((byte) 0);
    }

    private c() {
        this.ahN = new HashMap();
        this.ahO = new HashMap();
        this.ahP = new Stack<>();
        this.ahQ = false;
        this.ahR = false;
        this.ahS = false;
    }

    /* synthetic */ c(byte b) {
        this();
    }

    static /* synthetic */ e a(c cVar, e eVar) {
        cVar.ahM = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdTemplate adTemplate, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnClickListener onClickListener) {
        if (com.kwad.sdk.a.a.a.nd()) {
            return;
        }
        com.kwad.sdk.core.c.b.AT();
        Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
        if (currentActivity != null && com.kwad.sdk.a.a.a.a(currentActivity, adTemplate, onDismissListener, onClickListener)) {
            a(adTemplate, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdTemplate adTemplate, boolean z, int i, boolean z2) {
        if (this.ahM != null || com.kwad.components.core.e.c.b.nd()) {
            return;
        }
        boolean z3 = true;
        a(adTemplate, z, (z && i == 1) ? false : false, z2);
    }

    private void a(AdTemplate adTemplate, boolean z, boolean z2) {
        int i;
        String valueOf = String.valueOf(com.kwad.sdk.core.response.b.d.cu(adTemplate));
        if (!z) {
            com.kwad.sdk.core.report.a.c(adTemplate, 93, (JSONObject) null);
            b(this.ahO, valueOf);
            return;
        }
        b(this.ahN, valueOf);
        j jVar = new j();
        if (z2) {
            jVar.cm(23);
            i = 191;
        } else {
            i = 92;
        }
        jVar.ci(i);
        com.kwad.sdk.core.report.a.d(adTemplate, (JSONObject) null, jVar);
    }

    private void a(final AdTemplate adTemplate, boolean z, boolean z2, boolean z3) {
        Context context;
        Context wrapContextIfNeed;
        com.kwad.sdk.core.c.b.AT();
        Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
        if (currentActivity == null || (context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext()) == null || (wrapContextIfNeed = l.wrapContextIfNeed(context)) == null) {
            return;
        }
        e eVar = new e(wrapContextIfNeed, adTemplate, z, z2, z3);
        View findViewById = currentActivity.getWindow().getDecorView().findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            eVar.a((FrameLayout) findViewById);
            this.ahM = eVar;
            a(adTemplate, z, z3);
        }
        if (z3) {
            com.kwad.sdk.core.c.b.AT();
            com.kwad.sdk.a.a.a.b.J(com.kwad.sdk.core.c.b.getCurrentActivity());
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.sdk.a.a.c.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.ahM != null) {
                        c.this.ahM.dismiss();
                        c.a(c.this, (e) null);
                        c cVar = c.this;
                        c.h(adTemplate, 2);
                    }
                }
            }, PushUIConfig.dismissTime);
        }
    }

    private static boolean am(AdTemplate adTemplate) {
        String B;
        if (adTemplate == null) {
            return false;
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        Context context = KsAdSDKImpl.get().getContext();
        if (context == null || ak.ak(context, com.kwad.sdk.core.response.b.a.aq(ck)) || (B = com.kwad.sdk.core.download.a.B(ck)) == null || TextUtils.isEmpty(B)) {
            return false;
        }
        return new File(B).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar(final AdTemplate adTemplate) {
        a(adTemplate, (DialogInterface.OnDismissListener) null, new DialogInterface.OnClickListener() { // from class: com.kwad.sdk.a.a.c.7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i != -1) {
                    if (i == -2) {
                        c cVar = c.this;
                        c.h(adTemplate, 1);
                        return;
                    }
                    return;
                }
                j jVar = new j();
                jVar.ci(29);
                jVar.cm(23);
                com.kwad.sdk.core.report.a.a(adTemplate, jVar);
                com.kwad.sdk.a.a.a.xT();
            }
        });
        bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.sdk.a.a.c.8
            @Override // java.lang.Runnable
            public final void run() {
                if (com.kwad.sdk.a.a.a.xT()) {
                    c cVar = c.this;
                    c.h(adTemplate, 2);
                }
            }
        }, PushUIConfig.dismissTime);
    }

    private static void b(Map<String, Integer> map, String str) {
        map.put(str, map.containsKey(str) ? Integer.valueOf(map.get(str).intValue() + 1) : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final AdTemplate adTemplate, final boolean z) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.sdk.a.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                int zj = com.kwad.sdk.core.config.d.zj();
                boolean z2 = z;
                if (z2 && zj == 2) {
                    c.this.a(adTemplate, (DialogInterface.OnDismissListener) null, new DialogInterface.OnClickListener() { // from class: com.kwad.sdk.a.a.c.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (i != -1) {
                                if (i == -2) {
                                    c cVar = c.this;
                                    c.h(adTemplate, 1);
                                    return;
                                }
                                return;
                            }
                            j jVar = new j();
                            jVar.ci(29);
                            jVar.cm(23);
                            com.kwad.sdk.core.report.a.a(adTemplate, jVar);
                            com.kwad.sdk.a.a.a.xT();
                        }
                    });
                } else {
                    c.this.a(adTemplate, z2, zj, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(AdTemplate adTemplate, int i) {
        com.kwad.sdk.core.report.a.a(adTemplate, new j().ci(69).cm(23).cq(i));
    }

    public static c xY() {
        return a.ahX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yc() {
        if (!this.ahR && com.kwad.sdk.a.a.a.b.cJ() <= 0) {
            bj.runOnUiThread(new Runnable() { // from class: com.kwad.sdk.a.a.c.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AdTemplate xW = b.xV().xW();
                        if (xW == null || com.kwad.sdk.core.config.d.zk() == 0) {
                            return;
                        }
                        c.this.ahR = true;
                        com.kwad.sdk.core.c.b.AT();
                        com.kwad.sdk.a.a.a.b.J(com.kwad.sdk.core.c.b.getCurrentActivity());
                        c.this.ar(xW);
                    } catch (Throwable th) {
                        com.kwad.components.core.d.a.b(th);
                    }
                }
            });
        }
    }

    public final void an(AdTemplate adTemplate) {
        if (am(adTemplate)) {
            this.ahP.add(adTemplate);
        }
    }

    public final void ao(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        this.ahP.remove(adTemplate);
    }

    public final void ap(final AdTemplate adTemplate) {
        int zi = com.kwad.sdk.core.config.d.zi();
        if (adTemplate == null || zi <= 0) {
            return;
        }
        final AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (adTemplate.mAdScene.getAdStyle() == 0) {
            return;
        }
        String valueOf = String.valueOf(com.kwad.sdk.core.response.b.d.cu(adTemplate));
        int i = 0;
        if (this.ahN.containsKey(valueOf)) {
            i = this.ahN.get(valueOf).intValue();
            this.ahN.put(valueOf, Integer.valueOf(i));
        }
        if (i > 0) {
            return;
        }
        g.schedule(new Runnable() { // from class: com.kwad.sdk.a.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ck.status == 12 || ck.status == 10) {
                    return;
                }
                c.this.e(adTemplate, true);
            }
        }, zi, TimeUnit.SECONDS);
    }

    public final void aq(final AdTemplate adTemplate) {
        int zu = com.kwad.sdk.core.config.d.zu();
        if (zu < 0) {
            return;
        }
        final AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        String valueOf = String.valueOf(ck.adBaseInfo.creativeId);
        int i = 0;
        if (this.ahO.containsKey(valueOf)) {
            i = this.ahO.get(valueOf).intValue();
            this.ahO.put(valueOf, Integer.valueOf(i));
        }
        if (i > 0) {
            return;
        }
        g.schedule(new Runnable() { // from class: com.kwad.sdk.a.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ak.al(ServiceProvider.getContext(), com.kwad.sdk.core.response.b.a.aq(ck)) == 1) {
                    return;
                }
                c.this.e(adTemplate, false);
            }
        }, zu, TimeUnit.SECONDS);
    }

    public final void bc(boolean z) {
        this.ahQ = z;
    }

    public final void dismiss() {
        com.kwad.sdk.a.a.a.xT();
        e eVar = this.ahM;
        if (eVar != null) {
            eVar.dismiss();
            this.ahM = null;
        }
    }

    public final AdTemplate xZ() {
        AdTemplate adTemplate = null;
        while (!this.ahP.isEmpty()) {
            AdTemplate pop = this.ahP.pop();
            if (am(pop)) {
                adTemplate = pop;
            }
        }
        if (adTemplate != null) {
            this.ahP.add(0, adTemplate);
        }
        return adTemplate;
    }

    public final void ya() {
        b.xV().a(new b.a() { // from class: com.kwad.sdk.a.a.c.4
            @Override // com.kwad.sdk.a.a.b.a
            public final void gD() {
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.sdk.a.a.c.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c.this.ahQ) {
                            c.this.ahS = true;
                        } else {
                            c.this.yc();
                        }
                    }
                }, com.kwad.sdk.core.config.d.zl());
            }

            @Override // com.kwad.sdk.a.a.b.a
            public final void xX() {
                com.kwad.sdk.core.e.c.d("InstallTipsManager", "showInitDelayDialog failed");
            }
        });
    }

    public final void yb() {
        bc(false);
        if (this.ahR || !this.ahS) {
            return;
        }
        bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.sdk.a.a.c.5
            @Override // java.lang.Runnable
            public final void run() {
                c.this.yc();
            }
        }, PushUIConfig.dismissTime);
    }

    public final void yd() {
        this.ahM = null;
    }
}
