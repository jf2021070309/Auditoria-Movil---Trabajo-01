package com.crunchyroll.contentrating.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.h;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.j50.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.uf.c;
import com.amazon.aps.iva.uf.e;
import com.amazon.aps.iva.uf.f;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: RatingControls.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R(\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/crunchyroll/contentrating/controls/RatingControlsLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/uf/c;", "Lcom/amazon/aps/iva/uf/e;", "value", "getListener", "()Lcom/amazon/aps/iva/uf/e;", "setListener", "(Lcom/amazon/aps/iva/uf/e;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "content-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RatingControlsLayout extends g implements c {
    public final com.amazon.aps.iva.vf.b b;
    public final com.amazon.aps.iva.uf.g c;

    /* compiled from: RatingControls.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends i implements com.amazon.aps.iva.xb0.a<q> {
        public a(com.amazon.aps.iva.uf.g gVar) {
            super(0, gVar, f.class, "onLike", "onLike()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((f) this.receiver).y1();
            return q.a;
        }
    }

    /* compiled from: RatingControls.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.a<q> {
        public b(com.amazon.aps.iva.uf.g gVar) {
            super(0, gVar, f.class, "onDislike", "onDislike()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((f) this.receiver).Q5();
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingControlsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void Bh() {
        com.amazon.aps.iva.vf.b bVar = this.b;
        ((RateButtonLayout) bVar.d).setClickable(false);
        ((RateButtonLayout) bVar.c).setClickable(false);
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void Fg() {
        String string = getResources().getString(R.string.content_rating_like);
        j.e(string, "resources.getString(R.string.content_rating_like)");
        Locale locale = Locale.getDefault();
        j.e(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        String string2 = getResources().getString(R.string.content_rating_dislike);
        j.e(string2, "resources.getString(R.st…g.content_rating_dislike)");
        Locale locale2 = Locale.getDefault();
        j.e(locale2, "getDefault()");
        String upperCase2 = string2.toUpperCase(locale2);
        j.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        com.amazon.aps.iva.vf.b bVar = this.b;
        ((RateButtonLayout) bVar.d).b1(new d(upperCase, 0, false, false, 7));
        ((RateButtonLayout) bVar.c).b1(new d(upperCase2, 0, false, false, 7));
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void Q1(d dVar) {
        ((RateButtonLayout) this.b.d).b1(dVar);
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void a9(d dVar) {
        ((RateButtonLayout) this.b.c).b1(dVar);
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void ah() {
        com.amazon.aps.iva.vf.b bVar = this.b;
        RateButtonLayout rateButtonLayout = (RateButtonLayout) bVar.d;
        j.e(rateButtonLayout, "binding.likeButton");
        rateButtonLayout.setEnabled(false);
        RateButtonLayout rateButtonLayout2 = (RateButtonLayout) bVar.c;
        j.e(rateButtonLayout2, "binding.dislikeButton");
        rateButtonLayout2.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void dh() {
        com.amazon.aps.iva.vf.b bVar = this.b;
        RateButtonLayout rateButtonLayout = (RateButtonLayout) bVar.d;
        j.e(rateButtonLayout, "binding.likeButton");
        rateButtonLayout.setEnabled(true);
        RateButtonLayout rateButtonLayout2 = (RateButtonLayout) bVar.c;
        j.e(rateButtonLayout2, "binding.dislikeButton");
        rateButtonLayout2.setEnabled(true);
    }

    public final e getListener() {
        return this.c.c;
    }

    @Override // com.amazon.aps.iva.uf.c
    public final void performHapticFeedback() {
        performHapticFeedback(1);
    }

    public final void setListener(e eVar) {
        this.c.c = eVar;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingControlsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_content_rating_controls, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.dislike_button;
        RateButtonLayout rateButtonLayout = (RateButtonLayout) z.u(R.id.dislike_button, inflate);
        if (rateButtonLayout != null) {
            i2 = R.id.like_button;
            RateButtonLayout rateButtonLayout2 = (RateButtonLayout) z.u(R.id.like_button, inflate);
            if (rateButtonLayout2 != null) {
                this.b = new com.amazon.aps.iva.vf.b((LinearLayoutCompat) inflate, rateButtonLayout, rateButtonLayout2, 0);
                com.amazon.aps.iva.sf.d dVar = w.f;
                if (dVar != null) {
                    l<h, com.amazon.aps.iva.sf.b> a2 = dVar.a();
                    Context context2 = getContext();
                    j.d(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    com.amazon.aps.iva.sf.b invoke = a2.invoke((h) context2);
                    j.f(invoke, "pendingStateRouter");
                    com.amazon.aps.iva.uf.g gVar = new com.amazon.aps.iva.uf.g(this, invoke);
                    this.c = gVar;
                    rateButtonLayout2.U2(new com.amazon.aps.iva.uf.d(this), new a(gVar));
                    rateButtonLayout.U2(new com.amazon.aps.iva.uf.d(this), new b(gVar));
                    return;
                }
                j.m("dependencies");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
