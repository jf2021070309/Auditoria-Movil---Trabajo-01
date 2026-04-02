package com.amazon.aps.iva.rz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor;
/* compiled from: ServiceUnavailablePresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> {
    public final EtpServiceAvailabilityMonitor b;
    public final JwtInvalidator c;

    /* compiled from: ServiceUnavailablePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c.this.getView().closeScreen();
            return q.a;
        }
    }

    /* compiled from: ServiceUnavailablePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c.this.getView().o();
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, EtpServiceAvailabilityMonitor etpServiceAvailabilityMonitor, JwtInvalidator jwtInvalidator) {
        super(dVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(dVar, "view");
        this.b = etpServiceAvailabilityMonitor;
        this.c = jwtInvalidator;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a aVar = new a();
        b bVar = new b();
        this.b.observeServiceAvailability(getView(), aVar, bVar);
    }
}
