package com.amazon.aps.iva.wm;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.cn.d;
import com.amazon.aps.iva.cn.e;
import com.amazon.aps.iva.f1.x;
import com.crunchyroll.crunchyroid.R;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum SWITCH_PROFILE_DEFAULT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: SwitchProfileIconStyle.kt */
/* loaded from: classes2.dex */
public final class a implements e {
    private static final /* synthetic */ a[] $VALUES;
    public static final a SWITCH_PROFILE_ADD;
    public static final a SWITCH_PROFILE_DEFAULT;
    public static final a SWITCH_PROFILE_DELETE;
    public static final a SWITCH_PROFILE_EDIT;
    public static final a SWITCH_PROFILE_LOADING = new a("SWITCH_PROFILE_LOADING", 0, null, null, null, com.amazon.aps.iva.ao.a.v, null, null, false, null, null, 439, null);
    public static final a SWITCH_PROFILE_PREMIUM_BLOCKED;
    public static final a SWITCH_PROFILE_SELECTED;
    private final f borderModifier;
    private final boolean displayImage;
    private final x endBottomIconBackground;
    private final long iconBackground;
    private final Integer iconResId;
    private final Integer imageFailureSize;
    private final x imageOverlayColor;
    private final x overlayColor;
    private final d statusIcon;

    private static final /* synthetic */ a[] $values() {
        return new a[]{SWITCH_PROFILE_LOADING, SWITCH_PROFILE_DEFAULT, SWITCH_PROFILE_SELECTED, SWITCH_PROFILE_EDIT, SWITCH_PROFILE_DELETE, SWITCH_PROFILE_PREMIUM_BLOCKED, SWITCH_PROFILE_ADD};
    }

    static {
        f fVar = com.amazon.aps.iva.cn.f.b;
        SWITCH_PROFILE_DEFAULT = new a("SWITCH_PROFILE_DEFAULT", 1, fVar, null, null, 0L, null, null, false, null, null, 510, null);
        SWITCH_PROFILE_SELECTED = new a("SWITCH_PROFILE_SELECTED", 2, com.amazon.aps.iva.cn.f.a, null, null, 0L, null, null, false, null, null, 510, null);
        long j = com.amazon.aps.iva.ao.a.r;
        SWITCH_PROFILE_EDIT = new a("SWITCH_PROFILE_EDIT", 3, fVar, null, null, 0L, new d(R.drawable.ic_pencil, j, null), null, false, null, null, 494, null);
        SWITCH_PROFILE_DELETE = new a("SWITCH_PROFILE_DELETE", 4, fVar, null, null, 0L, new d(R.drawable.ic_trash_bin, j, null), null, false, null, null, 494, null);
        f fVar2 = com.amazon.aps.iva.cn.f.c;
        d dVar = new d(R.drawable.ic_crown_black, com.amazon.aps.iva.ao.a.d, null);
        long j2 = com.amazon.aps.iva.ao.a.A;
        SWITCH_PROFILE_PREMIUM_BLOCKED = new a("SWITCH_PROFILE_PREMIUM_BLOCKED", 5, fVar2, null, new x(j2), 0L, dVar, null, false, null, null, 490, null);
        SWITCH_PROFILE_ADD = new a("SWITCH_PROFILE_ADD", 6, fVar, null, new x(j2), j2, null, Integer.valueOf((int) R.drawable.ic_add_profile), false, null, null, 402, null);
        $VALUES = $values();
    }

    private a(String str, int i, f fVar, x xVar, x xVar2, long j, d dVar, Integer num, boolean z, x xVar3, Integer num2) {
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

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // com.amazon.aps.iva.cn.e
    public f getBorderModifier() {
        return this.borderModifier;
    }

    @Override // com.amazon.aps.iva.cn.e
    public boolean getDisplayImage() {
        return this.displayImage;
    }

    /* renamed from: getEndBottomIconBackground-QN2ZGVo  reason: not valid java name */
    public x m24getEndBottomIconBackgroundQN2ZGVo() {
        return this.endBottomIconBackground;
    }

    @Override // com.amazon.aps.iva.cn.e
    /* renamed from: getIconBackground-0d7_KjU */
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
    public x m25getImageOverlayColorQN2ZGVo() {
        return this.imageOverlayColor;
    }

    @Override // com.amazon.aps.iva.cn.e
    /* renamed from: getOverlayColor-QN2ZGVo */
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
    public a(java.lang.String r17, int r18, com.amazon.aps.iva.a1.f r19, com.amazon.aps.iva.f1.x r20, com.amazon.aps.iva.f1.x r21, long r22, com.amazon.aps.iva.cn.d r24, java.lang.Integer r25, boolean r26, com.amazon.aps.iva.f1.x r27, java.lang.Integer r28, int r29, com.amazon.aps.iva.yb0.e r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r6 = r2
            goto Lb
        L9:
            r6 = r19
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r7 = r2
            goto L13
        L11:
            r7 = r20
        L13:
            r1 = r0 & 4
            if (r1 == 0) goto L19
            r8 = r2
            goto L1b
        L19:
            r8 = r21
        L1b:
            r1 = r0 & 8
            if (r1 == 0) goto L25
            int r1 = com.amazon.aps.iva.ao.a.C
            long r3 = com.amazon.aps.iva.ao.a.c
            r9 = r3
            goto L27
        L25:
            r9 = r22
        L27:
            r1 = r0 & 16
            if (r1 == 0) goto L2d
            r11 = r2
            goto L2f
        L2d:
            r11 = r24
        L2f:
            r1 = r0 & 32
            if (r1 == 0) goto L35
            r12 = r2
            goto L37
        L35:
            r12 = r25
        L37:
            r1 = r0 & 64
            if (r1 == 0) goto L3e
            r1 = 1
            r13 = r1
            goto L40
        L3e:
            r13 = r26
        L40:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L46
            r14 = r2
            goto L48
        L46:
            r14 = r27
        L48:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4e
            r15 = r2
            goto L50
        L4e:
            r15 = r28
        L50:
            r3 = r16
            r4 = r17
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wm.a.<init>(java.lang.String, int, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.f1.x, com.amazon.aps.iva.f1.x, long, com.amazon.aps.iva.cn.d, java.lang.Integer, boolean, com.amazon.aps.iva.f1.x, java.lang.Integer, int, com.amazon.aps.iva.yb0.e):void");
    }
}
