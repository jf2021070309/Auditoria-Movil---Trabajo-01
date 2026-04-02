package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
/* loaded from: classes2.dex */
final class b {
    private final boolean a;
    private final DataCharacter b;
    private final DataCharacter c;
    private final FinderPattern d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean z) {
        this.b = dataCharacter;
        this.c = dataCharacter2;
        this.d = finderPattern;
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataCharacter a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataCharacter b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FinderPattern c() {
        return this.d;
    }

    public boolean d() {
        return this.c == null;
    }

    public String toString() {
        return "[ " + this.b + " , " + this.c + " : " + (this.d == null ? "null" : Integer.valueOf(this.d.getValue())) + " ]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return a(this.b, bVar.b) && a(this.c, bVar.c) && a(this.d, bVar.d);
        }
        return false;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public int hashCode() {
        return (a(this.b) ^ a(this.c)) ^ a(this.d);
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
