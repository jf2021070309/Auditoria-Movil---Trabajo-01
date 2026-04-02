package com.amazon.aps.iva.w5;

import android.net.Uri;
import android.util.Base64;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.g0;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URLDecoder;
/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes.dex */
public final class d extends b {
    public i e;
    public byte[] f;
    public int g;
    public int h;

    public d() {
        super(false);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws IOException {
        o(iVar);
        this.e = iVar;
        Uri normalizeScheme = iVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        com.amazon.aps.iva.cq.b.v(equals, "Unsupported scheme: " + scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = g0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new h0(com.amazon.aps.iva.oa.a.a("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.f = g0.H(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            byte[] bArr = this.f;
            long j = iVar.f;
            if (j <= bArr.length) {
                int i2 = (int) j;
                this.g = i2;
                int length = bArr.length - i2;
                this.h = length;
                long j2 = iVar.g;
                int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                if (i3 != 0) {
                    this.h = (int) Math.min(length, j2);
                }
                p(iVar);
                if (i3 == 0) {
                    return this.h;
                }
                return j2;
            }
            this.f = null;
            throw new g(2008);
        }
        throw new h0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() {
        if (this.f != null) {
            this.f = null;
            n();
        }
        this.e = null;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = g0.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        m(min);
        return min;
    }
}
