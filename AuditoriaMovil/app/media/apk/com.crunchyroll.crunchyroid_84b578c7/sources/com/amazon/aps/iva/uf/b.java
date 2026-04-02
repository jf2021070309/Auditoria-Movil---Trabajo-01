package com.amazon.aps.iva.uf;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: RatingControlState.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: RatingControlState.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public static final a a = new a();
    }

    /* compiled from: RatingControlState.kt */
    /* renamed from: com.amazon.aps.iva.uf.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0765b extends b {
        public static final C0765b a = new C0765b();
    }

    /* compiled from: RatingControlState.kt */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public final h a;
        public final int b;
        public final int c;
        public final boolean d;

        public c(h hVar, int i, int i2, boolean z) {
            j.f(hVar, "userRating");
            this.a = hVar;
            this.b = i;
            this.c = i2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int a = r.a(this.c, r.a(this.b, this.a.hashCode() * 31, 31), 31);
            boolean z = this.d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return a + i;
        }

        public final String toString() {
            return "RatingControlSuccessState(userRating=" + this.a + ", likesCount=" + this.b + ", dislikesCount=" + this.c + ", animate=" + this.d + ")";
        }
    }
}
