package com.amazon.aps.iva.dw;

import com.amazon.aps.iva.q5.u0;
/* compiled from: ExoPlayerTrackSelectionParamsProvider.kt */
/* loaded from: classes2.dex */
public interface r {

    /* compiled from: ExoPlayerTrackSelectionParamsProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a implements r {
        public final com.amazon.aps.iva.wg.a a;
        public final com.amazon.aps.iva.xb0.a<u0.a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.wg.a aVar, com.amazon.aps.iva.xb0.a<? extends u0.a> aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        @Override // com.amazon.aps.iva.dw.r
        public final u0 i() {
            com.amazon.aps.iva.wg.a aVar = this.a;
            u0 b = this.b.invoke().j(aVar.J().getWidth(), aVar.J().getHeight()).i(aVar.J().getWidth(), aVar.J().getHeight()).b();
            com.amazon.aps.iva.yb0.j.e(b, "getDefaultTrackSelection…\n                .build()");
            return b;
        }
    }

    u0 i();
}
