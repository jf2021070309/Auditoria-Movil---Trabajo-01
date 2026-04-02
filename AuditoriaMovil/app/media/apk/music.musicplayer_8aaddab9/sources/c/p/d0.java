package c.p;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import c.w.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class d0 {
    public static final Class[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f2442b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, a.b> f2443c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, ?> f2444d;

    /* renamed from: e  reason: collision with root package name */
    public final a.b f2445e;

    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // c.w.a.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(d0.this.f2443c).entrySet()) {
                Bundle a = ((a.b) entry.getValue()).a();
                d0 d0Var = d0.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(d0Var);
                if (a != null) {
                    for (Class cls : d0.a) {
                        if (!cls.isInstance(a)) {
                        }
                    }
                    StringBuilder y = e.a.d.a.a.y("Can't put value with type ");
                    y.append(a.getClass());
                    y.append(" into saved state");
                    throw new IllegalArgumentException(y.toString());
                }
                w wVar = (w) d0Var.f2444d.get(str);
                if (wVar != null) {
                    wVar.h(a);
                } else {
                    d0Var.f2442b.put(str, a);
                }
            }
            Set<String> keySet = d0.this.f2442b.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(d0.this.f2442b.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i2 = Build.VERSION.SDK_INT;
        clsArr[27] = i2 >= 21 ? Size.class : cls;
        if (i2 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        a = clsArr;
    }

    public d0() {
        this.f2443c = new HashMap();
        this.f2444d = new HashMap();
        this.f2445e = new a();
        this.f2442b = new HashMap();
    }

    public d0(Map<String, Object> map) {
        this.f2443c = new HashMap();
        this.f2444d = new HashMap();
        this.f2445e = new a();
        this.f2442b = new HashMap(map);
    }
}
