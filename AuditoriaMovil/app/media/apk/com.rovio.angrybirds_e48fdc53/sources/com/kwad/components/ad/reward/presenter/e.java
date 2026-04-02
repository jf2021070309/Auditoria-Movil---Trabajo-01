package com.kwad.components.ad.reward.presenter;

import android.content.Context;
import android.os.SystemClock;
import androidx.renderscript.ScriptIntrinsicBLAS;
import com.kwad.components.ad.reward.k;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e {
    private static long sh = 0;

    private static boolean R(String str) {
        if (!com.kwad.components.ad.reward.a.b.gQ()) {
            com.kwad.sdk.core.e.c.e(str, "isEnable false");
            return true;
        }
        int gP = com.kwad.components.ad.reward.a.b.gP();
        com.kwad.sdk.core.e.c.d(str, "JumpDirectMaxCount " + gP);
        return gP <= 0 || com.kwad.components.ad.reward.g.a.cJ() >= gP;
    }

    private static void a(final com.kwad.components.ad.reward.j jVar, final k.b bVar) {
        String str;
        final AdTemplate adTemplate = jVar.mAdTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        final JSONObject jSONObject = jVar.mReportExtData;
        long V = com.kwad.sdk.core.response.b.a.V(ck);
        if (V <= 0 || com.kwad.sdk.core.response.b.a.G(ck) <= V) {
            str = "观看完整视频即可获取奖励";
        } else {
            str = "观看视频" + V + "s即可获取奖励";
        }
        final k.c a = com.kwad.components.ad.reward.k.a(jVar, str);
        com.kwad.components.ad.reward.j.a(jVar, a, new k.b() { // from class: com.kwad.components.ad.reward.presenter.e.7
            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void G(boolean z) {
                com.kwad.components.ad.reward.j.this.E(false);
                if (!z) {
                    com.kwad.sdk.core.report.a.q(adTemplate, 151);
                }
                k.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.G(z);
                }
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.ad.reward.k.a
            public final void g(int i, int i2) {
                super.g(i, i2);
                com.kwad.components.ad.reward.j jVar2 = com.kwad.components.ad.reward.j.this;
                jVar2.a(1, jVar2.mContext, i, i2);
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gi() {
                com.kwad.components.ad.reward.j.this.oZ.pause();
                com.kwad.components.ad.reward.j.this.E(true);
                if (a.getStyle() == 0) {
                    com.kwad.sdk.core.report.a.j(adTemplate, jSONObject);
                } else {
                    com.kwad.sdk.core.report.a.b(adTemplate, 149, jSONObject);
                }
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.ad.reward.k.a
            public final void gp() {
                super.gp();
                com.kwad.sdk.core.report.a.q(adTemplate, 150);
                com.kwad.components.ad.reward.j jVar2 = com.kwad.components.ad.reward.j.this;
                jVar2.a(1, jVar2.mContext, 156, 1);
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gq() {
                super.gq();
                com.kwad.components.ad.reward.j.this.E(false);
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gr() {
                com.kwad.components.ad.reward.j.this.E(false);
                com.kwad.components.ad.reward.j.this.oZ.resume();
                if (a.getStyle() == 1 || a.getStyle() == 2 || a.getStyle() == 5 || a.getStyle() == 8) {
                    com.kwad.sdk.core.report.a.q(adTemplate, 150);
                } else {
                    com.kwad.sdk.core.report.a.k(adTemplate, jSONObject);
                }
            }
        });
    }

    public static void a(final com.kwad.components.ad.reward.j jVar, boolean z) {
        AdTemplate adTemplate = jVar.mAdTemplate;
        final AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (!jVar.pn) {
            jVar.mAdOpenInteractionListener.onVideoSkipToEnd(0L);
            if (com.kwad.sdk.core.response.b.a.bF(ck)) {
                q(jVar);
                return;
            } else if (jVar.pp) {
                s(jVar);
                return;
            } else {
                jVar.ps = true;
                com.kwad.components.ad.reward.j.a(jVar.ph, new com.kwad.sdk.g.a<com.kwad.components.ad.reward.j.a>() { // from class: com.kwad.components.ad.reward.presenter.e.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.kwad.sdk.g.a
                    /* renamed from: c */
                    public void accept(com.kwad.components.ad.reward.j.a aVar) {
                        aVar.iS();
                    }
                });
                com.kwad.sdk.core.report.a.i(adTemplate, jVar.mReportExtData);
                jVar.oZ.release();
                jVar.fT();
                v(jVar);
                return;
            }
        }
        r(jVar);
        boolean z2 = !jVar.ge() && z(jVar.mAdTemplate);
        if (t(adTemplate) || u(adTemplate) || jVar.pJ < com.kwad.sdk.core.response.b.a.Y(ck)) {
            if (z2) {
                a(jVar, new k.b() { // from class: com.kwad.components.ad.reward.presenter.e.2
                    @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
                    public final void G(boolean z3) {
                        super.G(z3);
                        if (com.kwad.components.ad.reward.a.b.k(AdInfo.this)) {
                            jVar.hy();
                        } else if (com.kwad.sdk.core.response.b.a.bG(AdInfo.this)) {
                            e.q(jVar);
                        } else {
                            e.s(jVar);
                            com.kwad.components.ad.reward.m.m(jVar);
                        }
                    }
                });
            } else if (com.kwad.sdk.core.response.b.a.bG(ck)) {
                q(jVar);
            } else {
                s(jVar);
                com.kwad.components.ad.reward.m.m(jVar);
            }
        } else if (jVar.pD) {
            jVar.hy();
        } else if (!jVar.pK && jVar.pJ < com.kwad.sdk.core.response.b.a.Y(ck)) {
            if (z) {
                jVar.hy();
            }
        } else {
            if (jVar.pK) {
                jVar.K(2);
            } else {
                jVar.K(1);
            }
            z(jVar);
            if (com.kwad.sdk.core.response.b.a.bG(ck)) {
                q(jVar);
                return;
            }
            s(jVar);
            com.kwad.components.ad.reward.m.m(jVar);
        }
    }

    private static boolean a(String str, AdTemplate adTemplate, AdInfo adInfo) {
        String str2;
        if (com.kwad.sdk.core.response.b.a.bv(adInfo)) {
            str2 = "is playable return";
        } else if (!com.kwad.sdk.core.response.b.a.ax(adInfo)) {
            str2 = "is not Download type";
        } else if (com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(adInfo))) {
            str2 = "isRewardLaunchAppTask";
        } else if (!com.kwad.components.ad.reward.j.g(adInfo)) {
            return false;
        } else {
            str2 = "is Aggregation return";
        }
        com.kwad.sdk.core.e.c.i(str, str2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(final com.kwad.components.ad.reward.j jVar) {
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.e.3
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.components.ad.reward.j.this.gf();
                com.kwad.components.ad.reward.j.this.mAdOpenInteractionListener.onVideoSkipToEnd(com.kwad.components.ad.reward.j.this.pJ);
                com.kwad.components.ad.reward.j.this.release();
                com.kwad.components.ad.reward.j.this.hy();
            }
        });
    }

    private static void r(com.kwad.components.ad.reward.j jVar) {
        int i = jVar.pI != 0 ? (int) (jVar.pI / 1000) : 0;
        int i2 = jVar.pJ != 0 ? (int) (jVar.pJ / 1000) : 0;
        z.b bVar = new z.b();
        bVar.atc = 69;
        bVar.ats = i;
        bVar.att = i2;
        com.kwad.sdk.core.report.a.b(jVar.mAdTemplate, (int) ScriptIntrinsicBLAS.LEFT, bVar, jVar.mReportExtData);
    }

    public static void s(final com.kwad.components.ad.reward.j jVar) {
        jVar.ps = true;
        jVar.gf();
        if (h.A(jVar)) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    e.t(com.kwad.components.ad.reward.j.this);
                }
            }, 200L);
        } else {
            t(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(final com.kwad.components.ad.reward.j jVar) {
        com.kwad.components.ad.reward.j.a(jVar.ph, new com.kwad.sdk.g.a<com.kwad.components.ad.reward.j.a>() { // from class: com.kwad.components.ad.reward.presenter.e.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.g.a
            /* renamed from: c */
            public void accept(com.kwad.components.ad.reward.j.a aVar) {
                aVar.iS();
            }
        });
        jVar.oZ.skipToEnd();
    }

    private static boolean t(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
    }

    public static void u(com.kwad.components.ad.reward.j jVar) {
        y(jVar);
        jVar.hy();
    }

    private static boolean u(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.d.u(adTemplate);
    }

    public static void v(com.kwad.components.ad.reward.j jVar) {
        com.kwad.sdk.core.e.c.d("openAppMarket", "tryOpenAppMarket");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - sh < 300) {
            com.kwad.sdk.core.e.c.d("openAppMarket", "连续点击");
            return;
        }
        sh = elapsedRealtime;
        if (R("openAppMarket")) {
            return;
        }
        AdTemplate adTemplate = jVar.mAdTemplate;
        Context context = jVar.mContext;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (a("openAppMarket", adTemplate, ck)) {
            return;
        }
        com.kwad.sdk.core.report.j cp = new com.kwad.sdk.core.report.j().cg(182).cp(8);
        boolean z = com.kwad.sdk.core.download.a.b.i(context, com.kwad.sdk.core.response.b.a.cx(ck)) == 1;
        com.kwad.sdk.core.e.c.i("openAppMarket", "handleDeepLink dpSuccess: " + z);
        if (z) {
            com.kwad.components.ad.reward.i.b.a(adTemplate, "native_id", "autoLaunchMarket", cp, (JSONObject) null);
            com.kwad.components.ad.reward.g.a.J(context);
            return;
        }
        String cz = com.kwad.sdk.core.response.b.a.cz(ck);
        com.kwad.sdk.core.e.c.i("openAppMarket", "tryOpenMiAppStore url：" + cz);
        if (com.kwad.sdk.utils.d.a(context, cz, adTemplate)) {
            com.kwad.components.ad.reward.i.b.a(adTemplate, "native_id", "autoLaunchMarket", cp, (JSONObject) null);
            com.kwad.sdk.core.report.a.c(adTemplate, 1, 8);
            com.kwad.components.ad.reward.g.a.J(context);
        } else if (!com.kwad.sdk.utils.d.f(context, cz, com.kwad.sdk.core.response.b.a.aq(ck))) {
            com.kwad.sdk.core.e.c.i("openAppMarket", "tryOpenMiAppStore failed");
        } else {
            com.kwad.components.ad.reward.i.b.a(adTemplate, "native_id", "autoLaunchMarket", cp, (JSONObject) null);
            com.kwad.sdk.core.report.a.c(adTemplate, 0, 8);
            com.kwad.components.ad.reward.g.a.J(context);
        }
    }

    public static void w(com.kwad.components.ad.reward.j jVar) {
        AdTemplate adTemplate = jVar.mAdTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (jVar.pn) {
            boolean z = true;
            if (!t(adTemplate) && !u(adTemplate)) {
                long Y = com.kwad.sdk.core.response.b.a.Y(ck);
                if (!jVar.pK && jVar.pJ < Y) {
                    z = false;
                }
                if (z) {
                    z(jVar);
                }
                y(jVar);
                jVar.hy();
                return;
            }
            r(jVar);
            if (jVar.ge() || !z(jVar.mAdTemplate) || jVar.ps) {
                z = false;
            }
            if (z) {
                x(jVar);
                return;
            }
        }
        y(jVar);
        jVar.hy();
    }

    private static void x(final com.kwad.components.ad.reward.j jVar) {
        final AdTemplate adTemplate = jVar.mAdTemplate;
        com.kwad.components.ad.reward.j.a(jVar, com.kwad.components.ad.reward.k.a(jVar, (String) null), new k.b() { // from class: com.kwad.components.ad.reward.presenter.e.6
            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void G(boolean z) {
                com.kwad.components.ad.reward.j.this.E(false);
                if (!z) {
                    com.kwad.sdk.core.report.a.q(adTemplate, 151);
                }
                e.y(com.kwad.components.ad.reward.j.this);
                com.kwad.components.ad.reward.j.this.hy();
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gi() {
                com.kwad.components.ad.reward.j.this.E(true);
                com.kwad.sdk.core.report.a.b(adTemplate, 149, com.kwad.components.ad.reward.j.this.mReportExtData);
            }

            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gr() {
                com.kwad.components.ad.reward.j.this.E(false);
                com.kwad.sdk.core.report.a.q(adTemplate, 150);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(com.kwad.components.ad.reward.j jVar) {
        jVar.mAdOpenInteractionListener.h(false);
    }

    private static void z(com.kwad.components.ad.reward.j jVar) {
        jVar.mAdOpenInteractionListener.onRewardVerify();
    }

    private static boolean z(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.a.ac(com.kwad.sdk.core.response.b.d.ck(adTemplate));
    }
}
