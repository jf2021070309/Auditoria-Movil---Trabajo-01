package com.iab.omid.library.applovin.b;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
/* loaded from: classes2.dex */
public class c {
    private final com.iab.omid.library.applovin.e.a a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4781b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f4782c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4783d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = new com.iab.omid.library.applovin.e.a(view);
        this.f4781b = view.getClass().getCanonicalName();
        this.f4782c = friendlyObstructionPurpose;
        this.f4783d = str;
    }

    public com.iab.omid.library.applovin.e.a a() {
        return this.a;
    }

    public String b() {
        return this.f4781b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f4782c;
    }

    public String d() {
        return this.f4783d;
    }
}
