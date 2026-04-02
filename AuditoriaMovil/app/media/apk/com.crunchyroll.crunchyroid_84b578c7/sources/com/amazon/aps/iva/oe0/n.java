package com.amazon.aps.iva.oe0;
/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<CharSequence, Integer, com.amazon.aps.iva.kb0.j<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(char[] cArr, boolean z) {
        super(2);
        this.h = cArr;
        this.i = z;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(charSequence2, "$this$$receiver");
        int s0 = q.s0(intValue, charSequence2, this.i, this.h);
        if (s0 < 0) {
            return null;
        }
        return new com.amazon.aps.iva.kb0.j<>(Integer.valueOf(s0), 1);
    }
}
