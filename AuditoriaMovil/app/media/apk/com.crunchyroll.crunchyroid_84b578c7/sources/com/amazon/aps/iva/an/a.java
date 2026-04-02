package com.amazon.aps.iva.an;

import com.amazon.aps.iva.cn.d;
import com.amazon.aps.iva.cn.e;
import com.amazon.aps.iva.cn.f;
import com.amazon.aps.iva.f1.x;
/* compiled from: WelcomeProfileIconStyle.kt */
/* loaded from: classes2.dex */
public enum a implements e {
    WELCOME_DEFAULT(f.b, null, null, 0, null, null, false, null, 80, 254, null);
    
    private final com.amazon.aps.iva.a1.f borderModifier;
    private final boolean displayImage;
    private final x endBottomIconBackground;
    private final long iconBackground;
    private final Integer iconResId;
    private final Integer imageFailureSize;
    private final x imageOverlayColor;
    private final x overlayColor;
    private final d statusIcon;

    static {
        r0 = f.a;
    }

    a(com.amazon.aps.iva.a1.f fVar, x xVar, x xVar2, long j, d dVar, Integer num, boolean z, x xVar3, Integer num2) {
        this.borderModifier = fVar;
        this.endBottomIconBackground = xVar;
        this.overlayColor = xVar2;
        this.iconBackground = j;
        this.statusIcon = dVar;
        this.iconResId = num;
        this.displayImage = z;
        this.imageOverlayColor = xVar3;
        this.imageFailureSize = num2;
    }

    @Override // com.amazon.aps.iva.cn.e
    public com.amazon.aps.iva.a1.f getBorderModifier() {
        return this.borderModifier;
    }

    @Override // com.amazon.aps.iva.cn.e
    public boolean getDisplayImage() {
        return this.displayImage;
    }

    /* renamed from: getEndBottomIconBackground-QN2ZGVo  reason: not valid java name */
    public x m5getEndBottomIconBackgroundQN2ZGVo() {
        return this.endBottomIconBackground;
    }

    @Override // com.amazon.aps.iva.cn.e
    /* renamed from: getIconBackground-0d7_KjU  reason: not valid java name */
    public long mo6getIconBackground0d7_KjU() {
        return this.iconBackground;
    }

    @Override // com.amazon.aps.iva.cn.e
    public Integer getIconResId() {
        return this.iconResId;
    }

    @Override // com.amazon.aps.iva.cn.e
    public Integer getImageFailureSize() {
        return this.imageFailureSize;
    }

    /* renamed from: getImageOverlayColor-QN2ZGVo  reason: not valid java name */
    public x m7getImageOverlayColorQN2ZGVo() {
        return this.imageOverlayColor;
    }

    @Override // com.amazon.aps.iva.cn.e
    /* renamed from: getOverlayColor-QN2ZGVo  reason: not valid java name */
    public x mo8getOverlayColorQN2ZGVo() {
        return this.overlayColor;
    }

    @Override // com.amazon.aps.iva.cn.e
    public d getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    a(com.amazon.aps.iva.a1.f r19, com.amazon.aps.iva.f1.x r20, com.amazon.aps.iva.f1.x r21, long r22, com.amazon.aps.iva.cn.d r24, java.lang.Integer r25, boolean r26, com.amazon.aps.iva.f1.x r27, java.lang.Integer r28, int r29, com.amazon.aps.iva.yb0.e r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r20
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r21
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L1d
            int r1 = com.amazon.aps.iva.ao.a.C
            long r3 = com.amazon.aps.iva.ao.a.c
            r9 = r3
            goto L1f
        L1d:
            r9 = r22
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r11 = r2
            goto L27
        L25:
            r11 = r24
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2d
            r12 = r2
            goto L2f
        L2d:
            r12 = r25
        L2f:
            r1 = r0 & 64
            if (r1 == 0) goto L36
            r1 = 1
            r13 = r1
            goto L38
        L36:
            r13 = r26
        L38:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3e
            r14 = r2
            goto L40
        L3e:
            r14 = r27
        L40:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L46
            r15 = r2
            goto L48
        L46:
            r15 = r28
        L48:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r3.<init>(r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.an.a.<init>(java.lang.String, int, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.f1.x, com.amazon.aps.iva.f1.x, long, com.amazon.aps.iva.cn.d, java.lang.Integer, boolean, com.amazon.aps.iva.f1.x, java.lang.Integer, int, com.amazon.aps.iva.yb0.e):void");
    }
}
