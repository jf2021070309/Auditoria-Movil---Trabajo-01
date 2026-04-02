package com.ellation.crunchyroll.inappupdates.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g;
import com.amazon.aps.iva.c8.e;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.oy.b;
import com.amazon.aps.iva.py.a;
import com.amazon.aps.iva.py.c;
import com.amazon.aps.iva.py.d;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: InAppUpdatesLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/inappupdates/view/InAppUpdatesLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/py/c;", "Lcom/amazon/aps/iva/i5/o;", "Lcom/amazon/aps/iva/py/d;", "b", "Lcom/amazon/aps/iva/py/d;", "getInAppUpdatesVisibilityListener", "()Lcom/amazon/aps/iva/py/d;", "setInAppUpdatesVisibilityListener", "(Lcom/amazon/aps/iva/py/d;)V", "inAppUpdatesVisibilityListener", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "in-app-updates_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class InAppUpdatesLayout extends ConstraintLayout implements c, o {
    public static final /* synthetic */ int e = 0;
    public d b;
    public final a c;
    public final com.amazon.aps.iva.ny.a d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppUpdatesLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.py.c
    public final void Le() {
        int i = h.a;
        FrameLayout frameLayout = (FrameLayout) this.d.h;
        j.e(frameLayout, "binding.messageLayout");
        h.a.a(frameLayout, com.amazon.aps.iva.my.c.b);
    }

    @Override // com.amazon.aps.iva.py.c
    public final void f() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.d.c;
        j.e(constraintLayout, "binding.updateDialogLayout");
        constraintLayout.setVisibility(8);
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public final d getInAppUpdatesVisibilityListener() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.py.c
    public final void jg(com.amazon.aps.iva.oy.a aVar) {
        j.f(aVar, "updateStatus");
        com.amazon.aps.iva.ny.a aVar2 = this.d;
        ((TextView) aVar2.d).setText(aVar.a);
        View view = aVar2.f;
        ((TextView) view).setText(aVar.b);
        TextView textView = (TextView) view;
        j.e(textView, "binding.inAppUpdatesPositiveButtonText");
        int i = aVar.h;
        t0.j(textView, Integer.valueOf(t0.a(i, this)), null, Integer.valueOf(t0.a(i, this)), null, 10);
        View view2 = aVar2.e;
        ((TextView) view2).setText(aVar.c);
        ((TextView) view).setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), aVar.d));
        ((TextView) view2).setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), aVar.e));
        ((TextView) view).setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), aVar.f));
        ((TextView) view2).setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), aVar.g));
    }

    @Override // com.amazon.aps.iva.py.c
    public final void k() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.d.c;
        j.e(constraintLayout, "binding.updateDialogLayout");
        constraintLayout.setVisibility(0);
        d dVar = this.b;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ellation.crunchyroll.mvp.lifecycle.a.a(this.c, this);
        com.amazon.aps.iva.ny.a aVar = this.d;
        ((TextView) aVar.f).setOnClickListener(new e(this, 12));
        ((TextView) aVar.e).setOnClickListener(new f(this, 13));
    }

    public final void setInAppUpdatesVisibilityListener(d dVar) {
        this.b = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdatesLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        b bVar = l1.c;
        if (bVar != null) {
            com.amazon.aps.iva.my.d dVar = l1.d;
            if (dVar != null) {
                com.amazon.aps.iva.xb0.a<Boolean> a = dVar.a();
                j.f(a, "canShowInAppUpdates");
                this.c = new a(this, bVar, a);
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_in_app_updates, (ViewGroup) this, false);
                addView(inflate);
                int i2 = R.id.in_app_updates_message;
                TextView textView = (TextView) z.u(R.id.in_app_updates_message, inflate);
                if (textView != null) {
                    i2 = R.id.in_app_updates_negative_button;
                    TextView textView2 = (TextView) z.u(R.id.in_app_updates_negative_button, inflate);
                    if (textView2 != null) {
                        i2 = R.id.in_app_updates_positive_button;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.in_app_updates_positive_button, inflate);
                        if (frameLayout != null) {
                            i2 = R.id.in_app_updates_positive_button_text;
                            TextView textView3 = (TextView) z.u(R.id.in_app_updates_positive_button_text, inflate);
                            if (textView3 != null) {
                                i2 = R.id.message_layout;
                                FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.message_layout, inflate);
                                if (frameLayout2 != null) {
                                    i2 = R.id.update_dialog_layout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.update_dialog_layout, inflate);
                                    if (constraintLayout != null) {
                                        this.d = new com.amazon.aps.iva.ny.a((ConstraintLayout) inflate, textView, textView2, frameLayout, textView3, frameLayout2, constraintLayout);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            }
            j.m("dependencies");
            throw null;
        }
        j.m("inAppUpdatesManager");
        throw null;
    }
}
