package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends com.google.android.gms.internal.firebase_messaging.zza {
    private final /* synthetic */ q a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, Looper looper) {
        super(looper);
        this.a = qVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
