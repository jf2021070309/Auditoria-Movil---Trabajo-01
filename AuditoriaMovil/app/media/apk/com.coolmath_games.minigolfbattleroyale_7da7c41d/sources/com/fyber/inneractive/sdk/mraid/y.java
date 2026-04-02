package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class y extends t {
    private final aa a;

    private y(aa aaVar) {
        this.a = aaVar;
    }

    public static y a(aa aaVar) {
        return new y(aaVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "state: '" + this.a.toString().toLowerCase() + "'";
    }
}
