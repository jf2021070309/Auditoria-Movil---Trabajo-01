package com.amazon.aps.iva.j9;

import android.os.Build;
import com.amazon.aps.iva.j9.g0;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ApiFeature.java */
/* loaded from: classes.dex */
public abstract class a implements v {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    /* compiled from: ApiFeature.java */
    /* renamed from: com.amazon.aps.iva.j9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0408a {
        public static final HashSet a = new HashSet(Arrays.asList(g0.b.a.d()));
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class c extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class d extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class e extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class f extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            if (Build.VERSION.SDK_INT >= 27) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class g extends a {
        public g() {
            super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        }

        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class h extends a {
        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class i extends a {
        public i() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        }

        @Override // com.amazon.aps.iva.j9.a
        public final boolean b() {
            if (Build.VERSION.SDK_INT >= 33) {
                return true;
            }
            return false;
        }
    }

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // com.amazon.aps.iva.j9.v
    public final String a() {
        return this.a;
    }

    public abstract boolean b();

    public boolean c() {
        boolean z;
        HashSet hashSet = C0408a.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (hashSet.contains(str + ":dev")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.j9.v
    public final boolean isSupported() {
        if (!b() && !c()) {
            return false;
        }
        return true;
    }
}
