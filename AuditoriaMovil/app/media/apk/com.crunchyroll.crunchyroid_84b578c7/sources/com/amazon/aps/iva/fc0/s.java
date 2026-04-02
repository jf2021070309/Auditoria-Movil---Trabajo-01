package com.amazon.aps.iva.fc0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
/* loaded from: classes4.dex */
public final class s {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s INVARIANT = new s("INVARIANT", 0);
    public static final s IN = new s("IN", 1);
    public static final s OUT = new s("OUT", 2);

    private static final /* synthetic */ s[] $values() {
        return new s[]{INVARIANT, IN, OUT};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private s(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<s> getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
