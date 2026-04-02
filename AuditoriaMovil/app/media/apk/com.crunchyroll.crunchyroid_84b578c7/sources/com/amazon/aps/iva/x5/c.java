package com.amazon.aps.iva.x5;

import android.net.Uri;
import androidx.core.app.NotificationManagerCompat;
import com.amazon.aps.iva.q5.a0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.n;
import com.amazon.aps.iva.w5.u;
import com.amazon.aps.iva.w5.x;
import com.amazon.aps.iva.w5.y;
import com.amazon.aps.iva.x5.a;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: CacheDataSource.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.w5.f {
    public final com.amazon.aps.iva.x5.a a;
    public final com.amazon.aps.iva.w5.f b;
    public final x c;
    public final com.amazon.aps.iva.w5.f d;
    public final g e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public com.amazon.aps.iva.w5.i j;
    public com.amazon.aps.iva.w5.i k;
    public com.amazon.aps.iva.w5.f l;
    public long m;
    public long n;
    public long o;
    public h p;
    public boolean q;
    public boolean r;
    public long s;

    /* compiled from: CacheDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements f.a {
        public com.amazon.aps.iva.x5.a a;
        public final n.b b = new n.b();
        public final a0 c = g.s0;
        public boolean d;
        public f.a e;

        @Override // com.amazon.aps.iva.w5.f.a
        public final com.amazon.aps.iva.w5.f a() {
            com.amazon.aps.iva.w5.f fVar;
            f.a aVar = this.e;
            if (aVar != null) {
                fVar = aVar.a();
            } else {
                fVar = null;
            }
            return c(fVar, 0, 0);
        }

        public final c b() {
            com.amazon.aps.iva.w5.f fVar;
            f.a aVar = this.e;
            if (aVar != null) {
                fVar = aVar.a();
            } else {
                fVar = null;
            }
            return c(fVar, 1, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }

        public final c c(com.amazon.aps.iva.w5.f fVar, int i, int i2) {
            b bVar;
            com.amazon.aps.iva.x5.a aVar = this.a;
            aVar.getClass();
            if (!this.d && fVar != null) {
                bVar = new b(aVar);
            } else {
                bVar = null;
            }
            b bVar2 = bVar;
            this.b.getClass();
            return new c(aVar, fVar, new com.amazon.aps.iva.w5.n(), bVar2, this.c, i, i2);
        }
    }

    public c(com.amazon.aps.iva.x5.a aVar, com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.n nVar, b bVar, a0 a0Var, int i, int i2) {
        boolean z;
        boolean z2;
        this.a = aVar;
        this.b = nVar;
        this.e = a0Var == null ? g.s0 : a0Var;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.h = (i & 4) != 0;
        if (fVar != null) {
            this.d = fVar;
            this.c = bVar != null ? new x(fVar, bVar) : null;
            return;
        }
        this.d = u.a;
        this.c = null;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(com.amazon.aps.iva.w5.i iVar) throws IOException {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        long min;
        c cVar = this;
        com.amazon.aps.iva.x5.a aVar = cVar.a;
        try {
            String b = ((a0) cVar.e).b(iVar);
            long j = iVar.f;
            Uri uri = iVar.a;
            long j2 = iVar.b;
            int i = iVar.c;
            byte[] bArr = iVar.d;
            Map<String, String> map = iVar.e;
            long j3 = iVar.f;
            try {
                long j4 = iVar.g;
                int i2 = iVar.i;
                Object obj = iVar.j;
                com.amazon.aps.iva.cq.b.E(uri, "The uri must be set.");
                com.amazon.aps.iva.w5.i iVar2 = new com.amazon.aps.iva.w5.i(uri, j2, i, bArr, map, j3, j4, b, i2, obj);
                cVar = this;
                cVar.j = iVar2;
                Uri uri2 = iVar2.a;
                byte[] bArr2 = aVar.a(b).b.get("exo_redir");
                Uri uri3 = null;
                if (bArr2 != null) {
                    str = new String(bArr2, Charsets.UTF_8);
                } else {
                    str = null;
                }
                if (str != null) {
                    uri3 = Uri.parse(str);
                }
                if (uri3 != null) {
                    uri2 = uri3;
                }
                cVar.i = uri2;
                cVar.n = j;
                boolean z4 = cVar.g;
                long j5 = iVar.g;
                if (z4 && cVar.q) {
                    z2 = false;
                } else if (cVar.h && j5 == -1) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cVar.r = z3;
                if (z3) {
                    cVar.o = -1L;
                } else {
                    long a2 = l.a(aVar.a(b));
                    cVar.o = a2;
                    if (a2 != -1) {
                        long j6 = a2 - j;
                        cVar.o = j6;
                        if (j6 < 0) {
                            throw new com.amazon.aps.iva.w5.g(2008);
                        }
                    }
                }
                int i3 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
                if (i3 != 0) {
                    long j7 = cVar.o;
                    if (j7 == -1) {
                        min = j5;
                    } else {
                        min = Math.min(j7, j5);
                    }
                    cVar.o = min;
                }
                long j8 = cVar.o;
                if (j8 <= 0 && j8 != -1) {
                    z = false;
                } else {
                    z = false;
                    try {
                        cVar.n(iVar2, false);
                    } catch (Throwable th) {
                        th = th;
                        if (cVar.l == cVar.b) {
                            z = true;
                        }
                        if (z || (th instanceof a.C0842a)) {
                            cVar.q = true;
                        }
                        throw th;
                    }
                }
                if (i3 == 0) {
                    return cVar.o;
                }
                return j5;
            } catch (Throwable th2) {
                th = th2;
                z = false;
                cVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws IOException {
        boolean z;
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            m();
        } catch (Throwable th) {
            if (this.l == this.b) {
                z = true;
            } else {
                z = false;
            }
            if (z || (th instanceof a.C0842a)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        boolean z;
        if (this.l == this.b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return this.d.d();
        }
        return Collections.emptyMap();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
        yVar.getClass();
        this.b.j(yVar);
        this.d.j(yVar);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        int i3;
        boolean z2;
        com.amazon.aps.iva.w5.f fVar = this.b;
        boolean z3 = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        com.amazon.aps.iva.w5.i iVar = this.j;
        iVar.getClass();
        com.amazon.aps.iva.w5.i iVar2 = this.k;
        iVar2.getClass();
        try {
            if (this.n >= this.s) {
                n(iVar, true);
            }
            com.amazon.aps.iva.w5.f fVar2 = this.l;
            fVar2.getClass();
            int l = fVar2.l(bArr, i, i2);
            if (l != -1) {
                if (this.l == fVar) {
                }
                long j = l;
                this.n += j;
                this.m += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
                return l;
            }
            com.amazon.aps.iva.w5.f fVar3 = this.l;
            if (fVar3 == fVar) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i3 = l;
                long j3 = iVar2.g;
                if (j3 == -1 || this.m < j3) {
                    String str = iVar.h;
                    int i4 = g0.a;
                    this.o = 0L;
                    if (fVar3 == this.c) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        m mVar = new m();
                        Long valueOf = Long.valueOf(this.n);
                        HashMap hashMap = mVar.a;
                        valueOf.getClass();
                        hashMap.put("exo_len", valueOf);
                        mVar.b.remove("exo_len");
                        this.a.h(str, mVar);
                        return i3;
                    }
                    return i3;
                }
            } else {
                i3 = l;
            }
            long j4 = this.o;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            m();
            n(iVar, false);
            return l(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == fVar) {
                z3 = true;
            }
            if (z3 || (th instanceof a.C0842a)) {
                this.q = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.amazon.aps.iva.w5.i, com.amazon.aps.iva.x5.h, com.amazon.aps.iva.w5.f] */
    public final void m() throws IOException {
        com.amazon.aps.iva.x5.a aVar = this.a;
        com.amazon.aps.iva.w5.f fVar = this.l;
        if (fVar == null) {
            return;
        }
        try {
            fVar.close();
        } finally {
            this.k = null;
            this.l = null;
            h hVar = this.p;
            if (hVar != null) {
                aVar.b(hVar);
                this.p = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.amazon.aps.iva.w5.i r35, boolean r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.c.n(com.amazon.aps.iva.w5.i, boolean):void");
    }
}
