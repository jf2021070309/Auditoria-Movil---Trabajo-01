package com.amazon.aps.iva.r5;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.t5.g0;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: AudioProcessor.java */
/* loaded from: classes.dex */
public interface b {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            int i4;
            this.a = i;
            this.b = i2;
            this.c = i3;
            if (g0.M(i3)) {
                i4 = g0.A(i3, i2);
            } else {
                i4 = -1;
            }
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            return b2.b(sb, this.c, ']');
        }
    }

    /* compiled from: AudioProcessor.java */
    /* renamed from: com.amazon.aps.iva.r5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0666b extends Exception {
        public C0666b(a aVar) {
            super("Unhandled input format: " + aVar);
        }
    }

    ByteBuffer a();

    @CanIgnoreReturnValue
    a b(a aVar) throws C0666b;

    void c(ByteBuffer byteBuffer);

    boolean d();

    void e();

    void flush();

    boolean isActive();

    void reset();
}
