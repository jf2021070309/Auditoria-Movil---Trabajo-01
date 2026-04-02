package com.braze.managers;

import android.content.Context;
import bo.app.b2;
import bo.app.n;
import bo.app.p1;
import bo.app.r1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumSet;
/* loaded from: classes.dex */
public final class a implements b2 {
    public static final b d = new b(null);
    private final r1 a;
    private final BrazeConfigurationProvider b;
    private n c;

    /* renamed from: com.braze.managers.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0937a extends l implements com.amazon.aps.iva.xb0.a {
        public static final C0937a b = new C0937a();

        public C0937a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "***Location API not found. Please include android-sdk-location module***";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: com.braze.managers.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0938a extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ d0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0938a(d0 d0Var) {
                super(0);
                this.b = d0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Using location providers: " + this.b.b;
            }
        }

        public /* synthetic */ b(e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.EnumSet] */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.util.EnumSet] */
        public final EnumSet a(BrazeConfigurationProvider brazeConfigurationProvider) {
            j.f(brazeConfigurationProvider, "appConfigurationProvider");
            d0 d0Var = new d0();
            d0Var.b = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
                d0Var.b = brazeConfigurationProvider.getCustomLocationProviderNames();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0938a(d0Var), 2, (Object) null);
            }
            T t = d0Var.b;
            j.e(t, "allowedLocationProviders");
            return (EnumSet) t;
        }

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l {
        public d() {
            super(1);
        }

        public final void a(IBrazeLocation iBrazeLocation) {
            j.f(iBrazeLocation, "it");
            a.this.a(iBrazeLocation);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IBrazeLocation) obj);
            return q.a;
        }
    }

    public a(Context context, r1 r1Var, BrazeConfigurationProvider brazeConfigurationProvider) {
        j.f(context, "context");
        j.f(r1Var, "brazeManager");
        j.f(brazeConfigurationProvider, "appConfigurationProvider");
        this.a = r1Var;
        this.b = brazeConfigurationProvider;
        n nVar = new n(context, d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.c = nVar;
        if (!nVar.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, C0937a.b, 2, (Object) null);
        }
    }

    public boolean a(IBrazeLocation iBrazeLocation) {
        j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
        try {
            p1 a = bo.app.j.h.a(iBrazeLocation);
            if (a != null) {
                this.a.a(a);
            }
            return true;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            return false;
        }
    }

    @Override // bo.app.b2
    public boolean a() {
        return this.c.a(new d());
    }
}
