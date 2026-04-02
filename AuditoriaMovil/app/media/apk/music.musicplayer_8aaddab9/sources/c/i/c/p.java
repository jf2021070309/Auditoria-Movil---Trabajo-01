package c.i.c;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
/* loaded from: classes.dex */
public class p {
    public static final Object a = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle[] b(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[sVarArr.length];
        if (sVarArr.length <= 0) {
            return bundleArr;
        }
        s sVar = sVarArr[0];
        new Bundle();
        throw null;
    }
}
