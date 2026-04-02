package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Bo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0504Bo extends AbstractC1022Wq<C0503Bn, AbstractC0500Bk, GZ> implements VI {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract GY A0b(byte[] bArr, int i2, boolean z) throws GZ;

    public AbstractC0504Bo(String str) {
        super(new C0503Bn[2], new AbstractC0500Bk[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1022Wq
    /* renamed from: A0E */
    public final GZ A0W(C0503Bn c0503Bn, AbstractC0500Bk abstractC0500Bk, boolean z) {
        try {
            ByteBuffer byteBuffer = c0503Bn.A01;
            abstractC0500Bk.A09(((C1024Ws) c0503Bn).A00, A0b(byteBuffer.array(), byteBuffer.limit(), z), c0503Bn.A00);
            abstractC0500Bk.A01(Level.ALL_INT);
            return null;
        } catch (GZ e2) {
            return e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1022Wq
    /* renamed from: A0F */
    public final GZ A0X(Throwable th) {
        return new GZ(A0I(0, 23, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1022Wq
    /* renamed from: A0G */
    public final C0503Bn A0T() {
        return new C0503Bn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1022Wq
    /* renamed from: A0H */
    public final AbstractC0500Bk A0V() {
        return new AbstractC0500Bk(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC0504Bo A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0500Bk
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1022Wq
    /* renamed from: A0c */
    public final void A0a(AbstractC0500Bk abstractC0500Bk) {
        super.A0a(abstractC0500Bk);
    }

    @Override // com.facebook.ads.redexgen.X.VI
    public final void AEl(long j2) {
    }
}
