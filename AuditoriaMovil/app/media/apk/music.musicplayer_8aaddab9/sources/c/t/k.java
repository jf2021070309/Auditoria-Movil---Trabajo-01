package c.t;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.c0;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public class k extends c0 {

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f2561f;

    /* renamed from: g  reason: collision with root package name */
    public final c.i.k.e f2562g;

    /* renamed from: h  reason: collision with root package name */
    public final c.i.k.e f2563h;

    /* loaded from: classes.dex */
    public class a extends c.i.k.e {
        public a() {
        }

        @Override // c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            Preference l2;
            k.this.f2562g.d(view, bVar);
            Objects.requireNonNull(k.this.f2561f);
            RecyclerView.a0 N = RecyclerView.N(view);
            int f2 = N != null ? N.f() : -1;
            RecyclerView.e adapter = k.this.f2561f.getAdapter();
            if ((adapter instanceof g) && (l2 = ((g) adapter).l(f2)) != null) {
                l2.w();
            }
        }

        @Override // c.i.k.e
        public boolean g(View view, int i2, Bundle bundle) {
            return k.this.f2562g.g(view, i2, bundle);
        }
    }

    public k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f2562g = this.f2588e;
        this.f2563h = new a();
        this.f2561f = recyclerView;
    }

    @Override // c.u.b.c0
    public c.i.k.e j() {
        return this.f2563h;
    }
}
