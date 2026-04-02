package e.g.a.d;

import android.os.Bundle;
import e.h.g.x0;
/* loaded from: classes2.dex */
public abstract class k extends c.b.c.l {
    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        getApplication();
        if (getApplication() instanceof x0) {
            ((x0) getApplication()).B(true);
        }
        super.onCreate(bundle);
        y(bundle);
    }

    public abstract void y(Bundle bundle);
}
