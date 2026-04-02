package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import e.d.b.e.a.g.n;
/* loaded from: classes2.dex */
public final class b extends ResultReceiver {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Handler handler, n nVar) {
        super(handler);
        this.a = nVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        this.a.b(null);
    }
}
