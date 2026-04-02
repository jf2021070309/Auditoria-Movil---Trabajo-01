package com.ellation.crunchyroll.presentation.availability;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import com.amazon.aps.iva.e.m;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.rz.c;
import com.amazon.aps.iva.rz.d;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor;
import com.ellation.crunchyroll.application.e;
import com.google.android.gms.ads.AdRequest;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ServiceUnavailableActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/availability/ServiceUnavailableActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/rz/d;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ServiceUnavailableActivity extends com.amazon.aps.iva.i60.b implements d {
    public final v k = g.d(this, 16908290);
    public final v l = g.d(this, R.id.service_availability_progress);
    public final c m;
    public final int n;
    public static final /* synthetic */ l<Object>[] p = {q.a(ServiceUnavailableActivity.class, "container", "getContainer()Landroid/view/View;", 0), q.a(ServiceUnavailableActivity.class, "serviceAvailabilityProgress", "getServiceAvailabilityProgress()Landroid/view/View;", 0)};
    public static final a o = new a();

    /* compiled from: ServiceUnavailableActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: ServiceUnavailableActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m mVar) {
            j.f(mVar, "$this$onBackPressedCallback");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public ServiceUnavailableActivity() {
        EtpServiceAvailabilityMonitor etpServiceMonitor = e.c().getEtpServiceMonitor();
        JwtInvalidator jwtInvalidator = e.c().getJwtInvalidator();
        j.f(etpServiceMonitor, "serviceMonitor");
        j.f(jwtInvalidator, "jwtInvalidator");
        this.m = new c(this, etpServiceMonitor, jwtInvalidator);
        this.n = R.layout.activity_service_unavailable;
    }

    @Override // com.amazon.aps.iva.rz.d
    public final void j() {
        ((View) this.l.getValue(this, p[1])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.n);
    }

    @Override // com.amazon.aps.iva.rz.d
    public final void o() {
        ((View) this.l.getValue(this, p[1])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.TransparentStatusBar);
        super.onCreate(bundle);
        ((View) this.k.getValue(this, p[0])).setOnClickListener(new com.amazon.aps.iva.ne.a(this, 15));
        getWindow().setFlags(AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        com.amazon.aps.iva.xw.a b2 = com.amazon.aps.iva.xw.b.b(this, b.h);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.b(b2);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<Object> setupPresenters() {
        return l1.H(this.m);
    }
}
