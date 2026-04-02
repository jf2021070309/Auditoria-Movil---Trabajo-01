package com.amazon.aps.iva.fc0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
/* loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t PUBLIC = new t("PUBLIC", 0);
    public static final t PROTECTED = new t("PROTECTED", 1);
    public static final t INTERNAL = new t("INTERNAL", 2);
    public static final t PRIVATE = new t("PRIVATE", 3);

    private static final /* synthetic */ t[] $values() {
        return new t[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private t(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<t> getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
