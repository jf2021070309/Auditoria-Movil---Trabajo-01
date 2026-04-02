package com.amazon.aps.iva.v1;
/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class h1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ androidx.savedstate.a i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(boolean z, androidx.savedstate.a aVar, String str) {
        super(0);
        this.h = z;
        this.i = aVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        if (this.h) {
            androidx.savedstate.a aVar = this.i;
            aVar.getClass();
            String str = this.j;
            com.amazon.aps.iva.yb0.j.f(str, "key");
            aVar.a.e(str);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
