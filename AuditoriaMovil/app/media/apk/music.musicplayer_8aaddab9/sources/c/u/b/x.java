package c.u.b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public abstract class x {
    public final RecyclerView.m a;

    /* renamed from: b  reason: collision with root package name */
    public int f2734b = Level.ALL_INT;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2735c = new Rect();

    public x(RecyclerView.m mVar, v vVar) {
        this.a = mVar;
    }

    public static x a(RecyclerView.m mVar, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new w(mVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new v(mVar);
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

    public int m() {
        if (Integer.MIN_VALUE == this.f2734b) {
            return 0;
        }
        return l() - this.f2734b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i2);
}
