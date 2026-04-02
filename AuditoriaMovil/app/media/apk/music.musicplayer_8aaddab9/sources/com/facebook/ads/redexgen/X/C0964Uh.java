package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.facebook.ads.redexgen.X.Uh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0964Uh implements InterfaceC0630Hc {
    public static String[] A0B = {"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    public long A00;
    public long A01;
    public C0636Hi A02;
    public C0667Ip A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final I3 A09;
    public final boolean A0A;

    public C0964Uh(I3 i3, long j2) {
        this(i3, j2, 20480, true);
    }

    public C0964Uh(I3 i3, long j2, int i2, boolean z) {
        this.A09 = (I3) IJ.A01(i3);
        this.A08 = j2;
        this.A07 = i2;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            C0676Iy.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A43(file);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C0676Iy.A0X(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A43(file2);
            } else {
                file2.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long min;
        if (this.A02.A02 == -1) {
            min = this.A08;
        } else {
            long j2 = this.A02.A02;
            long maxLength = this.A00;
            long j3 = j2 - maxLength;
            long maxLength2 = this.A08;
            min = Math.min(j3, maxLength2);
        }
        I3 i3 = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = i3.AF2(str, this.A00 + maxLength3, min);
        this.A05 = new FileOutputStream(this.A04);
        int i2 = this.A07;
        if (i2 > 0) {
            C0667Ip c0667Ip = this.A03;
            if (c0667Ip == null) {
                this.A03 = new C0667Ip(this.A05, i2);
            } else {
                c0667Ip.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0630Hc
    public final void ACv(C0636Hi c0636Hi) throws C0965Ui {
        if (c0636Hi.A02 == -1 && !c0636Hi.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0636Hi;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e2) {
            throw new C0965Ui(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0630Hc
    public final void close() throws C0965Ui {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e2) {
            throw new C0965Ui(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0630Hc
    public final void write(byte[] bArr, int bytesToWrite, int i2) throws C0965Ui {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = (this.A01 > this.A08 ? 1 : (this.A01 == this.A08 ? 0 : -1));
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                A0B[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (i4 == 0) {
                    A00();
                    A01();
                }
                int min = (int) Math.min(i2 - i3, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i3, min);
                i3 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e2) {
                throw new C0965Ui(e2);
            }
        }
    }
}
