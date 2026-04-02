package com.amazon.aps.iva.r70;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.x50.h;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
import java.util.List;
/* compiled from: ItemMoveCallback.kt */
/* loaded from: classes2.dex */
public final class c extends q.d {
    public final d a;
    public final float b;
    public final List<j<Integer, Integer>> c;
    public final m d;

    /* compiled from: ItemMoveCallback.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ RecyclerView i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView recyclerView, int i, int i2) {
            super(0);
            this.i = recyclerView;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            c cVar = c.this;
            cVar.getClass();
            this.i.performHapticFeedback(1);
            cVar.a.b(this.j, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c(d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "itemTouchListener");
        this.a = dVar;
        this.b = 0.5f;
        this.c = f1.K(new j(0, 1), new j(1, 2), new j(1, 0));
        this.d = f.b(b.h);
    }

    @Override // androidx.recyclerview.widget.q.d
    public final RecyclerView.f0 chooseDropTarget(RecyclerView.f0 f0Var, List<? extends RecyclerView.f0> list, int i, int i2) {
        int bottom;
        int abs;
        int top;
        com.amazon.aps.iva.yb0.j.f(f0Var, "selected");
        com.amazon.aps.iva.yb0.j.f(list, "targets");
        int height = (int) (f0Var.itemView.getHeight() * this.b);
        int i3 = i2 - height;
        int height2 = f0Var.itemView.getHeight() + i2 + height;
        int top2 = i2 - f0Var.itemView.getTop();
        int size = list.size();
        RecyclerView.f0 f0Var2 = null;
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.f0 f0Var3 = list.get(i5);
            if (top2 >= 0 ? !(top2 <= 0 || (bottom = f0Var3.itemView.getBottom() - height2) >= 0 || f0Var3.itemView.getBottom() * 2 <= f0Var.itemView.getBottom() || (abs = Math.abs(bottom)) <= i4) : !((top = f0Var3.itemView.getTop() - i3) <= 0 || f0Var3.itemView.getTop() >= f0Var.itemView.getTop() || (abs = Math.abs(top)) <= i4)) {
                f0Var2 = f0Var3;
                i4 = abs;
            }
        }
        return f0Var2;
    }

    @Override // androidx.recyclerview.widget.q.d
    public final void clearView(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
        com.amazon.aps.iva.yb0.j.f(f0Var, "viewHolder");
        super.clearView(recyclerView, f0Var);
        ((com.amazon.aps.iva.r70.a) f0Var).U2();
    }

    @Override // androidx.recyclerview.widget.q.d
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
        com.amazon.aps.iva.yb0.j.f(f0Var, "viewHolder");
        return q.d.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.q.d
    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.q.d
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.q.d
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
        com.amazon.aps.iva.yb0.j.f(f0Var, "viewHolder");
        com.amazon.aps.iva.yb0.j.f(f0Var2, "target");
        int bindingAdapterPosition = f0Var.getBindingAdapterPosition();
        int bindingAdapterPosition2 = f0Var2.getBindingAdapterPosition();
        if (this.c.contains(new j(Integer.valueOf(bindingAdapterPosition), Integer.valueOf(bindingAdapterPosition2)))) {
            ((h) this.d.getValue()).a(new a(recyclerView, bindingAdapterPosition, bindingAdapterPosition2));
        } else {
            recyclerView.performHapticFeedback(1);
            this.a.b(bindingAdapterPosition, bindingAdapterPosition2);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.q.d
    public final void onSelectedChanged(RecyclerView.f0 f0Var, int i) {
        if (i == 2) {
            com.amazon.aps.iva.yb0.j.d(f0Var, "null cannot be cast to non-null type com.ellation.widgets.recyclerview.DraggableViewHolder");
            com.amazon.aps.iva.r70.a aVar = (com.amazon.aps.iva.r70.a) f0Var;
            Animation loadAnimation = AnimationUtils.loadAnimation(aVar.itemView.getContext(), R.anim.item_scale_out);
            aVar.itemView.startAnimation(loadAnimation);
            loadAnimation.setFillAfter(true);
            aVar.itemView.setSelected(true);
            aVar.G4();
        }
        super.onSelectedChanged(f0Var, i);
    }

    @Override // androidx.recyclerview.widget.q.d
    public final void onSwiped(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "viewHolder");
    }
}
