package com.amazon.aps.iva.fg;

import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
/* compiled from: LocalVideoData.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: LocalVideoData.kt */
    /* loaded from: classes.dex */
    public static final class a extends d {
        public final boolean a;
        public final v b;

        public a(v vVar, boolean z) {
            j.f(vVar, "mediaSource");
            this.a = z;
            this.b = vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.b.hashCode() + (r0 * 31);
        }

        public final String toString() {
            return "LocalMediaSource(isAbleToPlay=" + this.a + ", mediaSource=" + this.b + ")";
        }
    }

    /* compiled from: LocalVideoData.kt */
    /* loaded from: classes.dex */
    public static final class b extends d {
        public final boolean a;
        public final File b;

        public b(File file, boolean z) {
            this.a = z;
            this.b = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && j.a(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int hashCode() {
            int hashCode;
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            File file = this.b;
            if (file == null) {
                hashCode = 0;
            } else {
                hashCode = file.hashCode();
            }
            return i + hashCode;
        }

        public final String toString() {
            return "LocalVideoFile(_isAbleToPlay=" + this.a + ", localVideoFile=" + this.b + ")";
        }
    }
}
