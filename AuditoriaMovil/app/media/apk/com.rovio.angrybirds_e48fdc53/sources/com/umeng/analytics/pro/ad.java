package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
/* compiled from: IntervalPeriodCondition.java */
/* loaded from: classes3.dex */
public class ad implements aa {
    private String a;
    private long b;

    public ad(String str, long j) {
        this.a = "";
        this.b = 0L;
        this.a = str;
        this.b = j;
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        try {
            String str = ap.b + this.a;
            SharedPreferences a = ap.a(UMGlobalContext.getAppContext());
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis() - a.getLong(str, 0L);
                if (currentTimeMillis > this.b * 1000) {
                    return true;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "internal period skipped. elapse: " + currentTimeMillis + "; config: " + (this.b * 1000));
                return false;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
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
