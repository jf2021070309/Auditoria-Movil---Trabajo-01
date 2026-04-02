package com.amazon.aps.iva.f8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaRouteSelector.java */
/* loaded from: classes.dex */
public final class e0 {
    public static final e0 c = new e0(new Bundle(), null);
    public final Bundle a;
    public List<String> b;

    /* compiled from: MediaRouteSelector.java */
    /* loaded from: classes.dex */
    public static final class a {
        public ArrayList<String> a;

        public a(e0 e0Var) {
            if (e0Var != null) {
                e0Var.a();
                if (!e0Var.b.isEmpty()) {
                    this.a = new ArrayList<>(e0Var.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public final void a(ArrayList arrayList) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        if (this.a == null) {
                            this.a = new ArrayList<>();
                        }
                        if (!this.a.contains(str)) {
                            this.a.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            }
        }

        public final e0 b() {
            if (this.a == null) {
                return e0.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new e0(bundle, this.a);
        }
    }

    public e0(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public static e0 b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new e0(bundle, null);
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean d() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            a();
            e0Var.a();
            return this.b.equals(e0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
