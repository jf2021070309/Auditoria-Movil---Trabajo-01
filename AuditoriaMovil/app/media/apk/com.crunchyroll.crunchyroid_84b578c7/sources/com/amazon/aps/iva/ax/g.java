package com.amazon.aps.iva.ax;

import android.app.Activity;
import android.content.Intent;
import com.amazon.aps.iva.f20.j;
import com.amazon.aps.iva.k50.i;
import com.ellation.crunchyroll.cast.dependencies.CastRouters;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: CastFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class g implements CastRouters {
    public final /* synthetic */ com.amazon.aps.iva.ph.a a;

    /* compiled from: CastFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.k50.g {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // com.amazon.aps.iva.k50.g
        public final void a() {
            SettingsBottomBarActivity.B.getClass();
            Activity activity = this.a;
            activity.startActivity(SettingsBottomBarActivity.a.a(activity, null));
            activity.finish();
        }
    }

    /* compiled from: CastFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b implements i {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // com.amazon.aps.iva.k50.i
        public final void a() {
            Activity activity = this.a;
            activity.startActivity(new Intent(activity, StartupActivity.class));
        }
    }

    public g(j jVar) {
        this.a = jVar;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastRouters
    public final com.amazon.aps.iva.k50.g createSettingsRouter(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        return new a(activity);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastRouters
    public final i createStartupRouter(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        return new b(activity);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastRouters
    public final com.amazon.aps.iva.k50.j createSubscriptionFlowRouter(com.amazon.aps.iva.k.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "activity");
        return this.a.b(cVar);
    }
}
