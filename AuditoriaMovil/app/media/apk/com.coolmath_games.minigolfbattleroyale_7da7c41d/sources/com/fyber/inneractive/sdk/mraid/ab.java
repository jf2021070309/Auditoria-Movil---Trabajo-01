package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class ab extends t {
    private final boolean a;

    public ab(boolean z) {
        this.a = z;
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        StringBuilder sb = new StringBuilder("viewable: ");
        sb.append(this.a ? "true" : "false");
        return sb.toString();
    }
}
