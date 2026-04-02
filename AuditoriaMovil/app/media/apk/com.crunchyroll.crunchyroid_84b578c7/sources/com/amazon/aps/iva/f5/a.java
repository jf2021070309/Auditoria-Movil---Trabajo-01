package com.amazon.aps.iva.f5;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: BaseGridView.java */
/* loaded from: classes.dex */
public final class a implements RecyclerView.x {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public final void a(RecyclerView.f0 f0Var) {
        b bVar = this.a;
        f fVar = bVar.b;
        fVar.getClass();
        int adapterPosition = f0Var.getAdapterPosition();
        if (adapterPosition != -1) {
            View view = f0Var.itemView;
            a0 a0Var = fVar.M;
            int i = a0Var.a;
            if (i != 1) {
                if ((i == 2 || i == 3) && a0Var.c != null) {
                    String num = Integer.toString(adapterPosition);
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view.saveHierarchyState(sparseArray);
                    a0Var.c.put(num, sparseArray);
                }
            } else {
                com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = a0Var.c;
                if (gVar != null && gVar.size() != 0) {
                    a0Var.c.remove(Integer.toString(adapterPosition));
                }
            }
        }
        RecyclerView.x xVar = bVar.f;
        if (xVar != null) {
            xVar.a(f0Var);
        }
    }
}
