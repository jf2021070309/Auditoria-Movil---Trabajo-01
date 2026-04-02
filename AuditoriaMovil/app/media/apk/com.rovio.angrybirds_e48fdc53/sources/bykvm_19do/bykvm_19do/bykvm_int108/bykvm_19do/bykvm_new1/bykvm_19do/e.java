package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class e {
    private static volatile e e;
    private Context a;
    private Map<bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c, c> b = new HashMap();
    private b c;
    private d d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.values().length];
            a = iArr;
            try {
                iArr[bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.CUSTOM_JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private e(Context context) {
        this.a = context;
        this.c = new b(context);
        this.d = new d(this.a);
    }

    private c a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c cVar) {
        c cVar2 = this.b.get(cVar);
        if (cVar2 == null) {
            int i = a.a[cVar.ordinal()];
            if (i == 1) {
                cVar2 = new g(this.a, this.c, this.d);
            } else if (i == 2) {
                cVar2 = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do.a(this.a, this.c, this.d);
            } else if (i == 3) {
                cVar2 = new f(this.a, this.c, this.d);
            }
            if (cVar2 != null) {
                this.b.put(cVar, cVar2);
            }
        }
        return cVar2;
    }

    public static e a() {
        if (e != null) {
            return e;
        }
        throw new IllegalArgumentException("CrashContextAssembly not init");
    }

    public static void a(Context context) {
        if (e == null) {
            e = new e(context);
        }
    }

    public bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c cVar, bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a aVar) {
        c a2;
        return (cVar == null || (a2 = a(cVar)) == null) ? aVar : a2.b(aVar);
    }
}
