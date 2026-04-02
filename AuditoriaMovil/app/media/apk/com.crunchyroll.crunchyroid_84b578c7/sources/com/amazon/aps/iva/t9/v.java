package com.amazon.aps.iva.t9;

import android.os.Build;
/* compiled from: WorkTypeConverters.java */
/* loaded from: classes.dex */
public final class v {

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.amazon.aps.iva.k9.q.values().length];
            d = iArr;
            try {
                iArr[com.amazon.aps.iva.k9.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[com.amazon.aps.iva.k9.q.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.amazon.aps.iva.k9.n.values().length];
            c = iArr2;
            try {
                iArr2[com.amazon.aps.iva.k9.n.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[com.amazon.aps.iva.k9.n.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[com.amazon.aps.iva.k9.n.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[com.amazon.aps.iva.k9.n.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[com.amazon.aps.iva.k9.n.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[com.amazon.aps.iva.k9.a.values().length];
            b = iArr3;
            try {
                iArr3[com.amazon.aps.iva.k9.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[com.amazon.aps.iva.k9.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[com.amazon.aps.iva.k9.t.values().length];
            a = iArr4;
            try {
                iArr4[com.amazon.aps.iva.k9.t.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[com.amazon.aps.iva.k9.t.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[com.amazon.aps.iva.k9.t.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[com.amazon.aps.iva.k9.t.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[com.amazon.aps.iva.k9.t.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[com.amazon.aps.iva.k9.t.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.k9.d a(byte[] r7) {
        /*
            com.amazon.aps.iva.k9.d r0 = new com.amazon.aps.iva.k9.d
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            com.amazon.aps.iva.k9.d$a r5 = new com.amazon.aps.iva.k9.d$a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.HashSet r3 = r0.a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t9.v.a(byte[]):com.amazon.aps.iva.k9.d");
    }

    public static com.amazon.aps.iva.k9.a b(int i) {
        if (i != 0) {
            if (i == 1) {
                return com.amazon.aps.iva.k9.a.LINEAR;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Could not convert ", i, " to BackoffPolicy"));
        }
        return com.amazon.aps.iva.k9.a.EXPONENTIAL;
    }

    public static com.amazon.aps.iva.k9.n c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return com.amazon.aps.iva.k9.n.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Could not convert ", i, " to NetworkType"));
                        }
                        return com.amazon.aps.iva.k9.n.METERED;
                    }
                    return com.amazon.aps.iva.k9.n.NOT_ROAMING;
                }
                return com.amazon.aps.iva.k9.n.UNMETERED;
            }
            return com.amazon.aps.iva.k9.n.CONNECTED;
        }
        return com.amazon.aps.iva.k9.n.NOT_REQUIRED;
    }

    public static com.amazon.aps.iva.k9.q d(int i) {
        if (i != 0) {
            if (i == 1) {
                return com.amazon.aps.iva.k9.q.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Could not convert ", i, " to OutOfQuotaPolicy"));
        }
        return com.amazon.aps.iva.k9.q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static com.amazon.aps.iva.k9.t e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return com.amazon.aps.iva.k9.t.CANCELLED;
                            }
                            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Could not convert ", i, " to State"));
                        }
                        return com.amazon.aps.iva.k9.t.BLOCKED;
                    }
                    return com.amazon.aps.iva.k9.t.FAILED;
                }
                return com.amazon.aps.iva.k9.t.SUCCEEDED;
            }
            return com.amazon.aps.iva.k9.t.RUNNING;
        }
        return com.amazon.aps.iva.k9.t.ENQUEUED;
    }

    public static int f(com.amazon.aps.iva.k9.t tVar) {
        switch (a.a[tVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + tVar + " to int");
        }
    }
}
