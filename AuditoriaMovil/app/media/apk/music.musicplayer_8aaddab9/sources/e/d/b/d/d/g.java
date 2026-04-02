package e.d.b.d.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2.dex */
public class g<V extends View> extends CoordinatorLayout.c<V> {
    public h a;

    /* renamed from: b  reason: collision with root package name */
    public int f6360b;

    public g() {
        this.f6360b = 0;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6360b = 0;
    }

    public int B() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.f6363d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.r(v, i2);
    }

    public boolean D(int i2) {
        h hVar = this.a;
        if (hVar == null) {
            this.f6360b = i2;
            return false;
        } else if (hVar.f6363d != i2) {
            hVar.f6363d = i2;
            hVar.a();
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        C(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new h(v);
        }
        h hVar = this.a;
        hVar.f6361b = hVar.a.getTop();
        hVar.f6362c = hVar.a.getLeft();
        this.a.a();
        int i3 = this.f6360b;
        if (i3 != 0) {
            h hVar2 = this.a;
            if (hVar2.f6363d != i3) {
                hVar2.f6363d = i3;
                hVar2.a();
            }
            this.f6360b = 0;
            return true;
        }
        return true;
    }
}
