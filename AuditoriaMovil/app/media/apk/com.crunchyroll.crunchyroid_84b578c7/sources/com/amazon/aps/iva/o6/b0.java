package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.o6.a0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.r0;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: MergingMediaSource.java */
/* loaded from: classes.dex */
public final class b0 extends g<Integer> {
    public static final com.amazon.aps.iva.q5.b0 s;
    public final v[] k;
    public final r0[] l;
    public final ArrayList<v> m;
    public final h n;
    public final ListMultimap o;
    public int p;
    public long[][] q;
    public a r;

    /* compiled from: MergingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends IOException {
    }

    static {
        b0.b bVar = new b0.b();
        bVar.a = "MergingMediaSource";
        s = bVar.a();
    }

    public b0(v... vVarArr) {
        h hVar = new h(0);
        this.k = vVarArr;
        this.n = hVar;
        this.m = new ArrayList<>(Arrays.asList(vVarArr));
        this.p = -1;
        this.l = new r0[vVarArr.length];
        this.q = new long[0];
        new HashMap();
        this.o = MultimapBuilder.hashKeys().arrayListValues().build();
    }

    @Override // com.amazon.aps.iva.o6.v
    public final com.amazon.aps.iva.q5.b0 b() {
        v[] vVarArr = this.k;
        if (vVarArr.length > 0) {
            return vVarArr[0].b();
        }
        return s;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        a0 a0Var = (a0) uVar;
        int i = 0;
        while (true) {
            v[] vVarArr = this.k;
            if (i < vVarArr.length) {
                v vVar = vVarArr[i];
                u uVar2 = a0Var.b[i];
                if (uVar2 instanceof a0.b) {
                    uVar2 = ((a0.b) uVar2).b;
                }
                vVar.c(uVar2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        v[] vVarArr = this.k;
        int length = vVarArr.length;
        u[] uVarArr = new u[length];
        r0[] r0VarArr = this.l;
        int c = r0VarArr[0].c(bVar.a);
        for (int i = 0; i < length; i++) {
            uVarArr[i] = vVarArr[i].h(bVar.b(r0VarArr[i].n(c)), bVar2, j - this.q[c][i]);
        }
        return new a0(this.n, this.q[c], uVarArr);
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.v
    public final void j() throws IOException {
        a aVar = this.r;
        if (aVar == null) {
            super.j();
            return;
        }
        throw aVar;
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(com.amazon.aps.iva.w5.y yVar) {
        this.j = yVar;
        this.i = com.amazon.aps.iva.t5.g0.m(null);
        int i = 0;
        while (true) {
            v[] vVarArr = this.k;
            if (i < vVarArr.length) {
                y(Integer.valueOf(i), vVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.g, com.amazon.aps.iva.o6.a
    public final void t() {
        super.t();
        Arrays.fill(this.l, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList<v> arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // com.amazon.aps.iva.o6.g
    public final v.b u(Integer num, v.b bVar) {
        if (num.intValue() != 0) {
            return null;
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.o6.g
    public final void x(Integer num, v vVar, r0 r0Var) {
        Integer num2 = num;
        if (this.r == null) {
            if (this.p == -1) {
                this.p = r0Var.j();
            } else if (r0Var.j() != this.p) {
                this.r = new a();
                return;
            }
            int length = this.q.length;
            r0[] r0VarArr = this.l;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance(Long.TYPE, this.p, r0VarArr.length);
            }
            ArrayList<v> arrayList = this.m;
            arrayList.remove(vVar);
            r0VarArr[num2.intValue()] = r0Var;
            if (arrayList.isEmpty()) {
                s(r0VarArr[0]);
            }
        }
    }
}
