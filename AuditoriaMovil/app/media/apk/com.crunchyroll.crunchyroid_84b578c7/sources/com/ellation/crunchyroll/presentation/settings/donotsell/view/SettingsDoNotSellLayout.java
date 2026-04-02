package com.ellation.crunchyroll.presentation.settings.donotsell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.c40.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.k50.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SettingsDoNotSellView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/presentation/settings/donotsell/view/SettingsDoNotSellLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/c40/a;", "Landroid/widget/TextView;", "c", "Lcom/amazon/aps/iva/bc0/b;", "getDoNotSelSubtitle", "()Landroid/widget/TextView;", "doNotSelSubtitle", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SettingsDoNotSellLayout extends g implements com.amazon.aps.iva.c40.a {
    public static final /* synthetic */ l<Object>[] d = {q.a(SettingsDoNotSellLayout.class, "doNotSelSubtitle", "getDoNotSelSubtitle()Landroid/widget/TextView;", 0)};
    public final b b;
    public final v c;

    /* compiled from: SettingsDoNotSellView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<View, String, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(View view, String str) {
            j.f(view, "<anonymous parameter 0>");
            j.f(str, "<anonymous parameter 1>");
            SettingsDoNotSellLayout.this.b.getView().n4();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsDoNotSellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final TextView getDoNotSelSubtitle() {
        return (TextView) this.c.getValue(this, d[0]);
    }

    @Override // com.amazon.aps.iva.c40.a
    public final void n4() {
        int i = com.amazon.aps.iva.k50.b.a;
        Context context = getContext();
        j.e(context, "context");
        c cVar = new c(context, "");
        String string = getResources().getString(R.string.privacy_center_url);
        j.e(string, "resources.getString(R.string.privacy_center_url)");
        String string2 = getContext().getString(R.string.privacy_center_open_fallback_dialog_message);
        j.e(string2, "context.getString(R.stri…_fallback_dialog_message)");
        String string3 = getContext().getString(R.string.privacy_center);
        j.e(string3, "context.getString(R.string.privacy_center)");
        cVar.s1(string, string2, string3);
    }

    @Override // com.amazon.aps.iva.c40.a
    public final void qe() {
        String string = getResources().getString(R.string.privacy_center);
        j.e(string, "resources.getString(R.string.privacy_center)");
        String string2 = getResources().getString(R.string.do_not_sell_subtitle, string);
        j.e(string2, "resources.getString(R.st…_subtitle, clickableText)");
        r0.b(getDoNotSelSubtitle(), m0.g(string2, new com.amazon.aps.iva.xw.p(string, new a(), false)));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsDoNotSellLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new b(this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.do_not_sell_subtitle, this);
        View.inflate(context, R.layout.layout_settings_do_not_sell, this);
    }
}
