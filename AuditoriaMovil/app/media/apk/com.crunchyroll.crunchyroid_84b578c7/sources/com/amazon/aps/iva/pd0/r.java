package com.amazon.aps.iva.pd0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes4.dex */
public abstract class r {
    public static final r PLAIN = new r() { // from class: com.amazon.aps.iva.pd0.r.b
        @Override // com.amazon.aps.iva.pd0.r
        public final String escape(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "string");
            return str;
        }
    };
    public static final r HTML = new r() { // from class: com.amazon.aps.iva.pd0.r.a
        @Override // com.amazon.aps.iva.pd0.r
        public final String escape(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "string");
            return com.amazon.aps.iva.oe0.m.f0(com.amazon.aps.iva.oe0.m.f0(str, "<", "&lt;"), ">", "&gt;");
        }
    };
    private static final /* synthetic */ r[] $VALUES = $values();

    private static final /* synthetic */ r[] $values() {
        return new r[]{PLAIN, HTML};
    }

    public /* synthetic */ r(String str, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(str, i);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    private r(String str, int i) {
    }
}
