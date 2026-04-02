package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ut  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0976Ut implements InterfaceC0632He {
    public static byte[] A05;
    public static String[] A06 = {"l2rBvT9KAEY6yl2SIp", "0cRN39km0cT", "q9WvQr", "pX7zul93kCJ6F7tIXqRnEpKrjeNmhaPh", "ddKujtHDPllkfb3cyYepVcXFvJyDikdo", "gNoa3Z", "AdKzyhJyCrP", "aoyUT4m5l2MLf3LhSWprSpj54sdxW1uC"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    @Nullable
    public final InterfaceC0651Hz<? super C0976Ut> A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{37};
    }

    static {
        A01();
    }

    public C0976Ut() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C0976Ut(@Nullable InterfaceC0651Hz<? super C0976Ut> interfaceC0651Hz) {
        this.A04 = interfaceC0651Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final Uri A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final long ACt(C0636Hi c0636Hi) throws C0638Hl {
        try {
            this.A01 = c0636Hi.A04;
            this.A02 = new RandomAccessFile(c0636Hi.A04.getPath(), A00(0, 1, 72));
            this.A02.seek(c0636Hi.A03);
            this.A00 = c0636Hi.A02 == -1 ? this.A02.length() - c0636Hi.A03 : c0636Hi.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                InterfaceC0651Hz<? super C0976Ut> interfaceC0651Hz = this.A04;
                if (interfaceC0651Hz != null) {
                    interfaceC0651Hz.ACY(this, c0636Hi);
                }
                long j2 = this.A00;
                if (A06[0].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[7] = "qz0up6ppIELboyns2CZBgMvSr8RDOOhA";
                strArr[3] = "iQKzkqELqDYakLKWZdfSUnFo9DHl6nVv";
                return j2;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new C0638Hl(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final void close() throws C0638Hl {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e2) {
                throw new C0638Hl(e2);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0651Hz<? super C0976Ut> interfaceC0651Hz = this.A04;
                if (interfaceC0651Hz != null) {
                    interfaceC0651Hz.ACX(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final int read(byte[] bArr, int i2, int i3) throws C0638Hl {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.A00 -= read;
                InterfaceC0651Hz<? super C0976Ut> interfaceC0651Hz = this.A04;
                if (interfaceC0651Hz != null) {
                    interfaceC0651Hz.AAE(this, read);
                }
            }
            return read;
        } catch (IOException e2) {
            throw new C0638Hl(e2);
        }
    }
}
