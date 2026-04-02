package com.amazon.aps.iva.k9;
/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class m {
    public static m a;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends m {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.amazon.aps.iva.k9.m
        public final void a(Throwable... thArr) {
            if (this.b <= 3 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // com.amazon.aps.iva.k9.m
        public final void b(Throwable... thArr) {
            if (this.b <= 6 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // com.amazon.aps.iva.k9.m
        public final void d(Throwable... thArr) {
            if (this.b <= 4 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        @Override // com.amazon.aps.iva.k9.m
        public final void f(Throwable... thArr) {
            if (this.b <= 5 && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public static synchronized m c() {
        m mVar;
        synchronized (m.class) {
            if (a == null) {
                a = new a(3);
            }
            mVar = a;
        }
        return mVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(Throwable... thArr);

    public abstract void b(Throwable... thArr);

    public abstract void d(Throwable... thArr);

    public abstract void f(Throwable... thArr);
}
