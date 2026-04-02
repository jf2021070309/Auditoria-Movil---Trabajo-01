package com.kwad.components.offline.a;

import android.content.Context;
import com.kwad.components.offline.api.InitCallBack;
import com.kwad.components.offline.api.adLive.IAdLiveOfflineCompo;
import com.kwad.sdk.core.config.d;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.n.b.a<IAdLiveOfflineCompo> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final b Zq = new b((byte) 0);
    }

    private b() {
    }

    /* synthetic */ b(byte b) {
        this();
    }

    private void a(Context context, final IAdLiveOfflineCompo iAdLiveOfflineCompo) {
        iAdLiveOfflineCompo.init(context, new c(), new InitCallBack() { // from class: com.kwad.components.offline.a.b.1
            @Override // com.kwad.components.offline.api.InitCallBack
            public final void onSuccess(boolean z) {
                com.kwad.sdk.components.c.a(com.kwad.components.core.n.a.a.a.class, new com.kwad.components.offline.a.a(iAdLiveOfflineCompo));
                b.this.ok();
            }
        });
    }

    public static void al(Context context) {
        sJ().init(context);
    }

    private static b sJ() {
        return a.Zq;
    }

    @Override // com.kwad.components.core.n.b.a
    public final /* bridge */ /* synthetic */ void a(Context context, boolean z, IAdLiveOfflineCompo iAdLiveOfflineCompo) {
        a(context, iAdLiveOfflineCompo);
    }

    @Override // com.kwad.components.core.n.b.a
    public final String getTag() {
        return "AdLiveInitModule";
    }

    @Override // com.kwad.components.core.n.b.a
    public final boolean isEnabled() {
        return ((Boolean) d.b(com.kwad.sdk.core.config.c.alw)).booleanValue();
    }

    @Override // com.kwad.components.core.n.b.a
    public final int ol() {
        return 2;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String om() {
        return IAdLiveOfflineCompo.PACKAGE_NAME;
    }

    @Override // com.kwad.components.core.n.b.a
    public final String on() {
        return "3.3.43";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oo() {
        return "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/offline_components/adLive/ks_so-adLiveNoSoRelease-3.3.43-4992a00e76-289.zip";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String op() {
        return "3cfeb92a3396da35ca4ad07a40bd0e83";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String oq() {
        return "ks_live_ed677b1b2";
    }

    @Override // com.kwad.components.core.n.b.a
    public final String or() {
        return IAdLiveOfflineCompo.IMPL;
    }
}
