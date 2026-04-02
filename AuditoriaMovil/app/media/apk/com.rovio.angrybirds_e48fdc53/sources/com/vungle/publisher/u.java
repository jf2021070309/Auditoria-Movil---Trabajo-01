package com.vungle.publisher;

import android.content.Intent;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class u {
    @Inject
    AdConfig a;

    public t a(AdConfig... adConfigArr) {
        int i;
        int i2 = 0;
        o[] oVarArr = null;
        if (adConfigArr != null) {
            o[] oVarArr2 = new o[adConfigArr.length];
            int length = adConfigArr.length;
            int i3 = 0;
            while (i3 < length) {
                AdConfig adConfig = adConfigArr[i3];
                if (adConfig != null) {
                    i = i2 + 1;
                    oVarArr2[i2] = adConfig.getDelegateAdConfig();
                } else {
                    i = i2;
                }
                i3++;
                i2 = i;
            }
            oVarArr = oVarArr2;
        }
        return new t(oVarArr);
    }

    public p a(Intent intent) {
        return (p) intent.getBundleExtra("adConfig").getParcelable("adConfig");
    }

    public void a(Intent intent, t tVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("adConfig", tVar);
        intent.putExtra("adConfig", bundle);
    }
}
