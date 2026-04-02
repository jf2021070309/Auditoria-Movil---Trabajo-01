package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.b.d;
import com.iab.omid.library.vungle.b.f;
import com.iab.omid.library.vungle.d.e;
/* loaded from: classes2.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.3.16-Vungle";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.vungle.b.b.a().a(context);
        com.iab.omid.library.vungle.d.b.a(context);
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
