package c.u.b;

import androidx.recyclerview.widget.RecyclerView;
import c.u.b.o;
import java.util.Objects;
/* loaded from: classes.dex */
public class p implements Runnable {
    public final /* synthetic */ o.f a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2718b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f2719c;

    public p(o oVar, o.f fVar, int i2) {
        this.f2719c = oVar;
        this.a = fVar;
        this.f2718b = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f2719c.r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        o.f fVar = this.a;
        if (fVar.f2715k || fVar.f2709e.f() == -1) {
            return;
        }
        RecyclerView.j itemAnimator = this.f2719c.r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.g()) {
            o oVar = this.f2719c;
            int size = oVar.p.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (!oVar.p.get(i2).f2716l) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                o.d dVar = this.f2719c.f2700m;
                RecyclerView.a0 a0Var = this.a.f2709e;
                Objects.requireNonNull((e.g.a.e.c) dVar);
                return;
            }
        }
        this.f2719c.r.post(this);
    }
}
