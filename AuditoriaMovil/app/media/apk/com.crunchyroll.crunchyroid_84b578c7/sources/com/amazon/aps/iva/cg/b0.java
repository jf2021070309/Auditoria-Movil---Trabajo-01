package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public abstract class b0 extends e0 {
    public final com.amazon.aps.iva.dg.a c;
    public final String d;

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class a extends b0 {
        public final com.amazon.aps.iva.dg.a e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.dg.a aVar, String str) {
            super(aVar, str);
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.e = aVar;
            this.f = str;
        }

        @Override // com.amazon.aps.iva.cg.b0
        public final String b() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.cg.e0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.e, aVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.cg.b0, com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
        public final com.amazon.aps.iva.dg.a getUri() {
            return this.e;
        }

        @Override // com.amazon.aps.iva.cg.e0
        public final int hashCode() {
            return this.f.hashCode() + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return "MusicConcertDeepLinkRawInput(uri=" + this.e + ", id=" + this.f + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class b extends b0 {
        public final com.amazon.aps.iva.dg.a e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.dg.a aVar, String str) {
            super(aVar, str);
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.e = aVar;
            this.f = str;
        }

        @Override // com.amazon.aps.iva.cg.b0
        public final String b() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.cg.e0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.e, bVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, bVar.f)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.cg.b0, com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
        public final com.amazon.aps.iva.dg.a getUri() {
            return this.e;
        }

        @Override // com.amazon.aps.iva.cg.e0
        public final int hashCode() {
            return this.f.hashCode() + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return "MusicVideoDeepLinkRawInput(uri=" + this.e + ", id=" + this.f + ")";
        }
    }

    public b0(com.amazon.aps.iva.dg.a aVar, String str) {
        super(u.a.WATCH_MUSIC_SCREEN, aVar);
        this.c = aVar;
        this.d = str;
    }

    public String b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public com.amazon.aps.iva.dg.a getUri() {
        return this.c;
    }
}
