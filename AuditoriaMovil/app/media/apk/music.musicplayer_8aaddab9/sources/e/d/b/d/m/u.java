package e.d.b.d.m;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class u extends LinearLayoutManager {

    /* loaded from: classes2.dex */
    public class a extends c.u.b.s {
        public a(u uVar, Context context) {
            super(context);
        }

        @Override // c.u.b.s
        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public u(Context context, int i2, boolean z) {
        super(i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, RecyclerView.x xVar, int i2) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.a = i2;
        Z0(aVar);
    }
}
