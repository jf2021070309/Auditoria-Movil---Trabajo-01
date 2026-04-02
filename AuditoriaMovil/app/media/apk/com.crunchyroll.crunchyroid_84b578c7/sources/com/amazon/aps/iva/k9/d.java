package com.amazon.aps.iva.k9;

import android.net.Uri;
import java.util.HashSet;
/* compiled from: ContentUriTriggers.java */
/* loaded from: classes.dex */
public final class d {
    public final HashSet a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == aVar.b && this.a.equals(aVar.a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
