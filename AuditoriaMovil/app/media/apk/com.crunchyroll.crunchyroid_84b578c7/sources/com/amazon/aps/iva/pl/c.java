package com.amazon.aps.iva.pl;

import com.amazon.aps.iva.ye.h;
/* compiled from: ChromecastPreferenceController.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final h a;

    public c(h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.pl.b
    public final void Q(boolean z) {
        this.a.sendMessage(new a(z));
    }
}
