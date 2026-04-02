package e.d.b.e.a.a;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
public final class k2 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("VerifySliceTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    public final z f6830b;

    public k2(z zVar) {
        this.f6830b = zVar;
    }

    public final void a(j2 j2Var) {
        File b2 = this.f6830b.b(j2Var.f6822b, j2Var.f6823c, j2Var.f6824d, j2Var.f6825e);
        if (!b2.exists()) {
            throw new p0(String.format("Cannot find unverified files for slice %s.", j2Var.f6825e), j2Var.a);
        }
        try {
            File n2 = this.f6830b.n(j2Var.f6822b, j2Var.f6823c, j2Var.f6824d, j2Var.f6825e);
            if (!n2.exists()) {
                throw new p0(String.format("Cannot find metadata files for slice %s.", j2Var.f6825e), j2Var.a);
            }
            try {
                if (!e.d.b.d.a.e(i2.a(b2, n2)).equals(j2Var.f6826f)) {
                    throw new p0(String.format("Verification failed for slice %s.", j2Var.f6825e), j2Var.a);
                }
                a.a(4, "Verification of slice %s of pack %s successful.", new Object[]{j2Var.f6825e, j2Var.f6822b});
                File g2 = this.f6830b.g(j2Var.f6822b, j2Var.f6823c, j2Var.f6824d, j2Var.f6825e);
                if (!g2.exists()) {
                    g2.mkdirs();
                }
                if (!b2.renameTo(g2)) {
                    throw new p0(String.format("Failed to move slice %s after verification.", j2Var.f6825e), j2Var.a);
                }
            } catch (IOException e2) {
                throw new p0(String.format("Could not digest file during verification for slice %s.", j2Var.f6825e), e2, j2Var.a);
            } catch (NoSuchAlgorithmException e3) {
                throw new p0("SHA256 algorithm not supported.", e3, j2Var.a);
            }
        } catch (IOException e4) {
            throw new p0(String.format("Could not reconstruct slice archive during verification for slice %s.", j2Var.f6825e), e4, j2Var.a);
        }
    }
}
