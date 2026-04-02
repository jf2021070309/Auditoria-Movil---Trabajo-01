package com.amazon.aps.iva.x5;

import java.io.File;
/* compiled from: CacheSpan.java */
/* loaded from: classes.dex */
public class h implements Comparable<h> {
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final File f;
    public final long g;

    public h(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.b = str;
        this.c = j;
        this.d = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = file;
        this.g = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        String str = hVar2.b;
        String str2 = this.b;
        if (!str2.equals(str)) {
            return str2.compareTo(hVar2.b);
        }
        int i = ((this.c - hVar2.c) > 0L ? 1 : ((this.c - hVar2.c) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.c);
        sb.append(", ");
        return com.amazon.aps.iva.c.b.b(sb, this.d, "]");
    }
}
