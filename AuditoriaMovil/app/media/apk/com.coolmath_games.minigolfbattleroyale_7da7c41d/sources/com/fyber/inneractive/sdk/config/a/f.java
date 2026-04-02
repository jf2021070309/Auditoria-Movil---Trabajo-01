package com.fyber.inneractive.sdk.config.a;

import com.facebook.appevents.codeless.internal.Constants;
/* loaded from: classes.dex */
public final class f implements d {
    String a;
    boolean b;

    public f(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.d
    public final boolean a(e eVar) {
        String str = this.a;
        if (str != null) {
            if (str.equalsIgnoreCase(Constants.PLATFORM)) {
                return !this.b;
            }
            return this.b;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "os", this.a, Boolean.valueOf(this.b));
    }
}
