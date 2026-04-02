package com.amazon.aps.iva.vb0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c TOP_DOWN = new c("TOP_DOWN", 0);
    public static final c BOTTOM_UP = new c("BOTTOM_UP", 1);

    private static final /* synthetic */ c[] $values() {
        return new c[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private c(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
