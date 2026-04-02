package com.kwad.components.offline.b;

import android.content.Context;
import com.kwad.components.core.request.f;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.components.offline.api.InitCallBack;
import com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo;
import com.kwad.sdk.core.response.model.SdkConfigData;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.n.b.a<IObiwanOfflineCompo> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final b ZF = new b((byte) 0);
    }

    private b() {
    }

    /* synthetic */ b(byte b) {
        this();
    }

    private void a(Context context, final IObiwanOfflineCompo iObiwanOfflineCompo) {
        iObiwanOfflineCompo.init(context, new d(), new InitCallBack() { // from class: com.kwad.components.offline.b.b.1
            @Override // com.kwad.components.offline.api.InitCallBack
            public final void onSuccess(boolean z) {
                final com.kwad.components.offline.b.a aVar = new com.kwad.components.offline.b.a(iObiwanOfflineCompo);
                com.kwad.sdk.components.c.a(com.kwad.components.core.n.a.b.a.class, aVar);
                com.kwad.sdk.core.e.c.a(new c(aVar.getLog()));
                b.this.ok();
                f.a(new f.a() { // from class: com.kwad.components.offline.b.b.1.1
                    private void updateConfigs() {
                        com.kwad.sdk.core.e.c.a(com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alX) ? new c(aVar.getLog()) : null);
                        aVar.updateConfigs();
                    }

                    @Override // com.kwad.components.core.request.f.a
                    public final void a(SdkConfigData sdkConfigData) {
                        updateConfigs();
                    }

                    @Override // com.kwad.components.core.request.f.a
                    public final void pJ() {
                        updateConfigs();
                    }
                });
            }
        });
    }

    public static void al(Context context) {
        sM().init(context);
    }

    private static b sM() {
        return a.ZF;
    }

    @Override // com.kwad.components.core.n.b.a
    public final /* bridge */ /* synthetic */ void a(Context context, boolean z, IObiwanOfflineCompo iObiwanOfflineCompo) {
        a(context, iObiwanOfflineCompo);
    }

    @Override // com.kwad.components.core.n.b.a
    public final String getTag() {
        return "ObiwanInitModule";
    }

    @Override // com.kwad.components.core.n.b.a
    public final boolean isEnabled() {
        return ((Boolean) com.kwad.sdk.core.config.d.b(com.kwad.sdk.core.config.c.alX)).booleanValue();
    }

    @Override // com.kwad.components.core.n.b.a
    public final int ol() {
        return 3;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String om() {
        return IObiwanOfflineCompo.PACKAGE_NAME;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String on() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oo() {
        return "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/obiwan/ks_so-obiwanNoSoRelease-3.3.44-dd6401f217-301.zip";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String op() {
        return "d945ab0533c29de4146475cc3b8cc310";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oq() {
        return "ks_obiwan_3344";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String or() {
        return IObiwanOfflineCompo.IMPL;
    }
}
