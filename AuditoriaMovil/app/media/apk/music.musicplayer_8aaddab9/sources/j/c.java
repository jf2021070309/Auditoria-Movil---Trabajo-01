package j;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9195b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9196c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9197d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9198e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9199f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9200g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9201h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9202i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f9203j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9204k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9205l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f9206m;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.a = z;
        this.f9195b = z2;
        this.f9196c = i2;
        this.f9197d = i3;
        this.f9198e = z3;
        this.f9199f = z4;
        this.f9200g = z5;
        this.f9201h = i4;
        this.f9202i = i5;
        this.f9203j = z6;
        this.f9204k = z7;
        this.f9205l = z8;
        this.f9206m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j.c a(j.r r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.a(j.r):j.c");
    }

    public String toString() {
        String str = this.f9206m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.f9195b) {
                sb.append("no-store, ");
            }
            if (this.f9196c != -1) {
                sb.append("max-age=");
                sb.append(this.f9196c);
                sb.append(", ");
            }
            if (this.f9197d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f9197d);
                sb.append(", ");
            }
            if (this.f9198e) {
                sb.append("private, ");
            }
            if (this.f9199f) {
                sb.append("public, ");
            }
            if (this.f9200g) {
                sb.append("must-revalidate, ");
            }
            if (this.f9201h != -1) {
                sb.append("max-stale=");
                sb.append(this.f9201h);
                sb.append(", ");
            }
            if (this.f9202i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f9202i);
                sb.append(", ");
            }
            if (this.f9203j) {
                sb.append("only-if-cached, ");
            }
            if (this.f9204k) {
                sb.append("no-transform, ");
            }
            if (this.f9205l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f9206m = str;
        }
        return str;
    }
}
