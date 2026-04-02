package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public final class z extends t {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    @Override // com.fyber.inneractive.sdk.mraid.t
    final String a() {
        return "supports: {sms: " + String.valueOf(this.a) + ", tel: " + String.valueOf(this.b) + ", calendar: " + String.valueOf(this.c) + ", storePicture: " + String.valueOf(this.d) + ", inlineVideo: " + String.valueOf(this.e) + "}";
    }
}
