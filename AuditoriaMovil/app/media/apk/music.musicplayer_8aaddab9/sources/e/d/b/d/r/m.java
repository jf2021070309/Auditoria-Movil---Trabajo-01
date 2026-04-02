package e.d.b.d.r;

import android.view.View;
import c.i.k.j0;
import c.i.k.u;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes2.dex */
public final class m implements u {
    public final /* synthetic */ o a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f6550b;

    public m(o oVar, p pVar) {
        this.a = oVar;
        this.f6550b = pVar;
    }

    @Override // c.i.k.u
    public j0 a(View view, j0 j0Var) {
        o oVar = this.a;
        p pVar = this.f6550b;
        int i2 = pVar.a;
        int i3 = pVar.f6552c;
        int i4 = pVar.f6553d;
        e.d.b.d.g.b bVar = (e.d.b.d.g.b) oVar;
        bVar.f6377b.s = j0Var.e();
        boolean N = e.d.b.d.a.N(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = bVar.f6377b;
        if (bottomSheetBehavior.f4566n) {
            bottomSheetBehavior.r = j0Var.b();
            paddingBottom = bVar.f6377b.r + i4;
        }
        if (bVar.f6377b.o) {
            paddingLeft = j0Var.c() + (N ? i3 : i2);
        }
        if (bVar.f6377b.p) {
            if (!N) {
                i2 = i3;
            }
            paddingRight = j0Var.d() + i2;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (bVar.a) {
            bVar.f6377b.f4564l = j0Var.f2164b.h().f2038e;
        }
        BottomSheetBehavior bottomSheetBehavior2 = bVar.f6377b;
        if (bottomSheetBehavior2.f4566n || bVar.a) {
            bottomSheetBehavior2.T(false);
        }
        return j0Var;
    }
}
