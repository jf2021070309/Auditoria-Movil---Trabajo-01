package e.j.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.zipoapps.ads.config.PHAdSize;
import e.j.d.c0.a0;
import e.j.d.w;
import h.o.b.p;
import h.o.c.n;
import i.a.c0;
import i.a.e0;
import i.a.g1;
import i.a.h2.r;
import i.a.h2.t;
import i.a.o0;
import i.a.p1;
import i.a.z0;
import java.util.HashMap;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ h.r.f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f8432b;

    /* renamed from: c  reason: collision with root package name */
    public final e.j.d.z.d f8433c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, g1> f8434d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.h2.k<a0<InterstitialAd>> f8435e;

    /* renamed from: f  reason: collision with root package name */
    public final r<a0<InterstitialAd>> f8436f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.h2.k<a0<RewardedAd>> f8437g;

    /* renamed from: h  reason: collision with root package name */
    public final r<a0<RewardedAd>> f8438h;

    /* renamed from: i  reason: collision with root package name */
    public final e.j.a.o.f f8439i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8440j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a.g2.f<NativeAd> f8441k;

    /* loaded from: classes2.dex */
    public enum a {
        INTERSTITIAL,
        BANNER,
        NATIVE,
        REWARDED
    }

    /* renamed from: e.j.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0180b {
        SESSION,
        GLOBAL
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {508}, m = "loadAndGetNativeAd")
    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8442b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f8443c;

        /* renamed from: e  reason: collision with root package name */
        public int f8445e;

        public c(h.m.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8443c = obj;
            this.f8445e |= Level.ALL_INT;
            return b.this.c(false, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadAndGetNativeAd$2$1", f = "AdManager.kt", l = {373}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f8446b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f8447c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i.a.j<a0<? extends NativeAd>> f8448d;

        /* loaded from: classes2.dex */
        public static final class a extends AdListener {
            public final /* synthetic */ i.a.j<a0<? extends NativeAd>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(i.a.j<? super a0<? extends NativeAd>> jVar) {
                this.a = jVar;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                h.o.c.j.e(loadAdError, "error");
                this.a.resumeWith(new a0.b(new IllegalStateException(loadAdError.getMessage())));
            }
        }

        /* renamed from: e.j.a.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0181b implements NativeAd.OnNativeAdLoadedListener {
            public final /* synthetic */ i.a.j<a0<? extends NativeAd>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0181b(i.a.j<? super a0<? extends NativeAd>> jVar) {
                this.a = jVar;
            }

            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                if (this.a.a()) {
                    this.a.resumeWith(new a0.c(nativeAd));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, b bVar, i.a.j<? super a0<? extends NativeAd>> jVar, h.m.d<? super d> dVar) {
            super(2, dVar);
            this.f8446b = str;
            this.f8447c = bVar;
            this.f8448d = jVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new d(this.f8446b, this.f8447c, this.f8448d, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new d(this.f8446b, this.f8447c, this.f8448d, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                e.j.a.n.h hVar = new e.j.a.n.h(this.f8446b);
                Application application = this.f8447c.f8432b;
                a aVar2 = new a(this.f8448d);
                C0181b c0181b = new C0181b(this.f8448d);
                this.a = 1;
                i.a.k kVar = new i.a.k(w.P(this), 1);
                kVar.p();
                try {
                    new AdLoader.Builder(application, hVar.a).forNativeAd(new e.j.a.n.f(c0181b, hVar)).withAdListener(new e.j.a.n.g(kVar, aVar2)).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setRequestMultipleImages(true).build()).build();
                    new AdRequest.Builder().build();
                } catch (Exception e2) {
                    if (kVar.a()) {
                        kVar.resumeWith(new a0.b(e2));
                    }
                }
                Object o = kVar.o();
                if (o == h.m.h.a.COROUTINE_SUSPENDED) {
                    h.o.c.j.e(this, "frame");
                }
                if (o == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return h.k.a;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {306}, m = "loadBanner")
    /* loaded from: classes2.dex */
    public static final class e extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8449b;

        /* renamed from: d  reason: collision with root package name */
        public int f8451d;

        public e(h.m.d<? super e> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8449b = obj;
            this.f8451d |= Level.ALL_INT;
            return b.this.d(null, null, false, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadBanner$result$1", f = "AdManager.kt", l = {310}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends h.m.i.a.h implements p<e0, h.m.d<? super a0<? extends View>>, Object> {
        public int a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f8453c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PHAdSize f8454d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AdListener f8455e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, PHAdSize pHAdSize, AdListener adListener, h.m.d<? super f> dVar) {
            super(2, dVar);
            this.f8453c = z;
            this.f8454d = pHAdSize;
            this.f8455e = adListener;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new f(this.f8453c, this.f8454d, this.f8455e, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super a0<? extends View>> dVar) {
            return new f(this.f8453c, this.f8454d, this.f8455e, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                b bVar = b.this;
                a aVar2 = a.BANNER;
                boolean z = this.f8453c;
                h.r.f<Object>[] fVarArr = b.a;
                String a = bVar.a(aVar2, z);
                e.j.d.z.c b2 = b.this.b();
                StringBuilder B = e.a.d.a.a.B("AdManager: Loading banner ad: (", a, ", ");
                B.append(this.f8453c);
                B.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                b2.a(B.toString(), new Object[0]);
                h.o.c.j.e(a, "adUnitId");
                Application application = b.this.f8432b;
                PHAdSize pHAdSize = this.f8454d;
                AdListener adListener = this.f8455e;
                this.a = 1;
                i.a.k kVar = new i.a.k(w.P(this), 1);
                kVar.p();
                try {
                    AdView adView = new AdView(application);
                    AdSize asAdSize = pHAdSize == null ? null : pHAdSize.asAdSize(application);
                    if (asAdSize == null) {
                        asAdSize = AdSize.BANNER;
                    }
                    adView.setAdSize(asAdSize);
                    adView.setAdUnitId(a);
                    adView.setOnPaidEventListener(new e.j.a.n.a(adView));
                    adView.setAdListener(new e.j.a.n.b(adListener, kVar, adView));
                    new AdRequest.Builder().build();
                } catch (Exception e2) {
                    if (kVar.a()) {
                        kVar.resumeWith(new a0.b(e2));
                    }
                }
                obj = kVar.o();
                if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                    h.o.c.j.e(this, "frame");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return obj;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadInterstitial$1", f = "AdManager.kt", l = {108, 119}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
        public int a;

        @h.m.i.a.e(c = "com.zipoapps.ads.AdManager$loadInterstitial$1$result$1", f = "AdManager.kt", l = {SyslogConstants.LOG_ALERT}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements p<e0, h.m.d<? super a0<? extends InterstitialAd>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ b f8457b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.f8457b = bVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new a(this.f8457b, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super a0<? extends InterstitialAd>> dVar) {
                return new a(this.f8457b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    b bVar = this.f8457b;
                    a aVar2 = a.INTERSTITIAL;
                    h.r.f<Object>[] fVarArr = b.a;
                    String a = bVar.a(aVar2, false);
                    e.j.d.z.c b2 = this.f8457b.b();
                    b2.a("AdManager: Loading interstitial ad: (" + a + CoreConstants.RIGHT_PARENTHESIS_CHAR, new Object[0]);
                    e.j.a.n.e eVar = new e.j.a.n.e(a);
                    Application application = this.f8457b.f8432b;
                    this.a = 1;
                    i.a.k kVar = new i.a.k(w.P(this), 1);
                    kVar.p();
                    try {
                        InterstitialAd.load(application, eVar.a, new AdRequest.Builder().build(), new e.j.a.n.d(kVar, eVar));
                    } catch (Exception e2) {
                        if (kVar.a()) {
                            kVar.resumeWith(new a0.b(e2));
                        }
                    }
                    obj = kVar.o();
                    if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                        h.o.c.j.e(this, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                return obj;
            }
        }

        public g(h.m.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new g(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new g(dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            a0<InterstitialAd> bVar;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            try {
            } catch (Exception e2) {
                b bVar2 = b.this;
                h.r.f<Object>[] fVarArr = b.a;
                bVar2.b().k(6, e2, "AdManager: Failed to load interstitial ad", new Object[0]);
                bVar = new a0.b(e2);
            }
            if (i2 == 0) {
                w.E0(obj);
                c0 c0Var = o0.a;
                p1 p1Var = i.a.i2.l.f9078c;
                a aVar2 = new a(b.this, null);
                this.a = 1;
                obj = w.J0(p1Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    w.E0(obj);
                    return h.k.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            bVar = (a0) obj;
            i.a.h2.k<a0<InterstitialAd>> kVar = b.this.f8435e;
            this.a = 2;
            if (kVar.b(bVar, this) == aVar) {
                return aVar;
            }
            return h.k.a;
        }
    }

    static {
        n nVar = new n(b.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(h.o.c.r.a);
        a = new h.r.f[]{nVar};
    }

    public b(Application application) {
        h.o.c.j.e(application, "application");
        this.f8432b = application;
        this.f8433c = new e.j.d.z.d("PremiumHelper");
        this.f8434d = new HashMap<>();
        i.a.h2.k<a0<InterstitialAd>> a2 = t.a(null);
        this.f8435e = a2;
        this.f8436f = w.h(a2);
        i.a.h2.k<a0<RewardedAd>> a3 = t.a(null);
        this.f8437g = a3;
        this.f8438h = w.h(a3);
        this.f8439i = new e.j.a.o.f(this, application);
        i.a.g2.e eVar = i.a.g2.e.SUSPEND;
        this.f8441k = eVar == eVar ? new i.a.g2.k<>(null) : new i.a.g2.d(1, eVar, null);
    }

    public static /* synthetic */ Object e(b bVar, PHAdSize pHAdSize, AdListener adListener, boolean z, h.m.d dVar, int i2) {
        if ((i2 & 1) != 0) {
            pHAdSize = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return bVar.d(pHAdSize, adListener, z, dVar);
    }

    public final String a(a aVar, boolean z) {
        String str;
        e.j.d.y.b bVar = e.j.d.k.a.a().f8812i;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            str = (String) bVar.f(e.j.d.y.b.f8873g);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new h.e();
                }
                str = (String) bVar.f(e.j.d.y.b.f8875i);
            } else if (z) {
                CharSequence charSequence = (CharSequence) bVar.f(e.j.d.y.b.f8877k);
                if (charSequence.length() == 0) {
                    charSequence = (String) bVar.f(e.j.d.y.b.f8874h);
                }
                str = (String) charSequence;
            } else {
                str = (String) bVar.f(e.j.d.y.b.f8874h);
            }
        } else if (z) {
            CharSequence charSequence2 = (CharSequence) bVar.f(e.j.d.y.b.f8876j);
            if (charSequence2.length() == 0) {
                charSequence2 = (String) bVar.f(e.j.d.y.b.f8872f);
            }
            str = (String) charSequence2;
        } else {
            str = (String) bVar.f(e.j.d.y.b.f8872f);
        }
        if (!h.o.c.j.a(str, "disabled") && this.f8440j) {
            int ordinal2 = aVar.ordinal();
            if (ordinal2 == 0) {
                str = "ca-app-pub-3940256099942544/8691691433";
            } else if (ordinal2 == 1) {
                str = "ca-app-pub-3940256099942544/6300978111";
            } else if (ordinal2 == 2) {
                str = "ca-app-pub-3940256099942544/2247696110";
            } else if (ordinal2 != 3) {
                throw new h.e();
            } else {
                str = "ca-app-pub-3940256099942544/5224354917";
            }
        }
        if (str.length() == 0) {
            throw new IllegalStateException(h.o.c.j.i(aVar.name(), " Id not defined"));
        }
        return str;
    }

    public final e.j.d.z.c b() {
        return this.f8433c.a(this, a[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r12, h.m.d<? super e.j.d.c0.a0<? extends com.google.android.gms.ads.nativead.NativeAd>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof e.j.a.b.c
            if (r0 == 0) goto L13
            r0 = r13
            e.j.a.b$c r0 = (e.j.a.b.c) r0
            int r1 = r0.f8445e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8445e = r1
            goto L18
        L13:
            e.j.a.b$c r0 = new e.j.a.b$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8443c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8445e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r12 = r0.f8442b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.a
            e.j.a.b r12 = (e.j.a.b) r12
            e.j.d.w.E0(r13)     // Catch: java.lang.Exception -> L31
            goto La9
        L31:
            r13 = move-exception
            goto Lae
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            e.j.d.w.E0(r13)
            e.j.a.b$a r13 = e.j.a.b.a.NATIVE     // Catch: java.lang.Exception -> La3
            if (r12 == 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            java.lang.String r13 = r11.a(r13, r2)     // Catch: java.lang.Exception -> La3
            e.j.d.z.c r2 = r11.b()     // Catch: java.lang.Exception -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La3
            r5.<init>()     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "AdManager: Loading native ad: ("
            r5.append(r6)     // Catch: java.lang.Exception -> La3
            r5.append(r13)     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch: java.lang.Exception -> La3
            if (r12 == 0) goto L64
            r12 = 1
            goto L65
        L64:
            r12 = 0
        L65:
            r5.append(r12)     // Catch: java.lang.Exception -> La3
            r12 = 41
            r5.append(r12)     // Catch: java.lang.Exception -> La3
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Exception -> La3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> La3
            r2.a(r12, r5)     // Catch: java.lang.Exception -> La3
            r0.a = r11     // Catch: java.lang.Exception -> La3
            r0.f8442b = r13     // Catch: java.lang.Exception -> La3
            r0.f8445e = r3     // Catch: java.lang.Exception -> La3
            i.a.k r12 = new i.a.k     // Catch: java.lang.Exception -> La3
            h.m.d r2 = e.j.d.w.P(r0)     // Catch: java.lang.Exception -> La3
            r12.<init>(r2, r3)     // Catch: java.lang.Exception -> La3
            r12.p()     // Catch: java.lang.Exception -> La3
            i.a.z0 r5 = i.a.z0.a     // Catch: java.lang.Exception -> La3
            r6 = 0
            r7 = 0
            e.j.a.b$d r8 = new e.j.a.b$d     // Catch: java.lang.Exception -> La3
            r2 = 0
            r8.<init>(r13, r11, r12, r2)     // Catch: java.lang.Exception -> La3
            r9 = 3
            r10 = 0
            e.j.d.w.Y(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La3
            java.lang.Object r13 = r12.o()     // Catch: java.lang.Exception -> La3
            if (r13 != r1) goto La5
            java.lang.String r12 = "frame"
            h.o.c.j.e(r0, r12)     // Catch: java.lang.Exception -> La3
            goto La5
        La3:
            r12 = move-exception
            goto Lac
        La5:
            if (r13 != r1) goto La8
            return r1
        La8:
            r12 = r11
        La9:
            e.j.d.c0.a0 r13 = (e.j.d.c0.a0) r13     // Catch: java.lang.Exception -> L31
            goto Lc0
        Lac:
            r13 = r12
            r12 = r11
        Lae:
            e.j.d.z.c r12 = r12.b()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 6
            java.lang.String r2 = "AdManager: Failed to load native ad"
            r12.k(r1, r13, r2, r0)
            e.j.d.c0.a0$b r12 = new e.j.d.c0.a0$b
            r12.<init>(r13)
            r13 = r12
        Lc0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.b.c(boolean, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.zipoapps.ads.config.PHAdSize r12, com.google.android.gms.ads.AdListener r13, boolean r14, h.m.d<? super android.view.View> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof e.j.a.b.e
            if (r0 == 0) goto L13
            r0 = r15
            e.j.a.b$e r0 = (e.j.a.b.e) r0
            int r1 = r0.f8451d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8451d = r1
            goto L18
        L13:
            e.j.a.b$e r0 = new e.j.a.b$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8449b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8451d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r12 = r0.a
            e.j.a.b r12 = (e.j.a.b) r12
            e.j.d.w.E0(r15)     // Catch: java.lang.Exception -> L2c
            goto L58
        L2c:
            r13 = move-exception
            goto L5e
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            e.j.d.w.E0(r15)
            i.a.c0 r15 = i.a.o0.a     // Catch: java.lang.Exception -> L5b
            i.a.p1 r15 = i.a.i2.l.f9078c     // Catch: java.lang.Exception -> L5b
            e.j.a.b$f r2 = new e.j.a.b$f     // Catch: java.lang.Exception -> L5b
            if (r14 == 0) goto L43
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            r10 = 0
            r5 = r2
            r6 = r11
            r8 = r12
            r9 = r13
            r5.<init>(r7, r8, r9, r10)     // Catch: java.lang.Exception -> L5b
            r0.a = r11     // Catch: java.lang.Exception -> L5b
            r0.f8451d = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r15 = e.j.d.w.J0(r15, r2, r0)     // Catch: java.lang.Exception -> L5b
            if (r15 != r1) goto L57
            return r1
        L57:
            r12 = r11
        L58:
            e.j.d.c0.a0 r15 = (e.j.d.c0.a0) r15     // Catch: java.lang.Exception -> L2c
            goto L63
        L5b:
            r12 = move-exception
            r13 = r12
            r12 = r11
        L5e:
            e.j.d.c0.a0$b r15 = new e.j.d.c0.a0$b
            r15.<init>(r13)
        L63:
            boolean r13 = r15 instanceof e.j.d.c0.a0.c
            if (r13 == 0) goto L6e
            e.j.d.c0.a0$c r15 = (e.j.d.c0.a0.c) r15
            T r12 = r15.f8619b
            android.view.View r12 = (android.view.View) r12
            goto L83
        L6e:
            boolean r13 = r15 instanceof e.j.d.c0.a0.b
            if (r13 == 0) goto L84
            e.j.d.z.c r12 = r12.b()
            e.j.d.c0.a0$b r15 = (e.j.d.c0.a0.b) r15
            java.lang.Exception r13 = r15.f8618b
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r15 = 6
            java.lang.String r0 = "AdManager: Failed to load banner ad"
            r12.k(r15, r13, r0, r14)
            r12 = 0
        L83:
            return r12
        L84:
            h.e r12 = new h.e
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.b.d(com.zipoapps.ads.config.PHAdSize, com.google.android.gms.ads.AdListener, boolean, h.m.d):java.lang.Object");
    }

    public final void f() {
        w.Y(z0.a, null, null, new g(null), 3, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean g(final Activity activity) {
        h.o.c.j.e(activity, "activity");
        final e.j.a.o.f fVar = this.f8439i;
        Objects.requireNonNull(fVar);
        h.o.c.j.e(activity, "activity");
        final ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ph_ad_close_view);
        if (fVar.c()) {
            if ((activity.getResources().getConfiguration().orientation == 1) && viewGroup != null && viewGroup.getVisibility() != 0) {
                final ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(R.id.ph_ad_close_background);
                viewGroup2.post(new Runnable() { // from class: e.j.a.o.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup3 = viewGroup2;
                        viewGroup3.setAlpha(0.0f);
                        viewGroup3.setVisibility(0);
                        ViewPropertyAnimator animate = viewGroup3.animate();
                        animate.alpha(1.0f);
                        animate.setDuration(250L);
                        animate.setListener(null);
                        animate.start();
                    }
                });
                viewGroup.post(new Runnable() { // from class: e.j.a.o.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup3 = viewGroup;
                        viewGroup3.setTranslationY(viewGroup2.getHeight());
                        viewGroup3.setVisibility(0);
                        ViewPropertyAnimator animate = viewGroup3.animate();
                        animate.translationY(0.0f);
                        animate.setStartDelay(200L);
                        animate.setDuration(250L);
                        animate.setInterpolator(new c.n.a.a.b());
                        animate.setListener(null);
                        animate.start();
                    }
                });
                ((TextView) activity.findViewById(R.id.confirm_exit_text)).setOnClickListener(new View.OnClickListener() { // from class: e.j.a.o.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Activity activity2 = activity;
                        h.o.c.j.e(activity2, "$activity");
                        activity2.finish();
                    }
                });
                viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: e.j.a.o.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewGroup viewGroup3 = viewGroup2;
                        ViewGroup viewGroup4 = viewGroup;
                        Activity activity2 = activity;
                        f fVar2 = fVar;
                        h.o.c.j.e(activity2, "$activity");
                        h.o.c.j.e(fVar2, "this$0");
                        viewGroup3.animate().alpha(0.0f).setDuration(500L).setListener(new k(viewGroup3)).start();
                        viewGroup4.animate().translationY(viewGroup3.getHeight()).setStartDelay(200L).setDuration(500L).setInterpolator(new c.n.a.a.b()).setListener(new l(activity2, viewGroup4, fVar2)).start();
                    }
                });
                return false;
            }
        }
        return true;
    }

    public final void h(Activity activity) {
        h.o.c.j.e(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.banner_ad_container);
        if (viewGroup == null) {
            return;
        }
        g1 remove = this.f8434d.remove(activity.toString());
        if (remove != null) {
            w.n(remove, null, 1, null);
        }
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i2 + 1;
            e.j.d.z.c b2 = b();
            StringBuilder y = e.a.d.a.a.y("AdManager: Removing banner from ");
            y.append((Object) activity.getClass().getSimpleName());
            y.append(" ...");
            b2.a(y.toString(), new Object[0]);
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AdView) {
                ((AdView) childAt).destroy();
            } else if (childAt instanceof AdManagerAdView) {
                ((AdManagerAdView) childAt).destroy();
            }
            i2 = i3;
        }
        viewGroup.removeAllViews();
    }

    public final <T extends Activity & l> void i(T t) {
        h.o.c.j.e(t, "activity");
        g1 remove = this.f8434d.remove(t.toString());
        if (remove != null) {
            w.n(remove, null, 1, null);
        }
        for (m mVar : t.a()) {
            Objects.requireNonNull(mVar);
            ViewGroup viewGroup = (ViewGroup) t.findViewById(0);
            if (viewGroup.getChildCount() > 0) {
                b();
                new StringBuilder().append("AdManager: Removing banner:");
                throw null;
            }
            viewGroup.removeAllViews();
        }
    }

    public final <T extends Fragment & l> void j(T t) {
        ViewGroup viewGroup;
        h.o.c.j.e(t, "fragment");
        g1 remove = this.f8434d.remove(t.toString());
        if (remove != null) {
            w.n(remove, null, 1, null);
        }
        for (m mVar : t.a()) {
            View view = t.getView();
            if (view == null) {
                viewGroup = null;
            } else {
                Objects.requireNonNull(mVar);
                viewGroup = (ViewGroup) view.findViewById(0);
            }
            if ((viewGroup != null ? viewGroup.getChildCount() : 0) > 0) {
                b();
                new StringBuilder().append("AdManager: Removing banner:");
                Objects.requireNonNull(mVar);
                throw null;
            } else if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        }
    }
}
