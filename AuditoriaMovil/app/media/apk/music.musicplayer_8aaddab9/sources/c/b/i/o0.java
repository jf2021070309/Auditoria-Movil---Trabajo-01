package c.b.i;

import android.widget.PopupWindow;
import java.util.Objects;
/* loaded from: classes.dex */
public class o0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        Objects.requireNonNull(this.a);
    }
}
