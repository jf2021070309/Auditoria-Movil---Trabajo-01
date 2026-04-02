package c.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class w extends x {
    public w(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // c.u.b.x
    public int b(View view) {
        return this.a.D(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // c.u.b.x
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.G(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // c.u.b.x
    public int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.a.H(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // c.u.b.x
    public int e(View view) {
        return this.a.J(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // c.u.b.x
    public int f() {
        return this.a.q;
    }

    @Override // c.u.b.x
    public int g() {
        RecyclerView.m mVar = this.a;
        return mVar.q - mVar.P();
    }

    @Override // c.u.b.x
    public int h() {
        return this.a.P();
    }

    @Override // c.u.b.x
    public int i() {
        return this.a.o;
    }

    @Override // c.u.b.x
    public int j() {
        return this.a.f560n;
    }

    @Override // c.u.b.x
    public int k() {
        return this.a.S();
    }

    @Override // c.u.b.x
    public int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.q - mVar.S()) - this.a.P();
    }

    @Override // c.u.b.x
    public int n(View view) {
        this.a.X(view, true, this.f2735c);
        return this.f2735c.bottom;
    }

    @Override // c.u.b.x
    public int o(View view) {
        this.a.X(view, true, this.f2735c);
        return this.f2735c.top;
    }

    @Override // c.u.b.x
    public void p(int i2) {
        this.a.e0(i2);
    }
}
