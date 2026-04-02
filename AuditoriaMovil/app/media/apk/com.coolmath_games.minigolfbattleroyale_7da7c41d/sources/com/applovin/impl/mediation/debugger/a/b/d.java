package com.applovin.impl.mediation.debugger.a.b;

import android.content.Context;
import com.applovin.impl.sdk.utils.f;
/* loaded from: classes.dex */
public class d {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = f.a(str, context);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
