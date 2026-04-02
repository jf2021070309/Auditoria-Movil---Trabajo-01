package c.u.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class y extends s {
    public final /* synthetic */ z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context) {
        super(context);
        this.q = zVar;
    }

    @Override // c.u.b.s, androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        z zVar = this.q;
        int[] a = zVar.a(zVar.a.getLayoutManager(), view);
        int i2 = a[0];
        int i3 = a[1];
        double g2 = g(Math.max(Math.abs(i2), Math.abs(i3)));
        Double.isNaN(g2);
        Double.isNaN(g2);
        Double.isNaN(g2);
        int ceil = (int) Math.ceil(g2 / 0.3356d);
        if (ceil > 0) {
            aVar.b(i2, i3, ceil, this.f2729j);
        }
    }

    @Override // c.u.b.s
    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // c.u.b.s
    public int g(int i2) {
        return Math.min(100, super.g(i2));
    }
}
