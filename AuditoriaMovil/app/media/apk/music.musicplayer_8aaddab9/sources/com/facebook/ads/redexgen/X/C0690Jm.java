package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Jm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0690Jm extends ImageView implements Q0 {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    @Nullable
    public Q8 A00;
    public final Paint A01;
    public final C1046Xo A02;
    public final C0692Jo A03;
    public final AbstractC0704Ka A04;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (C0739Lm.A00 * 4.0f);
    }

    public C0690Jm(C1046Xo c1046Xo, C0692Jo c0692Jo) {
        super(c1046Xo);
        this.A04 = new AbstractC0704Ka() { // from class: com.facebook.ads.redexgen.X.7n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04429c
            /* renamed from: A00 */
            public final void A03(C0705Kb c0705Kb) {
                C0690Jm.this.A09();
            }
        };
        this.A03 = c0692Jo;
        this.A02 = c1046Xo;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i2 = A07;
        setPadding(i2, i2, i2, i2);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new QE(this));
    }

    private void A04() {
        setImageBitmap(MU.A01(MT.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(MU.A01(MT.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        Q8 q8 = this.A00;
        if (q8 != null) {
            float volume = q8.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void A8o(Q8 q8) {
        this.A00 = q8;
        Q8 q82 = this.A00;
        if (q82 != null) {
            q82.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AFL(Q8 q8) {
        Q8 q82 = this.A00;
        if (q82 != null) {
            q82.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.A01);
        super.onDraw(canvas);
    }
}
