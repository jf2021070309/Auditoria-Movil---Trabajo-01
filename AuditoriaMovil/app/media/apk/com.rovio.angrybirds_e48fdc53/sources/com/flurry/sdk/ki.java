package com.flurry.sdk;

import android.text.TextUtils;
/* loaded from: classes2.dex */
public abstract class ki {
    protected String f;

    public ki(String str) {
        this.f = "com.flurry.android.sdk.ReplaceMeWithAProperEventName";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Event must have a name!");
        }
        this.f = str;
    }

    public final String a() {
        return this.f;
    }

    public final void b() {
        kk.a().a(this);
    }
}
