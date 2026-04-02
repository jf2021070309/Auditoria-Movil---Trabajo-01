package e.j.d.c0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.applinks.AppLinkData;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes2.dex */
public final class w {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e.j.d.i f8790b;

    /* loaded from: classes2.dex */
    public static final class a implements AppLinkData.CompletionHandler {
        public final /* synthetic */ i.a.j<AppLinkData> a;

        public a(i.a.j<? super AppLinkData> jVar) {
            this.a = jVar;
        }
    }

    public w(Context context) {
        h.o.c.j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
        this.f8790b = new e.j.d.i(context);
    }

    public final Object a(h.m.d<? super AppLinkData> dVar) {
        i.a.k kVar = new i.a.k(e.j.d.w.P(dVar), 1);
        kVar.p();
        AppLinkData.fetchDeferredAppLinkData(this.a, new a(kVar));
        Object o = kVar.o();
        if (o == h.m.h.a.COROUTINE_SUSPENDED) {
            h.o.c.j.e(dVar, "frame");
        }
        return o;
    }

    public final void b(AppLinkData appLinkData) {
        if (appLinkData != null) {
            FirebaseAnalytics.getInstance(this.a).f4729b.zzx("fb_install", c.i.a.e(new h.f("uri", String.valueOf(appLinkData.getTargetUri())), new h.f("promo", appLinkData.getPromotionCode())));
        }
    }
}
