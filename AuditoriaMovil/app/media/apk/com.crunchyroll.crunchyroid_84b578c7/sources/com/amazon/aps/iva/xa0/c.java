package com.amazon.aps.iva.xa0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.p3.u;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Insetter.kt */
/* loaded from: classes4.dex */
public final class c implements u {
    public final /* synthetic */ a a;
    public final /* synthetic */ i b;

    public c(a aVar, i iVar) {
        this.a = aVar;
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.p3.u
    public final w0 onApplyWindowInsets(View view, w0 w0Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        w0 w0Var2 = new w0(w0Var);
        a aVar = this.a;
        aVar.b = w0Var2;
        j.e(view, "v");
        i iVar = this.b;
        j.f(iVar, "initialState");
        if (Log.isLoggable("Insetter", 3)) {
            view.toString();
            iVar.toString();
        }
        g a = aVar.c.a(aVar.a);
        int i5 = a.a;
        boolean z3 = true;
        if ((a.b | i5 | a.c | a.d) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            h hVar = iVar.a;
            if (i5 != 0) {
                paddingLeft = hVar.a + w0Var.a(i5).a;
            } else {
                paddingLeft = view.getPaddingLeft();
            }
            int i6 = a.b;
            if (i6 != 0) {
                paddingTop = hVar.b + w0Var.a(i6).b;
            } else {
                paddingTop = view.getPaddingTop();
            }
            int i7 = a.c;
            if (i7 != 0) {
                paddingRight = hVar.c + w0Var.a(i7).c;
            } else {
                paddingRight = view.getPaddingRight();
            }
            int i8 = a.d;
            if (i8 != 0) {
                paddingBottom = hVar.d + w0Var.a(i8).d;
            } else {
                paddingBottom = view.getPaddingBottom();
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        g a2 = aVar.d.a(aVar.a);
        if ((a2.a | a2.b | a2.c | a2.d) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int i9 = a2.a;
                h hVar2 = iVar.b;
                if (i9 != 0) {
                    i = hVar2.a + w0Var.a(i9).a;
                } else {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                }
                int i10 = a2.b;
                if (i10 != 0) {
                    i2 = hVar2.b + w0Var.a(i10).b;
                } else {
                    i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                }
                int i11 = a2.c;
                if (i11 != 0) {
                    i3 = hVar2.c + w0Var.a(i11).c;
                } else {
                    i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                int i12 = a2.d;
                if (i12 != 0) {
                    i4 = hVar2.d + w0Var.a(i12).d;
                } else {
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                j.f(marginLayoutParams, "$this$updateMargins");
                if (i == marginLayoutParams.leftMargin && i2 == marginLayoutParams.topMargin && i3 == marginLayoutParams.rightMargin && i4 == marginLayoutParams.bottomMargin) {
                    z3 = false;
                } else {
                    marginLayoutParams.setMargins(i, i2, i3, i4);
                }
                if (z3) {
                    view.setLayoutParams(layoutParams);
                }
            } else {
                throw new IllegalArgumentException("Margin window insets handling requested but View's LayoutParams do not extend MarginLayoutParams".toString());
            }
        }
        return w0Var;
    }
}
