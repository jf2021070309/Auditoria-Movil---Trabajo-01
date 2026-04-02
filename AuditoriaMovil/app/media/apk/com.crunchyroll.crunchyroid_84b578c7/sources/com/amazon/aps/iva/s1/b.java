package com.amazon.aps.iva.s1;
/* compiled from: AlignmentLine.kt */
/* loaded from: classes.dex */
public final class b {
    public static final j a = new j(a.b);
    public static final j b = new j(C0690b.b);

    /* compiled from: AlignmentLine.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Integer, Integer, Integer> {
        public static final a b = new a();

        public a() {
            super(2, com.amazon.aps.iva.ac0.a.class, "min", "min(II)I", 1);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* compiled from: AlignmentLine.kt */
    /* renamed from: com.amazon.aps.iva.s1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0690b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<Integer, Integer, Integer> {
        public static final C0690b b = new C0690b();

        public C0690b() {
            super(2, com.amazon.aps.iva.ac0.a.class, "max", "max(II)I", 1);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
