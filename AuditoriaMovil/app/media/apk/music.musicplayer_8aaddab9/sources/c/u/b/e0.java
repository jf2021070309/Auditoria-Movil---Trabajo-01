package c.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public abstract class e0 extends RecyclerView.p {
    public RecyclerView a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.r f2599b = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0 && this.a) {
                this.a = false;
                e0.this.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public abstract int[] a(RecyclerView.m mVar, View view);

    public void b() {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        z zVar = (z) this;
        View d2 = layoutManager.h() ? zVar.d(layoutManager, zVar.f(layoutManager)) : layoutManager.g() ? zVar.d(layoutManager, zVar.e(layoutManager)) : null;
        if (d2 == null) {
            return;
        }
        int[] a2 = a(layoutManager, d2);
        if (a2[0] == 0 && a2[1] == 0) {
            return;
        }
        this.a.p0(a2[0], a2[1], null, Level.ALL_INT, false);
    }
}
