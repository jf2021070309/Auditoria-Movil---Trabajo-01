package com.amazon.aps.iva.i;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.i.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends a<String, Boolean> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        j.f(componentActivity, "context");
        j.f(str, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // com.amazon.aps.iva.i.a
    public final a.C0348a b(ComponentActivity componentActivity, Object obj) {
        boolean z;
        String str = (String) obj;
        j.f(componentActivity, "context");
        j.f(str, "input");
        if (com.amazon.aps.iva.d3.a.checkSelfPermission(componentActivity, str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new a.C0348a(Boolean.TRUE);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Boolean c(int i, Intent intent) {
        boolean z;
        boolean z2;
        if (intent != null && i == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z3 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (intArrayExtra[i2] == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
        return Boolean.FALSE;
    }
}
