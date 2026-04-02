package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.b.d;
import com.iab.omid.library.applovin.b.f;
import com.iab.omid.library.applovin.d.e;
/* loaded from: classes2.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.24-Applovin";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.applovin.b.b.a().a(context);
        com.iab.omid.library.applovin.d.b.a(context);
        d.a().a(context);
    }

    public void a(boolean z) {
        this.a = z;
    }

    public boolean b() {
        return this.a;
    }
}
