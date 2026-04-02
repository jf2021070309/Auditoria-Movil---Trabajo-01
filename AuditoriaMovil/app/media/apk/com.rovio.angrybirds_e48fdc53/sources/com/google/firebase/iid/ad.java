package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad implements ThreadFactory {
    static final ThreadFactory a = new ad();

    private ad() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return ac.a(runnable);
    }
}
