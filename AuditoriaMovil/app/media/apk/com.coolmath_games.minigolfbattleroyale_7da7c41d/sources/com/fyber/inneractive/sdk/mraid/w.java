package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.m.d;
/* loaded from: classes.dex */
public final class w extends t {
    private final d.EnumC0045d a;

    public w(d.EnumC0045d enumC0045d) {
        this.a = enumC0045d;
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "placementType: '" + this.a.toString().toLowerCase() + "'";
    }
}
