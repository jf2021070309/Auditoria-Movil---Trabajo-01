package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.amazon.aps.iva.i4.j;
/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class h {
    public final com.amazon.aps.iva.j4.b a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final SparseArray<a> a;
        public j b;

        public a() {
            this(1);
        }

        public final void a(j jVar, int i, int i2) {
            a aVar;
            int a = jVar.a(i);
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(jVar.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(jVar, i + 1, i2);
            } else {
                aVar.b = jVar;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    public h(Typeface typeface, com.amazon.aps.iva.j4.b bVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        this.d = typeface;
        this.a = bVar;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i4 = a2 + bVar.a;
            i = bVar.b.getInt(bVar.b.getInt(i4) + i4);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i5 = a3 + bVar.a;
            i2 = bVar.b.getInt(bVar.b.getInt(i5) + i5);
        } else {
            i2 = 0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            j jVar = new j(this, i6);
            com.amazon.aps.iva.j4.a c = jVar.c();
            int a4 = c.a(4);
            if (a4 != 0) {
                i3 = c.b.getInt(a4 + c.a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, this.b, i6 * 2);
            if (jVar.b() > 0) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.u(z, "invalid metadata codepoint length");
            this.c.a(jVar, 0, jVar.b() - 1);
        }
    }
}
