package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.e0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class e {
    private static e d;
    private final Set<String> a = new HashSet(1);
    private final List<f> b = new ArrayList(1);
    private final List<WeakReference<f>> c = new ArrayList(1);

    private e() {
        b();
    }

    public static e a() {
        if (d == null) {
            d = new e();
        }
        return d;
    }

    private void a(f fVar) {
        synchronized (this) {
            Iterator<WeakReference<f>> it = this.c.iterator();
            while (it.hasNext()) {
                WeakReference<f> next = it.next();
                if (next.get() == fVar || next.get() == null) {
                    it.remove();
                }
            }
            Iterator<f> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (it2.next() == fVar) {
                    it2.remove();
                }
            }
        }
    }

    private void a(String[] strArr, f fVar) {
        synchronized (this) {
            if (fVar != null) {
                fVar.a(strArr);
                this.b.add(fVar);
                this.c.add(new WeakReference<>(fVar));
            }
        }
    }

    private void a(String[] strArr, int[] iArr) {
        int i;
        try {
            int length = strArr.length;
            if (iArr.length < length) {
                length = iArr.length;
            }
            Iterator<WeakReference<f>> it = this.c.iterator();
            while (it.hasNext()) {
                f fVar = it.next().get();
                while (i < length) {
                    i = (fVar == null || fVar.a(strArr[i], iArr[i])) ? 0 : i + 1;
                    it.remove();
                    break;
                }
            }
            Iterator<f> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        String str;
        synchronized (this) {
            for (Field field : Manifest.permission.class.getFields()) {
                try {
                    str = (String) field.get("");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    str = null;
                }
                this.a.add(str);
            }
        }
    }

    private void b(Activity activity, String[] strArr, f fVar) {
        for (String str : strArr) {
            if (fVar != null) {
                try {
                    if (fVar.a(str, !this.a.contains(str) ? d.NOT_FOUND : c.a(activity, str) != 0 ? d.DENIED : d.GRANTED)) {
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        a(fVar);
    }

    private List<String> c(Activity activity, String[] strArr, f fVar) {
        d dVar;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (this.a.contains(str)) {
                if (!a(activity, str)) {
                    arrayList.add(str);
                } else if (fVar != null) {
                    dVar = d.GRANTED;
                    fVar.a(str, dVar);
                }
            } else if (fVar != null) {
                dVar = d.NOT_FOUND;
                fVar.a(str, dVar);
            }
        }
        return arrayList;
    }

    public void a(Activity activity, String[] strArr, f fVar) {
        synchronized (this) {
            if (activity != null) {
                try {
                    a(strArr, fVar);
                    if (Build.VERSION.SDK_INT < 23) {
                        b(activity, strArr, fVar);
                    } else {
                        List<String> c = c(activity, strArr, fVar);
                        if (c.isEmpty()) {
                            a(fVar);
                        } else {
                            c.a(activity, (String[]) c.toArray(new String[c.size()]), 1);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void a(Activity activity, String[] strArr, int[] iArr) {
        synchronized (this) {
            try {
                new ArrayList(3);
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    if ((iArr[i] == -1 || (e0.t() && !b.b(activity, str))) && iArr[i] != -1) {
                        iArr[i] = -1;
                    }
                }
                a(strArr, iArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public boolean a(Context context, String str) {
        boolean z;
        synchronized (this) {
            z = false;
            if (context != null) {
                z = !e0.t() ? true : true;
            }
        }
        return z;
    }
}
