package com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.h;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.k20.k;
import com.amazon.aps.iva.k20.p;
import com.amazon.aps.iva.k20.r;
import com.amazon.aps.iva.k20.t;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.downgrade.DowngradeSuccessActivity;
import com.ellation.toolbar.ToolbarDivider;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CancellationRescueActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/cancellation/rescue/CancellationRescueActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/k20/r;", "<init>", "()V", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CancellationRescueActivity extends com.amazon.aps.iva.i60.b implements r {
    public static final /* synthetic */ l<Object>[] s = {q.a(CancellationRescueActivity.class, "productsViewModel", "getProductsViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscription/viewmodel/CrPlusSubscriptionProductsViewModel;", 0), q.a(CancellationRescueActivity.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/cancellation/rescue/CancellationRescueViewModelImpl;", 0)};
    public final com.amazon.aps.iva.i20.b k = new com.amazon.aps.iva.i20.b(com.amazon.aps.iva.ds.c.b, new com.amazon.aps.iva.fs.d());
    public final com.amazon.aps.iva.f20.e l = e.a.a(this);
    public final m m = com.amazon.aps.iva.kb0.f.b(f.h);
    public final com.amazon.aps.iva.ez.a n = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.d30.e.class, new d(this), new b());
    public final com.amazon.aps.iva.ez.a o = new com.amazon.aps.iva.ez.a(t.class, new e(this), new g());
    public final m p = com.amazon.aps.iva.kb0.f.b(new a());
    public final com.amazon.aps.iva.kb0.e q = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new c(this));
    public boolean r;

    /* compiled from: CancellationRescueActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.k20.l> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.k20.l invoke() {
            k kVar;
            Object obj;
            CancellationRescueActivity cancellationRescueActivity = CancellationRescueActivity.this;
            Intent intent = cancellationRescueActivity.getIntent();
            j.e(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("cancellation_rescue_input", k.class);
                } else {
                    obj = (k) extras.getSerializable("cancellation_rescue_input");
                }
                kVar = (k) obj;
            } else {
                kVar = null;
            }
            k kVar2 = kVar;
            j.c(kVar2);
            com.amazon.aps.iva.rv.e n = com.amazon.aps.iva.aq.k.n(cancellationRescueActivity);
            l<?> lVar = CancellationRescueActivity.s[1];
            com.amazon.aps.iva.i20.b bVar = cancellationRescueActivity.k;
            j.f(bVar, "analytics");
            return new p(cancellationRescueActivity, kVar2, n, bVar, (t) cancellationRescueActivity.o.getValue(cancellationRescueActivity, lVar));
        }
    }

    /* compiled from: CancellationRescueActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.d30.e> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.d30.e invoke(androidx.lifecycle.p pVar) {
            j.f(pVar, "it");
            CancellationRescueActivity cancellationRescueActivity = CancellationRescueActivity.this;
            com.amazon.aps.iva.rs.f c = cancellationRescueActivity.l.c();
            com.amazon.aps.iva.f20.e eVar = cancellationRescueActivity.l;
            com.amazon.aps.iva.b30.a a = eVar.a();
            com.amazon.aps.iva.rs.l d = eVar.d(cancellationRescueActivity);
            i iVar = i.a.a;
            if (iVar != null) {
                return new com.amazon.aps.iva.d30.e(c, a, d, iVar.o(), null, new com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.a(cancellationRescueActivity), (com.amazon.aps.iva.i20.e) cancellationRescueActivity.m.getValue(), 48);
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v60.a> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v60.a invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_cancellation_rescue, (ViewGroup) null, false);
            int i = R.id.cancellation_rescue_cancel;
            View u = z.u(R.id.cancellation_rescue_cancel, inflate);
            if (u != null) {
                int i2 = R.id.cancellation_recue_cancel_title;
                TextView textView = (TextView) z.u(R.id.cancellation_recue_cancel_title, u);
                if (textView != null) {
                    i2 = R.id.cancellation_rescue_cancel_cta;
                    TextView textView2 = (TextView) z.u(R.id.cancellation_rescue_cancel_cta, u);
                    if (textView2 != null) {
                        i2 = R.id.cancellation_rescue_stay_premium_cta;
                        TextView textView3 = (TextView) z.u(R.id.cancellation_rescue_stay_premium_cta, u);
                        if (textView3 != null) {
                            com.amazon.aps.iva.pu.k kVar = new com.amazon.aps.iva.pu.k((ConstraintLayout) u, textView, textView2, textView3, 1);
                            i = R.id.cancellation_rescue_downgrade;
                            View u2 = z.u(R.id.cancellation_rescue_downgrade, inflate);
                            if (u2 != null) {
                                int i3 = R.id.cancellation_recue_downgrade_episodes_checkmark;
                                if (((ImageView) z.u(R.id.cancellation_recue_downgrade_episodes_checkmark, u2)) != null) {
                                    i3 = R.id.cancellation_recue_downgrade_image;
                                    if (((ImageView) z.u(R.id.cancellation_recue_downgrade_image, u2)) != null) {
                                        i3 = R.id.cancellation_recue_downgrade_library_checkmark;
                                        if (((ImageView) z.u(R.id.cancellation_recue_downgrade_library_checkmark, u2)) != null) {
                                            i3 = R.id.cancellation_recue_downgrade_library_text;
                                            if (((TextView) z.u(R.id.cancellation_recue_downgrade_library_text, u2)) != null) {
                                                i3 = R.id.cancellation_recue_downgrade_no_ad_checkmark;
                                                if (((ImageView) z.u(R.id.cancellation_recue_downgrade_no_ad_checkmark, u2)) != null) {
                                                    i3 = R.id.cancellation_recue_downgrade_no_ad_text;
                                                    if (((TextView) z.u(R.id.cancellation_recue_downgrade_no_ad_text, u2)) != null) {
                                                        i3 = R.id.cancellation_recue_downgrade_subtitle;
                                                        if (((TextView) z.u(R.id.cancellation_recue_downgrade_subtitle, u2)) != null) {
                                                            i3 = R.id.cancellation_recue_downgrade_title;
                                                            if (((TextView) z.u(R.id.cancellation_recue_downgrade_title, u2)) != null) {
                                                                i3 = R.id.cancellation_rescue_downgrade_cta;
                                                                FrameLayout frameLayout = (FrameLayout) z.u(R.id.cancellation_rescue_downgrade_cta, u2);
                                                                if (frameLayout != null) {
                                                                    i3 = R.id.cancellation_rescue_downgrade_cta_text;
                                                                    TextView textView4 = (TextView) z.u(R.id.cancellation_rescue_downgrade_cta_text, u2);
                                                                    if (textView4 != null) {
                                                                        i3 = R.id.cancellation_rescue_downgrade_episodes_text;
                                                                        if (((TextView) z.u(R.id.cancellation_rescue_downgrade_episodes_text, u2)) != null) {
                                                                            com.amazon.aps.iva.v60.i iVar = new com.amazon.aps.iva.v60.i((ConstraintLayout) u2, frameLayout, textView4);
                                                                            i = R.id.cancellation_rescue_industry;
                                                                            View u3 = z.u(R.id.cancellation_rescue_industry, inflate);
                                                                            if (u3 != null) {
                                                                                int i4 = R.id.cancellation_recue_industry_image;
                                                                                if (((ImageView) z.u(R.id.cancellation_recue_industry_image, u3)) != null) {
                                                                                    i4 = R.id.cancellation_recue_industry_subtitle;
                                                                                    if (((TextView) z.u(R.id.cancellation_recue_industry_subtitle, u3)) != null) {
                                                                                        i4 = R.id.cancellation_recue_industry_title;
                                                                                        if (((TextView) z.u(R.id.cancellation_recue_industry_title, u3)) != null) {
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) u3;
                                                                                            i = R.id.cancellation_rescue_progress;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.cancellation_rescue_progress, inflate);
                                                                                            if (frameLayout2 != null) {
                                                                                                i = R.id.cancellation_rescue_scroll_view;
                                                                                                ScrollView scrollView = (ScrollView) z.u(R.id.cancellation_rescue_scroll_view, inflate);
                                                                                                if (scrollView != null) {
                                                                                                    i = R.id.cancellation_rescue_top_benefits;
                                                                                                    View u4 = z.u(R.id.cancellation_rescue_top_benefits, inflate);
                                                                                                    if (u4 != null) {
                                                                                                        int i5 = R.id.benefits;
                                                                                                        View u5 = z.u(R.id.benefits, u4);
                                                                                                        if (u5 != null) {
                                                                                                            int i6 = R.id.cancellation_rescue_ad_free_benefit_icon;
                                                                                                            if (((ImageView) z.u(R.id.cancellation_rescue_ad_free_benefit_icon, u5)) != null) {
                                                                                                                i6 = R.id.cancellation_rescue_ad_free_benefit_text;
                                                                                                                if (((TextView) z.u(R.id.cancellation_rescue_ad_free_benefit_text, u5)) != null) {
                                                                                                                    i6 = R.id.cancellation_rescue_new_episode_benefit_icon;
                                                                                                                    if (((ImageView) z.u(R.id.cancellation_rescue_new_episode_benefit_icon, u5)) != null) {
                                                                                                                        i6 = R.id.cancellation_rescue_new_episode_benefit_text;
                                                                                                                        if (((TextView) z.u(R.id.cancellation_rescue_new_episode_benefit_text, u5)) != null) {
                                                                                                                            i6 = R.id.last_benefit_icon;
                                                                                                                            ImageView imageView = (ImageView) z.u(R.id.last_benefit_icon, u5);
                                                                                                                            if (imageView != null) {
                                                                                                                                i6 = R.id.last_benefit_text;
                                                                                                                                TextView textView5 = (TextView) z.u(R.id.last_benefit_text, u5);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    i6 = R.id.offline_viewing_benefit_icon;
                                                                                                                                    ImageView imageView2 = (ImageView) z.u(R.id.offline_viewing_benefit_icon, u5);
                                                                                                                                    if (imageView2 != null) {
                                                                                                                                        i6 = R.id.offline_viewing_benefit_text;
                                                                                                                                        TextView textView6 = (TextView) z.u(R.id.offline_viewing_benefit_text, u5);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) u5;
                                                                                                                                            com.amazon.aps.iva.v60.g gVar = new com.amazon.aps.iva.v60.g(constraintLayout2, imageView, textView5, imageView2, textView6, constraintLayout2);
                                                                                                                                            i5 = R.id.cancellation_hime;
                                                                                                                                            ImageView imageView3 = (ImageView) z.u(R.id.cancellation_hime, u4);
                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                i5 = R.id.cancellation_subtitle;
                                                                                                                                                TextView textView7 = (TextView) z.u(R.id.cancellation_subtitle, u4);
                                                                                                                                                if (textView7 != null) {
                                                                                                                                                    i5 = R.id.cancellation_title;
                                                                                                                                                    TextView textView8 = (TextView) z.u(R.id.cancellation_title, u4);
                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                        com.amazon.aps.iva.on.e eVar = new com.amazon.aps.iva.on.e((ConstraintLayout) u4, gVar, imageView3, textView7, textView8);
                                                                                                                                                        i = R.id.toolbar;
                                                                                                                                                        Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                                                                                                                                                        if (toolbar != null) {
                                                                                                                                                            i = R.id.toolbar_divider;
                                                                                                                                                            ToolbarDivider toolbarDivider = (ToolbarDivider) z.u(R.id.toolbar_divider, inflate);
                                                                                                                                                            if (toolbarDivider != null) {
                                                                                                                                                                return new com.amazon.aps.iva.v60.a((ConstraintLayout) inflate, kVar, iVar, frameLayout2, scrollView, eVar, toolbar, toolbarDivider);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(u5.getResources().getResourceName(i6)));
                                                                                                        }
                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(u4.getResources().getResourceName(i5)));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("Missing required view with ID: ".concat(u3.getResources().getResourceName(i4)));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(u2.getResources().getResourceName(i3)));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    /* compiled from: CancellationRescueActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i20.e> {
        public static final f h = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i20.e invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.CANCELLATION_RESCUE;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            return e.a.a(aVar);
        }
    }

    /* compiled from: CancellationRescueActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, t> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t invoke(androidx.lifecycle.p pVar) {
            j.f(pVar, "it");
            l<Object>[] lVarArr = CancellationRescueActivity.s;
            CancellationRescueActivity cancellationRescueActivity = CancellationRescueActivity.this;
            cancellationRescueActivity.getClass();
            return new t((com.amazon.aps.iva.d30.d) cancellationRescueActivity.n.getValue(cancellationRescueActivity, CancellationRescueActivity.s[0]));
        }
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void S9(com.amazon.aps.iva.k20.b bVar) {
        j.f(bVar, "benefit");
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        ConstraintLayout constraintLayout = ((com.amazon.aps.iva.v60.g) mi().f.e).f;
        j.e(constraintLayout, "binding.cancellationResc…its.benefits.parentLayout");
        cVar.f(constraintLayout);
        cVar.e(R.id.offline_viewing_benefit_text, 7);
        cVar.b(constraintLayout);
        com.amazon.aps.iva.v60.g gVar = (com.amazon.aps.iva.v60.g) mi().f.e;
        ImageView imageView = gVar.b;
        j.e(imageView, "lastBenefitIcon");
        imageView.setVisibility(0);
        gVar.b.setImageDrawable(com.amazon.aps.iva.l.a.a(this, bVar.getIcon()));
        TextView textView = gVar.c;
        j.e(textView, "lastBenefitText");
        textView.setVisibility(0);
        textView.setText(bVar.getText());
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        FrameLayout frameLayout = mi().d;
        j.e(frameLayout, "binding.cancellationRescueProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void a8() {
        com.amazon.aps.iva.l20.a.d.getClass();
        new com.amazon.aps.iva.l20.a().show(getSupportFragmentManager(), "cancellation_rescue_dialog");
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        FrameLayout frameLayout = mi().d;
        j.e(frameLayout, "binding.cancellationRescueProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void b3() {
        ImageView imageView = ((com.amazon.aps.iva.v60.g) mi().f.e).d;
        j.e(imageView, "binding.cancellationResc…offlineViewingBenefitIcon");
        imageView.setVisibility(8);
        TextView textView = ((com.amazon.aps.iva.v60.g) mi().f.e).e;
        j.e(textView, "binding.cancellationResc…offlineViewingBenefitText");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void hg(String str) {
        com.amazon.aps.iva.i30.d dVar = new com.amazon.aps.iva.i30.d(str);
        Intent intent = new Intent(this, DowngradeSuccessActivity.class);
        intent.putExtra("downgrade_success_input", dVar);
        int i = com.amazon.aps.iva.vw.a.q0;
        intent.putExtra("experiment", (Serializable) null);
        startActivity(intent);
    }

    public final com.amazon.aps.iva.v60.a mi() {
        return (com.amazon.aps.iva.v60.a) this.q.getValue();
    }

    public final com.amazon.aps.iva.k20.l ni() {
        return (com.amazon.aps.iva.k20.l) this.p.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        mi().g.setNavigationIcon(R.drawable.ic_cross);
        mi().g.setNavigationOnClickListener(new com.amazon.aps.iva.c8.k(this, 15));
        mi().c.b.setOnClickListener(new com.amazon.aps.iva.c8.r(this, 15));
        ((TextView) mi().b.d).setOnClickListener(new s(this, 17));
        ((TextView) mi().b.e).setOnClickListener(new com.amazon.aps.iva.c8.e(this, 18));
        mi().e.setOnScrollChangeListener(new com.amazon.aps.iva.k20.a(this, 0));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ni());
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void u7() {
        com.amazon.aps.iva.l20.b.f.getClass();
        new com.amazon.aps.iva.l20.b().show(getSupportFragmentManager(), "cancellation_rescue_dialog");
    }

    @Override // com.amazon.aps.iva.k20.r
    public final void x6() {
        ConstraintLayout constraintLayout = mi().c.a;
        j.e(constraintLayout, "binding.cancellationRescueDowngrade.root");
        constraintLayout.setVisibility(8);
    }
}
