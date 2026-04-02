package e.d.b.d.g;

import android.view.View;
import c.i.k.k0.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes2.dex */
public class c implements d {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f6378b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f6378b = bottomSheetBehavior;
        this.a = i2;
    }

    @Override // c.i.k.k0.d
    public boolean a(View view, d.a aVar) {
        this.f6378b.K(this.a);
        return true;
    }
}
