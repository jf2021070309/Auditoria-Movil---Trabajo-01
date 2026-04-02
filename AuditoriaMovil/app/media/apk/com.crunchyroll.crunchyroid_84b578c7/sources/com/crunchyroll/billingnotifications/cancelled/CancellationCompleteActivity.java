package com.crunchyroll.billingnotifications.cancelled;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ne.d;
import com.amazon.aps.iva.ne.e;
import com.amazon.aps.iva.ne.g;
import com.amazon.aps.iva.ne.h;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.billingnotifications.card.c;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CancellationCompleteActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/billingnotifications/cancelled/CancellationCompleteActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/ne/h;", "<init>", "()V", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CancellationCompleteActivity extends com.amazon.aps.iva.i60.b implements h {
    public static final /* synthetic */ int n = 0;
    public final m k = f.b(new b());
    public final m l = f.b(new c());
    public final m m = f.b(new a());

    /* compiled from: CancellationCompleteActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.pe.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.pe.a invoke() {
            View inflate = CancellationCompleteActivity.this.getLayoutInflater().inflate(R.layout.activity_cancellation_complete, (ViewGroup) null, false);
            int i = R.id.cancellation_complete_close_button;
            ImageView imageView = (ImageView) z.u(R.id.cancellation_complete_close_button, inflate);
            if (imageView != null) {
                i = R.id.cancellation_complete_cta;
                TextView textView = (TextView) z.u(R.id.cancellation_complete_cta, inflate);
                if (textView != null) {
                    i = R.id.cancellation_complete_hime;
                    if (((ImageView) z.u(R.id.cancellation_complete_hime, inflate)) != null) {
                        i = R.id.cancellation_complete_message;
                        TextView textView2 = (TextView) z.u(R.id.cancellation_complete_message, inflate);
                        if (textView2 != null) {
                            i = R.id.cancellation_complete_title;
                            if (((TextView) z.u(R.id.cancellation_complete_title, inflate)) != null) {
                                return new com.amazon.aps.iva.pe.a(imageView, textView, textView2, (ConstraintLayout) inflate);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CancellationCompleteActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            e eVar;
            Object obj;
            Bundle extras = CancellationCompleteActivity.this.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("input", e.class);
                } else {
                    obj = (e) extras.getSerializable("input");
                }
                eVar = (e) obj;
            } else {
                eVar = null;
            }
            j.c(eVar);
            return eVar;
        }
    }

    /* compiled from: CancellationCompleteActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ne.f> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ne.f invoke() {
            CancellationCompleteActivity cancellationCompleteActivity = CancellationCompleteActivity.this;
            e eVar = (e) cancellationCompleteActivity.k.getValue();
            com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
            if (bVar != null) {
                com.amazon.aps.iva.xb0.a a = bVar.a(cancellationCompleteActivity);
                com.amazon.aps.iva.we.b bVar2 = new com.amazon.aps.iva.we.b();
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                com.amazon.aps.iva.me.b bVar3 = com.amazon.aps.iva.a60.b.b;
                if (bVar3 != null) {
                    com.amazon.aps.iva.xb0.l<String, String> d = bVar3.d();
                    j.f(eVar, "input");
                    j.f(d, "geSkuTitle");
                    com.amazon.aps.iva.ne.b bVar4 = com.amazon.aps.iva.ne.b.h;
                    j.f(bVar4, "createTimer");
                    d dVar = new d(eVar, cVar, d, bVar4);
                    j.f(a, "premiumMembershipLauncher");
                    return new g(eVar, bVar2, dVar, a, cancellationCompleteActivity);
                }
                j.m("dependencies");
                throw null;
            }
            j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.ne.h
    public final void O4(c.e eVar) {
        j.f(eVar, "timeLeftUiModel");
        Resources resources = getResources();
        long j = eVar.g;
        String quantityString = resources.getQuantityString(eVar.h, (int) j, Long.valueOf(j));
        j.e(quantityString, "resources.getQuantityStr…el.numberOfDays\n        )");
        Resources resources2 = getResources();
        long j2 = eVar.f;
        int i = (int) j2;
        String quantityString2 = resources2.getQuantityString(eVar.d, i, Long.valueOf(j2), quantityString);
        j.e(quantityString2, "resources.getQuantityStr…   daysAppendix\n        )");
        String quantityString3 = getResources().getQuantityString(eVar.e, i, Long.valueOf(j2), quantityString);
        j.e(quantityString3, "resources.getQuantityStr…   daysAppendix\n        )");
        mi(quantityString3, quantityString2);
    }

    public final void mi(String str, String str2) {
        CharSequence charSequence;
        TextView textView = ((com.amazon.aps.iva.pe.a) this.m.getValue()).d;
        String string = getString(R.string.cancellation_complete_message, str);
        Typeface a2 = com.amazon.aps.iva.f3.f.a(R.font.lato_heavy, this);
        if (a2 != null) {
            j.e(string, "text");
            charSequence = m0.e(string, str2, com.amazon.aps.iva.d3.a.getColor(this, R.color.color_white), a2);
        } else {
            j.e(string, "text");
            charSequence = string;
        }
        textView.setText(charSequence);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m mVar = this.m;
        ConstraintLayout constraintLayout = ((com.amazon.aps.iva.pe.a) mVar.getValue()).a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        com.amazon.aps.iva.xw.b.d(this, true);
        ((com.amazon.aps.iva.pe.a) mVar.getValue()).b.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 0));
        ((com.amazon.aps.iva.pe.a) mVar.getValue()).c.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 2));
    }

    @Override // com.amazon.aps.iva.ne.h
    public final void pf(c.g gVar) {
        j.f(gVar, "timeLeftUiModel");
        long c2 = gVar.c();
        int i = (int) c2;
        String quantityString = getResources().getQuantityString(gVar.d, i, Long.valueOf(c2));
        j.e(quantityString, "resources.getQuantityStr…         number\n        )");
        String quantityString2 = getResources().getQuantityString(gVar.e, i, Long.valueOf(c2));
        j.e(quantityString2, "resources.getQuantityStr…         number\n        )");
        mi(quantityString2, quantityString);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.ne.f) this.l.getValue());
    }
}
