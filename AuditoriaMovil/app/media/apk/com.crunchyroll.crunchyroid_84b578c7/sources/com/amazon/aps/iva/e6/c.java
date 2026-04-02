package com.amazon.aps.iva.e6;

import android.net.Uri;
import com.amazon.aps.iva.m6.q;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: DashManifest.java */
/* loaded from: classes.dex */
public final class c implements q<c> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final n3 i;
    public final l j;
    public final Uri k;
    public final h l;
    public final List<g> m;

    public c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, h hVar, n3 n3Var, l lVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = hVar;
        this.i = n3Var;
        this.k = uri;
        this.j = lVar;
        this.m = arrayList;
    }

    @Override // com.amazon.aps.iva.m6.q
    public final c a(List list) {
        long j;
        ArrayList arrayList;
        long j2;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new p0(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= c()) {
                break;
            }
            if (((p0) linkedList.peek()).b != i) {
                long d = d(i);
                if (d != -9223372036854775807L) {
                    j3 += d;
                }
                j2 = j3;
                arrayList2 = arrayList3;
            } else {
                g b = b(i);
                List<a> list2 = b.c;
                p0 p0Var = (p0) linkedList.poll();
                int i2 = p0Var.b;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i3 = p0Var.c;
                    a aVar = list2.get(i3);
                    List<j> list3 = aVar.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add(list3.get(p0Var.d));
                        p0Var = (p0) linkedList.poll();
                        if (p0Var.b != i2) {
                            break;
                        }
                    } while (p0Var.c == i3);
                    arrayList = arrayList3;
                    j2 = j3;
                    arrayList4.add(new a(aVar.a, aVar.b, arrayList5, aVar.d, aVar.e, aVar.f));
                    if (p0Var.b != i2) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j3 = j2;
                }
                linkedList.addFirst(p0Var);
                arrayList2 = arrayList;
                arrayList2.add(new g(b.a, b.b - j2, arrayList4, b.d));
            }
            i++;
            arrayList3 = arrayList2;
            j3 = j2;
        }
        long j4 = j3;
        ArrayList arrayList6 = arrayList3;
        long j5 = this.b;
        if (j5 != -9223372036854775807L) {
            j = j5 - j4;
        }
        return new c(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
    }

    public final g b(int i) {
        return this.m.get(i);
    }

    public final int c() {
        return this.m.size();
    }

    public final long d(int i) {
        long j;
        long j2;
        List<g> list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = list.get(i).b;
        } else {
            j = list.get(i + 1).b;
            j2 = list.get(i).b;
        }
        return j - j2;
    }

    public final long e(int i) {
        return g0.Q(d(i));
    }
}
