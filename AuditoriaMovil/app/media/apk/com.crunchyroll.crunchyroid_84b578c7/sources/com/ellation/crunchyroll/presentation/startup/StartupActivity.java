package com.ellation.crunchyroll.presentation.startup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cg.r;
import com.amazon.aps.iva.cg.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mh.a;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.us.z;
import com.amazon.aps.iva.x40.g;
import com.amazon.aps.iva.x40.h;
import com.amazon.aps.iva.x40.o;
import com.amazon.aps.iva.x40.q;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ys.p;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.downloads.activity.DownloadsActivity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import hm.mod.update.up;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: StartupActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/startup/StartupActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/x40/c;", "Lcom/amazon/aps/iva/x40/q;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class StartupActivity extends com.amazon.aps.iva.i60.b implements com.amazon.aps.iva.x40.c, q {
    public static final /* synthetic */ int r = 0;
    public ViewGroup k;
    public final m l = com.amazon.aps.iva.kb0.f.b(new a());
    public final g m;
    public final r n;
    public final s o;
    public final m p;
    public final int q;

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.x40.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.x40.a invoke() {
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                v a = aVar.a();
                StartupActivity startupActivity = StartupActivity.this;
                j.f(startupActivity, "view");
                j.f(a, "appConfigLiveData");
                return new com.amazon.aps.iva.x40.b(startupActivity, a);
            }
            j.m("instance");
            throw null;
        }
    }

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<Intent> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Intent invoke() {
            Intent intent = StartupActivity.this.getIntent();
            j.e(intent, "intent");
            return intent;
        }
    }

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<String, Boolean> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
            if (r2.equals("crunchyroll.google.fanpack.monthly") == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r2.equals("crunchyroll.google.premium.monthly") == false) goto L14;
         */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r0 = "activeSku"
                com.amazon.aps.iva.yb0.j.f(r2, r0)
                int r0 = r2.hashCode()
                switch(r0) {
                    case -1666493765: goto L21;
                    case -1574954394: goto L18;
                    case -447375682: goto L12;
                    case 1568935424: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L2c
            Lf:
                java.lang.String r0 = "crunchyroll.google.superfanpack.monthly"
                goto L14
            L12:
                java.lang.String r0 = "crunchyroll.google.fanpack.annually"
            L14:
                r2.equals(r0)
                goto L2c
            L18:
                java.lang.String r0 = "crunchyroll.google.premium.monthly"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2a
                goto L2c
            L21:
                java.lang.String r0 = "crunchyroll.google.fanpack.monthly"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2a
                goto L2c
            L2a:
                r2 = 1
                goto L2d
            L2c:
                r2 = 0
            L2d:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.startup.StartupActivity.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d(h hVar) {
            super(0, hVar, h.class, "onUserAcceptedUpdatedTerms", "onUserAcceptedUpdatedTerms()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((h) this.receiver).O4();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e(h hVar) {
            super(0, hVar, h.class, "onTermsUpdatedDialogCancelledByUser", "onTermsUpdatedDialogCancelledByUser()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((h) this.receiver).X4();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: StartupActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<h> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            ApplicationInfo applicationInfo;
            PackageManager.ApplicationInfoFlags of;
            StartupActivity startupActivity = StartupActivity.this;
            s sVar = startupActivity.o;
            CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
            com.amazon.aps.iva.uy.a.a.getClass();
            com.amazon.aps.iva.o60.i iVar = com.amazon.aps.iva.uy.a.c;
            if (iVar != null) {
                CrunchyrollApplication b2 = com.ellation.crunchyroll.application.e.b();
                if (q.a.a == null) {
                    q.a.a = new com.amazon.aps.iva.x50.r(b2);
                }
                com.amazon.aps.iva.x50.r rVar = q.a.a;
                j.c(rVar);
                com.amazon.aps.iva.cg.e eVar = startupActivity.n.a;
                com.ellation.crunchyroll.presentation.startup.a aVar = new com.ellation.crunchyroll.presentation.startup.a(startupActivity);
                com.amazon.aps.iva.s40.h hVar = new com.amazon.aps.iva.s40.h(new com.amazon.aps.iva.u40.a(), new com.amazon.aps.iva.s40.a(new com.crunchyroll.auth.c(false, false, null, null, false, 15)), aVar);
                com.ellation.crunchyroll.presentation.startup.b bVar = new com.ellation.crunchyroll.presentation.startup.b(startupActivity);
                com.amazon.aps.iva.s40.h hVar2 = new com.amazon.aps.iva.s40.h(new com.ellation.crunchyroll.presentation.signing.signup.a(), new com.amazon.aps.iva.s40.b(new com.crunchyroll.auth.c(false, false, null, null, true, 15)), bVar);
                com.amazon.aps.iva.ho.d b3 = ((d0) com.ellation.crunchyroll.application.e.a()).q.b(startupActivity, null);
                AccountStateProvider accountStateProvider = com.ellation.crunchyroll.application.e.c().getAccountStateProvider();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = startupActivity.getPackageManager();
                    String packageName = startupActivity.getPackageName();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = startupActivity.getPackageManager().getApplicationInfo(startupActivity.getPackageName(), 128);
                }
                Set<String> keySet = applicationInfo.metaData.keySet();
                j.e(keySet, "if (Build.VERSION.SDK_IN…      }.metaData.keySet()");
                com.amazon.aps.iva.x40.e eVar2 = new com.amazon.aps.iva.x40.e(keySet);
                UserTokenInteractor userTokenInteractor = com.ellation.crunchyroll.application.e.c().getUserTokenInteractor();
                p f = com.ellation.crunchyroll.application.e.b().f();
                z zVar = w.a.a;
                CrunchyrollApplication b4 = com.ellation.crunchyroll.application.e.b();
                com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                if (aVar2 != null) {
                    Object c = aVar2.c().c(com.amazon.aps.iva.cx.r.class, "terms_of_service");
                    if (c != null) {
                        com.amazon.aps.iva.mh.b a = a.C0516a.a(b4, (com.amazon.aps.iva.cx.r) c);
                        j.f(sVar, "deeplinkProvider");
                        g gVar = startupActivity.m;
                        j.f(gVar, "analytics");
                        j.f(eVar, "deepLinkAnalytics");
                        j.f(userTokenInteractor, "userTokenInteractor");
                        j.f(accountStateProvider, "accountStateProvider");
                        j.f(zVar, "userSessionAnalytics");
                        return new o(eVar, sVar, a, b3, zVar, accountStateProvider, userTokenInteractor, b, f, hVar, hVar2, eVar2, gVar, startupActivity, rVar, iVar);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.TermsOfServiceConfigImpl");
                }
                j.m("instance");
                throw null;
            }
            j.m("translationsSynchronizer");
            throw null;
        }
    }

    public StartupActivity() {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.m = new g();
        b bVar = new b();
        LifecycleCoroutineScopeImpl O = x.O(this);
        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        SubscriptionProcessorService subscriptionProcessorService = com.ellation.crunchyroll.application.e.c().getSubscriptionProcessorService();
        j.f(etpContentService, "contentService");
        j.f(subscriptionProcessorService, "subscriptionProcessorService");
        c cVar2 = c.h;
        j.f(cVar2, "isUpgradable");
        r rVar = new r(bVar, O, etpContentService, subscriptionProcessorService, cVar2);
        this.n = rVar;
        this.o = rVar.b;
        this.p = com.amazon.aps.iva.kb0.f.b(new f());
        this.q = R.layout.splash_screen;
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void A() {
        HomeBottomBarActivity.x.getClass();
        HomeBottomBarActivity.a.a(this);
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void Cc() {
        com.ellation.crunchyroll.application.e.a().f().a(this);
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void W9() {
        com.amazon.aps.iva.y40.d dVar = new com.amazon.aps.iva.y40.d(this, this);
        d dVar2 = new d(mi());
        final e eVar = new e(mi());
        Context context = dVar.b;
        String string = context.getString(R.string.terms_updated_text, context.getString(R.string.terms_updated_replacement_updated_terms), context.getString(R.string.terms_of_use_link_text));
        j.e(string, "context.getString(\n     …_use_link_text)\n        )");
        String string2 = context.getString(R.string.terms_updated_replacement_updated_terms);
        j.e(string2, "context.getString(R.stri…eplacement_updated_terms)");
        com.amazon.aps.iva.xw.p pVar = new com.amazon.aps.iva.xw.p(string2, new com.amazon.aps.iva.y40.b(dVar), false);
        String string3 = context.getString(R.string.terms_of_use_link_text);
        j.e(string3, "context.getString(R.string.terms_of_use_link_text)");
        SpannableString g = m0.g(string, pVar, new com.amazon.aps.iva.xw.p(string3, new com.amazon.aps.iva.y40.c(dVar), false));
        TextView textView = (TextView) new MaterialAlertDialogBuilder(context).setTitle(R.string.terms_updated_title).setMessage((CharSequence) g).setPositiveButton(R.string.acknowledge, (DialogInterface.OnClickListener) new com.amazon.aps.iva.tl.j(dVar2, 1)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.amazon.aps.iva.y40.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.amazon.aps.iva.xb0.a aVar = eVar;
                j.f(aVar, "$onCancel");
                aVar.invoke();
            }
        }).show().findViewById(16908299);
        if (textView != null) {
            r0.b(textView, g);
        }
    }

    @Override // com.amazon.aps.iva.x40.c
    public final void Y7() {
        com.ellation.crunchyroll.mvp.lifecycle.a.a(mi(), this);
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void dg(o.a aVar) {
        AnimationUtil animationUtil = AnimationUtil.INSTANCE;
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            Interpolator b2 = com.amazon.aps.iva.r3.a.b(0.5f, 0.0f, 0.25f, 1.0f);
            j.e(b2, "create(0.5f, 0f, 0.25f, 1f)");
            animationUtil.fadeOut(viewGroup, 200L, b2, aVar);
            return;
        }
        j.m("container");
        throw null;
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.q);
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void mc() {
        DownloadsActivity.o.getClass();
        startActivity(new Intent(this, DownloadsActivity.class));
    }

    public final h mi() {
        return (h) this.p.getValue();
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void n0() {
        startActivity(new Intent(this, AcceptTermsAndPrivacyPolicyActivity.class));
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void ph() {
        View inflate = getLayoutInflater().inflate(R.layout.layout_error_startup, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(viewGroup.getContext(), R.color.black));
            viewGroup.addView(inflate);
            ViewGroup viewGroup2 = this.k;
            if (viewGroup2 != null) {
                this.e = viewGroup2.findViewById(R.id.progress);
                ViewGroup viewGroup3 = this.k;
                if (viewGroup3 != null) {
                    viewGroup3.findViewById(R.id.retry_text).setOnClickListener(new com.amazon.aps.iva.c8.s(this, 23));
                    ViewGroup viewGroup4 = this.k;
                    if (viewGroup4 != null) {
                        View findViewById = viewGroup4.findViewById(R.id.button_offline_viewing);
                        j.e(findViewById, "container.findViewById(R…d.button_offline_viewing)");
                        findViewById.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 22));
                        return;
                    }
                    j.m("container");
                    throw null;
                }
                j.m("container");
                throw null;
            }
            j.m("container");
            throw null;
        }
        j.m("container");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.x40.a> setupPresenters() {
        return l1.H((com.amazon.aps.iva.x40.a) this.l.getValue());
    }

    @Override // com.amazon.aps.iva.x40.q
    public final void zh(boolean z) {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.setEnabled(z);
            viewGroup.setClickable(z);
            return;
        }
        j.m("container");
        throw null;
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        up.process(this);
        setTheme(R.style.TransparentStatusBar);
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.d(this, true);
        View findViewById = findViewById(R.id.splash_screen_container);
        j.e(findViewById, "findViewById(R.id.splash_screen_container)");
        this.k = (ViewGroup) findViewById;
        if (getIntent().getExtras() != null) {
            com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.amazon.aps.iva.c8.r(this, 18));
            androidx.lifecycle.g lifecycle = getLifecycle();
            j.e(lifecycle, "this.lifecycle");
            d.a.a(this, lifecycle).a(mi());
            Intent intent = getIntent();
            j.e(intent, "intent");
            ((d0) com.ellation.crunchyroll.application.e.a()).t.a(intent);
            ((d0) com.ellation.crunchyroll.application.e.a()).u.b.c();
            return;
        }
        j.m("container");
        throw null;
    }
}
