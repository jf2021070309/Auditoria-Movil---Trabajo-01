package com.amazon.aps.iva.k;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q.m1;
import com.crunchyroll.crunchyroid.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.p3.u {
    public final /* synthetic */ g a;

    public h(g gVar) {
        this.a = gVar;
    }

    @Override // com.amazon.aps.iva.p3.u
    public final w0 onApplyWindowInsets(View view, w0 w0Var) {
        boolean z;
        w0.e bVar;
        boolean z2;
        int c;
        int d;
        boolean z3;
        boolean z4;
        boolean z5;
        int color;
        w0 w0Var2 = w0Var;
        int e = w0Var.e();
        g gVar = this.a;
        gVar.getClass();
        int e2 = w0Var.e();
        ActionBarContextView actionBarContextView = gVar.w;
        int i = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.w.getLayoutParams();
            if (gVar.w.isShown()) {
                if (gVar.y0 == null) {
                    gVar.y0 = new Rect();
                    gVar.z0 = new Rect();
                }
                Rect rect = gVar.y0;
                Rect rect2 = gVar.z0;
                rect.set(w0Var.c(), w0Var.e(), w0Var.d(), w0Var.b());
                ViewGroup viewGroup = gVar.C;
                Method method = m1.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = gVar.C;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                w0 a = g0.j.a(viewGroup2);
                if (a == null) {
                    c = 0;
                } else {
                    c = a.c();
                }
                if (a == null) {
                    d = 0;
                } else {
                    d = a.d();
                }
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = gVar.l;
                if (i2 > 0 && gVar.E == null) {
                    View view2 = new View(context);
                    gVar.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c;
                    layoutParams.rightMargin = d;
                    gVar.C.addView(gVar.E, -1, layoutParams);
                } else {
                    View view3 = gVar.E;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != c || marginLayoutParams2.rightMargin != d) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = c;
                            marginLayoutParams2.rightMargin = d;
                            gVar.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = gVar.E;
                if (view4 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = gVar.E;
                    if ((g0.d.g(view5) & 8192) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        color = com.amazon.aps.iva.d3.a.getColor(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = com.amazon.aps.iva.d3.a.getColor(context, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!gVar.J && z4) {
                    e2 = 0;
                }
                z = z4;
                z2 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                gVar.w.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = gVar.E;
        if (view6 != null) {
            if (!z) {
                i = 8;
            }
            view6.setVisibility(i);
        }
        if (e != e2) {
            int c2 = w0Var.c();
            int d2 = w0Var.d();
            int b = w0Var.b();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                bVar = new w0.d(w0Var2);
            } else if (i7 >= 29) {
                bVar = new w0.c(w0Var2);
            } else {
                bVar = new w0.b(w0Var2);
            }
            bVar.g(com.amazon.aps.iva.g3.f.b(c2, e2, d2, b));
            w0Var2 = bVar.b();
        }
        WeakHashMap<View, r0> weakHashMap2 = g0.a;
        WindowInsets g = w0Var2.g();
        if (g != null) {
            WindowInsets b2 = g0.h.b(view, g);
            if (!b2.equals(g)) {
                return w0.h(view, b2);
            }
            return w0Var2;
        }
        return w0Var2;
    }
}
