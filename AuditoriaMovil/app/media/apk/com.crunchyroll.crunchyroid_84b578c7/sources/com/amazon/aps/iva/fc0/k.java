package com.amazon.aps.iva.fc0;

import com.amazon.aps.iva.ic0.k0;
/* compiled from: KParameter.kt */
/* loaded from: classes4.dex */
public interface k extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KParameter.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final /* synthetic */ com.amazon.aps.iva.rb0.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE = new a("INSTANCE", 0);
        public static final a EXTENSION_RECEIVER = new a("EXTENSION_RECEIVER", 1);
        public static final a VALUE = new a("VALUE", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
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

    boolean a();

    int getIndex();

    a getKind();

    String getName();

    k0 getType();

    boolean l();
}
