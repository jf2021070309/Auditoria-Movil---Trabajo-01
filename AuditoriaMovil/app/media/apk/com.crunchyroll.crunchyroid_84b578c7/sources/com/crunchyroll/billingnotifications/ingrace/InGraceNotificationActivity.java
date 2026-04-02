package com.crunchyroll.billingnotifications.ingrace;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.me.j;
import com.amazon.aps.iva.qe.e;
import com.amazon.aps.iva.qe.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InGraceNotificationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/billingnotifications/ingrace/InGraceNotificationActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/qe/g;", "<init>", "()V", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InGraceNotificationActivity extends com.amazon.aps.iva.i60.b implements g {
    public static final /* synthetic */ int o = 0;
    public final m k = f.b(new c());
    public final m l = f.b(new b());
    public final m m = f.b(new a());
    public final m n = f.b(new d());

    /* compiled from: InGraceNotificationActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.qe.b> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.qe.b invoke() {
            com.amazon.aps.iva.qe.d dVar = (com.amazon.aps.iva.qe.d) InGraceNotificationActivity.this.k.getValue();
            com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
            if (bVar != null) {
                j e = bVar.e();
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                com.amazon.aps.iva.yb0.j.f(dVar, "input");
                com.amazon.aps.iva.yb0.j.f(e, "experiment");
                com.amazon.aps.iva.qe.a aVar = com.amazon.aps.iva.qe.a.h;
                com.amazon.aps.iva.yb0.j.f(aVar, "createTimer");
                return new com.amazon.aps.iva.qe.c(dVar, cVar, e, aVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: InGraceNotificationActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.pe.b> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.pe.b invoke() {
            View inflate = InGraceNotificationActivity.this.getLayoutInflater().inflate(R.layout.activity_in_grace_notification, (ViewGroup) null, false);
            int i = R.id.in_grace_hime;
            if (((ImageView) z.u(R.id.in_grace_hime, inflate)) != null) {
                i = R.id.in_grace_not_now_cta;
                TextView textView = (TextView) z.u(R.id.in_grace_not_now_cta, inflate);
                if (textView != null) {
                    i = R.id.in_grace_subtitle;
                    TextView textView2 = (TextView) z.u(R.id.in_grace_subtitle, inflate);
                    if (textView2 != null) {
                        i = R.id.in_grace_title;
                        TextView textView3 = (TextView) z.u(R.id.in_grace_title, inflate);
                        if (textView3 != null) {
                            i = R.id.in_grace_update_payment_cta;
                            TextView textView4 = (TextView) z.u(R.id.in_grace_update_payment_cta, inflate);
                            if (textView4 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                                if (toolbar != null) {
                                    return new com.amazon.aps.iva.pe.b((ConstraintLayout) inflate, textView, textView2, textView3, textView4, toolbar);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: InGraceNotificationActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.qe.d> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.qe.d invoke() {
            com.amazon.aps.iva.qe.d dVar;
            Object obj;
            Bundle extras = InGraceNotificationActivity.this.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("in_grace_input", com.amazon.aps.iva.qe.d.class);
                } else {
                    obj = (com.amazon.aps.iva.qe.d) extras.getSerializable("in_grace_input");
                }
                dVar = (com.amazon.aps.iva.qe.d) obj;
            } else {
                dVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(dVar);
            return dVar;
        }
    }

    /* compiled from: InGraceNotificationActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<e> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            InGraceNotificationActivity inGraceNotificationActivity = InGraceNotificationActivity.this;
            com.amazon.aps.iva.qe.d dVar = (com.amazon.aps.iva.qe.d) inGraceNotificationActivity.k.getValue();
            com.amazon.aps.iva.qe.b bVar = (com.amazon.aps.iva.qe.b) inGraceNotificationActivity.m.getValue();
            com.amazon.aps.iva.me.c cVar = com.amazon.aps.iva.a60.b.c;
            if (cVar != null) {
                com.amazon.aps.iva.ve.e f = cVar.f();
                com.amazon.aps.iva.k50.m mVar = new com.amazon.aps.iva.k50.m(inGraceNotificationActivity);
                com.amazon.aps.iva.yb0.j.f(dVar, "input");
                com.amazon.aps.iva.yb0.j.f(bVar, "analytics");
                com.amazon.aps.iva.yb0.j.f(f, "billingStatusStorage");
                return new com.amazon.aps.iva.qe.f(inGraceNotificationActivity, dVar, bVar, f, mVar);
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void Kg() {
        TextView textView = mi().b;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.inGraceNotNowCta");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void Ta(int i) {
        String string = getResources().getString(R.string.billing_notification_generic_days_left_colored);
        com.amazon.aps.iva.yb0.j.e(string, "resources.getString(\n   …ys_left_colored\n        )");
        TextView textView = mi().c;
        String string2 = getString(i, string);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(subtitle, coloredSubtitle)");
        textView.setText(new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.cr_honey_gold), string2, string)));
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void Ug(int i) {
        mi().d.setText(getString(i));
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void h9(int i, long j) {
        String quantityString = getResources().getQuantityString(R.plurals.billing_notification_days_left, (int) j, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…      deltaDays\n        )");
        TextView textView = mi().c;
        String string = getString(i, quantityString);
        com.amazon.aps.iva.yb0.j.e(string, "getString(subtitle, coloredSubtitle)");
        textView.setText(new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.cr_honey_gold), string, quantityString)));
    }

    public final com.amazon.aps.iva.pe.b mi() {
        return (com.amazon.aps.iva.pe.b) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        mi().f.setNavigationIcon(R.drawable.ic_cross);
        mi().e.setOnClickListener(new r(this, 1));
        mi().b.setOnClickListener(new s(this, 3));
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void s7(int i, long j) {
        int i2 = (int) j;
        String quantityString = getResources().getQuantityString(R.plurals.billing_notification_hours_left_colored, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…     deltaHours\n        )");
        String quantityString2 = getResources().getQuantityString(R.plurals.billing_notification_hours_left, i2, Long.valueOf(j));
        com.amazon.aps.iva.yb0.j.e(quantityString2, "resources.getQuantityStr…     deltaHours\n        )");
        TextView textView = mi().c;
        String string = getString(i, quantityString2);
        com.amazon.aps.iva.yb0.j.e(string, "getString(subtitle, toInsertSubtitle)");
        textView.setText(new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.cr_honey_gold), string, quantityString)));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((e) this.n.getValue());
    }

    @Override // com.amazon.aps.iva.qe.g
    public final void y() {
        TextView textView = mi().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.inGraceUpdatePaymentCta");
        textView.setVisibility(8);
    }
}
