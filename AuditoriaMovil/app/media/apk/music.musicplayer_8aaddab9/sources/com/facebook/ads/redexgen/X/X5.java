package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class X5 implements JM, BT, InterfaceC0603Gb, EJ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    public final /* synthetic */ DN A00;

    public X5(DN dn) {
        this.A00 = dn;
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA2(String str, long j2, long j3) {
        Iterator it = DN.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA2(str, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA3(C0512Bw c0512Bw) {
        Iterator it = DN.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!hasNext) {
                DN dn = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                A01[5] = "AJXnTxM8Cjr";
                DN.A04(dn, null);
                DN.A06(this.A00, null);
                DN.A00(this.A00, 0);
                return;
            }
            BT bt = (BT) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "rZ";
            bt.AA3(c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(C0512Bw c0512Bw) {
        DN.A06(this.A00, c0512Bw);
        Iterator it = DN.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA4(c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(Format format) {
        DN.A04(this.A00, format);
        Iterator it = DN.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA5(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(int i2) {
        DN.A00(this.A00, i2);
        Iterator it = DN.A0D(this.A00).iterator();
        while (it.hasNext()) {
            BT bt = (BT) it.next();
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            A01[2] = "0C";
            bt.AA6(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(int i2, long j2, long j3) {
        Iterator it = DN.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA7(i2, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0603Gb
    public final void AAQ(List<GX> list) {
        DN.A08(this.A00, list);
        Iterator it = DN.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0603Gb) it.next()).AAQ(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AAc(int i2, long j2) {
        Iterator it = DN.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JM) it.next()).AAc(i2, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABV(Metadata metadata) {
        Iterator it = DN.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((EJ) it.next()).ABV(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AC4(Surface surface) {
        if (DN.A01(this.A00) == surface) {
            Iterator it = DN.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = DN.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((JM) it2.next()).AC4(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACd(String str, long j2, long j3) {
        Iterator it = DN.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JM) it.next()).ACd(str, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACe(C0512Bw c0512Bw) {
        Iterator it = DN.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((JM) it.next()).ACe(c0512Bw);
        }
        DN.A03(this.A00, null);
        DN.A05(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACf(C0512Bw c0512Bw) {
        DN.A05(this.A00, c0512Bw);
        Iterator it = DN.A0B(this.A00).iterator();
        while (it.hasNext()) {
            JM jm = (JM) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "6iGRC7";
            jm.ACf(c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACi(Format format) {
        DN.A03(this.A00, format);
        Iterator it = DN.A0B(this.A00).iterator();
        while (it.hasNext()) {
            JM jm = (JM) it.next();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            A01[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            jm.ACi(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACn(int i2, int i3, int i4, float f2) {
        Iterator it = DN.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((JD) it.next()).ACn(i2, i3, i4, f2);
        }
        Iterator it2 = DN.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((JM) it2.next()).ACn(i2, i3, i4, f2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        DN.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        DN.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        DN.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        DN.A0H(this.A00, null, false);
    }
}
