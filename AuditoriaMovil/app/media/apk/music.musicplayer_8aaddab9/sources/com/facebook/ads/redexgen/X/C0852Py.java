package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Py  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0852Py extends ContentObserver {
    public final C0796Nt A00;

    public C0852Py(Handler handler, C0796Nt c0796Nt) {
        super(handler);
        this.A00 = c0796Nt;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Z();
    }
}
