package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_if122;
/* loaded from: classes.dex */
public class a {
    final int a;
    final int b;

    a(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.a = i;
        this.b = i2;
    }

    public static a a(int i, int i2, long j) {
        return new a(i, i2, j);
    }

    public static a c() {
        return new a(1, 100, 172800000L);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}
