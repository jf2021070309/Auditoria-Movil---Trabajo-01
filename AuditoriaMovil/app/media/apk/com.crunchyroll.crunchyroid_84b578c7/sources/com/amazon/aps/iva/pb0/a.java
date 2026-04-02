package com.amazon.aps.iva.pb0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COROUTINE_SUSPENDED = new a("COROUTINE_SUSPENDED", 0);
    public static final a UNDECIDED = new a("UNDECIDED", 1);
    public static final a RESUMED = new a("RESUMED", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private a(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
