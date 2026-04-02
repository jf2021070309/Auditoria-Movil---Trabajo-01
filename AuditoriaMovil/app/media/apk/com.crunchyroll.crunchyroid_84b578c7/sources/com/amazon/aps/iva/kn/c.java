package com.amazon.aps.iva.kn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kn.d;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.segment.analytics.integrations.TrackPayload;
/* compiled from: SingularIntegrationDelegate.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<TrackPayload, q> {
    public final /* synthetic */ d.a.C0449a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d.a.C0449a c0449a) {
        super(1);
        this.h = c0449a;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(TrackPayload trackPayload) {
        TrackPayload trackPayload2 = trackPayload;
        j.f(trackPayload2, "trackPayload");
        super/*com.amazon.aps.iva.af0.a*/.track(trackPayload2);
        return q.a;
    }
}
