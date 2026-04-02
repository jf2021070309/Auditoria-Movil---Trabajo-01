package com.crunchyroll.appwidgets.continuewatching;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: ContinueWatchingState.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: ContinueWatchingState.kt */
    /* renamed from: com.crunchyroll.appwidgets.continuewatching.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0949a implements a {
        public static final C0949a a = new C0949a();
    }

    /* compiled from: ContinueWatchingState.kt */
    /* loaded from: classes.dex */
    public static final class b implements a {
        public final g<List<com.amazon.aps.iva.sd.a>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g<? extends List<com.amazon.aps.iva.sd.a>> gVar) {
            this.a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Authorized(data=" + this.a + ")";
        }
    }
}
