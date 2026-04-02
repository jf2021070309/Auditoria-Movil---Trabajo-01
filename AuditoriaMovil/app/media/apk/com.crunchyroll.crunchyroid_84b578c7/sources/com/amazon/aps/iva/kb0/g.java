package com.amazon.aps.iva.kb0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
/* loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g SYNCHRONIZED = new g("SYNCHRONIZED", 0);
    public static final g PUBLICATION = new g("PUBLICATION", 1);
    public static final g NONE = new g("NONE", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = com.amazon.aps.iva.dg.b.o($values);
    }

    private g(String str, int i) {
    }

    public static com.amazon.aps.iva.rb0.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
