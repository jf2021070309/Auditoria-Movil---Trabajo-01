package e.d.b.d.r;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* loaded from: classes2.dex */
public final class l implements Runnable {
    public final /* synthetic */ View a;

    public l(View view) {
        this.a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InputMethodManager) this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 1);
    }
}
