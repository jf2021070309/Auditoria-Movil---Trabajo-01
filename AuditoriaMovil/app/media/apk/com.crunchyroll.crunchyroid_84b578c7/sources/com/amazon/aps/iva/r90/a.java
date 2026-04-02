package com.amazon.aps.iva.r90;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.ThreadFactory;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$static$0;
        lambda$static$0 = DefaultHeartBeatController.lambda$static$0(runnable);
        return lambda$static$0;
    }
}
