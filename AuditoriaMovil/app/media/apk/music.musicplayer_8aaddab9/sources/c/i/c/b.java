package c.i.c;

import android.app.Activity;
/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ Activity a;

    public b(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.isFinishing() || e.b(this.a)) {
            return;
        }
        this.a.recreate();
    }
}
