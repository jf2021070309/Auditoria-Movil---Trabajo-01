package com.fyber.inneractive.sdk.d.a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.g.a.m;
import com.fyber.inneractive.sdk.g.a.o;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class d implements Comparator<m> {
    private int a;
    private int b;
    private int c;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(m mVar, m mVar2) {
        m mVar3 = mVar;
        m mVar4 = mVar2;
        if (TextUtils.equals("VPAID", mVar4.g)) {
            return -1;
        }
        if (TextUtils.equals("VPAID", mVar3.g)) {
            return 1;
        }
        int intValue = mVar3.f == null ? 0 : mVar3.f.intValue();
        int intValue2 = mVar4.f == null ? 0 : mVar4.f.intValue();
        int i = this.a;
        if (intValue2 <= i || intValue > i) {
            int i2 = this.a;
            if (intValue <= i2 || intValue2 > i2) {
                int compareTo = a(mVar4.d).compareTo(a(mVar3.d));
                if (compareTo != 0) {
                    return compareTo;
                }
                if (intValue < intValue2) {
                    return 1;
                }
                if (intValue > intValue2) {
                    return -1;
                }
                int intValue3 = (mVar3.b == null ? 0 : mVar3.b.intValue()) * (mVar3.c == null ? 0 : mVar3.c.intValue());
                int intValue4 = (mVar4.b == null ? 0 : mVar4.b.intValue()) * (mVar4.c == null ? 0 : mVar4.c.intValue());
                int i3 = this.b * this.c;
                int abs = Math.abs(intValue3 - i3);
                int abs2 = Math.abs(intValue4 - i3);
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            }
            return 1;
        }
        return -1;
    }

    public d(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private static Integer a(String str) {
        o a = o.a(str);
        if (a == o.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (a == o.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (a == o.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }
}
