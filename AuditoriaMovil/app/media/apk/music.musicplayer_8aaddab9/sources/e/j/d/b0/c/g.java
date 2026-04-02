package e.j.d.b0.c;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentManager;
import c.b.c.l;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import e.j.d.b;
import e.j.d.b0.c.g;
import e.j.d.i;
import h.k;
import h.o.c.j;
import h.o.c.n;
import h.o.c.r;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g {
    public static final /* synthetic */ h.r.f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public final e.j.d.y.b f8580b;

    /* renamed from: c  reason: collision with root package name */
    public final i f8581c;

    /* renamed from: d  reason: collision with root package name */
    public final e.j.d.z.d f8582d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(c cVar, boolean z);
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ALL,
        VALIDATE_INTENT
    }

    /* loaded from: classes2.dex */
    public enum c {
        NONE,
        DIALOG,
        IN_APP_REVIEW
    }

    /* loaded from: classes2.dex */
    public static final class d implements a {
        public final /* synthetic */ h.o.b.a<k> a;

        public d(h.o.b.a<k> aVar) {
            this.a = aVar;
        }

        @Override // e.j.d.b0.c.g.a
        public void a(c cVar, boolean z) {
            j.e(cVar, "reviewUiShown");
            h.o.b.a<k> aVar = this.a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements a {
        public final /* synthetic */ h.o.b.a<k> a;

        public e(h.o.b.a<k> aVar) {
            this.a = aVar;
        }

        @Override // e.j.d.b0.c.g.a
        public void a(c cVar, boolean z) {
            j.e(cVar, "reviewUiShown");
            h.o.b.a<k> aVar = this.a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    static {
        n nVar = new n(g.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(r.a);
        a = new h.r.f[]{nVar};
    }

    public g(e.j.d.y.b bVar, i iVar) {
        j.e(bVar, "configuration");
        j.e(iVar, "preferences");
        this.f8580b = bVar;
        this.f8581c = iVar;
        this.f8582d = new e.j.d.z.d("PremiumHelper");
    }

    public final e.j.d.z.c a() {
        return this.f8582d.a(this, a[0]);
    }

    public final c b() {
        long longValue = ((Number) this.f8580b.f(e.j.d.y.b.f8880n)).longValue();
        int e2 = this.f8581c.e();
        e.j.d.z.c a2 = a();
        a2.g("Rate: shouldShowRateThisSession appStartCounter=" + e2 + ", startSession=" + longValue, new Object[0]);
        if (((long) e2) >= longValue) {
            b bVar = (b) this.f8580b.e(e.j.d.y.b.o);
            int e3 = this.f8581c.e();
            a().g(j.i("Rate: shouldShowRateOnAppStart rateMode=", bVar), new Object[0]);
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        a().g(j.i("Rate: shouldShowRateOnAppStart appStartCounter=", Integer.valueOf(e3)), new Object[0]);
                        String str = (String) this.f8581c.b("rate_intent", "");
                        a().g(j.i("Rate: shouldShowRateOnAppStart rateIntent=", str), new Object[0]);
                        if (!(str.length() == 0)) {
                            return j.a(str, "positive") ? c.IN_APP_REVIEW : j.a(str, "negative") ? c.NONE : c.NONE;
                        }
                        int i2 = this.f8581c.a.getInt("rate_session_number", 0);
                        a().g(j.i("Rate: shouldShowRateOnAppStart nextSession=", Integer.valueOf(i2)), new Object[0]);
                        return e3 >= i2 ? c.DIALOG : c.NONE;
                    }
                    throw new h.e();
                }
                return c.IN_APP_REVIEW;
            }
            return c.NONE;
        }
        return c.NONE;
    }

    public final void c(final Activity activity, final a aVar) {
        j.e(activity, "activity");
        int i2 = PlayCoreDialogWrapperActivity.a;
        e.d.b.d.a.f(activity.getPackageManager(), new ComponentName(activity.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        final e.d.b.e.a.e.a aVar2 = new e.d.b.e.a.e.a(new e.d.b.e.a.e.e(applicationContext));
        j.d(aVar2, "create(activity)");
        e.d.b.e.a.e.e eVar = aVar2.a;
        e.d.b.e.a.e.e.a.a(4, "requestInAppReview (%s)", new Object[]{eVar.f7020c});
        e.d.b.e.a.g.n nVar = new e.d.b.e.a.g.n();
        eVar.f7019b.b(new e.d.b.e.a.e.c(eVar, nVar, nVar));
        e.d.b.e.a.g.r<ResultT> rVar = nVar.a;
        j.d(rVar, "manager.requestReviewFlow()");
        rVar.f7033b.a(new e.d.b.e.a.g.g(e.d.b.e.a.g.e.a, new e.d.b.e.a.g.a() { // from class: e.j.d.b0.c.d
            @Override // e.d.b.e.a.g.a
            public final void a(e.d.b.e.a.g.r rVar2) {
                e.d.b.e.a.e.a aVar3 = e.d.b.e.a.e.a.this;
                Activity activity2 = activity;
                final g.a aVar4 = aVar;
                j.e(aVar3, "$manager");
                j.e(activity2, "$activity");
                j.e(rVar2, "response");
                if (!rVar2.e()) {
                    if (aVar4 == null) {
                        return;
                    }
                    aVar4.a(g.c.NONE, false);
                    return;
                }
                e.j.d.k.a.a().f8813j.m(b.a.IN_APP_REVIEW);
                Object d2 = rVar2.d();
                j.d(d2, "response.result");
                ReviewInfo reviewInfo = (ReviewInfo) d2;
                final long currentTimeMillis = System.currentTimeMillis();
                try {
                    e.d.b.e.a.g.r<Void> a2 = aVar3.a(activity2, reviewInfo);
                    j.d(a2, "manager.launchReviewFlow(activity, reviewInfo)");
                    e.d.b.e.a.g.a aVar5 = new e.d.b.e.a.g.a() { // from class: e.j.d.b0.c.e
                        @Override // e.d.b.e.a.g.a
                        public final void a(e.d.b.e.a.g.r rVar3) {
                            long j2 = currentTimeMillis;
                            g.a aVar6 = aVar4;
                            j.e(rVar3, "it");
                            g.c cVar = System.currentTimeMillis() - j2 > 2000 ? g.c.IN_APP_REVIEW : g.c.NONE;
                            if (aVar6 == null) {
                                return;
                            }
                            aVar6.a(cVar, false);
                        }
                    };
                    a2.f7033b.a(new e.d.b.e.a.g.g(e.d.b.e.a.g.e.a, aVar5));
                    a2.c();
                } catch (ActivityNotFoundException e2) {
                    n.a.a.f9946d.c(e2);
                    if (aVar4 == null) {
                        return;
                    }
                    aVar4.a(g.c.NONE, false);
                }
            }
        }));
        rVar.c();
    }

    public final void d(Activity activity, h.o.b.a<k> aVar) {
        j.e(activity, "activity");
        c(activity, new d(aVar));
    }

    public final void e(FragmentManager fragmentManager, int i2, boolean z, a aVar) {
        j.e(fragmentManager, "fm");
        j.e(fragmentManager, "fm");
        f fVar = new f();
        fVar.f8577b = aVar;
        fVar.setArguments(c.i.a.e(new h.f("theme", Integer.valueOf(i2)), new h.f("from_relaunch", Boolean.valueOf(z))));
        try {
            c.m.b.d dVar = new c.m.b.d(fragmentManager);
            dVar.d(0, fVar, "RATE_DIALOG", 1);
            dVar.g();
        } catch (IllegalStateException e2) {
            n.a.a.f9946d.d(e2, "Failed to show rate dialog", new Object[0]);
        }
    }

    public final void f(l lVar, int i2, boolean z, h.o.b.a<k> aVar) {
        j.e(lVar, "activity");
        e eVar = new e(aVar);
        c b2 = b();
        a().g(j.i("Rate: showRateUi=", b2), new Object[0]);
        int ordinal = b2.ordinal();
        if (ordinal == 0) {
            eVar.a(c.NONE, j.a((String) this.f8581c.b("rate_intent", ""), "negative"));
        } else if (ordinal == 1) {
            FragmentManager supportFragmentManager = lVar.getSupportFragmentManager();
            j.d(supportFragmentManager, "activity.supportFragmentManager");
            e(supportFragmentManager, i2, z, eVar);
        } else if (ordinal == 2) {
            c(lVar, eVar);
        }
        if (b2 != c.NONE) {
            i iVar = this.f8581c;
            SharedPreferences.Editor edit = iVar.a.edit();
            edit.putInt("rate_session_number", iVar.e() + 3);
            edit.apply();
        }
    }
}
