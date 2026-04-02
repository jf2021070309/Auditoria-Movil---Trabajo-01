package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
/* loaded from: classes.dex */
public class c extends b {
    public c(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            this.f3795c.b(this.f3796d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(this.f3794b.am().d(), webView, this.a.getOpenMeasurementContentUrl(), this.a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            this.f3795c.b(this.f3796d, "Failed to create ad session context", th);
            return null;
        }
    }
}
