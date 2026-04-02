package com.amazon.aps.iva.fx;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.zv.h {
    public final a a;
    public final /* synthetic */ com.amazon.aps.iva.bo.f b;

    /* compiled from: DownloadingFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public final /* synthetic */ com.amazon.aps.iva.bo.f h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.bo.f fVar) {
            super(0);
            this.h = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (this.h.m0() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public l(com.amazon.aps.iva.bo.f fVar) {
        this.b = fVar;
        this.a = new a(fVar);
    }

    @Override // com.amazon.aps.iva.zv.h
    public final a a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.zv.h
    public final String b() {
        return this.b.b();
    }
}
