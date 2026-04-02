package e.d.b.d.d;

import android.view.View;
import c.i.k.k0.d;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes2.dex */
public class d implements c.i.k.k0.d {
    public final /* synthetic */ AppBarLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6346b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.f6346b = z;
    }

    @Override // c.i.k.k0.d
    public boolean a(View view, d.a aVar) {
        this.a.setExpanded(this.f6346b);
        return true;
    }
}
