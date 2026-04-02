package com.amazon.aps.iva.i;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.i.a;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // com.amazon.aps.iva.i.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        j.f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // com.amazon.aps.iva.i.a
    public final a.C0348a b(ComponentActivity componentActivity, Object obj) {
        boolean z;
        boolean z2;
        String[] strArr = (String[]) obj;
        j.f(componentActivity, "context");
        j.f(strArr, "input");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new a.C0348a(a0.b);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (com.amazon.aps.iva.d3.a.checkSelfPermission(componentActivity, strArr[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            int w = k.w(strArr.length);
            if (w < 16) {
                w = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0348a(linkedHashMap);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.i.a
    public final Map<String, Boolean> c(int i, Intent intent) {
        boolean z;
        a0 a0Var = a0.b;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return i0.Z(x.e1(o.O(stringArrayExtra), arrayList));
            }
            return a0Var;
        }
        return a0Var;
    }
}
