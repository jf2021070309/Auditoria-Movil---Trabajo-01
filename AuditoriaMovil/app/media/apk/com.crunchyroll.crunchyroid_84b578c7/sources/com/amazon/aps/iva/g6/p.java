package com.amazon.aps.iva.g6;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import com.amazon.aps.iva.b6.n0;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.t5.g0;
import java.util.Map;
import java.util.UUID;
/* compiled from: FrameworkMediaDrm.java */
/* loaded from: classes.dex */
public final class p implements m {
    public static final com.amazon.aps.iva.d90.a d = new com.amazon.aps.iva.d90.a();
    public final UUID a;
    public final MediaDrm b;
    public int c;

    /* compiled from: FrameworkMediaDrm.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, p1 p1Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            p1.a aVar = p1Var.a;
            aVar.getClass();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = aVar.a;
            equals = logSessionId2.equals(logSessionId);
            if (!equals) {
                playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                n0.a(playbackComponent).setLogSessionId(logSessionId2);
            }
        }
    }

    public p(UUID uuid) throws UnsupportedSchemeException {
        UUID uuid2;
        uuid.getClass();
        com.amazon.aps.iva.cq.b.v(!com.amazon.aps.iva.q5.l.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((g0.a >= 27 || !com.amazon.aps.iva.q5.l.c.equals(uuid)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (com.amazon.aps.iva.q5.l.d.equals(uuid) && "ASUS_Z00AD".equals(g0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.amazon.aps.iva.g6.m
    public final Map<String, String> a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.amazon.aps.iva.g6.m
    public final m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new m.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.amazon.aps.iva.g6.m
    public final byte[] c() throws MediaDrmException {
        return this.b.openSession();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void d(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void e(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.amazon.aps.iva.g6.m
    public final int f() {
        return 2;
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void g(byte[] bArr, p1 p1Var) {
        if (g0.a >= 31) {
            try {
                a.b(this.b, bArr, p1Var);
            } catch (UnsupportedOperationException unused) {
                com.amazon.aps.iva.t5.p.g();
            }
        }
    }

    @Override // com.amazon.aps.iva.g6.m
    public final com.amazon.aps.iva.z5.b h(byte[] bArr) throws MediaCryptoException {
        boolean z;
        int i = g0.a;
        UUID uuid = this.a;
        if (i < 21 && com.amazon.aps.iva.q5.l.d.equals(uuid) && "L3".equals(this.b.getPropertyString("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        if (i < 27 && com.amazon.aps.iva.q5.l.c.equals(uuid)) {
            uuid = com.amazon.aps.iva.q5.l.b;
        }
        return new n(uuid, bArr, z);
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void i(final b.a aVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.amazon.aps.iva.g6.o
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                p pVar = p.this;
                m.b bVar = aVar;
                pVar.getClass();
                b.HandlerC0290b handlerC0290b = b.this.y;
                handlerC0290b.getClass();
                handlerC0290b.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void j(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // com.amazon.aps.iva.g6.m
    public final byte[] k(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (com.amazon.aps.iva.q5.l.c.equals(this.a) && g0.a < 27) {
            try {
                com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(g0.p(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                com.amazon.aps.iva.if0.a jSONArray = cVar.getJSONArray("keys");
                for (int i = 0; i < jSONArray.e(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    com.amazon.aps.iva.if0.c b = jSONArray.b(i);
                    sb.append("{\"k\":\"");
                    sb.append(b.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(b.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(b.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = g0.H(sb.toString());
            } catch (com.amazon.aps.iva.if0.b e) {
                com.amazon.aps.iva.t5.p.d("Failed to adjust response data: ".concat(g0.p(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x019b, code lost:
        if ("AFTT".equals(r7) == false) goto L29;
     */
    @Override // com.amazon.aps.iva.g6.m
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.g6.m.a l(byte[] r17, java.util.List<com.amazon.aps.iva.q5.r.b> r18, int r19, java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g6.p.l(byte[], java.util.List, int, java.util.HashMap):com.amazon.aps.iva.g6.m$a");
    }

    @Override // com.amazon.aps.iva.g6.m
    public final boolean m(String str, byte[] bArr) {
        if (g0.a >= 31) {
            return a.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.amazon.aps.iva.g6.m
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }
}
