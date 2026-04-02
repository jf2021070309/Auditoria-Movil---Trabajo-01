package com.kwad.components.core.i;

import android.os.SystemClock;
import android.text.TextUtils;
import com.kwad.components.core.request.h;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private static int KO = 12;
    private static int KP = 4;
    private static int KQ = 1;

    /* renamed from: com.kwad.components.core.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0202a {
        void c(List<c> list);

        void onError(int i, String str);

        void onRequestResult(int i);
    }

    private static void a(int i, int i2, SceneImpl sceneImpl, final int i3, final InterfaceC0202a interfaceC0202a) {
        SceneImpl m20clone = sceneImpl.m20clone();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        m20clone.setAdStyle(i);
        m20clone.setAdNum(i2);
        a(new ImpInfo(m20clone), null, false, true, new h() { // from class: com.kwad.components.core.i.a.1
            @Override // com.kwad.components.core.request.i
            public final void a(final AdResultData adResultData) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.i.a.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            InterfaceC0202a.this.onRequestResult(adResultData.getAdTemplateList().size());
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                });
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.i.a.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0202a.this.c(a.b(adResultData.getAdTemplateList(), i3));
                        a.a(adResultData, elapsedRealtime);
                    }
                });
            }

            @Override // com.kwad.components.core.request.i
            public final void onError(final int i4, final String str) {
                bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.i.a.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.core.e.c.w("RefluxAdLoadManager", "loadInnerAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i4), str));
                        InterfaceC0202a.this.onError(i4, str);
                    }
                });
            }
        }, false);
    }

    private static void a(final ImpInfo impInfo, List<String> list, boolean z, boolean z2, final h hVar, boolean z3) {
        new com.kwad.components.core.m.a(impInfo) { // from class: com.kwad.components.core.i.a.2
            @Override // com.kwad.components.core.m.a, com.kwad.sdk.core.network.a
            /* renamed from: mq */
            public final com.kwad.components.core.request.a createRequest() {
                com.kwad.components.core.request.a aVar = new com.kwad.components.core.request.a(impInfo, r3, r4, null);
                aVar.aC(r5 ? 1 : 0);
                return aVar;
            }
        }.request(new p<com.kwad.components.core.request.a, AdResultData>() { // from class: com.kwad.components.core.i.a.3
            private void b(AdResultData adResultData) {
                if (!adResultData.isAdResultDataEmpty() || r1) {
                    hVar.a(adResultData);
                } else {
                    hVar.onError(f.aoZ.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? f.aoZ.msg : adResultData.testErrorMsg);
                }
            }

            private void f(int i, String str) {
                hVar.onError(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(g gVar, int i, String str) {
                f(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                b((AdResultData) baseResultData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AdResultData adResultData, long j) {
        AdTemplate adTemplate;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (adResultData.getAdTemplateList().size() <= 0 || (adTemplate = adResultData.getAdTemplateList().get(0)) == null) {
            return;
        }
        com.kwad.components.core.p.a.pC().g(adTemplate, elapsedRealtime - j);
    }

    public static void a(SceneImpl sceneImpl, InterfaceC0202a interfaceC0202a) {
        a(15, KP, sceneImpl, e.AGGREGATION, interfaceC0202a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<c> b(List<AdTemplate> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (AdTemplate adTemplate : list) {
            arrayList.add(new c(adTemplate, i));
        }
        return arrayList;
    }

    public static void b(SceneImpl sceneImpl, InterfaceC0202a interfaceC0202a) {
        a(17, KQ, sceneImpl, e.La, interfaceC0202a);
    }
}
