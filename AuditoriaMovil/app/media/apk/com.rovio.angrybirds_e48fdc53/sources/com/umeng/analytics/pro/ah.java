package com.umeng.analytics.pro;

import android.text.TextUtils;
/* compiled from: TimePeriodItem.java */
/* loaded from: classes3.dex */
public class ah {
    private String a;
    private boolean e = false;
    private int d = -1;
    private int c = -1;
    private int b = -1;

    public ah(String str) {
        this.a = str;
        if (!TextUtils.isEmpty(str)) {
            a();
        }
    }

    private void a() {
        try {
            if (this.a.contains("-")) {
                String[] split = this.a.split("-");
                if (split.length == 2) {
                    this.b = Integer.valueOf(split[0]).intValue();
                    int intValue = Integer.valueOf(split[1]).intValue();
                    this.c = intValue;
                    if (this.b < 1) {
                        this.b = 1;
                    }
                    if (intValue > 24) {
                        this.c = 24;
                    }
                }
                this.e = true;
                return;
            }
            this.d = Integer.valueOf(this.a).intValue();
            this.e = false;
        } catch (Throwable th) {
        }
    }

    public boolean a(int i) {
        int i2;
        if (this.e) {
            int i3 = this.b;
            if (i3 != -1 && (i2 = this.c) != -1 && i >= i3 && i <= i2) {
                return true;
            }
        } else {
            int i4 = this.d;
            if (i4 != -1 && i == i4) {
                return true;
            }
        }
        return false;
    }
}
