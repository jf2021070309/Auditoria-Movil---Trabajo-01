package e.d.b.d.d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.k0.d;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes2.dex */
public class c implements c.i.k.k0.d {
    public final /* synthetic */ CoordinatorLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6342b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f6343c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6344d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6345e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        this.f6345e = baseBehavior;
        this.a = coordinatorLayout;
        this.f6342b = appBarLayout;
        this.f6343c = view;
        this.f6344d = i2;
    }

    @Override // c.i.k.k0.d
    public boolean a(View view, d.a aVar) {
        this.f6345e.L(this.a, this.f6342b, this.f6343c, this.f6344d, new int[]{0, 0});
        return true;
    }
}
