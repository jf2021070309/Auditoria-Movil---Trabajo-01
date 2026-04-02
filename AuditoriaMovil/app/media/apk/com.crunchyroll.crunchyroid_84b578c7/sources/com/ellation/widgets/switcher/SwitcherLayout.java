package com.ellation.widgets.switcher;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.mj.i;
import com.amazon.aps.iva.v70.b;
import com.amazon.aps.iva.v70.c;
import com.amazon.aps.iva.v70.d;
import com.amazon.aps.iva.v70.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: SwitcherLayout.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ellation/widgets/switcher/SwitcherLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/v70/e;", "", "title", "Lcom/amazon/aps/iva/kb0/q;", "setButtonOneText", "setButtonTwoText", "Lcom/amazon/aps/iva/v70/b;", "getCurrentSwitcherItem", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SwitcherLayout extends g implements e {
    public static final /* synthetic */ int i = 0;
    public final i b;
    public final c c;
    public com.amazon.aps.iva.v70.a d;
    public d e;
    public boolean f;
    public final int g;
    public final int h;

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ SwitcherLayout c;

        public a(ConstraintLayout constraintLayout, SwitcherLayout switcherLayout) {
            this.b = constraintLayout;
            this.c = switcherLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                SwitcherLayout switcherLayout = this.c;
                SwitcherLayout.b1(switcherLayout);
                switcherLayout.C3();
                switcherLayout.Ub();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitcherLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static final void b1(SwitcherLayout switcherLayout) {
        switcherLayout.f = false;
        i iVar = switcherLayout.b;
        float width = iVar.d.getWidth();
        Context context = switcherLayout.getContext();
        j.e(context, "context");
        if (q.f(context)) {
            width = -width;
        }
        iVar.d.setTranslationX(width);
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void C3() {
        ((TextView) this.b.e).setTextColor(this.h);
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void De() {
        this.b.b.setTextColor(this.h);
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void K6() {
        this.f = false;
        i iVar = this.b;
        float width = iVar.d.getWidth();
        Context context = getContext();
        j.e(context, "context");
        if (q.f(context)) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iVar.d, "translationX", width);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void U2(d dVar, com.amazon.aps.iva.v70.a aVar) {
        j.f(dVar, "model");
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c cVar = this.c;
        cVar.getClass();
        cVar.getView().setButtonOneText(dVar.a.a);
        cVar.getView().setButtonTwoText(dVar.b.a);
        this.e = dVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void Ub() {
        this.b.b.setTextColor(this.g);
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void Yb() {
        this.f = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b.d, "translationX", 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final b getCurrentSwitcherItem() {
        if (this.f) {
            d dVar = this.e;
            if (dVar != null) {
                return dVar.a;
            }
            j.m("switcherUiModel");
            throw null;
        }
        d dVar2 = this.e;
        if (dVar2 != null) {
            return dVar2.b;
        }
        j.m("switcherUiModel");
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f = bundle.getBoolean("SWITCHER_LAYOUT_STATE", true);
            parcelable = bundle.getParcelable("SWITCHER_LAYOUT_PARENT_STATE");
            if (!this.f) {
                ConstraintLayout a2 = this.b.a();
                if (a2.isLaidOut()) {
                    b1(this);
                    C3();
                    Ub();
                } else {
                    a2.getViewTreeObserver().addOnGlobalLayoutListener(new a(a2, this));
                }
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("SWITCHER_LAYOUT_STATE", this.f);
        bundle.putParcelable("SWITCHER_LAYOUT_PARENT_STATE", super.onSaveInstanceState());
        return bundle;
    }

    @Override // com.amazon.aps.iva.v70.e
    public final void pc() {
        ((TextView) this.b.e).setTextColor(this.g);
    }

    @Override // com.amazon.aps.iva.v70.e
    public void setButtonOneText(int i2) {
        this.b.b.setText(getContext().getText(i2));
    }

    @Override // com.amazon.aps.iva.v70.e
    public void setButtonTwoText(int i2) {
        ((TextView) this.b.e).setText(getContext().getText(i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitcherLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_switcher, (ViewGroup) this, false);
        addView(inflate);
        int i3 = R.id.focused_background;
        View u = z.u(R.id.focused_background, inflate);
        if (u != null) {
            i3 = R.id.switcher_button_one;
            TextView textView = (TextView) z.u(R.id.switcher_button_one, inflate);
            if (textView != null) {
                i3 = R.id.switcher_button_two;
                TextView textView2 = (TextView) z.u(R.id.switcher_button_two, inflate);
                if (textView2 != null) {
                    this.b = new i(u, textView, textView2, (ConstraintLayout) inflate);
                    this.c = new c(this);
                    this.f = true;
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.z60.b.b, 0, 0);
                    j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
                    int color = context.getColor(obtainStyledAttributes.getResourceId(0, 0));
                    this.g = color;
                    int color2 = context.getColor(obtainStyledAttributes.getResourceId(1, 0));
                    this.h = color2;
                    obtainStyledAttributes.recycle();
                    textView.setTextColor(color2);
                    textView.setOnClickListener(new r(this, 20));
                    textView2.setTextColor(color);
                    textView2.setOnClickListener(new s(this, 25));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }
}
