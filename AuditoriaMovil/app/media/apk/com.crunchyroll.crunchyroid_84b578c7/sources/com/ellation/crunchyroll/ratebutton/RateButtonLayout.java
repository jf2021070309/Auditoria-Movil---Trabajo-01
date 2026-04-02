package com.ellation.crunchyroll.ratebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.j50.a;
import com.amazon.aps.iva.j50.b;
import com.amazon.aps.iva.j50.c;
import com.amazon.aps.iva.j50.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.on.f;
import com.amazon.aps.iva.wf.d;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z9.d0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: RateButtonLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/ratebutton/RateButtonLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/j50/e;", "", "ratesCount", "Lcom/amazon/aps/iva/kb0/q;", "setRatesCount", "", "enabled", "setEnabled", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RateButtonLayout extends g implements e {
    public static final /* synthetic */ int e = 0;
    public c b;
    public final f c;
    public final a d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RateButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void Cg() {
        f fVar = this.c;
        fVar.a().setSelected(false);
        fVar.a().setContentDescription(getResources().getText(this.d.f));
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void Ld() {
        TextView textView = this.c.d;
        j.e(textView, "binding.ratesCount");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void O9() {
        f fVar = this.c;
        ImageView imageView = fVar.c;
        j.e(imageView, "binding.rateImage");
        imageView.setVisibility(0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) fVar.e;
        j.e(lottieAnimationView, "binding.rateAnimation");
        lottieAnimationView.setVisibility(4);
        ((LottieAnimationView) fVar.e).setProgress(0.0f);
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void Pb() {
        playAnimation(this.d.d);
    }

    public final void U2(com.amazon.aps.iva.j50.f fVar, com.amazon.aps.iva.xb0.a<q> aVar) {
        a aVar2 = this.d;
        j.f(aVar2, "config");
        this.b = new c(this, aVar2, fVar);
        setOnClickListener(new d(4, aVar));
        f fVar2 = this.c;
        fVar2.c.setImageResource(aVar2.a);
        fVar2.d.setTextColor(com.amazon.aps.iva.d3.a.getColorStateList(getContext(), aVar2.b));
    }

    public final void b1(com.amazon.aps.iva.j50.d dVar) {
        boolean z;
        c cVar = this.b;
        if (cVar != null) {
            com.amazon.aps.iva.j50.d dVar2 = cVar.d;
            boolean z2 = true;
            boolean z3 = dVar.a;
            if (dVar2 != null && dVar2.a == z3) {
                z = true;
            } else {
                z = false;
            }
            if (z || !dVar.c) {
                z2 = false;
            }
            cVar.d = dVar;
            cVar.getView().cancelAnimations();
            if (!z2) {
                cVar.getView().O9();
            } else if (z3) {
                cVar.getView().u5();
            } else {
                cVar.getView().Pb();
            }
            boolean z4 = cVar.b.c;
            int i = dVar.b;
            if (z4 && i <= 0) {
                cVar.getView().Ld();
            } else {
                e view = cVar.getView();
                String str = dVar.d;
                if (str == null) {
                    str = cVar.c.a(i);
                }
                view.setRatesCount(str);
                cVar.getView().ee();
            }
            if (z3) {
                cVar.getView().m5();
            } else {
                cVar.getView().Cg();
            }
            ((LottieAnimationView) this.c.e).f.c.addListener(new b(this));
            return;
        }
        j.m("presenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void cancelAnimations() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.c.e;
        lottieAnimationView.l.add(LottieAnimationView.c.PLAY_OPTION);
        d0 d0Var = lottieAnimationView.f;
        d0Var.h.clear();
        d0Var.c.cancel();
        if (!d0Var.isVisible()) {
            d0Var.g = d0.c.NONE;
        }
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void ee() {
        TextView textView = this.c.d;
        j.e(textView, "binding.ratesCount");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void m5() {
        f fVar = this.c;
        fVar.a().setSelected(true);
        fVar.a().setContentDescription(getResources().getText(this.d.g));
    }

    public final void playAnimation(int i) {
        f fVar = this.c;
        ImageView imageView = fVar.c;
        j.e(imageView, "binding.rateImage");
        imageView.setVisibility(4);
        ImageView imageView2 = fVar.e;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) imageView2;
        j.e(lottieAnimationView, "binding.rateAnimation");
        lottieAnimationView.setVisibility(0);
        ((LottieAnimationView) imageView2).setAnimation(i);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) imageView2;
        lottieAnimationView2.l.add(LottieAnimationView.c.PLAY_OPTION);
        lottieAnimationView2.f.j();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        boolean isEnabled = isEnabled();
        f fVar = this.c;
        if (isEnabled) {
            ConstraintLayout a = fVar.a();
            j.e(a, "binding.root");
            a.setEnabled(true);
            return;
        }
        ConstraintLayout a2 = fVar.a();
        j.e(a2, "binding.root");
        a2.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.j50.e
    public void setRatesCount(String str) {
        j.f(str, "ratesCount");
        this.c.d.setText(str);
    }

    @Override // com.amazon.aps.iva.j50.e
    public final void u5() {
        playAnimation(this.d.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_rate_button, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.rate_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) z.u(R.id.rate_animation, inflate);
        if (lottieAnimationView != null) {
            i2 = R.id.rate_image;
            ImageView imageView = (ImageView) z.u(R.id.rate_image, inflate);
            if (imageView != null) {
                i2 = R.id.rates_count;
                TextView textView = (TextView) z.u(R.id.rates_count, inflate);
                if (textView != null) {
                    this.c = new f((ConstraintLayout) inflate, lottieAnimationView, imageView, textView);
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.z60.b.a, 0, 0);
                    j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
                    int resourceId = obtainStyledAttributes.getResourceId(4, 0);
                    int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
                    boolean z = obtainStyledAttributes.getBoolean(3, false);
                    int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                    int resourceId4 = obtainStyledAttributes.getResourceId(1, 0);
                    int resourceId5 = obtainStyledAttributes.getResourceId(2, -1);
                    int i3 = resourceId5 != -1 ? resourceId5 : 0;
                    int resourceId6 = obtainStyledAttributes.getResourceId(5, -1);
                    a aVar = new a(resourceId, resourceId2, resourceId3, resourceId4, i3, resourceId6 != -1 ? resourceId6 : 0, z);
                    obtainStyledAttributes.recycle();
                    this.d = aVar;
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
