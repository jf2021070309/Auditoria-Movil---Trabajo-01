package e.c.a.m.s.d0;

import e.c.a.s.k.a;
import e.c.a.s.k.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
/* loaded from: classes.dex */
public class k {
    public final e.c.a.s.g<e.c.a.m.k, String> a = new e.c.a.s.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final c.i.j.c<b> f5652b = e.c.a.s.k.a.a(10, new a(this));

    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        public a(k kVar) {
        }

        @Override // e.c.a.s.k.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.d {
        public final MessageDigest a;

        /* renamed from: b  reason: collision with root package name */
        public final e.c.a.s.k.d f5653b = new d.b();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // e.c.a.s.k.a.d
        public e.c.a.s.k.d b() {
            return this.f5653b;
        }
    }

    public String a(e.c.a.m.k kVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(kVar);
        }
        if (a2 == null) {
            b b2 = this.f5652b.b();
            Objects.requireNonNull(b2, "Argument must not be null");
            b bVar = b2;
            try {
                kVar.a(bVar.a);
                byte[] digest = bVar.a.digest();
                char[] cArr = e.c.a.s.j.f6031b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        int i3 = digest[i2] & 255;
                        int i4 = i2 * 2;
                        char[] cArr2 = e.c.a.s.j.a;
                        cArr[i4] = cArr2[i3 >>> 4];
                        cArr[i4 + 1] = cArr2[i3 & 15];
                    }
                    a2 = new String(cArr);
                }
            } finally {
                this.f5652b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(kVar, a2);
        }
        return a2;
    }
}
