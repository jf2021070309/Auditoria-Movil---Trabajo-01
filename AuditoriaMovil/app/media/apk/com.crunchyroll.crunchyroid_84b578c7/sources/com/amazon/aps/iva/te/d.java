package com.amazon.aps.iva.te;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: OnHoldNotificationMembershipFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/te/d;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/te/g;", "<init>", "()V", "a", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.e implements g {
    public final com.amazon.aps.iva.te.c c;
    public final m d;
    public final FragmentViewBindingDelegate e;
    public static final /* synthetic */ l<Object>[] g = {q.a(d.class, "binding", "getBinding()Lcom/crunchyroll/billingnotifications/databinding/FragmentOnHoldNotificationBinding;", 0)};
    public static final a f = new a();

    /* compiled from: OnHoldNotificationMembershipFragment.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: OnHoldNotificationMembershipFragment.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.pe.c> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.pe.c.class, "bind", "bind(Landroid/view/View;)Lcom/crunchyroll/billingnotifications/databinding/FragmentOnHoldNotificationBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pe.c invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            int i = R.id.on_hold_hime;
            if (((ImageView) z.u(R.id.on_hold_hime, view2)) != null) {
                i = R.id.on_hold_subtitle;
                TextView textView = (TextView) z.u(R.id.on_hold_subtitle, view2);
                if (textView != null) {
                    i = R.id.on_hold_title;
                    if (((TextView) z.u(R.id.on_hold_title, view2)) != null) {
                        i = R.id.on_hold_update_payment_cta;
                        TextView textView2 = (TextView) z.u(R.id.on_hold_update_payment_cta, view2);
                        if (textView2 != null) {
                            return new com.amazon.aps.iva.pe.c((ConstraintLayout) view2, textView, textView2);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: OnHoldNotificationMembershipFragment.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            d dVar = d.this;
            Context requireContext = dVar.requireContext();
            j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.k50.m mVar = new com.amazon.aps.iva.k50.m(requireContext);
            com.amazon.aps.iva.me.c cVar = com.amazon.aps.iva.a60.b.c;
            if (cVar != null) {
                com.amazon.aps.iva.ve.e f = cVar.f();
                j.f(f, "billingStatusStorage");
                com.amazon.aps.iva.te.c cVar2 = dVar.c;
                j.f(cVar2, "onHoldNotificationAnalytics");
                return new f(dVar, f, mVar, cVar2);
            }
            j.m("instance");
            throw null;
        }
    }

    public d() {
        super(R.layout.fragment_on_hold_notification);
        com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
        if (bVar != null) {
            com.amazon.aps.iva.me.j e = bVar.e();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(e, "experiment");
            com.amazon.aps.iva.te.a aVar = com.amazon.aps.iva.te.a.h;
            j.f(aVar, "createTimer");
            this.c = new com.amazon.aps.iva.te.c(cVar, e, aVar);
            this.d = com.amazon.aps.iva.kb0.f.b(new c());
            this.e = com.amazon.aps.iva.a60.b.A(this, b.b);
            return;
        }
        j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = g;
        l<?> lVar = lVarArr[0];
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.e;
        TextView textView = ((com.amazon.aps.iva.pe.c) fragmentViewBindingDelegate.getValue(this, lVar)).b;
        String string = getString(R.string.on_hold_dialog_subtitle);
        j.e(string, "getString(R.string.on_hold_dialog_subtitle)");
        String string2 = getString(R.string.on_hold_dialog_subtitle_colored);
        j.e(string2, "getString(R.string.on_ho…_dialog_subtitle_colored)");
        textView.setText(new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(requireContext(), com.ellation.crunchyroll.ui.R.color.white), string, string2)));
        ((com.amazon.aps.iva.pe.c) fragmentViewBindingDelegate.getValue(this, lVarArr[0])).c.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 2));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((e) this.d.getValue());
    }

    @Override // com.amazon.aps.iva.te.g
    public final void y() {
        TextView textView = ((com.amazon.aps.iva.pe.c) this.e.getValue(this, g[0])).c;
        j.e(textView, "binding.onHoldUpdatePaymentCta");
        textView.setVisibility(8);
    }
}
