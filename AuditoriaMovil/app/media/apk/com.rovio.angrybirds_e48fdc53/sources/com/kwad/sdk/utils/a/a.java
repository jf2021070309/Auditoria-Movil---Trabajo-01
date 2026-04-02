package com.kwad.sdk.utils.a;
/* loaded from: classes3.dex */
final class a {

    /* renamed from: com.kwad.sdk.utils.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0273a extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0273a(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        @Override // com.kwad.sdk.utils.a.a.b
        final byte Kd() {
            return (byte) 7;
        }
    }

    /* loaded from: classes3.dex */
    static abstract class b {
        int offset;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract byte Kd();
    }

    /* loaded from: classes3.dex */
    static class c extends b {
        boolean value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i, boolean z) {
            this.offset = i;
            this.value = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 1;
        }
    }

    /* loaded from: classes3.dex */
    static class d extends b {
        double value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(int i, double d) {
            this.offset = i;
            this.value = d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 5;
        }
    }

    /* loaded from: classes3.dex */
    static class e extends b {
        float value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(int i, float f) {
            this.offset = i;
            this.value = f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 3;
        }
    }

    /* loaded from: classes3.dex */
    static class f extends b {
        int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(int i, int i2) {
            this.offset = i;
            this.value = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 2;
        }
    }

    /* loaded from: classes3.dex */
    static class g extends b {
        long value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i, long j) {
            this.offset = i;
            this.value = j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 4;
        }
    }

    /* loaded from: classes3.dex */
    static class h extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 8;
        }
    }

    /* loaded from: classes3.dex */
    static class i extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.kwad.sdk.utils.a.a.b
        public final byte Kd() {
            return (byte) 6;
        }
    }

    /* loaded from: classes3.dex */
    static abstract class j extends b {
        int aKL;
        boolean aKM;
        int start;
        Object value;

        j(int i, int i2, Object obj, int i3, boolean z) {
            this.start = i;
            this.offset = i2;
            this.value = obj;
            this.aKL = i3;
            this.aKM = z;
        }
    }
}
