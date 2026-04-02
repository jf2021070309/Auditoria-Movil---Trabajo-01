package com.amazon.aps.iva.lb0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
/* loaded from: classes4.dex */
public final class o0 {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 Ready = new o0("Ready", 0);
    public static final o0 NotReady = new o0("NotReady", 1);
    public static final o0 Done = new o0("Done", 2);
    public static final o0 Failed = new o0("Failed", 3);

    private static final /* synthetic */ o0[] $values() {
        return new o0[]{Ready, NotReady, Done, Failed};
    }

    static {
        o0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private o0(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<o0> getEntries() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
