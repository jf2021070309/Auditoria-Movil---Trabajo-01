package c.b.i;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public class b1 implements View.OnClickListener {
    public final c.b.h.i.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c1 f1086b;

    public b1(c1 c1Var) {
        this.f1086b = c1Var;
        this.a = new c.b.h.i.a(c1Var.a.getContext(), 0, 16908332, 0, c1Var.f1105i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c1 c1Var = this.f1086b;
        Window.Callback callback = c1Var.f1108l;
        if (callback == null || !c1Var.f1109m) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
