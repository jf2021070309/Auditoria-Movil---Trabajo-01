package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: MarkAsWatchedHandler.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: MarkAsWatchedHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public static final a a = new a();
    }

    /* compiled from: MarkAsWatchedHandler.kt */
    /* renamed from: com.amazon.aps.iva.oh.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0573b extends b {
        public static final C0573b a = new C0573b();
    }

    /* compiled from: MarkAsWatchedHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public final List<String> a;

        public c(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && j.a(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MarkSeasonAsWatchedSelected(assetIds=" + this.a + ")";
        }
    }
}
