package com.kwad.components.offline.b;

import com.kwad.components.offline.api.obiwan.IObiwanLogcat;
/* loaded from: classes.dex */
public final class c implements com.kwad.sdk.core.e.a.b {
    private final IObiwanLogcat ZG;

    public c(IObiwanLogcat iObiwanLogcat) {
        this.ZG = iObiwanLogcat;
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void d(String str, String str2) {
        this.ZG.d(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void e(String str, String str2) {
        this.ZG.e(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void i(String str, String str2) {
        this.ZG.i(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void printStackTraceOnly(Throwable th) {
        this.ZG.printStackTraceOnly(th);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void v(String str, String str2) {
        this.ZG.v(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void v(String str, String str2, boolean z) {
        this.ZG.v(str, str2, true);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void w(String str, String str2) {
        this.ZG.w(str, str2);
    }

    @Override // com.kwad.sdk.core.e.a.b
    public final void w(String str, String str2, boolean z) {
        this.ZG.w(str, str2, z);
    }
}
