package com.crunchyroll.onboarding;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yi.g;
import com.amazon.aps.iva.yi.h;
import com.amazon.aps.iva.yi.k;
import com.amazon.aps.iva.yi.n;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.onboarding.d;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: OnboardingV2Activity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/onboarding/OnboardingV2Activity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/yi/k;", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnboardingV2Activity extends com.amazon.aps.iva.i60.b implements k {
    public static final /* synthetic */ int o = 0;
    public final com.amazon.aps.iva.yi.c k = new com.amazon.aps.iva.yi.c(com.amazon.aps.iva.ds.c.b, new com.amazon.aps.iva.fs.d());
    public final m l = f.b(new c());
    public final m m = f.b(new a());
    public final m n = f.b(new e());

    /* compiled from: OnboardingV2Activity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.zi.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.zi.a invoke() {
            View inflate = LayoutInflater.from(OnboardingV2Activity.this).inflate(R.layout.activity_onboarding_v2, (ViewGroup) null, false);
            int i = R.id.no_network_message_view;
            if (((ErrorBottomMessageView) z.u(R.id.no_network_message_view, inflate)) != null) {
                i = R.id.onboarding_background_image;
                if (((ImageView) z.u(R.id.onboarding_background_image, inflate)) != null) {
                    i = R.id.onboarding_background_middle;
                    if (z.u(R.id.onboarding_background_middle, inflate) != null) {
                        i = R.id.onboarding_buttons_container;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.onboarding_buttons_container, inflate);
                        if (frameLayout != null) {
                            i = R.id.onboarding_label_container;
                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.onboarding_label_container, inflate);
                            if (frameLayout2 != null) {
                                i = R.id.onboarding_logo;
                                if (((ImageView) z.u(R.id.onboarding_logo, inflate)) != null) {
                                    i = R.id.onboarding_main_text;
                                    if (((TextView) z.u(R.id.onboarding_main_text, inflate)) != null) {
                                        return new com.amazon.aps.iva.zi.a((ConstraintLayout) inflate, frameLayout, frameLayout2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: OnboardingV2Activity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.crunchyroll.onboarding.a.h, 253);
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Activity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            com.crunchyroll.onboarding.b bVar = com.crunchyroll.onboarding.b.h;
            OnboardingV2Activity onboardingV2Activity = OnboardingV2Activity.this;
            com.amazon.aps.iva.yi.m mVar = (com.amazon.aps.iva.yi.m) com.amazon.aps.iva.ez.l.a(onboardingV2Activity, com.amazon.aps.iva.yi.m.class, bVar);
            com.amazon.aps.iva.yi.e eVar = d.a.a;
            if (eVar != null) {
                com.amazon.aps.iva.yi.f invoke = eVar.a.invoke(onboardingV2Activity, onboardingV2Activity);
                com.amazon.aps.iva.yi.e eVar2 = d.a.a;
                if (eVar2 != null) {
                    com.amazon.aps.iva.yi.d invoke2 = eVar2.b.invoke(onboardingV2Activity);
                    com.amazon.aps.iva.yi.e eVar3 = d.a.a;
                    if (eVar3 != null) {
                        n invoke3 = eVar3.c.invoke(onboardingV2Activity);
                        boolean z = com.amazon.aps.iva.aq.k.n(onboardingV2Activity).b;
                        com.amazon.aps.iva.yi.e eVar4 = d.a.a;
                        if (eVar4 != null) {
                            com.crunchyroll.onboarding.c cVar = new com.crunchyroll.onboarding.c(onboardingV2Activity);
                            com.amazon.aps.iva.yi.e eVar5 = d.a.a;
                            if (eVar5 != null) {
                                j.f(invoke, "onboardingV2FlowRouter");
                                j.f(invoke2, "onboardingV2AuthenticationFlowRouter");
                                j.f(invoke3, "sessionExpiredFlowRouter");
                                com.amazon.aps.iva.yi.c cVar2 = onboardingV2Activity.k;
                                j.f(cVar2, "onboardingV2Analytics");
                                com.amazon.aps.iva.wh.f fVar = eVar4.e;
                                j.f(fVar, "unverifiedPurchaseProvider");
                                com.amazon.aps.iva.xb0.a<Boolean> aVar = eVar5.d;
                                j.f(aVar, "isUserLoggedIn");
                                return new h(onboardingV2Activity, mVar, cVar, invoke, invoke2, invoke3, z, cVar2, fVar, aVar);
                            }
                            j.m("dependencies");
                            throw null;
                        }
                        j.m("dependencies");
                        throw null;
                    }
                    j.m("dependencies");
                    throw null;
                }
                j.m("dependencies");
                throw null;
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OnboardingV2Activity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d extends i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public d(g gVar) {
            super(1, gVar, g.class, "onCreateAccountClicked", "onCreateAccountClicked(Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            j.f(bVar2, "p0");
            ((g) this.receiver).j0(bVar2);
            return q.a;
        }
    }

    /* compiled from: OnboardingV2Activity.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<TextView> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final TextView invoke() {
            int i = OnboardingV2Activity.o;
            return (TextView) OnboardingV2Activity.this.mi().b.findViewById(R.id.onboarding_explore_free_trial_text_view);
        }
    }

    @Override // com.amazon.aps.iva.yi.k
    public final void U4() {
        LayoutInflater.from(this).inflate(R.layout.onboarding_buttons_amazon, (ViewGroup) mi().b, true);
        mi().b.findViewById(R.id.onboarding_log_in).setOnClickListener(new com.amazon.aps.iva.c8.f(this, 2));
    }

    @Override // com.amazon.aps.iva.yi.k
    public final void hf() {
        LayoutInflater.from(this).inflate(R.layout.onboarding_buttons, (ViewGroup) mi().b, true);
        ((TextView) this.n.getValue()).setOnClickListener(new com.amazon.aps.iva.c8.e(this, 3));
        d dVar = new d((g) this.l.getValue());
        String string = getString(R.string.onboarding_v2_create_account);
        j.e(string, "getString(R.string.onboarding_v2_create_account)");
        String string2 = getString(R.string.onboarding_v2_create_account_format, string);
        j.e(string2, "getString(R.string.onboa…count_format, orangePart)");
        View findViewById = mi().b.findViewById(R.id.onboarding_create_account);
        j.e(findViewById, "binding.onboardingButton…nboarding_create_account)");
        SpannableString spannableString = new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.primary), string2, string));
        m0.a(spannableString, string, false, new com.amazon.aps.iva.yi.a(dVar));
        r0.b((TextView) findViewById, spannableString);
        mi().b.findViewById(R.id.onboarding_log_in).setOnClickListener(new com.amazon.aps.iva.c8.f(this, 2));
    }

    public final com.amazon.aps.iva.zi.a mi() {
        return (com.amazon.aps.iva.zi.a) this.m.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        com.amazon.aps.iva.xw.b.d(this, false);
        FrameLayout frameLayout = mi().c;
        j.e(frameLayout, "binding.onboardingLabelContainer");
        f1.i(frameLayout, b.h);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((g) this.l.getValue());
    }

    @Override // com.amazon.aps.iva.yi.k
    public final void y8() {
        ((TextView) this.n.getValue()).setText(R.string.onboarding_v2_upsell_discounts);
    }
}
