package com.amazon.aps.iva.eb0;
/* compiled from: CompositeMetadataContainer.java */
/* loaded from: classes4.dex */
public final class b implements f {
    public final e<Integer> a = new e<>(new d());
    public final e<String> b = new e<>(new c());

    @Override // com.amazon.aps.iva.eb0.f
    public final void a(com.amazon.aps.iva.ab0.f fVar) {
        e<String> eVar = this.b;
        if (!eVar.b.a(fVar).equals("001")) {
            eVar.a(fVar);
        } else {
            this.a.a(fVar);
        }
    }
}
