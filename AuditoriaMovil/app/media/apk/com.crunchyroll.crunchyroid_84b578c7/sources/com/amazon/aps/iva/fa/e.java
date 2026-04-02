package com.amazon.aps.iva.fa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public final class e {
    public static final e c = new e("COMPOSITION");
    public final List<String> a;
    public f b;

    public e(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public final boolean a(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        List<String> list = this.a;
        if (i >= list.size()) {
            return false;
        }
        if (i == list.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = list.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if ((!z && (i != list.size() - 2 || !list.get(list.size() - 1).equals("**"))) || !z3) {
                return false;
            }
            return true;
        }
        if (!z && list.get(i + 1).equals(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i != list.size() - 2 && (i != list.size() - 3 || !list.get(list.size() - 1).equals("**"))) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < list.size() - 1) {
                return false;
            }
            return list.get(i2).equals(str);
        }
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.a;
        if (!list.get(i).equals("**")) {
            return 1;
        }
        if (i == list.size() - 1 || !list.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        if (i >= list.size()) {
            return false;
        }
        if (list.get(i).equals(str) || list.get(i).equals("**") || list.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        if (i < list.size() - 1 || list.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.a)) {
            return false;
        }
        f fVar = this.b;
        f fVar2 = eVar.b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        return defpackage.a.b(sb, z, '}');
    }

    public e(e eVar) {
        this.a = new ArrayList(eVar.a);
        this.b = eVar.b;
    }
}
