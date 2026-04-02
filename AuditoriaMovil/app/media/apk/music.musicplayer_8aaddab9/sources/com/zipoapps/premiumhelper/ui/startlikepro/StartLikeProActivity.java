package com.zipoapps.premiumhelper.ui.startlikepro;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.b.c.l;
import c.p.q;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import e.j.d.c0.a0;
import e.j.d.c0.b0;
import e.j.d.h;
import e.j.d.w;
import e.j.d.y.b;
import h.k;
import h.m.d;
import h.m.i.a.e;
import h.o.b.p;
import h.o.c.j;
import i.a.e0;
import i.a.z0;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class StartLikeProActivity extends l {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4936c = 0;

    /* renamed from: d  reason: collision with root package name */
    public h f4937d;

    @e(c = "com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity$onCreate$5", f = "StartLikeProActivity.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements p<e0, d<? super k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e.j.d.k f4938b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ StartLikeProActivity f4939c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ProgressBar f4940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e.j.d.k kVar, StartLikeProActivity startLikeProActivity, ProgressBar progressBar, d<? super a> dVar) {
            super(2, dVar);
            this.f4938b = kVar;
            this.f4939c = startLikeProActivity;
            this.f4940d = progressBar;
        }

        @Override // h.m.i.a.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new a(this.f4938b, this.f4939c, this.f4940d, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super k> dVar) {
            return new a(this.f4938b, this.f4939c, this.f4940d, dVar).invokeSuspend(k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                e.j.d.k kVar = this.f4938b;
                b.a.d dVar = b.f8869c;
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
            a0 a0Var = (a0) obj;
            StartLikeProActivity startLikeProActivity = this.f4939c;
            boolean z = a0Var instanceof a0.c;
            h hVar = z ? (h) ((a0.c) a0Var).f8619b : new h((String) this.f4938b.f8812i.f(b.f8869c), null, null, null);
            ProgressBar progressBar = this.f4940d;
            StartLikeProActivity startLikeProActivity2 = this.f4939c;
            if (z) {
                progressBar.setVisibility(8);
                ((TextView) startLikeProActivity2.findViewById(R.id.start_like_pro_price_text)).setText(hVar.f8802d);
            }
            ((TextView) startLikeProActivity2.findViewById(R.id.start_like_pro_premium_purchase_button)).setText(b0.a.f(startLikeProActivity2, hVar));
            startLikeProActivity.f4937d = hVar;
            return k.a;
        }
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        if (i2 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        final e.j.d.k a2 = e.j.d.k.a.a();
        b bVar = a2.f8812i;
        setContentView((bVar.J.getStartLikeProActivityLayout().length == 0) ^ true ? bVar.d(bVar.J.getStartLikeProActivityLayout(), b.F) : (bVar.j() && bVar.J.getUseTestLayouts()) ? R.layout.ph_sample_activity_start_like_pro : 0);
        c.b.c.a u = u();
        if (u != null) {
            u.f();
        }
        TextView textView = (TextView) findViewById(R.id.start_like_pro_terms_text);
        String string = getString(R.string.ph_terms_and_conditions, new Object[]{(String) a2.f8812i.f(b.q), (String) a2.f8812i.f(b.r)});
        textView.setText(i2 >= 24 ? Html.fromHtml(string, 0) : Html.fromHtml(string));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        e.j.d.b bVar2 = a2.f8813j;
        Objects.requireNonNull(bVar2);
        w.Y(z0.a, null, null, new e.j.d.e(bVar2, null), 3, null);
        View findViewById = findViewById(R.id.start_like_pro_try_limited_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.e.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StartLikeProActivity startLikeProActivity = StartLikeProActivity.this;
                    int i3 = StartLikeProActivity.f4936c;
                    j.e(startLikeProActivity, "this$0");
                    startLikeProActivity.y();
                }
            });
        }
        findViewById(R.id.start_like_pro_premium_purchase_button).setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.e.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartLikeProActivity startLikeProActivity = StartLikeProActivity.this;
                e.j.d.k kVar = a2;
                int i3 = StartLikeProActivity.f4936c;
                j.e(startLikeProActivity, "this$0");
                j.e(kVar, "$premiumHelper");
                h hVar = startLikeProActivity.f4937d;
                if (hVar == null) {
                    return;
                }
                if (kVar.f8812i.j()) {
                    if (hVar.a.length() == 0) {
                        startLikeProActivity.y();
                        return;
                    }
                }
                kVar.f8813j.k("onboarding", hVar.a);
                w.Y(q.a(startLikeProActivity), null, null, new f(kVar, startLikeProActivity, hVar, null), 3, null);
            }
        });
        View findViewById2 = findViewById(R.id.start_like_pro_progress);
        j.d(findViewById2, "findViewById(R.id.start_like_pro_progress)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        progressBar.setVisibility(0);
        View findViewById3 = findViewById(R.id.start_like_pro_close_button);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.e.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StartLikeProActivity startLikeProActivity = StartLikeProActivity.this;
                    int i3 = StartLikeProActivity.f4936c;
                    j.e(startLikeProActivity, "this$0");
                    startLikeProActivity.y();
                }
            });
            if (i2 >= 28) {
                View findViewById4 = getWindow().getDecorView().findViewById(16908290);
                findViewById4.getViewTreeObserver().addOnGlobalLayoutListener(new e.j.d.b0.e.e(findViewById4, findViewById3));
            }
        }
        q.a(this).j(new a(a2, this, progressBar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r10 = this;
            e.j.d.k$a r0 = e.j.d.k.a
            e.j.d.k r0 = r0.a()
            e.j.d.i r1 = r0.f8811h
            r1.k()
            e.j.d.b r1 = r0.f8813j
            e.j.d.h r2 = r10.f4937d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1d
            if (r2 != 0) goto L17
            r2 = 0
            goto L19
        L17:
            java.lang.String r2 = r2.f8802d
        L19:
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            android.os.Bundle[] r5 = new android.os.Bundle[r3]
            r6 = 2
            h.f[] r6 = new h.f[r6]
            e.j.d.y.b r7 = r1.f8525c
            e.j.d.y.b$a$d r8 = e.j.d.y.b.f8869c
            java.lang.Object r7 = r7.f(r8)
            h.f r8 = new h.f
            java.lang.String r9 = "sku"
            r8.<init>(r9, r7)
            r6[r4] = r8
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            h.f r7 = new h.f
            java.lang.String r8 = "offer_loaded"
            r7.<init>(r8, r2)
            r6[r3] = r7
            android.os.Bundle r2 = c.i.a.e(r6)
            r5[r4] = r2
            java.lang.String r2 = "Onboarding_complete"
            r1.o(r2, r5)
            boolean r1 = r0.h()
            if (r1 == 0) goto L63
            android.content.Intent r1 = new android.content.Intent
            e.j.d.y.b r0 = r0.f8812i
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r0.J
            java.lang.Class r0 = r0.getMainActivityClass()
            r1.<init>(r10, r0)
            r10.startActivity(r1)
            goto L73
        L63:
            android.content.Intent r1 = new android.content.Intent
            e.j.d.y.b r0 = r0.f8812i
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r0.J
            java.lang.Class r0 = r0.getIntroActivityClass()
            r1.<init>(r10, r0)
            r10.startActivity(r1)
        L73:
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity.y():void");
    }
}
