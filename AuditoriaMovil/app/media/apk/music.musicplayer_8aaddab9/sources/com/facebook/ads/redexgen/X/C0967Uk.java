package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Uk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0967Uk implements InterfaceC0632He {
    public static byte[] A07;
    public static String[] A08 = {"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    @Nullable
    public final InterfaceC0651Hz<? super C0967Uk> A06;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, 63, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, 63, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hz != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C0967Uk(Context context, @Nullable InterfaceC0651Hz<? super C0967Uk> interfaceC0651Hz) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0651Hz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final Uri A7j() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        r7.A00 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        r2 = r7.A01.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
        if (r2 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r7.A00 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r4 = r2 - r8.A03;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACt(com.facebook.ads.redexgen.X.C0636Hi r8) throws com.facebook.ads.redexgen.X.C0650Hy {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0967Uk.ACt(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final void close() throws C0650Hy {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0651Hz<? super C0967Uk> interfaceC0651Hz = this.A06;
                            if (interfaceC0651Hz != null) {
                                interfaceC0651Hz.ACX(this);
                            }
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new C0650Hy(e2);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0651Hz<? super C0967Uk> interfaceC0651Hz2 = this.A06;
                        if (interfaceC0651Hz2 != null) {
                            interfaceC0651Hz2.ACX(this);
                        }
                    }
                }
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e3) {
                    throw new C0650Hy(e3);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0651Hz<? super C0967Uk> interfaceC0651Hz3 = this.A06;
                    if (interfaceC0651Hz3 != null) {
                        interfaceC0651Hz3.ACX(this);
                    }
                }
            }
        } catch (IOException e4) {
            throw new C0650Hy(e4);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final int read(byte[] bArr, int i2, int i3) throws C0650Hy {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new C0650Hy(e2);
            }
        }
        int read = this.A03.read(bArr, i2, i3);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0650Hy(new EOFException());
        }
        long j3 = this.A00;
        if (j3 != -1) {
            this.A00 = j3 - read;
        }
        InterfaceC0651Hz<? super C0967Uk> interfaceC0651Hz = this.A06;
        if (interfaceC0651Hz != null) {
            interfaceC0651Hz.AAE(this, read);
        }
        return read;
    }
}
