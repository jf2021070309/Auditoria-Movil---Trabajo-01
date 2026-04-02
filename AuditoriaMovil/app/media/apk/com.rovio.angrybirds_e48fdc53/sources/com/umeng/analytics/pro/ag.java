package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: TimePeriodChain.java */
/* loaded from: classes3.dex */
public class ag {
    private String a;
    private ArrayList<ah> b = new ArrayList<>();

    public ag(String str) {
        this.a = "";
        this.a = str;
        if (!TextUtils.isEmpty(str)) {
            a();
        }
    }

    private void a() {
        String[] split;
        try {
            if (this.a.contains(",")) {
                for (String str : this.a.split(",")) {
                    if (!TextUtils.isEmpty(str)) {
                        String trim = str.trim();
                        if (this.b != null) {
                            this.b.add(new ah(trim));
                        }
                    }
                }
                return;
            }
            String str2 = this.a;
            if (!TextUtils.isEmpty(str2)) {
                String trim2 = str2.trim();
                if (this.b != null) {
                    this.b.add(new ah(trim2));
                }
            }
        } catch (Throwable th) {
        }
    }

    public boolean a(int i) {
        try {
            ArrayList<ah> arrayList = this.b;
            if (arrayList == null) {
                return false;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ah ahVar = this.b.get(i2);
                if (ahVar != null && ahVar.a(i)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}
