package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LocalVideosListener.kt */
/* loaded from: classes2.dex */
public interface g0 {

    /* compiled from: LocalVideosListener.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(e0 e0Var, Throwable th) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            com.amazon.aps.iva.yb0.j.f(th, "throwable");
        }
    }

    void A0(e0 e0Var);

    void J3(com.amazon.aps.iva.nw.g gVar);

    void J7(e0 e0Var);

    void L0();

    void M3(List<? extends e0> list);

    void P5(String str);

    void T3();

    void V4(List<? extends PlayableAsset> list);

    void c3(String str);

    void f7(e0 e0Var);

    void s3(e0 e0Var);

    void s8(e0 e0Var);

    void t3();

    void u7(e0 e0Var);

    void v5(ArrayList arrayList);

    void x6(String str);

    void y7(List<? extends e0> list);

    void z1(List<? extends PlayableAsset> list);

    void z3(e0 e0Var, Throwable th);
}
