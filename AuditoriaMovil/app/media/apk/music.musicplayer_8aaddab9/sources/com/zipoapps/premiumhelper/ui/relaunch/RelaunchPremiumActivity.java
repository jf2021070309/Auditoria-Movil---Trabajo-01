package com.zipoapps.premiumhelper.ui.relaunch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import c.b.c.l;
import c.p.q;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import e.j.d.b0.d.t;
import e.j.d.b0.d.u;
import e.j.d.c0.a0;
import e.j.d.c0.b0;
import e.j.d.h;
import e.j.d.i;
import e.j.d.k;
import e.j.d.w;
import e.j.d.y.b;
import h.f;
import h.m.d;
import h.m.i.a.e;
import h.o.b.p;
import h.o.c.j;
import i.a.e0;
import i.a.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class RelaunchPremiumActivity extends l {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4916c = 0;

    /* renamed from: d  reason: collision with root package name */
    public CountDownTimer f4917d;

    /* renamed from: e  reason: collision with root package name */
    public View f4918e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f4919f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f4920g;

    /* renamed from: h  reason: collision with root package name */
    public View f4921h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f4922i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f4923j;

    /* renamed from: k  reason: collision with root package name */
    public k f4924k;

    /* renamed from: l  reason: collision with root package name */
    public h f4925l;

    /* renamed from: m  reason: collision with root package name */
    public String f4926m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4927n;

    @e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3", f = "RelaunchPremiumActivity.kt", l = {99, 104}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements p<e0, d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f4928b;

        @e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$1", f = "RelaunchPremiumActivity.kt", l = {100}, m = "invokeSuspend")
        /* renamed from: com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0102a extends h.m.i.a.h implements p<e0, d<? super a0<? extends h>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f4930b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0102a(RelaunchPremiumActivity relaunchPremiumActivity, d<? super C0102a> dVar) {
                super(2, dVar);
                this.f4930b = relaunchPremiumActivity;
            }

            @Override // h.m.i.a.a
            public final d<h.k> create(Object obj, d<?> dVar) {
                return new C0102a(this.f4930b, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, d<? super a0<? extends h>> dVar) {
                return new C0102a(this.f4930b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    k kVar = this.f4930b.f4924k;
                    if (kVar == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    b.a.d dVar = e.j.d.y.b.f8870d;
                    this.a = 1;
                    obj = kVar.d(dVar, this);
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

        @e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$2", f = "RelaunchPremiumActivity.kt", l = {101}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends h.m.i.a.h implements p<e0, d<? super a0<? extends h>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f4931b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RelaunchPremiumActivity relaunchPremiumActivity, d<? super b> dVar) {
                super(2, dVar);
                this.f4931b = relaunchPremiumActivity;
            }

            @Override // h.m.i.a.a
            public final d<h.k> create(Object obj, d<?> dVar) {
                return new b(this.f4931b, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, d<? super a0<? extends h>> dVar) {
                return new b(this.f4931b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    k kVar = this.f4931b.f4924k;
                    if (kVar == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    b.a.d dVar = e.j.d.y.b.f8871e;
                    this.a = 1;
                    obj = kVar.d(dVar, this);
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

        @e(c = "com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity$onCreate$3$offers$3", f = "RelaunchPremiumActivity.kt", l = {105}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends h.m.i.a.h implements p<e0, d<? super a0<? extends h>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RelaunchPremiumActivity f4932b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(RelaunchPremiumActivity relaunchPremiumActivity, d<? super c> dVar) {
                super(2, dVar);
                this.f4932b = relaunchPremiumActivity;
            }

            @Override // h.m.i.a.a
            public final d<h.k> create(Object obj, d<?> dVar) {
                return new c(this.f4932b, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, d<? super a0<? extends h>> dVar) {
                return new c(this.f4932b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    k kVar = this.f4932b.f4924k;
                    if (kVar == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    b.a.d dVar = e.j.d.y.b.f8869c;
                    this.a = 1;
                    obj = kVar.d(dVar, this);
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

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final d<h.k> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f4928b = obj;
            return aVar;
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super h.k> dVar) {
            a aVar = new a(dVar);
            aVar.f4928b = e0Var;
            return aVar.invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            Object j2;
            Object j3;
            List<a0> list;
            boolean z;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                e0 e0Var = (e0) this.f4928b;
                RelaunchPremiumActivity relaunchPremiumActivity = RelaunchPremiumActivity.this;
                if (relaunchPremiumActivity.f4927n) {
                    j0[] j0VarArr = {w.i(e0Var, null, null, new C0102a(relaunchPremiumActivity, null), 3, null), w.i(e0Var, null, null, new b(RelaunchPremiumActivity.this, null), 3, null)};
                    this.a = 1;
                    j3 = w.j(j0VarArr, this);
                    if (j3 == aVar) {
                        return aVar;
                    }
                    list = (List) j3;
                } else {
                    j0[] j0VarArr2 = {w.i(e0Var, null, null, new c(relaunchPremiumActivity, null), 3, null)};
                    this.a = 2;
                    j2 = w.j(j0VarArr2, this);
                    if (j2 == aVar) {
                        return aVar;
                    }
                    list = (List) j2;
                }
            } else if (i2 == 1) {
                w.E0(obj);
                j3 = obj;
                list = (List) j3;
            } else if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
                j2 = obj;
                list = (List) j2;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (a0 a0Var : list) {
                    if (!(a0Var instanceof a0.c)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                RelaunchPremiumActivity relaunchPremiumActivity2 = RelaunchPremiumActivity.this;
                ArrayList arrayList = new ArrayList(w.s(list, 10));
                for (a0 a0Var2 : list) {
                    arrayList.add((h) ((a0.c) a0Var2).f8619b);
                }
                int i3 = RelaunchPremiumActivity.f4916c;
                Objects.requireNonNull(relaunchPremiumActivity2);
                relaunchPremiumActivity2.f4925l = (h) arrayList.get(0);
                String str = relaunchPremiumActivity2.f4926m;
                if (str == null) {
                    j.k("source");
                    throw null;
                }
                if (j.a(str, "relaunch")) {
                    k kVar = relaunchPremiumActivity2.f4924k;
                    if (kVar == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    e.j.d.b bVar = kVar.f8813j;
                    h hVar = relaunchPremiumActivity2.f4925l;
                    if (hVar == null) {
                        j.k("offer");
                        throw null;
                    }
                    String str2 = hVar.a;
                    Objects.requireNonNull(bVar);
                    j.e(str2, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                    bVar.o("Relaunch", c.i.a.e(new f(AppLovinEventParameters.PRODUCT_IDENTIFIER, str2)));
                }
                k kVar2 = relaunchPremiumActivity2.f4924k;
                if (kVar2 == null) {
                    j.k("premiumHelper");
                    throw null;
                }
                e.j.d.b bVar2 = kVar2.f8813j;
                h hVar2 = relaunchPremiumActivity2.f4925l;
                if (hVar2 == null) {
                    j.k("offer");
                    throw null;
                }
                String str3 = hVar2.a;
                String str4 = relaunchPremiumActivity2.f4926m;
                if (str4 == null) {
                    j.k("source");
                    throw null;
                }
                Objects.requireNonNull(bVar2);
                j.e(str3, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                j.e(str4, "source");
                bVar2.o("Purchase_impression", c.i.a.e(new f(AppLovinEventParameters.PRODUCT_IDENTIFIER, str3), new f("offer", str4)));
                if (relaunchPremiumActivity2.f4927n) {
                    TextView textView = relaunchPremiumActivity2.f4920g;
                    if (textView == null) {
                        j.k("textPrice");
                        throw null;
                    }
                    SkuDetails skuDetails = ((h) arrayList.get(0)).f8801c;
                    textView.setText(skuDetails == null ? null : skuDetails.b());
                    TextView textView2 = relaunchPremiumActivity2.f4923j;
                    if (textView2 != null) {
                        SkuDetails skuDetails2 = ((h) arrayList.get(1)).f8801c;
                        textView2.setText(skuDetails2 == null ? null : skuDetails2.b());
                    }
                    TextView textView3 = relaunchPremiumActivity2.f4923j;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else {
                    TextView textView4 = relaunchPremiumActivity2.f4920g;
                    if (textView4 == null) {
                        j.k("textPrice");
                        throw null;
                    }
                    textView4.setText(((h) arrayList.get(0)).f8802d);
                    TextView textView5 = relaunchPremiumActivity2.f4919f;
                    if (textView5 == null) {
                        j.k("buttonPurchase");
                        throw null;
                    }
                    b0 b0Var = b0.a;
                    h hVar3 = relaunchPremiumActivity2.f4925l;
                    if (hVar3 == null) {
                        j.k("offer");
                        throw null;
                    }
                    textView5.setText(b0Var.f(relaunchPremiumActivity2, hVar3));
                }
                View view = relaunchPremiumActivity2.f4918e;
                if (view == null) {
                    j.k("progressView");
                    throw null;
                }
                view.setVisibility(8);
                TextView textView6 = relaunchPremiumActivity2.f4920g;
                if (textView6 == null) {
                    j.k("textPrice");
                    throw null;
                }
                textView6.setVisibility(0);
                TextView textView7 = relaunchPremiumActivity2.f4919f;
                if (textView7 == null) {
                    j.k("buttonPurchase");
                    throw null;
                }
                textView7.setVisibility(0);
                RelaunchPremiumActivity relaunchPremiumActivity3 = RelaunchPremiumActivity.this;
                if (relaunchPremiumActivity3.f4927n) {
                    k kVar3 = relaunchPremiumActivity3.f4924k;
                    if (kVar3 == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    e.j.d.b0.d.e eVar = kVar3.f8816m;
                    if (eVar.f8586d.f() == 0) {
                        i iVar = eVar.f8586d;
                        long currentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor edit = iVar.a.edit();
                        edit.putLong("one_time_offer_start_time", currentTimeMillis);
                        edit.apply();
                    }
                    k kVar4 = relaunchPremiumActivity3.f4924k;
                    if (kVar4 == null) {
                        j.k("premiumHelper");
                        throw null;
                    }
                    u uVar = new u((kVar4.f8811h.f() + 86400000) - System.currentTimeMillis(), relaunchPremiumActivity3);
                    relaunchPremiumActivity3.f4917d = uVar;
                    uVar.start();
                }
            } else {
                RelaunchPremiumActivity relaunchPremiumActivity4 = RelaunchPremiumActivity.this;
                k kVar5 = relaunchPremiumActivity4.f4924k;
                if (kVar5 == null) {
                    j.k("premiumHelper");
                    throw null;
                }
                relaunchPremiumActivity4.f4925l = new h((String) kVar5.f8812i.f(e.j.d.y.b.f8869c), null, null, null);
            }
            return h.k.a;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f4926m;
        if (str == null) {
            j.k("source");
            throw null;
        }
        if (j.a(str, "relaunch")) {
            k kVar = this.f4924k;
            if (kVar == null) {
                j.k("premiumHelper");
                throw null;
            } else {
                e.j.d.b0.d.e eVar = kVar.f8816m;
                eVar.f8585c.registerActivityLifecycleCallbacks(new e.j.d.b0.d.i(eVar));
            }
        }
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String str = this.f4926m;
        if (str == null) {
            j.k("source");
            throw null;
        }
        if (j.a(str, "relaunch")) {
            k kVar = this.f4924k;
            if (kVar == null) {
                j.k("premiumHelper");
                throw null;
            } else {
                e.j.d.b0.d.e eVar = kVar.f8816m;
                eVar.f8585c.registerActivityLifecycleCallbacks(new e.j.d.b0.d.i(eVar));
            }
        }
        super.onBackPressed();
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int h2;
        Intent intent = getIntent();
        int intExtra = intent == null ? -1 : intent.getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        getWindow().setFlags(1024, 1024);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        if (i2 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        k a2 = k.a.a();
        this.f4924k = a2;
        boolean e2 = a2.f8816m.e();
        this.f4927n = e2;
        if (e2) {
            k kVar = this.f4924k;
            if (kVar == null) {
                j.k("premiumHelper");
                throw null;
            }
            h2 = kVar.f8812i.i();
        } else {
            k kVar2 = this.f4924k;
            if (kVar2 == null) {
                j.k("premiumHelper");
                throw null;
            }
            h2 = kVar2.f8812i.h();
        }
        setContentView(h2);
        c.b.c.a u = u();
        if (u != null) {
            u.f();
        }
        Intent intent2 = getIntent();
        this.f4926m = (intent2 == null || (r6 = intent2.getStringExtra("source")) == null) ? "relaunch" : "relaunch";
        View findViewById = findViewById(R.id.relaunch_premium_progress);
        j.d(findViewById, "findViewById(R.id.relaunch_premium_progress)");
        this.f4918e = findViewById;
        this.f4922i = (TextView) findViewById(R.id.relaunch_premium_text_time);
        View findViewById2 = findViewById(R.id.relaunch_premium_text_price);
        j.d(findViewById2, "findViewById(R.id.relaunch_premium_text_price)");
        this.f4920g = (TextView) findViewById2;
        this.f4923j = (TextView) findViewById(R.id.relaunch_premium_text_price_strike);
        View findViewById3 = findViewById(R.id.relaunch_premium_purchase_button);
        j.d(findViewById3, "findViewById(R.id.relaun…_premium_purchase_button)");
        this.f4919f = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.relaunch_premium_close_button);
        j.d(findViewById4, "findViewById(R.id.relaunch_premium_close_button)");
        this.f4921h = findViewById4;
        TextView textView = this.f4923j;
        if (textView != null) {
            j.c(textView);
            TextView textView2 = this.f4923j;
            j.c(textView2);
            textView.setPaintFlags(textView2.getPaintFlags() | 16);
        }
        View view = this.f4921h;
        if (view == null) {
            j.k("buttonClose");
            throw null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.d.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RelaunchPremiumActivity relaunchPremiumActivity = RelaunchPremiumActivity.this;
                int i3 = RelaunchPremiumActivity.f4916c;
                h.o.c.j.e(relaunchPremiumActivity, "this$0");
                relaunchPremiumActivity.finish();
            }
        });
        TextView textView3 = this.f4919f;
        if (textView3 == null) {
            j.k("buttonPurchase");
            throw null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.d.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RelaunchPremiumActivity relaunchPremiumActivity = RelaunchPremiumActivity.this;
                int i3 = RelaunchPremiumActivity.f4916c;
                h.o.c.j.e(relaunchPremiumActivity, "this$0");
                e.j.d.h hVar = relaunchPremiumActivity.f4925l;
                if (hVar != null) {
                    e.j.d.k kVar3 = relaunchPremiumActivity.f4924k;
                    if (kVar3 == null) {
                        h.o.c.j.k("premiumHelper");
                        throw null;
                    }
                    e.j.d.b bVar = kVar3.f8813j;
                    String str = relaunchPremiumActivity.f4926m;
                    if (str == null) {
                        h.o.c.j.k("source");
                        throw null;
                    }
                    bVar.k(str, hVar.a);
                    w.Y(c.p.q.a(relaunchPremiumActivity), null, null, new v(relaunchPremiumActivity, null), 3, null);
                }
            }
        });
        View view2 = this.f4918e;
        if (view2 == null) {
            j.k("progressView");
            throw null;
        }
        view2.setVisibility(0);
        TextView textView4 = this.f4919f;
        if (textView4 == null) {
            j.k("buttonPurchase");
            throw null;
        }
        textView4.setVisibility(0);
        q.a(this).j(new a(null));
        if (i2 >= 28) {
            View findViewById5 = getWindow().getDecorView().findViewById(16908290);
            findViewById5.getViewTreeObserver().addOnGlobalLayoutListener(new t(findViewById5, this));
        }
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        CountDownTimer countDownTimer = this.f4917d;
        if (countDownTimer != null) {
            if (countDownTimer == null) {
                j.k("timer");
                throw null;
            }
            countDownTimer.cancel();
        }
        super.onStop();
    }
}
