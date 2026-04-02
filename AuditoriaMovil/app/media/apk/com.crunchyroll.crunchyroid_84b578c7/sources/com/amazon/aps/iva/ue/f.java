package com.amazon.aps.iva.ue;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.s;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: RenewNotificationDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/ue/f;", "Lcom/amazon/aps/iva/i60/c;", "Lcom/amazon/aps/iva/ue/j;", "<init>", "()V", "a", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.i60.c implements j {
    public final m d;
    public final s e;
    public final FragmentViewBindingDelegate f;
    public final m g;
    public static final /* synthetic */ l<Object>[] i = {defpackage.e.b(f.class, "input", "getInput()Lcom/crunchyroll/billingnotifications/renew/RenewNotificationInput;", 0), q.a(f.class, "binding", "getBinding()Lcom/ellation/crunchyroll/commonresources/databinding/LayoutSimpleDialogBinding;", 0)};
    public static final a h = new a();

    /* compiled from: RenewNotificationDialog.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: RenewNotificationDialog.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ue.d> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ue.d invoke() {
            a aVar = f.h;
            f fVar = f.this;
            fVar.getClass();
            g gVar = (g) fVar.e.getValue(fVar, f.i[0]);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
            if (bVar != null) {
                com.amazon.aps.iva.me.j e = bVar.e();
                com.amazon.aps.iva.yb0.j.f(e, "experiment");
                com.amazon.aps.iva.ue.c cVar2 = com.amazon.aps.iva.ue.c.h;
                com.amazon.aps.iva.yb0.j.f(cVar2, "createTimer");
                return new e(gVar, cVar, e, cVar2);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: RenewNotificationDialog.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.uu.b> {
        public static final c b = new c();

        public c() {
            super(1, com.amazon.aps.iva.uu.b.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/commonresources/databinding/LayoutSimpleDialogBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.uu.b invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            return com.amazon.aps.iva.uu.b.a(view2);
        }
    }

    /* compiled from: RenewNotificationDialog.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            a aVar = f.h;
            f fVar = f.this;
            fVar.getClass();
            g gVar = (g) fVar.e.getValue(fVar, f.i[0]);
            Context requireContext = fVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.k50.m mVar = new com.amazon.aps.iva.k50.m(requireContext);
            com.amazon.aps.iva.me.c cVar = com.amazon.aps.iva.a60.b.c;
            if (cVar != null) {
                com.amazon.aps.iva.ve.e f = cVar.f();
                com.amazon.aps.iva.ue.d dVar = (com.amazon.aps.iva.ue.d) fVar.d.getValue();
                com.amazon.aps.iva.yb0.j.f(f, "billingStatusStorage");
                com.amazon.aps.iva.yb0.j.f(dVar, "analytics");
                return new i(fVar, gVar, mVar, f, dVar);
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    public f() {
        super((Integer) null, 0, 7);
        this.d = com.amazon.aps.iva.kb0.f.b(new b());
        this.e = new s("renew_input");
        this.f = com.amazon.aps.iva.a60.b.z(this, c.b);
        this.g = com.amazon.aps.iva.kb0.f.b(new d());
    }

    @Override // com.amazon.aps.iva.ue.j
    public final void Y8(long j) {
        int i2 = (int) j;
        String quantityString = getResources().getQuantityString(R.plurals.billing_notification_card_hours_left_styled, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…     deltaHours\n        )");
        String quantityString2 = getResources().getQuantityString(R.plurals.billing_notification_card_hours_left, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString2, "resources.getQuantityStr…     deltaHours\n        )");
        TextView textView = ci().d;
        String string = getString(R.string.renew_dialog_subtitle, quantityString2);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.renew…btitle, toInsertSubtitle)");
        textView.setText(m0.b(com.amazon.aps.iva.d3.a.getColor(requireContext(), R.color.cr_honey_gold), string, quantityString));
    }

    @Override // com.amazon.aps.iva.ue.j
    public final void ab(long j) {
        int i2 = (int) j;
        String quantityString = getResources().getQuantityString(R.plurals.billing_notification_card_days_left_styled, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…      deltaDays\n        )");
        String quantityString2 = getResources().getQuantityString(R.plurals.billing_notification_card_days_left, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString2, "resources.getQuantityStr…      deltaDays\n        )");
        TextView textView = ci().d;
        String string = getString(R.string.renew_dialog_subtitle, quantityString2);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.renew…btitle, toInsertSubtitle)");
        textView.setText(m0.b(com.amazon.aps.iva.d3.a.getColor(requireContext(), R.color.cr_honey_gold), string, quantityString));
    }

    public final com.amazon.aps.iva.uu.b ci() {
        return (com.amazon.aps.iva.uu.b) this.f.getValue(this, i[1]);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ci().e.setText(getString(R.string.renew_dialog_title));
        ci().c.setText(getString(R.string.renew_dialog_cta));
        ci().c.setOnClickListener(new r(this, 2));
        ci().b.setOnClickListener(new com.amazon.aps.iva.c8.s(this, 4));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((h) this.g.getValue());
    }

    @Override // com.amazon.aps.iva.ue.j
    public final void y() {
        TextView textView = ci().c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.dialogCta");
        textView.setVisibility(8);
    }
}
