package com.amazon.aps.iva.x20;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.f20.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fs.d;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.us.v;
import com.amazon.aps.iva.v60.f;
import com.amazon.aps.iva.wy.e;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrPlusFreeMembershipPlanFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/x20/a;", "Lcom/amazon/aps/iva/wy/e;", "", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends e implements h {
    public final FragmentViewBindingDelegate c;
    public final m d;
    public static final /* synthetic */ l<Object>[] f = {q.a(a.class, "binding", "getBinding()Lcom/ellation/multitier/databinding/FragmentCrPlusFreeMembershipPlanBinding;", 0)};
    public static final C0837a e = new C0837a();

    /* compiled from: CrPlusFreeMembershipPlanFragment.kt */
    /* renamed from: com.amazon.aps.iva.x20.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0837a {
    }

    /* compiled from: CrPlusFreeMembershipPlanFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<View, f> {
        public static final b b = new b();

        public b() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/multitier/databinding/FragmentCrPlusFreeMembershipPlanBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            int i = R.id.cr_plus_free_membership_hime;
            if (((ImageView) z.u(R.id.cr_plus_free_membership_hime, view2)) != null) {
                i = R.id.cr_plus_free_membership_plan_subscription_button;
                CrPlusSubscriptionButton crPlusSubscriptionButton = (CrPlusSubscriptionButton) z.u(R.id.cr_plus_free_membership_plan_subscription_button, view2);
                if (crPlusSubscriptionButton != null) {
                    i = R.id.cr_plus_free_membership_title;
                    if (((TextView) z.u(R.id.cr_plus_free_membership_title, view2)) != null) {
                        i = R.id.linearLayout;
                        if (((LinearLayout) z.u(R.id.linearLayout, view2)) != null) {
                            return new f((ScrollView) view2, crPlusSubscriptionButton);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CrPlusFreeMembershipPlanFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.x20.b> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.x20.b invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.USER_SETTINGS_MEMBERSHIP_PLAN;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.xb0.a<Boolean> t = iVar.t();
                j.f(aVar, "screen");
                j.f(t, "hasPremiumBenefit");
                v vVar = new v(cVar, aVar, t);
                com.amazon.aps.iva.f20.i iVar2 = i.a.a;
                if (iVar2 != null) {
                    com.amazon.aps.iva.vw.a invoke = iVar2.i().invoke();
                    d dVar = new d();
                    j.f(invoke, "experimentObjectConfig");
                    com.amazon.aps.iva.i20.d dVar2 = new com.amazon.aps.iva.i20.d(cVar, dVar, invoke);
                    com.amazon.aps.iva.f20.i iVar3 = i.a.a;
                    if (iVar3 != null) {
                        a aVar2 = a.this;
                        k b = iVar3.b(aVar2);
                        j.f(aVar2, "view");
                        j.f(b, "flowRouter");
                        return new com.amazon.aps.iva.x20.c(aVar2, vVar, dVar2, b);
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

    public a() {
        super(R.layout.fragment_cr_plus_free_membership_plan);
        this.c = com.amazon.aps.iva.a60.b.A(this, b.b);
        this.d = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((f) this.c.getValue(this, f[0])).b.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 18));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.x20.b> setupPresenters() {
        return l1.H((com.amazon.aps.iva.x20.b) this.d.getValue());
    }
}
