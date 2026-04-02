package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class a0 {
    public final RecyclerView.p a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public a0(RecyclerView.p pVar) {
        this.a = pVar;
    }

    public static a0 a(RecyclerView.p pVar, int i) {
        if (i != 0) {
            if (i == 1) {
                return new z(pVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new y(pVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);
}
