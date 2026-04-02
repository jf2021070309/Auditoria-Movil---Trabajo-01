package com.amazon.aps.iva.q5;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;
/* compiled from: TrackGroup.java */
/* loaded from: classes.dex */
public final class s0 implements k {
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final p i = new p(3);
    public final int b;
    public final String c;
    public final int d;
    public final v[] e;
    public int f;

    public s0() {
        throw null;
    }

    public s0(String str, v... vVarArr) {
        com.amazon.aps.iva.cq.b.t(vVarArr.length > 0);
        this.c = str;
        this.e = vVarArr;
        this.b = vVarArr.length;
        int i2 = g0.i(vVarArr[0].m);
        this.d = i2 == -1 ? g0.i(vVarArr[0].l) : i2;
        String str2 = vVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i3 = vVarArr[0].f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i4 = 1; i4 < vVarArr.length; i4++) {
            String str3 = vVarArr[i4].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                c(i4, "languages", vVarArr[0].d, vVarArr[i4].d);
                return;
            } else if (i3 != (vVarArr[i4].f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                c(i4, "role flags", Integer.toBinaryString(vVarArr[0].f), Integer.toBinaryString(vVarArr[i4].f));
                return;
            }
        }
    }

    public static void c(int i2, String str, String str2, String str3) {
        StringBuilder b = com.amazon.aps.iva.n4.a.b("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        b.append(str3);
        b.append("' (track ");
        b.append(i2);
        b.append(")");
        com.amazon.aps.iva.t5.p.d("", new IllegalStateException(b.toString()));
    }

    public final s0 a(String str) {
        return new s0(str, this.e);
    }

    public final int b(v vVar) {
        int i2 = 0;
        while (true) {
            v[] vVarArr = this.e;
            if (i2 < vVarArr.length) {
                if (vVar == vVarArr[i2]) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.c.equals(s0Var.c) && Arrays.equals(this.e, s0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = com.amazon.aps.iva.c80.a.b(this.c, 527, 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        v[] vVarArr = this.e;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(vVarArr.length);
        for (v vVar : vVarArr) {
            arrayList.add(vVar.e(true));
        }
        bundle.putParcelableArrayList(g, arrayList);
        bundle.putString(h, this.c);
        return bundle;
    }
}
