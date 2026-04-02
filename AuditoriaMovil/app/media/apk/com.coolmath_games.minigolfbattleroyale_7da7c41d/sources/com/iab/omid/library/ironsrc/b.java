package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.b.d;
import com.iab.omid.library.ironsrc.b.f;
import com.iab.omid.library.ironsrc.d.e;
/* loaded from: classes2.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.3.12-Ironsrc";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.ironsrc.b.b.a().a(context);
        com.iab.omid.library.ironsrc.d.b.a(context);
        d.a().a(context);
    }

    void a(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.a;
    }
}
