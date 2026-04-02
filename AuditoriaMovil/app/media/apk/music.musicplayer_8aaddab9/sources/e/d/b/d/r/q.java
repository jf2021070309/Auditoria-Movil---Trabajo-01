package e.d.b.d.r;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class q extends ImageButton {
    public int a;

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.a = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.a = i2;
    }
}
