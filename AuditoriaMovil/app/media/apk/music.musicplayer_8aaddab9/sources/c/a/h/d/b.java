package c.a.h.d;

import android.content.Context;
import android.content.Intent;
import c.a.h.d.a;
import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import h.l.f;
import h.o.c.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // c.a.h.d.a
    public Intent a(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(strArr2, "input");
        j.e(strArr2, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
        j.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // c.a.h.d.a
    public a.C0011a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(strArr2, "input");
        boolean z = true;
        if (strArr2.length == 0) {
            return new a.C0011a<>(f.a);
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (!(c.i.d.a.a(context, strArr2[i2]) == 0)) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            int b0 = w.b0(strArr2.length);
            if (b0 < 16) {
                b0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(b0);
            for (String str : strArr2) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new a.C0011a<>(linkedHashMap);
        }
        return null;
    }

    @Override // c.a.h.d.a
    public Map<String, Boolean> c(int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return f.a;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            int i3 = 0;
            for (int i4 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i4 == 0));
            }
            j.e(stringArrayExtra, "<this>");
            ArrayList arrayList2 = new ArrayList();
            j.e(stringArrayExtra, "<this>");
            j.e(arrayList2, "destination");
            int length = stringArrayExtra.length;
            while (i3 < length) {
                String str = stringArrayExtra[i3];
                i3++;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            j.e(arrayList2, "<this>");
            j.e(arrayList, "other");
            Iterator it = arrayList2.iterator();
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList3 = new ArrayList(Math.min(w.s(arrayList2, 10), w.s(arrayList, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList3.add(new h.f(it.next(), it2.next()));
            }
            return h.l.c.k(arrayList3);
        }
        return f.a;
    }
}
