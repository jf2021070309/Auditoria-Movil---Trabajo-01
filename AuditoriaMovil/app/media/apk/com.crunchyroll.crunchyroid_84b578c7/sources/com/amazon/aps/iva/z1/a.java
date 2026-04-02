package com.amazon.aps.iva.z1;

import android.content.res.Resources;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.j1.d;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: VectorResources.android.kt */
/* loaded from: classes.dex */
public final class a {
    public final HashMap<b, WeakReference<C0908a>> a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    /* renamed from: com.amazon.aps.iva.z1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0908a {
        public final d a;
        public final int b;

        public C0908a(d dVar, int i) {
            this.a = dVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0908a)) {
                return false;
            }
            C0908a c0908a = (C0908a) obj;
            if (j.a(this.a, c0908a.a) && this.b == c0908a.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.a);
            sb.append(", configFlags=");
            return b2.b(sb, this.b, ')');
        }
    }

    /* compiled from: VectorResources.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final Resources.Theme a;
        public final int b;

        public b(Resources.Theme theme, int i) {
            this.a = theme;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.a, bVar.a) && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.a);
            sb.append(", id=");
            return b2.b(sb, this.b, ')');
        }
    }
}
