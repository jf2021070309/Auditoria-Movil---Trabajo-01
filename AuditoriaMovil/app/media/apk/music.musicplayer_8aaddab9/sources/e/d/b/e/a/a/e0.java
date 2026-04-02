package e.d.b.e.a.a;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e0 extends AssetPackState {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6767b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6768c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6769d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6770e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6771f;

    public e0(String str, int i2, int i3, long j2, long j3, int i4) {
        Objects.requireNonNull(str, "Null name");
        this.a = str;
        this.f6767b = i2;
        this.f6768c = i3;
        this.f6769d = j2;
        this.f6770e = j3;
        this.f6771f = i4;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f6769d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.f6768c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.a.equals(assetPackState.e()) && this.f6767b == assetPackState.f() && this.f6768c == assetPackState.d() && this.f6769d == assetPackState.c() && this.f6770e == assetPackState.g() && this.f6771f == assetPackState.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f6767b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long g() {
        return this.f6770e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f6771f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i2 = this.f6767b;
        int i3 = this.f6768c;
        long j2 = this.f6769d;
        long j3 = this.f6770e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f6771f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.f6767b;
        int i3 = this.f6768c;
        long j2 = this.f6769d;
        long j3 = this.f6770e;
        int i4 = this.f6771f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        e.a.d.a.a.K(sb, ", totalBytesToDownload=", j3, ", transferProgressPercentage=");
        return e.a.d.a.a.p(sb, i4, "}");
    }
}
