package c.u.b;

import androidx.recyclerview.widget.RecyclerView;
import c.u.b.f;
/* loaded from: classes.dex */
public abstract class d0 extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2595g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.f547b;
        if (a0Var2.w()) {
            int i6 = cVar.a;
            i3 = cVar.f547b;
            i2 = i6;
        } else {
            i2 = cVar2.a;
            i3 = cVar2.f547b;
        }
        f fVar = (f) this;
        if (a0Var == a0Var2) {
            return fVar.j(a0Var, i4, i5, i2, i3);
        }
        float translationX = a0Var.f527b.getTranslationX();
        float translationY = a0Var.f527b.getTranslationY();
        float alpha = a0Var.f527b.getAlpha();
        fVar.o(a0Var);
        a0Var.f527b.setTranslationX(translationX);
        a0Var.f527b.setTranslationY(translationY);
        a0Var.f527b.setAlpha(alpha);
        fVar.o(a0Var2);
        a0Var2.f527b.setTranslationX(-((int) ((i2 - i4) - translationX)));
        a0Var2.f527b.setTranslationY(-((int) ((i3 - i5) - translationY)));
        a0Var2.f527b.setAlpha(0.0f);
        fVar.f2605l.add(new f.d(a0Var, a0Var2, i4, i5, i2, i3));
        return true;
    }

    public abstract boolean j(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5);
}
