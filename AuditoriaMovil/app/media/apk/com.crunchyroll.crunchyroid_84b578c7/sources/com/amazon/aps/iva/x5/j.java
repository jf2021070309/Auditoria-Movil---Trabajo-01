package com.amazon.aps.iva.x5;

import java.util.ArrayList;
import java.util.TreeSet;
/* compiled from: CachedContent.java */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final String b;
    public final TreeSet<s> c = new TreeSet<>();
    public final ArrayList<a> d = new ArrayList<>();
    public n e;

    /* compiled from: CachedContent.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public j(int i, String str, n nVar) {
        this.a = i;
        this.b = str;
        this.e = nVar;
    }

    public final long a(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        s b = b(j, j2);
        boolean z4 = !b.e;
        long j3 = Long.MAX_VALUE;
        long j4 = b.d;
        if (z4) {
            if (j4 != -1) {
                z3 = false;
            }
            if (!z3) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = b.c + j4;
        if (j6 < j3) {
            for (s sVar : this.c.tailSet(b, false)) {
                long j7 = sVar.c;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + sVar.d);
                if (j6 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final s b(long j, long j2) {
        long j3;
        s sVar = new s(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet<s> treeSet = this.c;
        s floor = treeSet.floor(sVar);
        if (floor != null && floor.c + floor.d > j) {
            return floor;
        }
        s ceiling = treeSet.ceiling(sVar);
        if (ceiling != null) {
            long j4 = ceiling.c - j;
            if (j2 == -1) {
                j3 = j4;
                return new s(this.b, j, j3, -9223372036854775807L, null);
            }
            j2 = Math.min(j4, j2);
        }
        j3 = j2;
        return new s(this.b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        boolean z;
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i);
            long j3 = aVar.b;
            int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            long j4 = aVar.a;
            if (i2 != 0 ? j2 != -1 && j4 <= j && j + j2 <= j4 + j3 : j >= j4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a && this.b.equals(jVar.b) && this.c.equals(jVar.c) && this.e.equals(jVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a * 31, 31);
    }
}
