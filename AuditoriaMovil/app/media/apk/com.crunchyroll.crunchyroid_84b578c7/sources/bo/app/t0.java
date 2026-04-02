package bo.app;
/* loaded from: classes.dex */
public final class t0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(String str) {
        super(0);
        this.b = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    /* renamed from: a */
    public final String invoke() {
        return "Failed to create valid enum from string: " + this.b;
    }
}
