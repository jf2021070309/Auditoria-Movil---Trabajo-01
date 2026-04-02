package com.amazon.aps.iva.kn;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.oe0.r;
import com.amazon.aps.iva.yb0.j;
import com.segment.analytics.Analytics;
import com.segment.analytics.ValueMap;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.TrackPayload;
/* compiled from: SingularIntegrationDelegate.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final a a = new a();

    /* compiled from: SingularIntegrationDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Integration.Factory {

        /* compiled from: SingularIntegrationDelegate.kt */
        /* renamed from: com.amazon.aps.iva.kn.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0449a extends com.amazon.aps.iva.af0.a {
            public final b a;

            public C0449a(ValueMap valueMap, Analytics analytics) {
                super(valueMap, analytics);
                this.a = new b(new c(this));
            }

            @Override // com.amazon.aps.iva.af0.a, com.segment.analytics.integrations.Integration
            public final void track(TrackPayload trackPayload) {
                j.f(trackPayload, "track");
                b bVar = this.a;
                bVar.getClass();
                if (bVar.b.contains(trackPayload.event())) {
                    TrackPayload build = trackPayload.toBuilder().build();
                    j.e(build, "track.toBuilder().build()");
                    TrackPayload trackPayload2 = build;
                    String event = trackPayload2.event();
                    j.e(event, "trackPayload.event()");
                    trackPayload2.put((TrackPayload) "event", r.Q0(32, event));
                    bVar.a.invoke(trackPayload2);
                }
            }
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public final Integration<?> create(ValueMap valueMap, Analytics analytics) {
            j.f(valueMap, "settings");
            j.f(analytics, "analytics");
            com.amazon.aps.iva.kn.a aVar = w.b;
            if (aVar != null) {
                if (aVar.a) {
                    valueMap = new ValueMap();
                }
                return new C0449a(valueMap, analytics);
            }
            j.m("instance");
            throw null;
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public final String key() {
            return "Singular";
        }
    }
}
