package j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class v extends c0 {
    public static final u a = u.b("multipart/mixed");

    /* renamed from: b  reason: collision with root package name */
    public static final u f9556b;

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f9557c;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f9558d;

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f9559e;

    /* renamed from: f  reason: collision with root package name */
    public final k.h f9560f;

    /* renamed from: g  reason: collision with root package name */
    public final u f9561g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f9562h;

    /* renamed from: i  reason: collision with root package name */
    public long f9563i = -1;

    /* loaded from: classes.dex */
    public static final class a {
        public final k.h a;

        /* renamed from: b  reason: collision with root package name */
        public u f9564b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f9565c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.f9564b = v.a;
            this.f9565c = new ArrayList();
            this.a = k.h.h(uuid);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @Nullable
        public final r a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f9566b;

        public b(@Nullable r rVar, c0 c0Var) {
            this.a = rVar;
            this.f9566b = c0Var;
        }
    }

    static {
        u.b("multipart/alternative");
        u.b("multipart/digest");
        u.b("multipart/parallel");
        f9556b = u.b("multipart/form-data");
        f9557c = new byte[]{58, 32};
        f9558d = new byte[]{13, 10};
        f9559e = new byte[]{45, 45};
    }

    public v(k.h hVar, u uVar, List<b> list) {
        this.f9560f = hVar;
        this.f9561g = u.b(uVar + "; boundary=" + hVar.K());
        this.f9562h = j.i0.c.o(list);
    }

    @Override // j.c0
    public long a() throws IOException {
        long j2 = this.f9563i;
        if (j2 != -1) {
            return j2;
        }
        long d2 = d(null, true);
        this.f9563i = d2;
        return d2;
    }

    @Override // j.c0
    public u b() {
        return this.f9561g;
    }

    @Override // j.c0
    public void c(k.f fVar) throws IOException {
        d(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(@Nullable k.f fVar, boolean z) throws IOException {
        k.d dVar;
        if (z) {
            fVar = new k.d();
            dVar = fVar;
        } else {
            dVar = 0;
        }
        int size = this.f9562h.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f9562h.get(i2);
            r rVar = bVar.a;
            c0 c0Var = bVar.f9566b;
            fVar.O(f9559e);
            fVar.P(this.f9560f);
            fVar.O(f9558d);
            if (rVar != null) {
                int g2 = rVar.g();
                for (int i3 = 0; i3 < g2; i3++) {
                    fVar.x(rVar.d(i3)).O(f9557c).x(rVar.h(i3)).O(f9558d);
                }
            }
            u b2 = c0Var.b();
            if (b2 != null) {
                fVar.x("Content-Type: ").x(b2.f9553c).O(f9558d);
            }
            long a2 = c0Var.a();
            if (a2 != -1) {
                fVar.x("Content-Length: ").Z(a2).O(f9558d);
            } else if (z) {
                dVar.skip(dVar.f9620b);
                return -1L;
            }
            byte[] bArr = f9558d;
            fVar.O(bArr);
            if (z) {
                j2 += a2;
            } else {
                c0Var.c(fVar);
            }
            fVar.O(bArr);
        }
        byte[] bArr2 = f9559e;
        fVar.O(bArr2);
        fVar.P(this.f9560f);
        fVar.O(bArr2);
        fVar.O(f9558d);
        if (z) {
            long j3 = dVar.f9620b;
            long j4 = j2 + j3;
            dVar.skip(j3);
            return j4;
        }
        return j2;
    }
}
