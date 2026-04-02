package e.d.b.b.i.e;

import e.d.b.b.i.e.q;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class k extends q {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f6101b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6102c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f6103d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6104e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6105f;

    /* renamed from: g  reason: collision with root package name */
    public final t f6106g;

    /* loaded from: classes.dex */
    public static final class b extends q.a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f6107b;

        /* renamed from: c  reason: collision with root package name */
        public Long f6108c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f6109d;

        /* renamed from: e  reason: collision with root package name */
        public String f6110e;

        /* renamed from: f  reason: collision with root package name */
        public Long f6111f;

        /* renamed from: g  reason: collision with root package name */
        public t f6112g;
    }

    public k(long j2, Integer num, long j3, byte[] bArr, String str, long j4, t tVar, a aVar) {
        this.a = j2;
        this.f6101b = num;
        this.f6102c = j3;
        this.f6103d = bArr;
        this.f6104e = str;
        this.f6105f = j4;
        this.f6106g = tVar;
    }

    @Override // e.d.b.b.i.e.q
    public Integer a() {
        return this.f6101b;
    }

    @Override // e.d.b.b.i.e.q
    public long b() {
        return this.a;
    }

    @Override // e.d.b.b.i.e.q
    public long c() {
        return this.f6102c;
    }

    @Override // e.d.b.b.i.e.q
    public t d() {
        return this.f6106g;
    }

    @Override // e.d.b.b.i.e.q
    public byte[] e() {
        return this.f6103d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a == qVar.b() && ((num = this.f6101b) != null ? num.equals(qVar.a()) : qVar.a() == null) && this.f6102c == qVar.c()) {
                if (Arrays.equals(this.f6103d, qVar instanceof k ? ((k) qVar).f6103d : qVar.e()) && ((str = this.f6104e) != null ? str.equals(qVar.f()) : qVar.f() == null) && this.f6105f == qVar.g()) {
                    t tVar = this.f6106g;
                    if (tVar == null) {
                        if (qVar.d() == null) {
                            return true;
                        }
                    } else if (tVar.equals(qVar.d())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // e.d.b.b.i.e.q
    public String f() {
        return this.f6104e;
    }

    @Override // e.d.b.b.i.e.q
    public long g() {
        return this.f6105f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6101b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f6102c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6103d)) * 1000003;
        String str = this.f6104e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f6105f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        t tVar = this.f6106g;
        return i3 ^ (tVar != null ? tVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("LogEvent{eventTimeMs=");
        y.append(this.a);
        y.append(", eventCode=");
        y.append(this.f6101b);
        y.append(", eventUptimeMs=");
        y.append(this.f6102c);
        y.append(", sourceExtension=");
        y.append(Arrays.toString(this.f6103d));
        y.append(", sourceExtensionJsonProto3=");
        y.append(this.f6104e);
        y.append(", timezoneOffsetSeconds=");
        y.append(this.f6105f);
        y.append(", networkConnectionInfo=");
        y.append(this.f6106g);
        y.append("}");
        return y.toString();
    }
}
