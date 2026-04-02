package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: WeekOnCondition.java */
/* loaded from: classes3.dex */
public class ai implements aa {
    private Set<Integer> a;

    public ai(Set<Integer> set) {
        this.a = null;
        this.a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
        Iterator<Integer> it;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = 7;
            int i2 = calendar.get(7) - 1;
            if (i2 != 0) {
                i = i2;
            }
            Set<Integer> set = this.a;
            if (set == null || !set.contains(Integer.valueOf(i))) {
                String str = "";
                while (this.a.iterator().hasNext()) {
                    str = str + it.next() + ",";
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "WeekOn skipped. day of week: " + i + "; config: " + str);
                return false;
            }
            return true;
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
