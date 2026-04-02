package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
/* loaded from: classes4.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    private static final String BREADCRUMB_NAME_KEY = "name";
    private static final String BREADCRUMB_PARAMS_KEY = "parameters";
    private static final String BREADCRUMB_PREFIX = "$A$:";
    private BreadcrumbHandler breadcrumbHandler;

    private static String serializeEvent(String str, Bundle bundle) throws b {
        c cVar = new c();
        c cVar2 = new c();
        for (String str2 : bundle.keySet()) {
            cVar2.put(str2, bundle.get(str2));
        }
        cVar.put("name", str);
        cVar.put(BREADCRUMB_PARAMS_KEY, cVar2);
        return cVar.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(String str, Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.breadcrumbHandler;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.handleBreadcrumb(BREADCRUMB_PREFIX + serializeEvent(str, bundle));
            } catch (b unused) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        this.breadcrumbHandler = breadcrumbHandler;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
