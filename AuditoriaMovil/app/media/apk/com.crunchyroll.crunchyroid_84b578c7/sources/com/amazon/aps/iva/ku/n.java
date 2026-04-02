package com.amazon.aps.iva.ku;
/* compiled from: PostCommentModule.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a> {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar) {
        super(0);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final a invoke() {
        q qVar = this.h;
        androidx.fragment.app.h requireActivity = qVar.a.requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "dialog.requireActivity()");
        v vVar = qVar.g;
        return new a(requireActivity, new l(vVar), new m(vVar));
    }
}
