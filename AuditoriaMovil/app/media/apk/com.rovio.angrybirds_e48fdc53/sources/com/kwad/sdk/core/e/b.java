package com.kwad.sdk.core.e;

import android.util.Log;
/* loaded from: classes.dex */
final class b implements com.kwad.sdk.core.e.a.b {
    @Override // com.kwad.sdk.core.e.a.b
    public final void d(String str, String str2) {
        if (c.aoH && a.mp.booleanValue()) {
            Log.d(str, str2);
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void e(String str, String str2) {
        if (c.aoH) {
            Log.e(str, str2);
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void i(String str, String str2) {
        if (c.aoH) {
            Log.i(str, str2);
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void printStackTraceOnly(Throwable th) {
        if (c.aoH && a.mp.booleanValue() && th != null) {
            th.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void v(String str, String str2) {
        if (c.aoH && a.mp.booleanValue()) {
            Log.v(str, str2);
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void v(String str, String str2, boolean z) {
        Log.v(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void w(String str, String str2) {
        if (c.aoH) {
            Log.w(str, str2);
        }
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void w(String str, String str2, boolean z) {
        if (z) {
            Log.w(str, str2);
        }
    }
}
