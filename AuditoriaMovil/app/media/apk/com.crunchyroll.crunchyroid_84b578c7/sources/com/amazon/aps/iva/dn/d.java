package com.amazon.aps.iva.dn;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum AVATAR_CONTROL_ENABLED uses external variables
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
/* compiled from: ProfileHeaderUiModel.kt */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d AVATAR_CONTROL_ENABLED;
    public static final d CONTROLS_ENABLED;
    public static final d VIEW_ONLY = new d("VIEW_ONLY", 0, b.PROFILE_HEADER_DEFAULT);
    private final com.amazon.aps.iva.cn.e avatarIconStyle;

    private static final /* synthetic */ d[] $values() {
        return new d[]{VIEW_ONLY, AVATAR_CONTROL_ENABLED, CONTROLS_ENABLED};
    }

    static {
        b bVar = b.PROFILE_HEADER_EDIT;
        AVATAR_CONTROL_ENABLED = new d("AVATAR_CONTROL_ENABLED", 1, bVar);
        CONTROLS_ENABLED = new d("CONTROLS_ENABLED", 2, bVar);
        $VALUES = $values();
    }

    private d(String str, int i, com.amazon.aps.iva.cn.e eVar) {
        this.avatarIconStyle = eVar;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final com.amazon.aps.iva.cn.e getAvatarIconStyle() {
        return this.avatarIconStyle;
    }
}
