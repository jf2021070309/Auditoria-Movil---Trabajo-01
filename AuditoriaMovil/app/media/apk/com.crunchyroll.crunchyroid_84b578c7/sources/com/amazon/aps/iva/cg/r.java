package com.amazon.aps.iva.cg;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: DeepLinkModule.kt */
/* loaded from: classes.dex */
public final class r {
    public final e a;
    public final t b;

    public r(StartupActivity.b bVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, EtpContentService etpContentService, SubscriptionProcessorService subscriptionProcessorService, StartupActivity.c cVar) {
        e eVar = new e(com.amazon.aps.iva.ds.c.b);
        this.a = eVar;
        this.b = new t(bVar, new i(new g(etpContentService, subscriptionProcessorService), eVar, cVar, lifecycleCoroutineScopeImpl), eVar);
    }
}
