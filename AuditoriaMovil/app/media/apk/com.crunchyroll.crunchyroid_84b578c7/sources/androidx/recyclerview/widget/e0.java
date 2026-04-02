package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class e0 extends RecyclerView.m {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (f0Var2.shouldIgnore()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return j(f0Var, f0Var2, i3, i4, i, i2);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract void i(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean j(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean k(RecyclerView.f0 f0Var, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract void l(RecyclerView.f0 f0Var);
}
