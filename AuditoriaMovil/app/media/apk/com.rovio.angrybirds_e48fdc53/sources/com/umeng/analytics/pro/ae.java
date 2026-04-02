package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
/* compiled from: LaunchTimesCondition.java */
/* loaded from: classes3.dex */
public class ae implements aa {
    private int a;

    public ae(int i) {
        this.a = 0;
        this.a = i;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        long j = 0;
        try {
            SharedPreferences a = ap.a(UMGlobalContext.getAppContext());
            if (a != null) {
                j = a.getLong(ap.a, 0L);
                if (j >= this.a) {
                    return true;
                }
            }
        } catch (Throwable th) {
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "launch times skipped. times: " + j + " ; config: " + this.a);
        return false;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
        return 0L;
    }
}
