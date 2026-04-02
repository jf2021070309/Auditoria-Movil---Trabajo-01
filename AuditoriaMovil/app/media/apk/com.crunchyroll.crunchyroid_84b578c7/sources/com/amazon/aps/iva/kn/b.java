package com.amazon.aps.iva.kn;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.segment.analytics.integrations.TrackPayload;
import java.util.List;
/* compiled from: SingularIntegrationDelegate.kt */
/* loaded from: classes2.dex */
public final class b {
    public final l<TrackPayload, q> a;
    public final List<String> b = f1.K("Application Installed", "Application Opened", "Registration Succeeded", "Mobile Acquisition Flow Completed", "Video Play Requested");

    public b(c cVar) {
        this.a = cVar;
    }
}
