package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import java.util.ArrayList;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ q.f b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q d;

    public r(q qVar, q.f fVar, int i) {
        this.d = qVar;
        this.b = fVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.d;
        RecyclerView recyclerView = qVar.r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            q.f fVar = this.b;
            if (!fVar.k) {
                RecyclerView.f0 f0Var = fVar.e;
                if (f0Var.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.m itemAnimator = qVar.r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.g()) {
                        ArrayList arrayList = qVar.p;
                        int size = arrayList.size();
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (!((q.f) arrayList.get(i)).l) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (!z) {
                            qVar.m.onSwiped(f0Var, this.c);
                            return;
                        }
                    }
                    qVar.r.post(this);
                }
            }
        }
    }
}
