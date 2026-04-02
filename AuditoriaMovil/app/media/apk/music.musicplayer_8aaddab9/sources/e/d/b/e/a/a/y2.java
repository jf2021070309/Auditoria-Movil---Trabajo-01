package e.d.b.e.a.a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class y2 implements e.d.b.e.a.c.e0<?> {
    public final e.d.b.e.a.c.e0<q2> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.e.a.c.e0<Context> f6981b;

    public y2(e.d.b.e.a.c.e0<q2> e0Var, e.d.b.e.a.c.e0<Context> e0Var2) {
        this.a = e0Var;
        this.f6981b = e0Var2;
    }

    @Override // e.d.b.e.a.c.e0
    public final Object a() {
        q2 a = this.a.a();
        Context a2 = ((a3) this.f6981b).a();
        q2 q2Var = a;
        e.d.b.d.a.f(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        int i2 = PlayCoreDialogWrapperActivity.a;
        e.d.b.d.a.f(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        Objects.requireNonNull(q2Var, "Cannot return null from a non-@Nullable @Provides method");
        return q2Var;
    }
}
