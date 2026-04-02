package com.kwad.sdk.pngencrypt.chunk;

import com.kwad.sdk.pngencrypt.PngjException;
import java.io.ByteArrayInputStream;
import java.util.zip.CRC32;
/* loaded from: classes3.dex */
public final class d {
    public final byte[] aFB;
    private CRC32 aFE;
    public final String adQ;
    public final int len;
    public byte[] data = null;
    private long aFC = 0;
    public byte[] aFD = new byte[4];

    public d(int i, String str, boolean z) {
        this.len = i;
        this.adQ = str;
        this.aFB = b.fg(str);
        for (int i2 = 0; i2 < 4; i2++) {
            byte[] bArr = this.aFB;
            if (bArr[i2] < 65 || bArr[i2] > 122 || (bArr[i2] > 90 && bArr[i2] < 97)) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Bad id chunk: must be ascii letters " + str));
            }
        }
        if (z) {
            GU();
        }
    }

    private void GU() {
        byte[] bArr = this.data;
        if (bArr == null || bArr.length < this.len) {
            this.data = new byte[this.len];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteArrayInputStream GV() {
        return new ByteArrayInputStream(this.data);
    }

    public final long GW() {
        return this.aFC;
    }

    public final void aq(long j) {
        this.aFC = j;
    }

    public final void bw(boolean z) {
        int value = (int) this.aFE.getValue();
        int g = com.kwad.sdk.pngencrypt.n.g(this.aFD, 0);
        if (value != g) {
            String format = String.format("Bad CRC in chunk: %s (offset:%d). Expected:%x Got:%x", this.adQ, Long.valueOf(this.aFC), Integer.valueOf(g), Integer.valueOf(value));
            if (z) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException(format));
            } else {
                com.kwad.sdk.core.e.c.d("PNG_ENCRYPT", format);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            String str = this.adQ;
            if (str == null) {
                if (dVar.adQ != null) {
                    return false;
                }
            } else if (!str.equals(dVar.adQ)) {
                return false;
            }
            return this.aFC == dVar.aFC;
        }
        return false;
    }

    public final void f(byte[] bArr, int i, int i2) {
        if (this.aFE == null) {
            this.aFE = new CRC32();
        }
        this.aFE.update(bArr, i, i2);
    }

    public final int hashCode() {
        String str = this.adQ;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.aFC;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "chunkid=" + b.i(this.aFB) + " len=" + this.len;
    }
}
