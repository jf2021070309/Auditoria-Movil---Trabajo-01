package com.amazon.aps.iva.sv;

import com.amazon.aps.iva.rw.b;
import com.amazon.aps.iva.sv.c;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl;
/* compiled from: DownloadingModule.kt */
/* loaded from: classes2.dex */
public final class m2 implements h {
    public final NoOpDownloadsManagerImpl b = new NoOpDownloadsManagerImpl();
    public final n2 c = new n2();
    public final d d;
    public final a e;

    /* compiled from: DownloadingModule.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.wg.a {
        public com.amazon.aps.iva.wg.b b = b.a.g;
        public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.wg.b> c = new com.amazon.aps.iva.i5.v<>();

        @Override // com.amazon.aps.iva.wg.a
        public final void H2() {
        }

        @Override // com.amazon.aps.iva.wg.a
        public final com.amazon.aps.iva.wg.b J() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.wg.a
        public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.wg.b> T() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.wg.a
        public final void n0(com.amazon.aps.iva.wg.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "<set-?>");
            this.b = bVar;
        }
    }

    public m2() {
        c.n0.getClass();
        this.d = c.a.b;
        this.e = new a();
    }

    @Override // com.amazon.aps.iva.sv.h
    public final InternalDownloadsManager a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final c b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final k c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final com.amazon.aps.iva.wg.a d() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final boolean e() {
        return false;
    }
}
