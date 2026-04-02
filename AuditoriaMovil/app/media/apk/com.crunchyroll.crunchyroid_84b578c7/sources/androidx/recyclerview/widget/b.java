package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.o8.b {
    public final RecyclerView.h a;

    public b(RecyclerView.h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void a(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void b(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }

    @Override // com.amazon.aps.iva.o8.b
    @SuppressLint({"UnknownNullness"})
    public final void c(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // com.amazon.aps.iva.o8.b
    public final void d(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }
}
