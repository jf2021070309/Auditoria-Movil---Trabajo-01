package com.ellation.crunchyroll.presentation.multitiersubscription.disclaimer;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.b30.c;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.n20.e;
import com.amazon.aps.iva.rs.m;
import com.amazon.aps.iva.rs.n;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CrPlusLegalDisclaimerTextView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/disclaimer/CrPlusLegalDisclaimerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/amazon/aps/iva/wy/h;", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CrPlusLegalDisclaimerTextView extends AppCompatTextView implements h {

    /* compiled from: CrPlusLegalDisclaimerTextView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<View, String, q> {
        public final /* synthetic */ j h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(2);
            this.h = jVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(view2, "view");
            com.amazon.aps.iva.yb0.j.f(str2, "text");
            this.h.w5(r.p(view2, str2));
            return q.a;
        }
    }

    /* compiled from: CrPlusLegalDisclaimerTextView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<View, String, q> {
        public final /* synthetic */ j h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(2);
            this.h = jVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(view2, "view");
            com.amazon.aps.iva.yb0.j.f(str2, "text");
            this.h.C1(r.p(view2, str2));
            return q.a;
        }
    }

    public CrPlusLegalDisclaimerTextView() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrPlusLegalDisclaimerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public final void U2(String str, c cVar, j jVar) {
        m.b bVar;
        String string;
        com.amazon.aps.iva.yb0.j.f(cVar, "model");
        com.amazon.aps.iva.yb0.j.f(jVar, "presenter");
        m mVar = cVar.i;
        n nVar = null;
        if (mVar instanceof m.b) {
            bVar = (m.b) mVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            nVar = bVar.b();
        }
        e eVar = cVar.e;
        if (nVar != null) {
            com.amazon.aps.iva.ss.b bVar2 = nVar.e;
            int i = bVar2.b;
            int i2 = nVar.f;
            int i3 = i * i2;
            Resources resources = getResources();
            Object[] objArr = new Object[3];
            String str2 = nVar.b;
            if (i2 > 1) {
                str2 = getResources().getString(R.string.price_per_period, str2, getResources().getString(bVar2.c.getResId()));
            }
            objArr[0] = str2;
            objArr[1] = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar2), i3, Integer.valueOf(i3));
            objArr[2] = getResources().getString(R.string.price_per_period, eVar.a, getResources().getString(eVar.d.b()));
            String string2 = resources.getString(R.string.intro_offer_payment_info, objArr);
            com.amazon.aps.iva.yb0.j.e(string2, "resources.getString(\n   …)\n            )\n        )");
            string = getResources().getString(R.string.cr_plus_legal_disclaimer_intro_offer, str, string2, getResources().getString(R.string.cr_plus_legal_disclaimer_privacy_policy), getResources().getString(R.string.cr_plus_legal_disclaimer_terms));
        } else {
            string = getResources().getString(R.string.cr_plus_legal_disclaimer, str, getResources().getString(R.string.price_per_period, eVar.a, getResources().getString(eVar.d.b())), getResources().getString(R.string.cr_plus_legal_disclaimer_privacy_policy), getResources().getString(R.string.cr_plus_legal_disclaimer_terms));
        }
        com.amazon.aps.iva.yb0.j.e(string, "if (introPhase != null) …)\n            )\n        }");
        String string3 = getResources().getString(R.string.cr_plus_legal_disclaimer_privacy_policy);
        com.amazon.aps.iva.yb0.j.e(string3, "resources.getString(\n   …icy\n                    )");
        com.amazon.aps.iva.xw.p pVar = new com.amazon.aps.iva.xw.p(string3, new a(jVar), false);
        String string4 = getResources().getString(R.string.cr_plus_legal_disclaimer_terms);
        com.amazon.aps.iva.yb0.j.e(string4, "resources.getString(R.st…s_legal_disclaimer_terms)");
        r0.b(this, m0.g(string, pVar, new com.amazon.aps.iva.xw.p(string4, new b(jVar), false)));
    }
}
