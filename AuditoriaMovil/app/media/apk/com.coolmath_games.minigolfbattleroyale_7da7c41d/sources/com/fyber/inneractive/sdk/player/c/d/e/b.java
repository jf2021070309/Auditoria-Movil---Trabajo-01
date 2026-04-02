package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.d.e.h;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes.dex */
final class b extends h {
    com.fyber.inneractive.sdk.player.c.k.e a;
    private a d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.d = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    protected final long a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        if (a(kVar.a)) {
            int i6 = (kVar.a[2] & UByte.MAX_VALUE) >> 4;
            switch (i6) {
                case 1:
                    i = 192;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i2 = 576;
                    i3 = i6 - 2;
                    i = i2 << i3;
                    break;
                case 6:
                case 7:
                    kVar.d(4);
                    long j = kVar.a[kVar.b];
                    int i7 = 7;
                    while (true) {
                        if (i7 >= 0) {
                            if (((1 << i7) & j) != 0) {
                                i7--;
                            } else if (i7 < 6) {
                                j &= i5 - 1;
                                i4 = 7 - i7;
                            } else if (i7 == 7) {
                                i4 = 1;
                            }
                        }
                    }
                    i4 = 0;
                    if (i4 == 0) {
                        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                    }
                    for (int i8 = 1; i8 < i4; i8++) {
                        if ((kVar.a[kVar.b + i8] & 192) != 128) {
                            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                        }
                        j = (j << 6) | (b & 63);
                    }
                    kVar.b += i4;
                    int d = i6 == 6 ? kVar.d() : kVar.e();
                    kVar.c(0);
                    i = d + 1;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i2 = 256;
                    i3 = i6 - 8;
                    i = i2 << i3;
                    break;
                default:
                    i = -1;
                    break;
            }
            return i;
        }
        return -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    protected final boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        byte[] bArr = kVar.a;
        if (this.a == null) {
            this.a = new com.fyber.inneractive.sdk.player.c.k.e(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar.c);
            copyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            com.fyber.inneractive.sdk.player.c.k.e eVar = this.a;
            aVar.a = com.fyber.inneractive.sdk.player.c.h.a(null, "audio/flac", -1, eVar.g * eVar.e, this.a.f, this.a.e, singletonList, null, null);
        } else {
            if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
                a aVar2 = new a();
                this.d = aVar2;
                kVar.d(1);
                int g = kVar.g() / 18;
                aVar2.a = new long[g];
                aVar2.b = new long[g];
                for (int i = 0; i < g; i++) {
                    aVar2.a[i] = kVar.l();
                    aVar2.b[i] = kVar.l();
                    kVar.d(2);
                }
            } else if (a(bArr)) {
                a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.c = j;
                    aVar.b = this.d;
                }
                return false;
            }
        }
        return true;
    }

    /* loaded from: classes.dex */
    private class a implements f, m {
        long[] a;
        long[] b;
        long c = -1;
        private long e = -1;

        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final m a() {
            return this;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final boolean b_() {
            return true;
        }

        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final long a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
            long j = this.e;
            if (j >= 0) {
                long j2 = -(j + 2);
                this.e = -1L;
                return j2;
            }
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.e.f
        public final long a_(long j) {
            long b = b.this.b(j);
            this.e = this.a[t.a(this.a, b, true)];
            return b;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final long a(long j) {
            return this.c + this.b[t.a(this.a, b.this.b(j), true)];
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final long b() {
            com.fyber.inneractive.sdk.player.c.k.e eVar = b.this.a;
            return (eVar.h * 1000000) / eVar.e;
        }
    }
}
