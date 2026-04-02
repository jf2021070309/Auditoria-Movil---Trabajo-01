package c.b.e.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import c.b.e.a.b;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: n  reason: collision with root package name */
    public a f904n;
    public boolean o;

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f896g.length];
            }
        }

        @Override // c.b.e.a.b.c
        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i2 = this.f897h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar) {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // c.b.e.a.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // c.b.e.a.b
    public void e(b.c cVar) {
        this.f879b = cVar;
        int i2 = this.f885h;
        if (i2 >= 0) {
            Drawable d2 = cVar.d(i2);
            this.f881d = d2;
            if (d2 != null) {
                c(d2);
            }
        }
        this.f882e = null;
        if (cVar instanceof a) {
            this.f904n = (a) cVar;
        }
    }

    @Override // c.b.e.a.b
    /* renamed from: f */
    public a b() {
        return new a(this.f904n, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // c.b.e.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.f904n.e();
                this.o = true;
            }
        }
        return this;
    }

    @Override // c.b.e.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g2 = this.f904n.g(iArr);
        if (g2 < 0) {
            g2 = this.f904n.g(StateSet.WILD_CARD);
        }
        return d(g2) || onStateChange;
    }
}
