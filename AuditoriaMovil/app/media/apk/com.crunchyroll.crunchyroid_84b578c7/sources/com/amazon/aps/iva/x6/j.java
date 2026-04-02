package com.amazon.aps.iva.x6;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes.dex */
public final class j implements s {
    public static final int[] c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final a d = new a(new com.amazon.aps.iva.q5.e(8));
    public static final a e = new a(new com.amazon.aps.iva.g1.n(6));
    public ImmutableList<com.amazon.aps.iva.q5.v> b;

    /* compiled from: DefaultExtractorsFactory.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final InterfaceC0846a a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: com.amazon.aps.iva.x6.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0846a {
            Constructor<? extends n> b() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC0846a interfaceC0846a) {
            this.a = interfaceC0846a;
        }

        public final n a(Object... objArr) {
            Constructor<? extends n> b;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        b = this.a.b();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                b = null;
            }
            if (b == null) {
                return null;
            }
            try {
                return b.newInstance(objArr);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating extractor", e2);
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.s
    public final synchronized n[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = c;
        arrayList = new ArrayList(16);
        int B = com.amazon.aps.iva.e.z.B(map);
        if (B != -1) {
            c(B, arrayList);
        }
        int C = com.amazon.aps.iva.e.z.C(uri);
        if (C != -1 && C != B) {
            c(C, arrayList);
        }
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i];
            if (i2 != B && i2 != C) {
                c(i2, arrayList);
            }
        }
        return (n[]) arrayList.toArray(new n[arrayList.size()]);
    }

    @Override // com.amazon.aps.iva.x6.s
    public final synchronized n[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public final void c(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new com.amazon.aps.iva.z7.a());
                return;
            case 1:
                arrayList.add(new com.amazon.aps.iva.z7.c());
                return;
            case 2:
                arrayList.add(new com.amazon.aps.iva.z7.e(0));
                return;
            case 3:
                arrayList.add(new com.amazon.aps.iva.y6.b());
                return;
            case 4:
                n a2 = d.a(0);
                if (a2 != null) {
                    arrayList.add(a2);
                    return;
                } else {
                    arrayList.add(new com.amazon.aps.iva.a7.c());
                    return;
                }
            case 5:
                arrayList.add(new com.amazon.aps.iva.b7.c());
                return;
            case 6:
                arrayList.add(new com.amazon.aps.iva.m7.d(0));
                return;
            case 7:
                arrayList.add(new com.amazon.aps.iva.n7.d(0));
                return;
            case 8:
                arrayList.add(new com.amazon.aps.iva.o7.e(0));
                arrayList.add(new com.amazon.aps.iva.o7.h(0));
                return;
            case 9:
                arrayList.add(new com.amazon.aps.iva.p7.c());
                return;
            case 10:
                arrayList.add(new com.amazon.aps.iva.z7.x());
                return;
            case 11:
                if (this.b == null) {
                    this.b = ImmutableList.of();
                }
                arrayList.add(new com.amazon.aps.iva.z7.d0(1, new com.amazon.aps.iva.t5.b0(0L), new com.amazon.aps.iva.z7.g(0, this.b)));
                return;
            case 12:
                arrayList.add(new com.amazon.aps.iva.a8.a());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new com.amazon.aps.iva.c7.a());
                return;
            case 15:
                n a3 = e.a(new Object[0]);
                if (a3 != null) {
                    arrayList.add(a3);
                    return;
                }
                return;
            case 16:
                arrayList.add(new com.amazon.aps.iva.z6.b());
                return;
        }
    }
}
