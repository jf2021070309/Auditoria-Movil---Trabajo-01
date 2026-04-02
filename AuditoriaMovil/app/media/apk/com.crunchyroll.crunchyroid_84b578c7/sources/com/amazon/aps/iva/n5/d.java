package com.amazon.aps.iva.n5;

import android.content.Context;
import android.media.session.MediaSessionManager;
import com.amazon.aps.iva.n5.e;
/* compiled from: MediaSessionManagerImplApi28.java */
/* loaded from: classes.dex */
public final class d extends c {
    public d(Context context) {
        super(context);
        MediaSessionManager mediaSessionManager = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // com.amazon.aps.iva.n5.c, com.amazon.aps.iva.n5.e, com.amazon.aps.iva.n5.b.a
    public final boolean a(e.a aVar) {
        return super.a(aVar);
    }

    /* compiled from: MediaSessionManagerImplApi28.java */
    /* loaded from: classes.dex */
    public static final class a extends e.a {
        public a(String str, int i, int i2) {
            super(str, i, i2);
            com.amazon.aps.iva.n3.e.c(str, i, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.media.session.MediaSessionManager.RemoteUserInfo r3) {
            /*
                r2 = this;
                java.lang.String r0 = com.amazon.aps.iva.n3.f.c(r3)
                int r1 = com.amazon.aps.iva.n3.g.a(r3)
                int r3 = com.amazon.aps.iva.d2.p.a(r3)
                r2.<init>(r0, r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n5.d.a.<init>(android.media.session.MediaSessionManager$RemoteUserInfo):void");
        }
    }
}
