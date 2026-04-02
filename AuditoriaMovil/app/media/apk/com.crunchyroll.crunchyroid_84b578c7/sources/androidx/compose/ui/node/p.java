package androidx.compose.ui.node;

import androidx.compose.ui.node.a;
import androidx.compose.ui.node.o;
import com.amazon.aps.iva.h2.j;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.i2.f0;
import com.amazon.aps.iva.i2.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.a0;
import com.amazon.aps.iva.u1.e1;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.v1.a3;
import com.amazon.aps.iva.v1.b1;
import com.amazon.aps.iva.v1.k2;
import com.amazon.aps.iva.v1.v2;
/* compiled from: Owner.kt */
/* loaded from: classes.dex */
public interface p {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: Owner.kt */
    /* loaded from: classes.dex */
    public interface a {
        void f();
    }

    void a(boolean z);

    void b(e eVar, boolean z, boolean z2);

    long c(long j);

    void d(e eVar);

    void e(e eVar);

    void f(e eVar, boolean z);

    u0 g(o.h hVar, com.amazon.aps.iva.xb0.l lVar);

    com.amazon.aps.iva.v1.i getAccessibilityManager();

    com.amazon.aps.iva.b1.b getAutofill();

    com.amazon.aps.iva.b1.g getAutofillTree();

    b1 getClipboardManager();

    com.amazon.aps.iva.ob0.g getCoroutineContext();

    com.amazon.aps.iva.o2.c getDensity();

    com.amazon.aps.iva.d1.l getFocusOwner();

    k.a getFontFamilyResolver();

    j.a getFontLoader();

    com.amazon.aps.iva.l1.a getHapticFeedBack();

    com.amazon.aps.iva.m1.b getInputModeManager();

    com.amazon.aps.iva.o2.l getLayoutDirection();

    com.amazon.aps.iva.t1.e getModifierLocalManager();

    w getPlatformTextInputPluginRegistry();

    com.amazon.aps.iva.p1.w getPointerIconService();

    a0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    e1 getSnapshotObserver();

    f0 getTextInputService();

    k2 getTextToolbar();

    v2 getViewConfiguration();

    a3 getWindowInfo();

    void h(com.amazon.aps.iva.xb0.a<q> aVar);

    void j(a.b bVar);

    void k(e eVar);

    void l(e eVar, long j);

    long m(long j);

    void n(e eVar, boolean z, boolean z2, boolean z3);

    void o(e eVar);

    void q();

    void r();

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);
}
