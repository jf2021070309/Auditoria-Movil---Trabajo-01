package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class Ch {
    public final C0660Ii A00 = new C0660Ii(10);

    @Nullable
    public final Metadata A00(InterfaceC0518Cd interfaceC0518Cd, @Nullable ES es) throws IOException, InterruptedException {
        int i2 = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0518Cd.AD4(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                if (this.A00.A0G() != C0983Va.A03) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int i3 = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i3];
                    byte[] id3Data = this.A00.A00;
                    System.arraycopy(id3Data, 0, bArr, 0, 10);
                    interfaceC0518Cd.AD4(bArr, 10, A0D);
                    metadata = new C0983Va(es).A0O(bArr, i3);
                } else {
                    interfaceC0518Cd.A3J(A0D);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        interfaceC0518Cd.AE8();
        interfaceC0518Cd.A3J(i2);
        return metadata;
    }
}
