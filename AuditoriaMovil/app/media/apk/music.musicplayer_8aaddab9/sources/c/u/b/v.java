package c.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class v extends x {
    public v(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // c.u.b.x
    public int b(View view) {
        return this.a.I(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // c.u.b.x
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.H(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // c.u.b.x
    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.G(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // c.u.b.x
    public int e(View view) {
        return this.a.F(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // c.u.b.x
    public int f() {
        return this.a.p;
    }

    @Override // c.u.b.x
    public int g() {
        RecyclerView.m mVar = this.a;
        return mVar.p - mVar.R();
    }

    @Override // c.u.b.x
    public int h() {
        return this.a.R();
    }

    @Override // c.u.b.x
    public int i() {
        return this.a.f560n;
    }

    @Override // c.u.b.x
    public int j() {
        return this.a.o;
    }

    @Override // c.u.b.x
    public int k() {
        return this.a.Q();
    }

    @Override // c.u.b.x
    public int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.p - mVar.Q()) - this.a.R();
    }

    @Override // c.u.b.x
    public int n(View view) {
        this.a.X(view, true, this.f2735c);
        return this.f2735c.right;
    }

    @Override // c.u.b.x
    public int o(View view) {
        this.a.X(view, true, this.f2735c);
        return this.f2735c.left;
    }

    @Override // c.u.b.x
    public void p(int i2) {
        this.a.d0(i2);
    }
}
