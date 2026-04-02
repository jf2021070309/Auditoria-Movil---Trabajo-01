package com.amazon.aps.iva.v1;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class i3 extends ContentObserver {
    public final /* synthetic */ com.amazon.aps.iva.ue0.f<com.amazon.aps.iva.kb0.q> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.amazon.aps.iva.ue0.a aVar, Handler handler) {
        super(handler);
        this.a = aVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.h(com.amazon.aps.iva.kb0.q.a);
    }
}
