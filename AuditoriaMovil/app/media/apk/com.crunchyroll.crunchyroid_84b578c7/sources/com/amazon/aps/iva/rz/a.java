package com.amazon.aps.iva.rz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor;
/* compiled from: ServiceAvailabilityPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.rz.b> {
    public final EtpServiceAvailabilityMonitor b;

    /* compiled from: ServiceAvailabilityPresenter.kt */
    /* renamed from: com.amazon.aps.iva.rz.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0688a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public C0688a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.getView().Pa();
            return q.a;
        }
    }

    /* compiled from: ServiceAvailabilityPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            a.this.getView().R2();
            return q.a;
        }
    }

    public a(com.ellation.crunchyroll.presentation.availability.a aVar, EtpServiceAvailabilityMonitor etpServiceAvailabilityMonitor) {
        super(aVar, new j[0]);
        this.b = etpServiceAvailabilityMonitor;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        C0688a c0688a = new C0688a();
        b bVar = new b();
        this.b.observeServiceAvailability(getView(), c0688a, bVar);
    }
}
