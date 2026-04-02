package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: HourOnCondition.java */
/* loaded from: classes3.dex */
public class ac implements aa {
    private Set<Integer> a;

    public ac(Set<Integer> set) {
        this.a = null;
        this.a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        Iterator<Integer> it;
        try {
            int i = Calendar.getInstance().get(11);
            Set<Integer> set = this.a;
            if (set != null && set.contains(Integer.valueOf(i))) {
                return true;
            }
            String str = "";
            while (this.a.iterator().hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "HourOn skipped. hour of day: " + i + "; config: " + str);
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
