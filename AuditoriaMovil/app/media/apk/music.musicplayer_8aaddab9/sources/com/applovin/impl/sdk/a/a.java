package com.applovin.impl.sdk.a;

import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
/* loaded from: classes.dex */
public interface a {
    b getAdEventTracker();

    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}
