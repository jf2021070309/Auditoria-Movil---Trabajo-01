package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: assets/audience_network.dex */
public final class X3 implements InterfaceC0475Ak, EJ, BT, JM, InterfaceC0590Fo, HY, CA {
    public static String[] A05 = {"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    @MonotonicNonNull
    public InterfaceC0480Ap A00;
    public final IM A03;
    public final CopyOnWriteArraySet<B6> A04 = new CopyOnWriteArraySet<>();
    public final B3 A02 = new B3();
    public final B0 A01 = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.HY
    public final void AA9(int i2, long j2, long j3) {
        A01();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public X3(@Nullable InterfaceC0480Ap interfaceC0480Ap, IM im) {
        this.A00 = interfaceC0480Ap;
        this.A03 = (IM) IJ.A01(im);
    }

    private B5 A00() {
        return A05(this.A02.A03());
    }

    private B5 A01() {
        return A05(this.A02.A04());
    }

    private B5 A02() {
        return A05(this.A02.A05());
    }

    private B5 A03() {
        return A05(this.A02.A06());
    }

    private final B5 A04(int i2, @Nullable FY fy) {
        long j2;
        IJ.A01(this.A00);
        long A57 = this.A03.A57();
        B1 timeline = this.A00.A6G();
        if (i2 == this.A00.A6H()) {
            if (fy != null && fy.A01()) {
                if (this.A00.A6B() == fy.A00 && this.A00.A6C() == fy.A01) {
                    j2 = this.A00.A6E();
                } else {
                    j2 = 0;
                }
            } else {
                j2 = this.A00.A69();
            }
        } else if (i2 >= timeline.A01() || (fy != null && fy.A01())) {
            j2 = 0;
        } else {
            j2 = timeline.A0B(i2, this.A01).A00();
        }
        return new B5(A57, timeline, i2, fy, j2, this.A00.A6E(), this.A00.A5r() - this.A00.A69());
    }

    private B5 A05(@Nullable B4 b4) {
        if (b4 == null) {
            int A6H = ((InterfaceC0480Ap) IJ.A01(this.A00)).A6H();
            return A04(A6H, this.A02.A07(A6H));
        }
        return A04(b4.A00, b4.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            B5 A02 = A02();
            this.A02.A09();
            Iterator<B6> it = this.A04.iterator();
            while (it.hasNext()) {
                B6 next = it.next();
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                next.onSeekStarted(A02);
            }
        }
    }

    public final void A07() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        Iterator it = new ArrayList(arrayList).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "gG2PlvUwOW39eC8R";
            if (hasNext) {
                B4 b4 = (B4) it.next();
                ABS(b4.A00, b4.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA2(String str, long j2, long j3) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA3(C0512Bw c0512Bw) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(C0512Bw c0512Bw) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(Format format) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(int i2) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(int i2, long j2, long j3) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (hasNext) {
                it.next().onAudioUnderrun(A03, i2, j2, j3);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void AAX(int i2, @Nullable FY fy, C0589Fn c0589Fn) {
        B5 A04 = A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(A04, c0589Fn);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAY() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAZ() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysRemoved(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAa() {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAb(Exception exc) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AAc(int i2, long j2) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i2, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABB(int i2, @Nullable FY fy, C0588Fm c0588Fm, C0589Fn c0589Fn) {
        A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABD(int i2, @Nullable FY fy, C0588Fm c0588Fm, C0589Fn c0589Fn) {
        A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABG(int i2, @Nullable FY fy, C0588Fm c0588Fm, C0589Fn c0589Fn, IOException iOException, boolean z) {
        B5 A04 = A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, c0588Fm, c0589Fn, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABI(int i2, @Nullable FY fy, C0588Fm c0588Fm, C0589Fn c0589Fn) {
        A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ABK(boolean z) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            A05[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            next.onLoadingChanged(A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABR(int i2, FY fy) {
        this.A02.A0B(i2, fy);
        B5 A04 = A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void ABS(int i2, FY fy) {
        this.A02.A0C(i2, fy);
        B5 A04 = A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (hasNext) {
                it.next().onMediaPeriodReleased(A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABV(Metadata metadata) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ABl(C0472Ah c0472Ah) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            A05[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            next.onPlaybackParametersChanged(A02, c0472Ah);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ABn(AM am) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 next = it.next();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            next.onPlayerError(A02, am);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ABp(boolean z, int i2) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(A02, z, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ABr(int i2) {
        this.A02.A0A(i2);
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            B6 listener = it.next();
            listener.onPositionDiscontinuity(A02, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Fo
    public final void AC0(int i2, FY fy) {
        this.A02.A0D(i2, fy);
        B5 A04 = A04(i2, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void AC4(Surface surface) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (hasNext) {
                it.next().onRenderedFirstFrame(A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ACE() {
        if (this.A02.A0F()) {
            this.A02.A08();
            B5 A02 = A02();
            Iterator<B6> it = this.A04.iterator();
            while (it.hasNext()) {
                B6 listener = it.next();
                listener.onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ACT(B1 b1, @Nullable Object obj, int i2) {
        this.A02.A0E(b1);
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0475Ak
    public final void ACV(TrackGroupArray trackGroupArray, HR hr) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, hr);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACd(String str, long j2, long j3) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACe(C0512Bw c0512Bw) {
        B5 A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACf(C0512Bw c0512Bw) {
        B5 A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c0512Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACi(Format format) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JM
    public final void ACn(int i2, int i3, int i4, float f2) {
        B5 A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i2, i3, i4, f2);
        }
    }
}
