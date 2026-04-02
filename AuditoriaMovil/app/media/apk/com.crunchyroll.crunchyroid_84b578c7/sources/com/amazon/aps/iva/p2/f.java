package com.amazon.aps.iva.p2;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AndroidView.android.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.a<Object> {
    public final /* synthetic */ g<View> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<View> gVar) {
        super(0);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.h.w.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
