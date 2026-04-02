package e.g.a.d;

import android.os.Bundle;
import e.h.g.x0;
/* loaded from: classes.dex */
public abstract class i extends c.b.c.l {
    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        getApplication();
        if (getApplication() instanceof x0) {
            ((x0) getApplication()).B(true);
        }
        try {
            super.onCreate(bundle);
            y(bundle);
        } catch (IllegalArgumentException | NullPointerException e2) {
            e2.printStackTrace();
            finish();
        }
    }

    public abstract void y(Bundle bundle);
}
