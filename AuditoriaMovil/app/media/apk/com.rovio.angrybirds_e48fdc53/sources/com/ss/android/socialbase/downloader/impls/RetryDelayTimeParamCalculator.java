package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.IRetryDelayTimeCalculator;
/* loaded from: classes3.dex */
public class RetryDelayTimeParamCalculator implements IRetryDelayTimeCalculator {
    private final long[] mTimeArray;

    public RetryDelayTimeParamCalculator(String str) {
        this.mTimeArray = parseTimeArray(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IRetryDelayTimeCalculator
    public long calculateRetryDelayTime(int i, int i2) {
        long[] jArr = this.mTimeArray;
        if (jArr != null && jArr.length > 0) {
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > jArr.length - 1) {
                i3 = jArr.length - 1;
            }
            return jArr[i3];
        }
        return 0L;
    }

    private long[] parseTimeArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
