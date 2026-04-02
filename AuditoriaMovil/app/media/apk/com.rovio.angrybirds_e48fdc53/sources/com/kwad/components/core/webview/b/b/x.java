package com.kwad.components.core.webview.b.b;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class x extends com.kwad.sdk.core.response.a.a {
    public String Xp;
    public int errorCode;
    public String errorReason;
    public int nQ;

    public final boolean isFailed() {
        return TextUtils.equals("failed", this.Xp);
    }

    public final boolean rX() {
        return TextUtils.equals("start", this.Xp);
    }

    public final boolean rY() {
        return TextUtils.equals("end", this.Xp);
    }

    public final boolean rZ() {
        return TextUtils.equals("progress", this.Xp);
    }

    public final int sa() {
        String str = this.errorReason;
        if (str != null) {
            return (int) Long.parseLong(str);
        }
        return 0;
    }
}
