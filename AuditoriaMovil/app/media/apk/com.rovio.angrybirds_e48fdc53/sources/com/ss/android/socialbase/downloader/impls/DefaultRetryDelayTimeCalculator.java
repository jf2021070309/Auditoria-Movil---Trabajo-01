package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.IRetryDelayTimeCalculator;
/* loaded from: classes3.dex */
public class DefaultRetryDelayTimeCalculator implements IRetryDelayTimeCalculator {
    @Override // com.ss.android.socialbase.downloader.downloader.IRetryDelayTimeCalculator
    public long calculateRetryDelayTime(int i, int i2) {
        if (i == 1) {
            return 3000L;
        }
        if (i == 2) {
            return 15000L;
        }
        if (i == 3) {
            return 30000L;
        }
        if (i > 3) {
            return 300000L;
        }
        return 0L;
    }
}
