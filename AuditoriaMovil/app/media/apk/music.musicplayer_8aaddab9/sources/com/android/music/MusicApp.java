package com.android.music;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import c.i.g.h;
import c.p.j;
import c.p.o;
import c.p.y;
import ch.qos.logback.core.net.SyslogConstants;
import com.android.music.MusicApp;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.zipoapps.ads.config.AdManagerConfiguration;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import e.a.c.b7;
import e.a.c.g7;
import e.a.c.j6;
import e.a.c.p6;
import e.a.c.u6;
import e.a.c.y6;
import e.a.c.z6;
import e.b.a.a.k;
import e.d.d.m.i;
import e.h.d.b0;
import e.h.e.g;
import e.h.g.a1;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.l0;
import e.h.g.q0;
import e.h.g.s1;
import e.h.g.x0;
import e.j.a.b;
import e.j.d.b0.a.a;
import e.j.d.b0.c.g;
import e.j.d.j;
import e.j.d.y.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class MusicApp extends x0 implements o {
    public static long o;
    public static Handler p;
    public static final b0 q = new a();
    public static k r;
    public static boolean s;

    /* loaded from: classes.dex */
    public class a implements b0 {
        public String a() {
            return z6.E(R.string.musicbrowserlabel);
        }

        public Class<?> b() {
            return MediaPlaybackService.class;
        }

        public p6 c() {
            return new p6();
        }
    }

    /* loaded from: classes.dex */
    public class b implements s1.d {
        public b(MusicApp musicApp) {
        }

        public void a() {
            try {
                PackageInfo packageInfo = x0.f8405d.getPackageManager().getPackageInfo("music.musicplayer", 0);
                s1.b("Version: " + packageInfo.versionName + " - " + packageInfo.versionCode);
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                String upperCase = Build.DEVICE.toUpperCase();
                s1.b("Device: " + str2 + " (" + upperCase + ") by " + Build.MANUFACTURER + " on Android " + str);
                String property = System.getProperty("os.version");
                StringBuilder sb = new StringBuilder();
                sb.append("Version: ");
                sb.append(property);
                s1.b(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.b {
        public c(MusicApp musicApp) {
        }

        public boolean a() {
            return g7.a("ss", true);
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.b.a.a.y.a {
        @Override // e.b.a.a.y.a
        public void a(String str, Object... objArr) {
        }

        @Override // e.b.a.a.y.a
        public void b(String str, Object... objArr) {
        }

        @Override // e.b.a.a.y.a
        public void c(String str, Object... objArr) {
            s1.c(String.format(str, objArr));
        }

        @Override // e.b.a.a.y.a
        public void d(Throwable th, String str, Object... objArr) {
            s1.c(String.format(str, objArr));
            s1.l(th, true);
        }

        @Override // e.b.a.a.y.a
        public boolean isDebugEnabled() {
            return false;
        }
    }

    static {
        new HashSet();
        s = false;
    }

    public static void G() {
        x0 x0Var = x0.f8405d;
        Pattern.compile("^([A-Za-z]|[0-9]|_|-)+$");
        e.b.a.a.w.a aVar = new e.b.a.a.w.a(null);
        aVar.a = x0Var.getApplicationContext();
        aVar.f5388c = new d();
        aVar.f5391f = 1;
        aVar.f5390e = 3;
        aVar.f5389d = 3;
        aVar.f5387b = SyslogConstants.LOG_CLOCK;
        if (aVar.f5393h == null) {
            aVar.f5393h = new e.b.a.a.g();
        }
        if (aVar.f5392g == null) {
            aVar.f5392g = new e.b.a.a.a0.c(aVar.a);
        }
        if (aVar.f5394i == null) {
            aVar.f5394i = new e.b.a.a.c0.a();
        }
        r = new k(aVar);
    }

    @Override // e.h.g.x0
    public void A(Throwable th) {
        c.i.g.b.l(th);
    }

    @Override // e.h.g.x0
    public void D() {
    }

    public final void H() {
        j.a.a();
    }

    @SuppressLint({"InvalidPremiumHelperConfiguration"})
    public final void I() {
        AdManagerConfiguration build = new AdManagerConfiguration.Builder().bannerAd("ca-app-pub-1253592490151982/5513607634").interstitialAd("ca-app-pub-1253592490151982/1795903640").rewardedAd("ca-app-pub-1253592490151982/8806803626").nativeAd("ca-app-pub-1253592490151982/3288567846").exitNativeAd("ca-app-pub-1253592490151982/8278579182").exitBannerAd("ca-app-pub-1253592490151982/9783232544").build();
        PremiumHelperConfiguration.a aVar = new PremiumHelperConfiguration.a(false);
        aVar.d(MusicBrowserActivity.class);
        aVar.o(R.layout.activity_start_like_pro);
        aVar.h(R.layout.activity_relaunch_premium);
        aVar.g(R.layout.activity_relaunch_premium_one_time);
        aVar.c("audioplayer_premium_v1_100_trial_7d_yearly");
        aVar.f(g.b.VALIDATE_INTENT);
        aVar.a(build);
        aVar.n(true);
        aVar.k(1200L, b.EnumC0180b.GLOBAL);
        aVar.j(120L);
        aVar.p(getString(R.string.zipoapps_terms_conditions));
        aVar.e(getString(R.string.zipoapps_privacy_policy));
        aVar.m(true);
        aVar.l("com.jrtstudio.iSyncr", "com.jrtstudio.AnotherMusicPlayer.Unlocker", "ringtone.maker.pro", "jrtstudio.music.ad.blocker");
        aVar.i(e.j.d.y.b.p, a.EnumC0186a.IN_APP_REVIEW);
        b.a.C0193a c0193a = e.j.d.y.b.B;
        Boolean bool = Boolean.TRUE;
        aVar.i(c0193a, bool);
        aVar.i(e.j.d.y.b.D, bool);
        aVar.i(e.j.d.y.b.E, bool);
        aVar.i(e.j.d.y.b.s, Boolean.FALSE);
        e.j.d.k.g(this, aVar.b());
    }

    @Override // e.h.g.x0, c.s.b, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context.createConfigurationContext(u6.a(context, context.getResources().getConfiguration())));
    }

    @Override // e.h.g.x0
    public void g() {
        l0.g();
        l0.i(x0.f8405d, "music.musicplayer");
        l0.i(x0.f8405d, "Music");
        l0.i(x0.f8405d, "vprefs");
        l0.i(x0.f8405d, "lang");
    }

    @Override // e.h.g.x0, android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return "music.musicplayer";
    }

    @Override // e.h.g.x0
    public void i() {
        j0.h(new j0.c() { // from class: e.a.c.i6
            @Override // e.h.g.j0.c
            public final void a() {
                Objects.requireNonNull(MusicApp.this);
                e.h.g.x0.f8408g = true;
            }
        });
    }

    @Override // e.h.g.x0
    public void j() {
        i.a().a.j(Boolean.TRUE);
        c.i.g.b.a = true;
    }

    @Override // e.h.g.x0
    public boolean k() {
        try {
            if (j1.e()) {
                Thread.currentThread().setPriority(1);
                g7.i();
                boolean a2 = g7.a("ss", true);
                if (!j1.e()) {
                    e.d.d.g.f(x0.f8405d);
                }
                x0.C();
                e.h.e.g.k(a2, true);
                j0.c(new j0.b() { // from class: e.a.c.u2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        String language;
                        Handler handler = MusicApp.p;
                        boolean a3 = e.h.g.n1.a(e.h.g.x0.f8405d, "music.musicplayer");
                        HashMap hashMap = new HashMap();
                        hashMap.put("MultiJRTAppUser", String.valueOf(a3));
                        try {
                            if (e.h.g.v0.i()) {
                                LocaleList localeList = LocaleList.getDefault();
                                language = localeList.size() > 0 ? localeList.get(0).getLanguage() : "";
                            } else {
                                language = Locale.getDefault().getLanguage();
                            }
                            if (language != null && language.length() > 0) {
                                hashMap.put("lang", language);
                            }
                        } catch (Exception e2) {
                            c.i.g.b.l(e2);
                        }
                        e.h.e.g.i("AppStartUp", hashMap);
                        e.h.e.g.i("InterAvail", hashMap);
                        long b2 = e.h.e.g.b(false);
                        boolean z = b2 > 10;
                        boolean z2 = b2 > 50;
                        boolean z3 = b2 > 100;
                        String str = b2 > 1000 ? "1000+" : b2 > 100 ? "101-1000" : b2 > 10 ? "11-100" : b2 > 0 ? "1-10" : "0";
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("librarySize", str);
                        e.h.e.g.i("UpdatePrefs", hashMap2);
                        double log = (Math.log(b2) / Math.log(2.0d)) / 100.0d;
                        if (z) {
                            e.h.e.g.h("MoreThan10Songs", log, "USD");
                        }
                        if (z2) {
                            e.h.e.g.h("MoreThan50Songs", log, "USD");
                        }
                        if (z3) {
                            e.h.e.g.h("MoreThan100Songs", log, "USD");
                        }
                        if (b2 > 1000) {
                            e.h.e.g.h("MoreThan1000Songs", log, "USD");
                        }
                        if (g7.a("bg", false) && !g7.a("bh", false) && e.h.g.n1.b(e.h.g.x0.f8405d)) {
                            Object obj = n6.a;
                            e.h.e.g.g("RingtonePlayerAd_convert");
                            g7.j("bh", true);
                        }
                        if (g7.a("bi", false) && !g7.a("bj", false)) {
                            e.h.g.x0 x0Var = e.h.g.x0.f8405d;
                            if (e.h.g.j1.d(x0Var, "iTunes.Sync.Android", false) || e.h.g.j1.d(x0Var, "com.jrtstudio.iSyncrLite", false) || e.h.g.j1.d(x0Var, "com.jrtstudio.iSyncr", false) || e.h.g.j1.d(x0Var, "com.jrtstudio.iSyncr4Mac", false)) {
                                Object obj2 = n6.a;
                                e.h.e.g.g("iSyncrAd_convert");
                                g7.j("bj", true);
                            }
                        }
                        if (g7.a("bk", false) && !g7.a("bl", false) && e.h.g.j1.d(e.h.g.x0.f8405d, "com.jrtstudio.AnotherMusicPlayer", false)) {
                            Object obj3 = n6.a;
                            e.h.e.g.g("RocketPlayerAdSettings_convert");
                            g7.j("bl", true);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            s1.l(th, true);
        }
        return e.h.e.g.d();
    }

    @Override // e.h.g.x0
    public q0.b m() {
        return y6.f5215b;
    }

    @Override // e.h.g.x0
    public a1[] o() {
        return new a1[]{new a1("en", R.string.english), new a1("af", R.string.afrikaans), new a1("sq", R.string.albanian), new a1("am", R.string.amharic), new a1("ar", R.string.arabic), new a1("hy", R.string.armenian), new a1("as", R.string.assamese, true), new a1("az", R.string.azerbaijani), new a1("bn", R.string.bangla, true), new a1("eu", R.string.basque), new a1("be", R.string.belarusian), new a1("bs", R.string.bosnian), new a1("bg", R.string.bulgarian), new a1("my", R.string.burmese), new a1("ca", R.string.catalan), new a1("zh", R.string.chinese_cn, false), new a1("hr", R.string.croatian), new a1("cs", R.string.czech), new a1("da", R.string.danish), new a1("nl", R.string.dutch), new a1("et", R.string.estonian), new a1("fil", R.string.filipino), new a1("fi", R.string.finnish), new a1("fr", R.string.french), new a1("gl", R.string.galician), new a1("ka", R.string.georgian), new a1("de", R.string.german, true), new a1("el", R.string.greek), new a1("gu", R.string.gujarati, true), new a1("iw", R.string.hebrew), new a1("he", R.string.hebrew), new a1("hi", R.string.hindi, true), new a1("hu", R.string.hungarian), new a1("is", R.string.icelandic), new a1("in", R.string.indo), new a1(FacebookAdapter.KEY_ID, R.string.indo), new a1("it", R.string.italian), new a1("ja", R.string.japanese), new a1("kn", R.string.kannada, true), new a1("kk", R.string.kazakh), new a1("km", R.string.khmer), new a1("ko", R.string.korean), new a1("ky", R.string.kyrgyz), new a1("lo", R.string.lao), new a1("lv", R.string.latvian), new a1("lt", R.string.lithuanian), new a1("mk", R.string.macedonian), new a1("ms", R.string.malay), new a1("ml", R.string.malayalam, true), new a1("mr", R.string.marathi, true), new a1("mn", R.string.mongolian), new a1("ne", R.string.nepali), new a1("nb", R.string.norwegian), new a1("no", R.string.norwegian), new a1("or", R.string.odia, true), new a1("fa", R.string.persian), new a1("pl", R.string.polish), new a1("pt", R.string.portuguese), new a1("pa", R.string.punjabi, true), new a1("ro", R.string.romanian), new a1("rm", R.string.romansh), new a1("ru", R.string.russian), new a1("sr", R.string.serbian), new a1("si", R.string.sinhala, true), new a1("sk", R.string.slovak), new a1("sl", R.string.slovenian), new a1("es", R.string.spanish), new a1("sw", R.string.swahili), new a1("sv", R.string.swedish), new a1("ta", R.string.tamil, true), new a1("te", R.string.telugu, true), new a1("th", R.string.thai), new a1("tr", R.string.turkish), new a1("uk", R.string.ukrainian), new a1("ur", R.string.urdu, true), new a1("uz", R.string.uzbek), new a1("vi", R.string.vietnamese), new a1("zu", R.string.zulu)};
    }

    @Override // e.h.g.x0, android.app.Application
    public void onCreate() {
        super.onCreate();
        c.p.b0.a.f2438g.a(this);
        H();
        I();
        Handler handler = new Handler(getMainLooper());
        p = handler;
        o = handler.getLooper().getThread().getId();
        j0.e(new j0.b() { // from class: e.a.c.n0
            @Override // e.h.g.j0.b
            public final void a() {
                e.h.g.j1.e();
            }
        }, 1000);
        j0.e(new j0.b() { // from class: e.a.c.a
            @Override // e.h.g.j0.b
            public final void a() {
                g7.i();
            }
        }, 1000);
    }

    @y(j.a.ON_START)
    public void onMoveToForeground() {
        if (z6.G()) {
            h.y();
        }
    }

    @Override // e.h.g.x0
    public Locale p() {
        if (c.i.g.b.j()) {
            a1 g2 = c.i.g.b.g(x0.f8405d);
            for (a1 a1Var : a1.g(c.i.g.b.h(Resources.getSystem().getConfiguration()))) {
                if (a1Var.equals(g2)) {
                    return g2.e();
                }
            }
            return null;
        }
        return null;
    }

    @Override // e.h.g.x0
    public boolean r() {
        return true;
    }

    @Override // e.h.g.x0
    public s1.d s() {
        if (g7.g()) {
            return new b(this);
        }
        return null;
    }

    @Override // e.h.g.x0
    public boolean t(String str, String str2, Throwable th) {
        return true;
    }

    @Override // e.h.g.x0
    public void v() {
        c cVar = new c(this);
        if (e.h.e.g.f8234c == null) {
            e.h.e.g.f8234c = cVar;
        }
    }

    @Override // e.h.g.x0
    public void w() {
        c.i.g.b.f2071d = q;
        c.i.g.b.f2069b = new b7();
        c.i.g.b.f2072e = new j6();
        c.i.g.b.f2070c = new Handler(x0.f8405d.getMainLooper());
    }

    @Override // e.h.g.x0
    public void x() {
    }
}
