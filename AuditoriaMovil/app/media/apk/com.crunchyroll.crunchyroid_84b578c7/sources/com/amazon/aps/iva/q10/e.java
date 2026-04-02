package com.amazon.aps.iva.q10;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SubgenreItemUiModel.kt */
/* loaded from: classes2.dex */
public abstract class e {

    /* compiled from: SubgenreItemUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e {
        public static final a a = new a();
    }

    /* compiled from: SubgenreItemUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        public static final b a = new b();
    }

    /* compiled from: SubgenreItemUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        public final Panel a;

        static {
            int i = Panel.$stable;
        }

        public c(Panel panel) {
            j.f(panel, "panel");
            this.a = panel;
        }
    }

    /* compiled from: SubgenreItemUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends e {
        public static final d a = new d();
    }
}
