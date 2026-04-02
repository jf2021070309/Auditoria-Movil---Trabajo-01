package com.vungle.warren.utility;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes2.dex */
public class ConcurrencyTimeoutProvider implements TimeoutProvider {
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    @Override // com.vungle.warren.utility.TimeoutProvider
    public long getTimeout() {
        return ThreadUtil.isMainThread() ? OPERATION_TIMEOUT : LongCompanionObject.MAX_VALUE;
    }
}
