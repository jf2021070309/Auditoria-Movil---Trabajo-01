package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class f {
    private static final String c = "f";
    private Looper a;
    private final Set<String> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.onGranted();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.onDenied(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.onGranted();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.onDenied(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.values().length];
            a = iArr;
            try {
                iArr[bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public f() {
        this.a = Looper.getMainLooper();
        this.b = new HashSet(1);
    }

    public f(Looper looper) {
        this.a = Looper.getMainLooper();
        this.b = new HashSet(1);
        this.a = looper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String[] strArr) {
        synchronized (this) {
            Collections.addAll(this.b, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str, int i) {
        boolean a2;
        synchronized (this) {
            a2 = a(str, i == 0 ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.GRANTED : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d.DENIED);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.d dVar) {
        boolean z;
        Handler handler;
        Runnable aVar;
        Handler handler2;
        Runnable bVar;
        synchronized (this) {
            this.b.remove(str);
            int i = e.a[dVar.ordinal()];
            z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!shouldIgnorePermNotFound(str)) {
                            handler2 = new Handler(this.a);
                            bVar = new d(str);
                        } else if (this.b.isEmpty()) {
                            handler = new Handler(this.a);
                            aVar = new c();
                            handler.post(aVar);
                        }
                    }
                    z = false;
                } else {
                    handler2 = new Handler(this.a);
                    bVar = new b(str);
                }
                handler2.post(bVar);
            } else {
                if (this.b.isEmpty()) {
                    handler = new Handler(this.a);
                    aVar = new a();
                    handler.post(aVar);
                }
                z = false;
            }
        }
        return z;
    }

    public abstract void onDenied(String str);

    public abstract void onGranted();

    public boolean shouldIgnorePermNotFound(String str) {
        synchronized (this) {
            String str2 = c;
            Log.i(str2, "permission not found:" + str);
        }
        return true;
    }
}
