package j.i0.g;

import j.f0;
import j.u;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g extends f0 {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f9336b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9337c;

    /* renamed from: d  reason: collision with root package name */
    public final k.g f9338d;

    public g(@Nullable String str, long j2, k.g gVar) {
        this.f9336b = str;
        this.f9337c = j2;
        this.f9338d = gVar;
    }

    @Override // j.f0
    public long a() {
        return this.f9337c;
    }

    @Override // j.f0
    public u f() {
        String str = this.f9336b;
        if (str != null) {
            Pattern pattern = u.a;
            try {
                return u.b(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // j.f0
    public k.g h() {
        return this.f9338d;
    }
}
