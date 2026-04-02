package e.j.d.y;

import android.content.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import e.j.a.b;
import e.j.d.b0.a.a;
import e.j.d.b0.c.g;
import e.j.d.z.d;
import h.m.i.a.e;
import h.o.c.j;
import h.o.c.n;
import h.o.c.r;
import h.r.f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class b implements e.j.d.y.a {
    public static final a.c A;
    public static final a.C0193a B;
    public static final a.d C;
    public static final a.C0193a D;
    public static final a.C0193a E;
    public static final a.c F;
    public static final a.c G;
    public static final a.c H;
    public static final /* synthetic */ f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, String> f8868b;

    /* renamed from: c  reason: collision with root package name */
    public static final a.d f8869c;

    /* renamed from: d  reason: collision with root package name */
    public static final a.d f8870d;

    /* renamed from: e  reason: collision with root package name */
    public static final a.d f8871e;

    /* renamed from: f  reason: collision with root package name */
    public static final a.d f8872f;

    /* renamed from: g  reason: collision with root package name */
    public static final a.d f8873g;

    /* renamed from: h  reason: collision with root package name */
    public static final a.d f8874h;

    /* renamed from: i  reason: collision with root package name */
    public static final a.d f8875i;

    /* renamed from: j  reason: collision with root package name */
    public static final a.d f8876j;

    /* renamed from: k  reason: collision with root package name */
    public static final a.d f8877k;

    /* renamed from: l  reason: collision with root package name */
    public static final a.d f8878l;

    /* renamed from: m  reason: collision with root package name */
    public static final a.c f8879m;

    /* renamed from: n  reason: collision with root package name */
    public static final a.c f8880n;
    public static final a.C0194b<g.b> o;
    public static final a.C0194b<a.EnumC0186a> p;
    public static final a.d q;
    public static final a.d r;
    public static final a.C0193a s;
    public static final a.C0193a t;
    public static final a.C0193a u;
    public static final a.c v;
    public static final a.c w;
    public static final a.C0194b<b.EnumC0180b> x;
    public static final a.C0193a y;
    public static final a.C0193a z;
    public final e.j.d.y.d.a I;
    public final PremiumHelperConfiguration J;
    public final d K;
    public final e.j.d.y.c.a L;
    public final e.j.d.y.e.a M;
    public final e.j.d.y.a N;
    public final C0195b O;

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final T f8881b;

        /* renamed from: e.j.d.y.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0193a extends a<Boolean> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0193a(String str, boolean z) {
                super(str, Boolean.valueOf(z), null);
                j.e(str, Action.KEY_ATTRIBUTE);
            }
        }

        /* renamed from: e.j.d.y.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0194b<E extends Enum<E>> extends a<E> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0194b(String str, E e2) {
                super(str, e2, null);
                j.e(str, Action.KEY_ATTRIBUTE);
                j.e(e2, "default");
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a<Long> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, long j2) {
                super(str, Long.valueOf(j2), null);
                j.e(str, Action.KEY_ATTRIBUTE);
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends a<String> {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(java.lang.String r2, java.lang.String r3, int r4) {
                /*
                    r1 = this;
                    r3 = r4 & 2
                    r4 = 0
                    if (r3 == 0) goto L8
                    java.lang.String r3 = ""
                    goto L9
                L8:
                    r3 = r4
                L9:
                    java.lang.String r0 = "key"
                    h.o.c.j.e(r2, r0)
                    java.lang.String r0 = "default"
                    h.o.c.j.e(r3, r0)
                    r1.<init>(r2, r3, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.b.a.d.<init>(java.lang.String, java.lang.String, int):void");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Object obj, h.o.c.f fVar) {
            this.a = str;
            this.f8881b = obj;
            HashMap<String, String> hashMap = b.f8868b;
            String lowerCase = String.valueOf(obj).toLowerCase(Locale.ROOT);
            j.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            hashMap.put(str, lowerCase);
        }
    }

    /* renamed from: e.j.d.y.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0195b implements e.j.d.y.a {
        @Override // e.j.d.y.a
        public Map<String, String> a() {
            return b.f8868b;
        }

        @Override // e.j.d.y.a
        public <T> T b(String str, T t) {
            j.e(str, Action.KEY_ATTRIBUTE);
            return t;
        }

        @Override // e.j.d.y.a
        public boolean contains(String str) {
            j.e(str, Action.KEY_ATTRIBUTE);
            return true;
        }

        @Override // e.j.d.y.a
        public String name() {
            return "DEFAULT";
        }
    }

    @e(c = "com.zipoapps.premiumhelper.configuration.Configuration", f = "Configuration.kt", l = {159, 161}, m = "allValuesToString$premium_helper_regularRelease")
    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8882b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8883c;

        /* renamed from: d  reason: collision with root package name */
        public Object f8884d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f8885e;

        /* renamed from: g  reason: collision with root package name */
        public int f8887g;

        public c(h.m.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8885e = obj;
            this.f8887g |= Level.ALL_INT;
            return b.this.c(this);
        }
    }

    static {
        n nVar = new n(b.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(r.a);
        a = new f[]{nVar};
        f8868b = new HashMap<>();
        f8869c = new a.d("main_sku", null, 2);
        f8870d = new a.d("onetime_offer_sku", null, 2);
        f8871e = new a.d("onetime_offer_strikethrough_sku", null, 2);
        f8872f = new a.d("ad_unit_banner", null, 2);
        f8873g = new a.d("ad_unit_interstitial", null, 2);
        f8874h = new a.d("ad_unit_native", null, 2);
        f8875i = new a.d("ad_unit_rewarded", null, 2);
        f8876j = new a.d("ad_unit_banner_exit", null, 2);
        f8877k = new a.d("ad_unit_native_exit", null, 2);
        f8878l = new a.d("analytics_prefix", null, 2);
        f8879m = new a.c("onetime_start_session", 3L);
        f8880n = new a.c("rateus_session_start", 3L);
        o = new a.C0194b<>("rate_us_mode", g.b.VALIDATE_INTENT);
        p = new a.C0194b<>("happy_moment", a.EnumC0186a.DEFAULT);
        q = new a.d("terms_url", null, 2);
        r = new a.d("privacy_url", null, 2);
        s = new a.C0193a("show_interstitial_onboarding_basic", true);
        t = new a.C0193a("show_relaunch_on_resume", true);
        u = new a.C0193a("show_ad_on_app_exit", false);
        v = new a.c("happy_moment_capping_seconds", 0L);
        w = new a.c("interstitial_capping_seconds", 0L);
        x = new a.C0194b<>("interstitial_capping_type", b.EnumC0180b.SESSION);
        y = new a.C0193a("show_trial_on_cta", false);
        z = new a.C0193a("toto_enabled", true);
        A = new a.c("toto_capping_hours", 24L);
        B = new a.C0193a("interstitial_muted", false);
        C = new a.d("premium_packages", null, 2);
        D = new a.C0193a("disable_relaunch_premium_offering", false);
        E = new a.C0193a("disable_onboarding_premium_offering", false);
        F = new a.c("onboarding_layout_variant", 0L);
        G = new a.c("relaunch_layout_variant", 0L);
        H = new a.c("relaunch_onetime_layout_variant", 0L);
    }

    public b(Context context, e.j.d.y.d.a aVar, PremiumHelperConfiguration premiumHelperConfiguration) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(aVar, "remoteConfig");
        j.e(premiumHelperConfiguration, "appConfig");
        this.I = aVar;
        this.J = premiumHelperConfiguration;
        this.K = new d("PremiumHelper");
        this.L = new e.j.d.y.c.a();
        this.M = new e.j.d.y.e.a(context);
        this.N = premiumHelperConfiguration.repository();
        this.O = new C0195b();
    }

    @Override // e.j.d.y.a
    public Map<String, String> a() {
        return f8868b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.j.d.y.a
    public <T> T b(String str, T t2) {
        j.e(str, Action.KEY_ATTRIBUTE);
        e.j.d.y.a g2 = g(str);
        Object b2 = g2.b(str, t2);
        if (b2 != 0) {
            t2 = b2;
        }
        e.j.d.z.c a2 = this.K.a(this, a[0]);
        a2.a("[PH CONFIGURATION] " + str + " = " + t2 + " from [" + g2.name() + ']', new Object[0]);
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.m.d<? super java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.y.b.c(h.m.d):java.lang.Object");
    }

    @Override // e.j.d.y.a
    public boolean contains(String str) {
        j.e(str, Action.KEY_ATTRIBUTE);
        return !(g(str) instanceof C0195b);
    }

    public final int d(int[] iArr, a.c cVar) {
        int longValue = (int) ((Number) f(cVar)).longValue();
        return longValue < iArr.length ? iArr[longValue] : iArr[0];
    }

    public final <T extends Enum<T>> T e(a.C0194b<T> c0194b) {
        j.e(c0194b, "param");
        String str = (String) b(c0194b.a, ((Enum) c0194b.f8881b).name());
        try {
            Class<?> cls = c0194b.f8881b.getClass();
            String upperCase = str.toUpperCase(Locale.ROOT);
            j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            T t2 = (T) Enum.valueOf(cls, upperCase);
            j.d(t2, "{\n            java.lang.…ue.uppercase())\n        }");
            return t2;
        } catch (IllegalArgumentException unused) {
            StringBuilder y2 = e.a.d.a.a.y("Invalid remote value for for '");
            y2.append((Object) a.C0194b.class.getSimpleName());
            y2.append("': ");
            y2.append(str);
            n.a.a.f9946d.b(y2.toString(), new Object[0]);
            return (T) c0194b.f8881b;
        }
    }

    public final <T> T f(a<T> aVar) {
        j.e(aVar, "param");
        return (T) b(aVar.a, aVar.f8881b);
    }

    public final e.j.d.y.a g(String str) {
        e.j.d.y.a aVar;
        if (j() && this.L.contains(str)) {
            return this.L;
        }
        if (j() && this.L.contains(z.a)) {
            aVar = this.L;
        } else {
            e.j.d.y.d.a aVar2 = this.I;
            a.C0193a c0193a = z;
            aVar = aVar2.contains(c0193a.a) ? this.I : this.N.contains(c0193a.a) ? this.N : this.O;
        }
        a.C0193a c0193a2 = z;
        return (((Boolean) aVar.b(c0193a2.a, c0193a2.f8881b)).booleanValue() && this.M.contains(str)) ? this.M : this.I.contains(str) ? this.I : this.N.contains(str) ? this.N : this.O;
    }

    public final int h() {
        if (!(this.J.getRelaunchPremiumActivityLayout().length == 0)) {
            return d(this.J.getRelaunchPremiumActivityLayout(), G);
        }
        if (j() && this.J.getUseTestLayouts()) {
            return R.layout.ph_sample_activity_relaunch;
        }
        return 0;
    }

    public final int i() {
        if (!(this.J.getRelaunchOneTimeActivityLayout().length == 0)) {
            return d(this.J.getRelaunchOneTimeActivityLayout(), H);
        }
        if (j() && this.J.getUseTestLayouts()) {
            return R.layout.ph_sample_activity_relaunch_one_time;
        }
        return 0;
    }

    public final boolean j() {
        return this.J.isDebugMode();
    }

    @Override // e.j.d.y.a
    public String name() {
        return "Premium Helper";
    }
}
