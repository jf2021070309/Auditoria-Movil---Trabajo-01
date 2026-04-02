package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class d0 {
    public static int a(RecyclerView.b0 b0Var, a0 a0Var, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.getChildCount() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
            }
            return Math.min(a0Var.l(), a0Var.b(view2) - a0Var.e(view));
        }
        return 0;
    }

    public static int b(RecyclerView.b0 b0Var, a0 a0Var, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        int max;
        if (pVar.getChildCount() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.getPosition(view), pVar.getPosition(view2));
        int max2 = Math.max(pVar.getPosition(view), pVar.getPosition(view2));
        if (z2) {
            max = Math.max(0, (b0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(a0Var.b(view2) - a0Var.e(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (a0Var.k() - a0Var.e(view)));
    }

    public static int c(RecyclerView.b0 b0Var, a0 a0Var, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.getChildCount() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return b0Var.b();
            }
            return (int) (((a0Var.b(view2) - a0Var.e(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * b0Var.b());
        }
        return 0;
    }
}
