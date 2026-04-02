package com.amazon.aps.iva.v1;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.amazon.aps.iva.o0.s3;
import java.io.Serializable;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class k1 {
    public static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof com.amazon.aps.iva.y0.t) {
            com.amazon.aps.iva.y0.t tVar = (com.amazon.aps.iva.y0.t) obj;
            if (tVar.b() != com.amazon.aps.iva.o0.r1.a && tVar.b() != s3.a && tVar.b() != com.amazon.aps.iva.o0.t2.a) {
                return false;
            }
            T value = tVar.getValue();
            if (value == 0) {
                return true;
            }
            return a(value);
        } else if ((obj instanceof com.amazon.aps.iva.kb0.a) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class<? extends Object>[] clsArr = a;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
