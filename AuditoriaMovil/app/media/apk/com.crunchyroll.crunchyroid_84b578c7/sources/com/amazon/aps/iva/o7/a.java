package com.amazon.aps.iva.o7;

import com.amazon.aps.iva.t5.v;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: Atom.java */
/* loaded from: classes.dex */
public abstract class a {
    public final int a;

    /* compiled from: Atom.java */
    /* renamed from: com.amazon.aps.iva.o7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0558a extends a {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;

        public C0558a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public final C0558a b(int i) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0558a c0558a = (C0558a) arrayList.get(i2);
                if (c0558a.a == i) {
                    return c0558a;
                }
            }
            return null;
        }

        public final b c(int i) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) arrayList.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.amazon.aps.iva.o7.a
        public final String toString() {
            return a.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public final v b;

        public b(int i, v vVar) {
            super(i);
            this.b = vVar;
        }
    }

    public a(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.a);
    }
}
