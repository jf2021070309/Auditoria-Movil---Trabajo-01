package com.ss.android.download.api.dr;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import com.ss.android.download.api.config.ll;
import com.ss.android.download.api.config.z;
/* loaded from: classes3.dex */
public class ge implements ll {
    private z dr;

    @Override // com.ss.android.download.api.config.ll
    public void dr(Activity activity, String[] strArr, z zVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.dr = zVar;
            activity.requestPermissions(strArr, 1);
        } else if (zVar != null) {
            zVar.dr();
        }
    }

    @Override // com.ss.android.download.api.config.ll
    public boolean dr(Context context, String str) {
        return context != null && ContextCompat.checkSelfPermission(context, str) == 0;
    }

    @Override // com.ss.android.download.api.config.ll
    public void dr(Activity activity, int i, String[] strArr, int[] iArr) {
        z zVar;
        if (iArr.length > 0 && (zVar = this.dr) != null) {
            if (iArr[0] == -1) {
                zVar.dr(strArr[0]);
            } else if (iArr[0] == 0) {
                zVar.dr();
            }
        }
    }
}
