package com.iab.omid.library.vungle.b;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
/* loaded from: classes2.dex */
public class c {
    private final com.iab.omid.library.vungle.e.a a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = new com.iab.omid.library.vungle.e.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.vungle.e.a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public FriendlyObstructionPurpose c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}
