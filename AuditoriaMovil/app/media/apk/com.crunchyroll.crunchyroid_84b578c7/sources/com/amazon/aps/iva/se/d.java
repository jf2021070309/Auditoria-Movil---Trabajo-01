package com.amazon.aps.iva.se;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.c8.h;
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
/* compiled from: OnHoldNotificationDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/se/d;", "Lcom/amazon/aps/iva/i60/c;", "Lcom/amazon/aps/iva/se/g;", "<init>", "()V", "a", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.i60.c implements g {
    public final FragmentViewBindingDelegate d;
    public final com.amazon.aps.iva.se.c e;
    public final m f;
    public static final /* synthetic */ l<Object>[] h = {q.a(d.class, "binding", "getBinding()Lcom/ellation/crunchyroll/commonresources/databinding/LayoutSimpleDialogBinding;", 0)};
    public static final a g = new a();

    /* compiled from: OnHoldNotificationDialog.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: OnHoldNotificationDialog.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.uu.b> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.uu.b.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/commonresources/databinding/LayoutSimpleDialogBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.uu.b invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            return com.amazon.aps.iva.uu.b.a(view2);
        }
    }

    /* compiled from: OnHoldNotificationDialog.kt */
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
                com.amazon.aps.iva.se.c cVar2 = dVar.e;
                j.f(cVar2, "analytics");
                return new f(dVar, mVar, f, cVar2);
            }
            j.m("instance");
            throw null;
        }
    }

    public d() {
        super((Integer) null, 0, 7);
        this.d = com.amazon.aps.iva.a60.b.z(this, b.b);
        com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
        if (bVar != null) {
            com.amazon.aps.iva.me.j e = bVar.e();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(e, "experiment");
            com.amazon.aps.iva.se.a aVar = com.amazon.aps.iva.se.a.h;
            j.f(aVar, "createTimer");
            this.e = new com.amazon.aps.iva.se.c(cVar, e, aVar);
            this.f = com.amazon.aps.iva.kb0.f.b(new c());
            return;
        }
        j.m("dependencies");
        throw null;
    }

    public final com.amazon.aps.iva.uu.b ci() {
        return (com.amazon.aps.iva.uu.b) this.d.getValue(this, h[0]);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        ci().e.setText(getString(R.string.on_hold_dialog_title));
        TextView textView = ci().d;
        String string = getString(R.string.on_hold_dialog_subtitle);
        j.e(string, "getString(R.string.on_hold_dialog_subtitle)");
        String string2 = getString(R.string.on_hold_dialog_subtitle_colored);
        j.e(string2, "getString(R.string.on_ho…_dialog_subtitle_colored)");
        textView.setText(new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(requireContext(), com.ellation.crunchyroll.ui.R.color.white), string, string2)));
        ci().c.setText(getString(R.string.on_hold_dialog_update_payment_cta));
        ci().c.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 1));
        ci().b.setOnClickListener(new h(this, 3));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((e) this.f.getValue());
    }

    @Override // com.amazon.aps.iva.se.g
    public final void y() {
        TextView textView = ci().c;
        j.e(textView, "binding.dialogCta");
        textView.setVisibility(8);
    }
}
