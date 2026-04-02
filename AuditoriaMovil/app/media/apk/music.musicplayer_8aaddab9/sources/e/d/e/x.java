package e.d.e;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x DEFAULT;
    public static final x STRING;

    /* loaded from: classes2.dex */
    public enum a extends x {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // e.d.e.x
        public o serialize(Long l2) {
            return new t(l2);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        x xVar = new x("STRING", 1) { // from class: e.d.e.x.b
            @Override // e.d.e.x
            public o serialize(Long l2) {
                return new t(String.valueOf(l2));
            }
        };
        STRING = xVar;
        $VALUES = new x[]{aVar, xVar};
    }

    private x(String str, int i2) {
    }

    public /* synthetic */ x(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public abstract o serialize(Long l2);
}
