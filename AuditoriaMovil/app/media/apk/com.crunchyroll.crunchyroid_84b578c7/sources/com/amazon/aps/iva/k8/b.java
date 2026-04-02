package com.amazon.aps.iva.k8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.g3.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Palette.java */
/* loaded from: classes.dex */
public final class b {
    public static final a f = new a();
    public final List<d> a;
    public final List<com.amazon.aps.iva.k8.c> b;
    public final d e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final com.amazon.aps.iva.x.a c = new com.amazon.aps.iva.x.a();

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // com.amazon.aps.iva.k8.b.c
        public final boolean a(float[] fArr) {
            boolean z;
            boolean z2;
            boolean z3;
            float f = fArr[2];
            if (f >= 0.95f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f <= 0.05f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    float f2 = fArr[0];
                    if (f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: com.amazon.aps.iva.k8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0437b {
        public final Bitmap a;
        public final ArrayList b;
        public int c;
        public final int d;
        public final int e;
        public final ArrayList f;

        public C0437b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.c = 16;
            this.d = 12544;
            this.e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (!bitmap.isRecycled()) {
                arrayList2.add(b.f);
                this.a = bitmap;
                arrayList.add(com.amazon.aps.iva.k8.c.e);
                arrayList.add(com.amazon.aps.iva.k8.c.f);
                arrayList.add(com.amazon.aps.iva.k8.c.g);
                arrayList.add(com.amazon.aps.iva.k8.c.h);
                arrayList.add(com.amazon.aps.iva.k8.c.i);
                arrayList.add(com.amazon.aps.iva.k8.c.j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.k8.b a() {
            /*
                Method dump skipped, instructions count: 449
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k8.b.C0437b.a():com.amazon.aps.iva.k8.b");
        }
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(float[] fArr);
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public final void a() {
            int h;
            int h2;
            if (!this.f) {
                int i = this.d;
                int f = e.f(-1, 4.5f, i);
                int f2 = e.f(-1, 3.0f, i);
                if (f != -1 && f2 != -1) {
                    this.h = e.h(-1, f);
                    this.g = e.h(-1, f2);
                    this.f = true;
                    return;
                }
                int f3 = e.f(-16777216, 4.5f, i);
                int f4 = e.f(-16777216, 3.0f, i);
                if (f3 != -1 && f4 != -1) {
                    this.h = e.h(-16777216, f3);
                    this.g = e.h(-16777216, f4);
                    this.f = true;
                    return;
                }
                if (f != -1) {
                    h = e.h(-1, f);
                } else {
                    h = e.h(-16777216, f3);
                }
                this.h = h;
                if (f2 != -1) {
                    h2 = e.h(-1, f2);
                } else {
                    h2 = e.h(-16777216, f4);
                }
                this.g = h2;
                this.f = true;
            }
        }

        public final float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            e.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.d * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(d.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.d));
            sb.append("] [HSL: ");
            sb.append(Arrays.toString(b()));
            sb.append("] [Population: ");
            sb.append(this.e);
            sb.append("] [Title Text: #");
            a();
            sb.append(Integer.toHexString(this.g));
            sb.append("] [Body Text: #");
            a();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = (d) arrayList.get(i2);
            int i3 = dVar2.e;
            if (i3 > i) {
                dVar = dVar2;
                i = i3;
            }
        }
        this.e = dVar;
    }
}
