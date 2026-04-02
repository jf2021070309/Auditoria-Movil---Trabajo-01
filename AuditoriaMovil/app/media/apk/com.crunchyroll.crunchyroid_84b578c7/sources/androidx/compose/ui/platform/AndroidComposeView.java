package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.a;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.p;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.r;
import com.amazon.aps.iva.a2.u;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.h2.j;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.i2.a;
import com.amazon.aps.iva.i2.f0;
import com.amazon.aps.iva.i2.t;
import com.amazon.aps.iva.i2.v;
import com.amazon.aps.iva.i2.x;
import com.amazon.aps.iva.i2.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.t2;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.p1.b0;
import com.amazon.aps.iva.p1.c0;
import com.amazon.aps.iva.p1.i0;
import com.amazon.aps.iva.p1.j0;
import com.amazon.aps.iva.p1.w;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.u1.a0;
import com.amazon.aps.iva.u1.e1;
import com.amazon.aps.iva.u1.h1;
import com.amazon.aps.iva.u1.t0;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.v1.a1;
import com.amazon.aps.iva.v1.a3;
import com.amazon.aps.iva.v1.b3;
import com.amazon.aps.iva.v1.k0;
import com.amazon.aps.iva.v1.k2;
import com.amazon.aps.iva.v1.l0;
import com.amazon.aps.iva.v1.l1;
import com.amazon.aps.iva.v1.n;
import com.amazon.aps.iva.v1.o;
import com.amazon.aps.iva.v1.r0;
import com.amazon.aps.iva.v1.s;
import com.amazon.aps.iva.v1.v2;
import com.amazon.aps.iva.v1.w0;
import com.amazon.aps.iva.v1.x0;
import com.amazon.aps.iva.v1.y0;
import com.amazon.aps.iva.v1.z0;
import com.amazon.aps.iva.v1.z2;
import com.amazon.aps.iva.y0.y;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.primitives.Ints;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004Î\u0001Ï\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R.\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR(\u0010]\u001a\u00020T8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010\\\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR(\u0010l\u001a\u00020d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bk\u0010\\\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR/\u0010s\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001d\u0010w\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010pR\u001a\u0010}\u001a\u00020x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u0089\u0001\u0010\\\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R3\u0010\u0091\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0016\u001a\u00030\u008b\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010n\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R3\u0010\u0098\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0016\u001a\u00030\u0092\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010n\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009e\u0001\u001a\u00030\u0099\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010¤\u0001\u001a\u00030\u009f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R \u0010ª\u0001\u001a\u00030¥\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R \u0010°\u0001\u001a\u00030«\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R \u0010¶\u0001\u001a\u00030±\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¹\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u001a\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Ç\u0001\u001a\u00020d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010hR\u0016\u0010É\u0001\u001a\u00020T8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010XR\u0018\u0010Í\u0001\u001a\u00030Ê\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006Ð\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/p;", "", "Lcom/amazon/aps/iva/p1/j0;", "Lcom/amazon/aps/iva/i5/g;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "Lcom/amazon/aps/iva/kb0/q;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Lcom/amazon/aps/iva/u1/a0;", "d", "Lcom/amazon/aps/iva/u1/a0;", "getSharedDrawScope", "()Lcom/amazon/aps/iva/u1/a0;", "sharedDrawScope", "Lcom/amazon/aps/iva/o2/c;", "<set-?>", "e", "Lcom/amazon/aps/iva/o2/c;", "getDensity", "()Lcom/amazon/aps/iva/o2/c;", "density", "Lcom/amazon/aps/iva/d1/l;", "f", "Lcom/amazon/aps/iva/d1/l;", "getFocusOwner", "()Lcom/amazon/aps/iva/d1/l;", "focusOwner", "Landroidx/compose/ui/node/e;", "k", "Landroidx/compose/ui/node/e;", "getRoot", "()Landroidx/compose/ui/node/e;", "root", "Lcom/amazon/aps/iva/u1/h1;", "l", "Lcom/amazon/aps/iva/u1/h1;", "getRootForTest", "()Lcom/amazon/aps/iva/u1/h1;", "rootForTest", "Lcom/amazon/aps/iva/a2/u;", "m", "Lcom/amazon/aps/iva/a2/u;", "getSemanticsOwner", "()Lcom/amazon/aps/iva/a2/u;", "semanticsOwner", "Lcom/amazon/aps/iva/b1/g;", "o", "Lcom/amazon/aps/iva/b1/g;", "getAutofillTree", "()Lcom/amazon/aps/iva/b1/g;", "autofillTree", "Landroid/content/res/Configuration;", "u", "Lcom/amazon/aps/iva/xb0/l;", "getConfigurationChangeObserver", "()Lcom/amazon/aps/iva/xb0/l;", "setConfigurationChangeObserver", "(Lcom/amazon/aps/iva/xb0/l;)V", "configurationChangeObserver", "Lcom/amazon/aps/iva/v1/l;", "x", "Lcom/amazon/aps/iva/v1/l;", "getClipboardManager", "()Lcom/amazon/aps/iva/v1/l;", "clipboardManager", "Lcom/amazon/aps/iva/v1/k;", "y", "Lcom/amazon/aps/iva/v1/k;", "getAccessibilityManager", "()Lcom/amazon/aps/iva/v1/k;", "accessibilityManager", "Lcom/amazon/aps/iva/u1/e1;", "z", "Lcom/amazon/aps/iva/u1/e1;", "getSnapshotObserver", "()Lcom/amazon/aps/iva/u1/e1;", "snapshotObserver", "", "A", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Lcom/amazon/aps/iva/v1/v2;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Lcom/amazon/aps/iva/v1/v2;", "getViewConfiguration", "()Lcom/amazon/aps/iva/v1/v2;", "viewConfiguration", "", "L", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "P", "Lcom/amazon/aps/iva/o0/q1;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "Q", "Lcom/amazon/aps/iva/o0/p3;", "getViewTreeOwners", "viewTreeOwners", "Lcom/amazon/aps/iva/i2/x;", "V", "Lcom/amazon/aps/iva/i2/x;", "getPlatformTextInputPluginRegistry", "()Lcom/amazon/aps/iva/i2/x;", "platformTextInputPluginRegistry", "Lcom/amazon/aps/iva/i2/f0;", "W", "Lcom/amazon/aps/iva/i2/f0;", "getTextInputService", "()Lcom/amazon/aps/iva/i2/f0;", "textInputService", "Lcom/amazon/aps/iva/h2/j$a;", "k0", "Lcom/amazon/aps/iva/h2/j$a;", "getFontLoader", "()Lcom/amazon/aps/iva/h2/j$a;", "getFontLoader$annotations", "fontLoader", "Lcom/amazon/aps/iva/h2/k$a;", "v0", "getFontFamilyResolver", "()Lcom/amazon/aps/iva/h2/k$a;", "setFontFamilyResolver", "(Lcom/amazon/aps/iva/h2/k$a;)V", "fontFamilyResolver", "Lcom/amazon/aps/iva/o2/l;", "x0", "getLayoutDirection", "()Lcom/amazon/aps/iva/o2/l;", "setLayoutDirection", "(Lcom/amazon/aps/iva/o2/l;)V", "layoutDirection", "Lcom/amazon/aps/iva/l1/a;", "y0", "Lcom/amazon/aps/iva/l1/a;", "getHapticFeedBack", "()Lcom/amazon/aps/iva/l1/a;", "hapticFeedBack", "Lcom/amazon/aps/iva/t1/e;", "A0", "Lcom/amazon/aps/iva/t1/e;", "getModifierLocalManager", "()Lcom/amazon/aps/iva/t1/e;", "modifierLocalManager", "Lcom/amazon/aps/iva/v1/k2;", "B0", "Lcom/amazon/aps/iva/v1/k2;", "getTextToolbar", "()Lcom/amazon/aps/iva/v1/k2;", "textToolbar", "Lcom/amazon/aps/iva/ob0/g;", "C0", "Lcom/amazon/aps/iva/ob0/g;", "getCoroutineContext", "()Lcom/amazon/aps/iva/ob0/g;", "coroutineContext", "Lcom/amazon/aps/iva/p1/w;", "N0", "Lcom/amazon/aps/iva/p1/w;", "getPointerIconService", "()Lcom/amazon/aps/iva/p1/w;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Lcom/amazon/aps/iva/v1/a3;", "getWindowInfo", "()Lcom/amazon/aps/iva/v1/a3;", "windowInfo", "Lcom/amazon/aps/iva/b1/b;", "getAutofill", "()Lcom/amazon/aps/iva/b1/b;", "autofill", "Lcom/amazon/aps/iva/v1/x0;", "getAndroidViewsHandler$ui_release", "()Lcom/amazon/aps/iva/v1/x0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lcom/amazon/aps/iva/m1/b;", "getInputModeManager", "()Lcom/amazon/aps/iva/m1/b;", "inputModeManager", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements p, h1, j0, com.amazon.aps.iva.i5.g {
    public static Class<?> O0;
    public static Method P0;
    public boolean A;
    public final com.amazon.aps.iva.t1.e A0;
    public x0 B;
    public final r0 B0;
    public l1 C;
    public final com.amazon.aps.iva.ob0.g C0;
    public com.amazon.aps.iva.o2.a D;
    public MotionEvent D0;
    public boolean E;
    public long E0;
    public final androidx.compose.ui.node.l F;
    public final z2<u0> F0;
    public final w0 G;
    public final com.amazon.aps.iva.p0.f<com.amazon.aps.iva.xb0.a<q>> G0;
    public long H;
    public final j H0;
    public final int[] I;
    public final com.amazon.aps.iva.v1.p I0;
    public final float[] J;
    public boolean J0;
    public final float[] K;
    public final i K0;
    public long L;
    public final y0 L0;
    public boolean M;
    public boolean M0;
    public long N;
    public final h N0;
    public boolean O;
    public final y1 P;
    public final q0 Q;
    public com.amazon.aps.iva.xb0.l<? super b, q> R;
    public final com.amazon.aps.iva.v1.m S;
    public final n T;
    public final o U;
    public final x V;
    public final f0 W;
    public long b;
    public final boolean c;
    public final a0 d;
    public com.amazon.aps.iva.o2.d e;
    public final com.amazon.aps.iva.d1.m f;
    public final b3 g;
    public final com.amazon.aps.iva.a1.f h;
    public final com.amazon.aps.iva.a1.f i;
    public final com.amazon.aps.iva.p0.e j;
    public final androidx.compose.ui.node.e k;
    public final com.amazon.aps.iva.v1.q0 k0;
    public final AndroidComposeView l;
    public final u m;
    public final androidx.compose.ui.platform.a n;
    public final com.amazon.aps.iva.b1.g o;
    public final ArrayList p;
    public ArrayList q;
    public boolean r;
    public final com.amazon.aps.iva.p1.i s;
    public final c0 t;
    public com.amazon.aps.iva.xb0.l<? super Configuration, q> u;
    public final com.amazon.aps.iva.b1.a v;
    public final y1 v0;
    public boolean w;
    public int w0;
    public final com.amazon.aps.iva.v1.l x;
    public final y1 x0;
    public final com.amazon.aps.iva.v1.k y;
    public final com.amazon.aps.iva.l1.b y0;
    public final e1 z;
    public final com.amazon.aps.iva.m1.c z0;

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final boolean a() {
            Object obj;
            Class<?> cls = AndroidComposeView.O0;
            try {
                if (AndroidComposeView.O0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.O0 = cls2;
                    AndroidComposeView.P0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.P0;
                Boolean bool = null;
                if (method != null) {
                    obj = method.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.i5.o a;
        public final com.amazon.aps.iva.s8.c b;

        public b(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.s8.c cVar) {
            this.a = oVar;
            this.b = cVar;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.m1.a, Boolean> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.m1.a aVar) {
            boolean z;
            boolean z2;
            int i = aVar.a;
            boolean z3 = false;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            if (z) {
                z3 = androidComposeView.isInTouchMode();
            } else {
                if (i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (androidComposeView.isInTouchMode()) {
                        z3 = androidComposeView.requestFocusFromTouch();
                    } else {
                        z3 = true;
                    }
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Configuration, q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Configuration configuration) {
            com.amazon.aps.iva.yb0.j.f(configuration, "it");
            return q.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<? extends q>, q> {
        public e() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xb0.a<? extends q> aVar) {
            com.amazon.aps.iva.xb0.a<? extends q> aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            AndroidComposeView.this.h(aVar2);
            return q.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.n1.b, Boolean> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.n1.b bVar) {
            boolean a;
            boolean a2;
            boolean a3;
            com.amazon.aps.iva.d1.d dVar;
            int i;
            KeyEvent keyEvent = bVar.a;
            com.amazon.aps.iva.yb0.j.f(keyEvent, "it");
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.getClass();
            long i2 = com.amazon.aps.iva.n1.c.i(keyEvent);
            boolean z = true;
            if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.h)) {
                if (keyEvent.isShiftPressed()) {
                    i = 2;
                } else {
                    i = 1;
                }
                dVar = new com.amazon.aps.iva.d1.d(i);
            } else if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.f)) {
                dVar = new com.amazon.aps.iva.d1.d(4);
            } else if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.e)) {
                dVar = new com.amazon.aps.iva.d1.d(3);
            } else if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.c)) {
                dVar = new com.amazon.aps.iva.d1.d(5);
            } else if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.d)) {
                dVar = new com.amazon.aps.iva.d1.d(6);
            } else {
                if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.g)) {
                    a = true;
                } else {
                    a = com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.i);
                }
                if (a) {
                    a2 = true;
                } else {
                    a2 = com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.k);
                }
                if (a2) {
                    dVar = new com.amazon.aps.iva.d1.d(7);
                } else {
                    if (com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.b)) {
                        a3 = true;
                    } else {
                        a3 = com.amazon.aps.iva.n1.a.a(i2, com.amazon.aps.iva.n1.a.j);
                    }
                    if (a3) {
                        dVar = new com.amazon.aps.iva.d1.d(8);
                    } else {
                        dVar = null;
                    }
                }
            }
            if (dVar != null) {
                if (com.amazon.aps.iva.n1.c.j(keyEvent) != 2) {
                    z = false;
                }
                if (z) {
                    return Boolean.valueOf(androidComposeView.getFocusOwner().g(dVar.a));
                }
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<v<?>, t, com.amazon.aps.iva.i2.u> {
        public g() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.i2.u invoke(v<?> vVar, t tVar) {
            v<?> vVar2 = vVar;
            t tVar2 = tVar;
            com.amazon.aps.iva.yb0.j.f(vVar2, "factory");
            com.amazon.aps.iva.yb0.j.f(tVar2, "platformTextInput");
            return vVar2.a(AndroidComposeView.this, tVar2);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class h implements w {
        public com.amazon.aps.iva.p1.p a;

        public h() {
            com.amazon.aps.iva.p1.p.b.getClass();
            this.a = com.amazon.aps.iva.gy.t.b;
        }

        @Override // com.amazon.aps.iva.p1.w
        public final void a(com.amazon.aps.iva.p1.p pVar) {
            if (pVar == null) {
                com.amazon.aps.iva.p1.p.b.getClass();
                pVar = com.amazon.aps.iva.gy.t.b;
            }
            this.a = pVar;
            k0.a.a(AndroidComposeView.this, pVar);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.D0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.E0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.H0);
            }
            return q.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.D0;
            if (motionEvent != null) {
                boolean z2 = false;
                if (motionEvent.getToolType(0) == 3) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!z ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z2 = true;
                }
                if (z2) {
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.I(motionEvent, i, androidComposeView2.E0, false);
                }
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.r1.c, Boolean> {
        public static final k h = new k();

        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.r1.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "it");
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<? extends q>, q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xb0.a<? extends q> aVar) {
            Looper looper;
            com.amazon.aps.iva.xb0.a<? extends q> aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "command");
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (looper == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new s(0, aVar2));
                }
            }
            return q.a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<b> {
        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    static {
        new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.amazon.aps.iva.v1.n] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.amazon.aps.iva.v1.o] */
    public AndroidComposeView(Context context, com.amazon.aps.iva.ob0.g gVar) {
        super(context);
        int i2;
        com.amazon.aps.iva.o2.l lVar;
        int i3;
        y0 z0Var;
        com.amazon.aps.iva.yb0.j.f(gVar, "coroutineContext");
        this.b = com.amazon.aps.iva.e1.c.d;
        this.c = true;
        this.d = new a0();
        this.e = com.amazon.aps.iva.gr.n.i(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.c;
        this.f = new com.amazon.aps.iva.d1.m(new e());
        this.g = new b3();
        com.amazon.aps.iva.a1.f a2 = androidx.compose.ui.input.key.a.a(new f());
        this.h = a2;
        com.amazon.aps.iva.a1.f a3 = androidx.compose.ui.input.rotary.a.a(k.h);
        this.i = a3;
        this.j = new com.amazon.aps.iva.p0.e(1);
        androidx.compose.ui.node.e eVar = new androidx.compose.ui.node.e(3, false);
        eVar.h(com.amazon.aps.iva.s1.y0.b);
        eVar.Y(getDensity());
        com.amazon.aps.iva.yb0.j.f(emptySemanticsElement, "other");
        eVar.g(emptySemanticsElement.o(a3).o(getFocusOwner().a()).o(a2));
        this.k = eVar;
        this.l = this;
        this.m = new u(getRoot());
        androidx.compose.ui.platform.a aVar = new androidx.compose.ui.platform.a(this);
        this.n = aVar;
        this.o = new com.amazon.aps.iva.b1.g();
        this.p = new ArrayList();
        this.s = new com.amazon.aps.iva.p1.i();
        this.t = new c0(getRoot());
        this.u = d.h;
        this.v = new com.amazon.aps.iva.b1.a(this, getAutofillTree());
        this.x = new com.amazon.aps.iva.v1.l(context);
        this.y = new com.amazon.aps.iva.v1.k(context);
        this.z = new e1(new l());
        this.F = new androidx.compose.ui.node.l(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        com.amazon.aps.iva.yb0.j.e(viewConfiguration, "get(context)");
        this.G = new w0(viewConfiguration);
        this.H = com.amazon.aps.iva.e.w.e(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.I = new int[]{0, 0};
        this.J = com.amazon.aps.iva.aq.k.k();
        this.K = com.amazon.aps.iva.aq.k.k();
        this.L = -1L;
        this.N = com.amazon.aps.iva.e1.c.c;
        this.O = true;
        this.P = com.amazon.aps.iva.cq.b.c0(null);
        this.Q = com.amazon.aps.iva.cq.b.M(new m());
        this.S = new com.amazon.aps.iva.v1.m(this, 0);
        this.T = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.amazon.aps.iva.v1.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.O0;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                com.amazon.aps.iva.yb0.j.f(androidComposeView, "this$0");
                androidComposeView.J();
            }
        };
        this.U = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: com.amazon.aps.iva.v1.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                int i4;
                Class<?> cls = AndroidComposeView.O0;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                com.amazon.aps.iva.yb0.j.f(androidComposeView, "this$0");
                if (z) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                com.amazon.aps.iva.m1.c cVar = androidComposeView.z0;
                cVar.getClass();
                cVar.b.setValue(new com.amazon.aps.iva.m1.a(i4));
            }
        };
        this.V = new x(new g());
        x platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        com.amazon.aps.iva.i2.a aVar2 = com.amazon.aps.iva.i2.a.a;
        platformTextInputPluginRegistry.getClass();
        com.amazon.aps.iva.y0.w<v<?>, x.b<?>> wVar = platformTextInputPluginRegistry.b;
        x.b<?> bVar = wVar.get(aVar2);
        if (bVar == null) {
            com.amazon.aps.iva.i2.u invoke = platformTextInputPluginRegistry.a.invoke(aVar2, new x.a(platformTextInputPluginRegistry));
            com.amazon.aps.iva.yb0.j.d(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
            x.b<?> bVar2 = new x.b<>(invoke);
            wVar.put(aVar2, bVar2);
            bVar = bVar2;
        }
        bVar.b.e(bVar.b.t() + 1);
        new y(bVar);
        T t = bVar.a;
        com.amazon.aps.iva.yb0.j.f(t, "adapter");
        this.W = ((a.C0350a) t).a;
        this.k0 = new com.amazon.aps.iva.v1.q0(context);
        this.v0 = com.amazon.aps.iva.cq.b.b0(com.amazon.aps.iva.h2.p.a(context), t2.a);
        Configuration configuration = context.getResources().getConfiguration();
        com.amazon.aps.iva.yb0.j.e(configuration, "context.resources.configuration");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            i2 = configuration.fontWeightAdjustment;
        } else {
            i2 = 0;
        }
        this.w0 = i2;
        Configuration configuration2 = context.getResources().getConfiguration();
        com.amazon.aps.iva.yb0.j.e(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                lVar = com.amazon.aps.iva.o2.l.Ltr;
            } else {
                lVar = com.amazon.aps.iva.o2.l.Rtl;
            }
        } else {
            lVar = com.amazon.aps.iva.o2.l.Ltr;
        }
        this.x0 = com.amazon.aps.iva.cq.b.c0(lVar);
        this.y0 = new com.amazon.aps.iva.l1.b(this);
        if (isInTouchMode()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        this.z0 = new com.amazon.aps.iva.m1.c(i3, new c());
        this.A0 = new com.amazon.aps.iva.t1.e(this);
        this.B0 = new r0(this);
        this.C0 = gVar;
        this.F0 = new z2<>();
        this.G0 = new com.amazon.aps.iva.p0.f<>(new com.amazon.aps.iva.xb0.a[16]);
        this.H0 = new j();
        this.I0 = new com.amazon.aps.iva.v1.p(this, 0);
        this.K0 = new i();
        if (i4 >= 29) {
            z0Var = new a1();
        } else {
            z0Var = new z0();
        }
        this.L0 = z0Var;
        setWillNotDraw(false);
        setFocusable(true);
        l0.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        g0.n(this, aVar);
        getRoot().j(this);
        if (i4 >= 29) {
            com.amazon.aps.iva.v1.j0.a.a(this);
        }
        this.N0 = new h();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[LOOP:0: B:35:0x0061->B:61:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EDGE_INSN: B:64:0x00a9->B:62:0x00a9 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L14
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L59
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L29
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L29
            r0 = r3
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L59
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L3e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L59
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L53
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            r0 = r3
            goto L54
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto L57
            goto L59
        L57:
            r0 = r2
            goto L5a
        L59:
            r0 = r3
        L5a:
            if (r0 != 0) goto La9
            int r1 = r6.getPointerCount()
            r4 = r3
        L61:
            if (r4 >= r1) goto La9
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L75
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            r0 = r3
            goto L76
        L75:
            r0 = r2
        L76:
            if (r0 == 0) goto La3
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L8a
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            r0 = r3
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r0 == 0) goto La3
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L9d
            com.amazon.aps.iva.v1.z1 r0 = com.amazon.aps.iva.v1.z1.a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L9d
            r0 = r3
            goto L9e
        L9d:
            r0 = r2
        L9e:
            if (r0 == 0) goto La1
            goto La3
        La1:
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            if (r0 != 0) goto La9
            int r4 = r4 + 1
            goto L61
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.P.getValue();
    }

    public static final void s(AndroidComposeView androidComposeView, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        androidx.compose.ui.platform.a aVar = androidComposeView.n;
        if (com.amazon.aps.iva.yb0.j.a(str, aVar.y)) {
            Integer num2 = aVar.w.get(Integer.valueOf(i2));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
            }
        } else if (com.amazon.aps.iva.yb0.j.a(str, aVar.z) && (num = aVar.x.get(Integer.valueOf(i2))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    private void setFontFamilyResolver(k.a aVar) {
        this.v0.setValue(aVar);
    }

    private void setLayoutDirection(com.amazon.aps.iva.o2.l lVar) {
        this.x0.setValue(lVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.P.setValue(bVar);
    }

    public static void u(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).q();
            } else if (childAt instanceof ViewGroup) {
                u((ViewGroup) childAt);
            }
        }
    }

    public static long v(int i2) {
        long j2;
        long j3;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    j3 = size;
                    j2 = j3 << 32;
                    return j2 | j3;
                }
                throw new IllegalStateException();
            }
            j2 = 0 << 32;
            size = Integer.MAX_VALUE;
        } else {
            j2 = 0 << 32;
        }
        j3 = size;
        return j2 | j3;
    }

    public static View w(int i2, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (com.amazon.aps.iva.yb0.j.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    com.amazon.aps.iva.yb0.j.e(childAt, "currentView.getChildAt(i)");
                    View w = w(i2, childAt);
                    if (w != null) {
                        return w;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void y(androidx.compose.ui.node.e eVar) {
        eVar.C();
        com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> y = eVar.y();
        int i2 = y.d;
        if (i2 > 0) {
            androidx.compose.ui.node.e[] eVarArr = y.b;
            int i3 = 0;
            do {
                y(eVarArr[i3]);
                i3++;
            } while (i3 < i2);
        }
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (0.0f <= y && y <= getHeight()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean C(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z;
        boolean z2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.D0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    public final void D(u0 u0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(u0Var, "layer");
        ArrayList arrayList = this.p;
        if (!z) {
            if (!this.r) {
                arrayList.remove(u0Var);
                ArrayList arrayList2 = this.q;
                if (arrayList2 != null) {
                    arrayList2.remove(u0Var);
                }
            }
        } else if (!this.r) {
            arrayList.add(u0Var);
        } else {
            ArrayList arrayList3 = this.q;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                this.q = arrayList3;
            }
            arrayList3.add(u0Var);
        }
    }

    public final void E() {
        if (!this.M) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.L) {
                this.L = currentAnimationTimeMillis;
                y0 y0Var = this.L0;
                float[] fArr = this.J;
                y0Var.a(this, fArr);
                z.D(fArr, this.K);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.I;
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr);
                this.N = com.amazon.aps.iva.e1.d.d(iArr[0] - iArr[0], iArr[1] - iArr[1]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(u0 u0Var) {
        z2<u0> z2Var;
        Reference<? extends u0> poll;
        com.amazon.aps.iva.yb0.j.f(u0Var, "layer");
        if (this.C != null) {
            f.b bVar = androidx.compose.ui.platform.f.p;
        }
        do {
            z2Var = this.F0;
            poll = z2Var.b.poll();
            if (poll != null) {
                z2Var.a.k(poll);
                continue;
            }
        } while (poll != null);
        z2Var.a.b(new WeakReference(u0Var, z2Var.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.compose.ui.node.e r6) {
        /*
            r5 = this;
            boolean r0 = r5.isLayoutRequested()
            if (r0 != 0) goto L69
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L69
            if (r6 == 0) goto L55
        Le:
            if (r6 == 0) goto L4b
            androidx.compose.ui.node.f r0 = r6.A
            androidx.compose.ui.node.f$b r0 = r0.n
            androidx.compose.ui.node.e$f r0 = r0.l
            androidx.compose.ui.node.e$f r1 = androidx.compose.ui.node.e.f.InMeasureBlock
            if (r0 != r1) goto L4b
            boolean r0 = r5.E
            r1 = 1
            if (r0 != 0) goto L44
            androidx.compose.ui.node.e r0 = r6.v()
            r2 = 0
            if (r0 == 0) goto L3f
            androidx.compose.ui.node.m r0 = r0.z
            androidx.compose.ui.node.c r0 = r0.b
            long r3 = r0.e
            boolean r0 = com.amazon.aps.iva.o2.a.f(r3)
            if (r0 == 0) goto L3a
            boolean r0 = com.amazon.aps.iva.o2.a.e(r3)
            if (r0 == 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 != 0) goto L3f
            r0 = r1
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L4b
            androidx.compose.ui.node.e r6 = r6.v()
            goto Le
        L4b:
            androidx.compose.ui.node.e r0 = r5.getRoot()
            if (r6 != r0) goto L55
            r5.requestLayout()
            return
        L55:
            int r6 = r5.getWidth()
            if (r6 == 0) goto L66
            int r6 = r5.getHeight()
            if (r6 != 0) goto L62
            goto L66
        L62:
            r5.invalidate()
            goto L69
        L66:
            r5.requestLayout()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.G(androidx.compose.ui.node.e):void");
    }

    public final int H(MotionEvent motionEvent) {
        b0 b0Var;
        boolean z = false;
        if (this.M0) {
            this.M0 = false;
            int metaState = motionEvent.getMetaState();
            this.g.getClass();
            b3.b.setValue(new i0(metaState));
        }
        com.amazon.aps.iva.p1.i iVar = this.s;
        com.amazon.aps.iva.p1.a0 a2 = iVar.a(motionEvent, this);
        c0 c0Var = this.t;
        if (a2 != null) {
            List<b0> list = a2.a;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    b0Var = list.get(size);
                    if (b0Var.e) {
                        break;
                    } else if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            b0Var = null;
            b0 b0Var2 = b0Var;
            if (b0Var2 != null) {
                this.b = b0Var2.d;
            }
            int a3 = c0Var.a(a2, this, B(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if ((a3 & 1) != 0) {
                    z = true;
                }
                if (!z) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iVar.c.delete(pointerId);
                    iVar.b.delete(pointerId);
                }
            }
            return a3;
        }
        c0Var.b();
        return 0;
    }

    public final void I(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int i3;
        int i4;
        int buttonState;
        long downTime;
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
            i3 = -1;
        } else {
            if (i2 != 9 && i2 != 10) {
                i3 = 0;
            }
            i3 = -1;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i3 >= 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i6 = pointerCount - i4;
        if (i6 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            pointerPropertiesArr[i7] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            pointerCoordsArr[i8] = new MotionEvent.PointerCoords();
        }
        for (int i9 = 0; i9 < i6; i9++) {
            if (i3 >= 0 && i9 >= i3) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            int i10 = i5 + i9;
            motionEvent.getPointerProperties(i10, pointerPropertiesArr[i9]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i9];
            motionEvent.getPointerCoords(i10, pointerCoords);
            long p = p(com.amazon.aps.iva.e1.d.d(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = com.amazon.aps.iva.e1.c.c(p);
            pointerCoords.y = com.amazon.aps.iva.e1.c.d(p);
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j2;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j2, i2, i6, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        com.amazon.aps.iva.yb0.j.e(obtain, "event");
        com.amazon.aps.iva.p1.a0 a2 = this.s.a(obtain, this);
        com.amazon.aps.iva.yb0.j.c(a2);
        this.t.a(a2, this, true);
        obtain.recycle();
    }

    public final void J() {
        int[] iArr = this.I;
        getLocationOnScreen(iArr);
        long j2 = this.H;
        int i2 = (int) (j2 >> 32);
        int b2 = com.amazon.aps.iva.o2.h.b(j2);
        boolean z = false;
        int i3 = iArr[0];
        if (i2 != i3 || b2 != iArr[1]) {
            this.H = com.amazon.aps.iva.e.w.e(i3, iArr[1]);
            if (i2 != Integer.MAX_VALUE && b2 != Integer.MAX_VALUE) {
                getRoot().A.n.D0();
                z = true;
            }
        }
        this.F.a(z);
    }

    @Override // androidx.compose.ui.node.p
    public final void a(boolean z) {
        boolean z2;
        i iVar;
        androidx.compose.ui.node.l lVar = this.F;
        com.amazon.aps.iva.u1.n nVar = lVar.b;
        if (((com.amazon.aps.iva.u1.m) nVar.c).c.isEmpty() && ((com.amazon.aps.iva.u1.m) nVar.b).c.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z2) || lVar.d.a.j()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    iVar = this.K0;
                } finally {
                    Trace.endSection();
                }
            } else {
                iVar = null;
            }
            if (lVar.f(iVar)) {
                requestLayout();
            }
            lVar.a(false);
            q qVar = q.a;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        com.amazon.aps.iva.yb0.j.f(sparseArray, "values");
        com.amazon.aps.iva.b1.a aVar = this.v;
        if (aVar != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                com.amazon.aps.iva.b1.d dVar = com.amazon.aps.iva.b1.d.a;
                com.amazon.aps.iva.yb0.j.e(autofillValue, "value");
                if (dVar.d(autofillValue)) {
                    String obj = dVar.i(autofillValue).toString();
                    com.amazon.aps.iva.b1.g gVar = aVar.b;
                    gVar.getClass();
                    com.amazon.aps.iva.yb0.j.f(obj, "value");
                    com.amazon.aps.iva.b1.f fVar = (com.amazon.aps.iva.b1.f) gVar.a.get(Integer.valueOf(keyAt));
                } else if (!dVar.b(autofillValue)) {
                    if (!dVar.c(autofillValue)) {
                        if (dVar.e(autofillValue)) {
                            throw new com.amazon.aps.iva.kb0.i("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        throw new com.amazon.aps.iva.kb0.i("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    throw new com.amazon.aps.iva.kb0.i("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void b(androidx.compose.ui.node.e eVar, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        androidx.compose.ui.node.l lVar = this.F;
        if (z) {
            if (lVar.l(eVar, z2)) {
                G(null);
            }
        } else if (lVar.n(eVar, z2)) {
            G(null);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final long c(long j2) {
        E();
        return com.amazon.aps.iva.aq.k.u(this.J, j2);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.n.c(i2, this.b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.n.c(i2, this.b, true);
    }

    @Override // androidx.compose.ui.node.p
    public final void d(androidx.compose.ui.node.e eVar) {
        androidx.compose.ui.node.l lVar = this.F;
        lVar.getClass();
        t0 t0Var = lVar.d;
        t0Var.getClass();
        t0Var.a.b(eVar);
        eVar.H = true;
        G(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        if (!isAttachedToWindow()) {
            y(getRoot());
        }
        a(true);
        this.r = true;
        com.amazon.aps.iva.p0.e eVar = this.j;
        com.amazon.aps.iva.f1.g gVar = (com.amazon.aps.iva.f1.g) eVar.b;
        Canvas canvas2 = gVar.a;
        gVar.getClass();
        gVar.a = canvas;
        com.amazon.aps.iva.f1.g gVar2 = (com.amazon.aps.iva.f1.g) eVar.b;
        getRoot().o(gVar2);
        gVar2.x(canvas2);
        ArrayList arrayList = this.p;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((u0) arrayList.get(i2)).i();
            }
        }
        if (androidx.compose.ui.platform.f.u) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.r = false;
        ArrayList arrayList2 = this.q;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                float f2 = -motionEvent.getAxisValue(26);
                getContext();
                getContext();
                return getFocusOwner().h(new com.amazon.aps.iva.r1.c(com.amazon.aps.iva.p3.i0.b(viewConfiguration) * f2, com.amazon.aps.iva.p3.i0.a(viewConfiguration) * f2, motionEvent.getEventTime()));
            } else if (!A(motionEvent) && isAttachedToWindow()) {
                if ((x(motionEvent) & 1) != 0) {
                    return true;
                }
                return false;
            } else {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        androidx.compose.ui.node.e eVar;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.compose.ui.node.m mVar;
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        boolean z5 = this.J0;
        com.amazon.aps.iva.v1.p pVar = this.I0;
        if (z5) {
            removeCallbacks(pVar);
            pVar.run();
        }
        if (A(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        androidx.compose.ui.platform.a aVar = this.n;
        aVar.getClass();
        AccessibilityManager accessibilityManager = aVar.c;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int action = motionEvent.getAction();
            AndroidComposeView androidComposeView = aVar.a;
            int i2 = Integer.MIN_VALUE;
            if (action != 7 && action != 9) {
                if (action == 10) {
                    if (aVar.b != Integer.MIN_VALUE) {
                        aVar.updateHoveredVirtualView(Integer.MIN_VALUE);
                    } else {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                androidComposeView.a(true);
                com.amazon.aps.iva.u1.s sVar = new com.amazon.aps.iva.u1.s();
                androidx.compose.ui.node.e root = androidComposeView.getRoot();
                long d2 = com.amazon.aps.iva.e1.d.d(x, y);
                e.c cVar = androidx.compose.ui.node.e.J;
                root.getClass();
                androidx.compose.ui.node.m mVar2 = root.z;
                mVar2.c.w1(androidx.compose.ui.node.o.F, mVar2.c.o1(d2), sVar, true, true);
                f.c cVar2 = (f.c) com.amazon.aps.iva.lb0.x.E0(sVar);
                if (cVar2 != null) {
                    eVar = com.amazon.aps.iva.u1.i.e(cVar2);
                } else {
                    eVar = null;
                }
                if (eVar != null && (mVar = eVar.z) != null && mVar.d(8)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    r a2 = com.amazon.aps.iva.a2.t.a(eVar, false);
                    androidx.compose.ui.node.o c2 = a2.c();
                    if (c2 != null) {
                        z3 = c2.z1();
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        if (!a2.d.d(com.amazon.aps.iva.a2.v.m)) {
                            z4 = true;
                            if (z4 && androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(eVar) == null) {
                                i2 = aVar.v(eVar.c);
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                        i2 = aVar.v(eVar.c);
                    }
                }
                androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                aVar.updateHoveredVirtualView(i2);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && B(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.D0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.D0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.J0 = true;
                    post(pVar);
                    return false;
                } else if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!C(motionEvent)) {
            return false;
        }
        if ((x(motionEvent) & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        com.amazon.aps.iva.yb0.j.f(keyEvent, "event");
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.g.getClass();
            b3.b.setValue(new i0(metaState));
            if (!getFocusOwner().n(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        com.amazon.aps.iva.yb0.j.f(keyEvent, "event");
        if ((isFocused() && getFocusOwner().i(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(motionEvent, "motionEvent");
        if (this.J0) {
            com.amazon.aps.iva.v1.p pVar = this.I0;
            removeCallbacks(pVar);
            MotionEvent motionEvent2 = this.D0;
            com.amazon.aps.iva.yb0.j.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    this.J0 = false;
                }
            }
            pVar.run();
        }
        if (A(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !C(motionEvent)) {
            return false;
        }
        int x = x(motionEvent);
        if ((x & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((x & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.p
    public final void e(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        androidx.compose.ui.platform.a aVar = this.n;
        aVar.getClass();
        aVar.p = true;
        if (aVar.n()) {
            aVar.p(eVar);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void f(androidx.compose.ui.node.e eVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.F.d(eVar, z);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:10:0x0032). Please submit an issue!!! */
    public final View findViewByAccessibilityIdTraversal(int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        }
        return w(i2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[LOOP_START] */
    @Override // androidx.compose.ui.node.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.u1.u0 g(androidx.compose.ui.node.o.h r4, com.amazon.aps.iva.xb0.l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "drawBlock"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "invalidateParentLayer"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
        La:
            com.amazon.aps.iva.v1.z2<com.amazon.aps.iva.u1.u0> r0 = r3.F0
            java.lang.ref.ReferenceQueue<T> r1 = r0.b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L19
            com.amazon.aps.iva.p0.f<java.lang.ref.Reference<T>> r2 = r0.a
            r2.k(r1)
        L19:
            if (r1 != 0) goto La
        L1b:
            com.amazon.aps.iva.p0.f<java.lang.ref.Reference<T>> r1 = r0.a
            boolean r2 = r1.j()
            if (r2 == 0) goto L34
            int r2 = r1.d
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.l(r2)
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L1b
            goto L35
        L34:
            r1 = 0
        L35:
            com.amazon.aps.iva.u1.u0 r1 = (com.amazon.aps.iva.u1.u0) r1
            if (r1 == 0) goto L3d
            r1.d(r4, r5)
            return r1
        L3d:
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L50
            boolean r0 = r3.O
            if (r0 == 0) goto L50
            com.amazon.aps.iva.v1.e2 r0 = new com.amazon.aps.iva.v1.e2     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4d:
            r0 = 0
            r3.O = r0
        L50:
            com.amazon.aps.iva.v1.l1 r0 = r3.C
            if (r0 != 0) goto L88
            boolean r0 = androidx.compose.ui.platform.f.t
            if (r0 != 0) goto L64
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            androidx.compose.ui.platform.f.c.a(r0)
        L64:
            boolean r0 = androidx.compose.ui.platform.f.u
            java.lang.String r1 = "context"
            if (r0 == 0) goto L77
            com.amazon.aps.iva.v1.l1 r0 = new com.amazon.aps.iva.v1.l1
            android.content.Context r2 = r3.getContext()
            com.amazon.aps.iva.yb0.j.e(r2, r1)
            r0.<init>(r2)
            goto L83
        L77:
            com.amazon.aps.iva.v1.w2 r0 = new com.amazon.aps.iva.v1.w2
            android.content.Context r2 = r3.getContext()
            com.amazon.aps.iva.yb0.j.e(r2, r1)
            r0.<init>(r2)
        L83:
            r3.C = r0
            r3.addView(r0)
        L88:
            androidx.compose.ui.platform.f r0 = new androidx.compose.ui.platform.f
            com.amazon.aps.iva.v1.l1 r1 = r3.C
            com.amazon.aps.iva.yb0.j.c(r1)
            r0.<init>(r3, r1, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.g(androidx.compose.ui.node.o$h, com.amazon.aps.iva.xb0.l):com.amazon.aps.iva.u1.u0");
    }

    public final x0 getAndroidViewsHandler$ui_release() {
        if (this.B == null) {
            Context context = getContext();
            com.amazon.aps.iva.yb0.j.e(context, "context");
            x0 x0Var = new x0(context);
            this.B = x0Var;
            addView(x0Var);
        }
        x0 x0Var2 = this.B;
        com.amazon.aps.iva.yb0.j.c(x0Var2);
        return x0Var2;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.b1.b getAutofill() {
        return this.v;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.b1.g getAutofillTree() {
        return this.o;
    }

    public final com.amazon.aps.iva.xb0.l<Configuration, q> getConfigurationChangeObserver() {
        return this.u;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.C0;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.o2.c getDensity() {
        return this.e;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.d1.l getFocusOwner() {
        return this.f;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        q qVar;
        com.amazon.aps.iva.yb0.j.f(rect, "rect");
        com.amazon.aps.iva.e1.e k2 = getFocusOwner().k();
        if (k2 != null) {
            rect.left = com.amazon.aps.iva.ob0.f.a(k2.a);
            rect.top = com.amazon.aps.iva.ob0.f.a(k2.b);
            rect.right = com.amazon.aps.iva.ob0.f.a(k2.c);
            rect.bottom = com.amazon.aps.iva.ob0.f.a(k2.d);
            qVar = q.a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.p
    public k.a getFontFamilyResolver() {
        return (k.a) this.v0.getValue();
    }

    @Override // androidx.compose.ui.node.p
    public j.a getFontLoader() {
        return this.k0;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.l1.a getHapticFeedBack() {
        return this.y0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        boolean z;
        com.amazon.aps.iva.u1.n nVar = this.F.b;
        if (((com.amazon.aps.iva.u1.m) nVar.c).c.isEmpty() && ((com.amazon.aps.iva.u1.m) nVar.b).c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.m1.b getInputModeManager() {
        return this.z0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.L;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.p
    public com.amazon.aps.iva.o2.l getLayoutDirection() {
        return (com.amazon.aps.iva.o2.l) this.x0.getValue();
    }

    public long getMeasureIteration() {
        androidx.compose.ui.node.l lVar = this.F;
        if (lVar.c) {
            return lVar.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.t1.e getModifierLocalManager() {
        return this.A0;
    }

    @Override // androidx.compose.ui.node.p
    public w getPointerIconService() {
        return this.N0;
    }

    public androidx.compose.ui.node.e getRoot() {
        return this.k;
    }

    public h1 getRootForTest() {
        return this.l;
    }

    public u getSemanticsOwner() {
        return this.m;
    }

    @Override // androidx.compose.ui.node.p
    public a0 getSharedDrawScope() {
        return this.d;
    }

    @Override // androidx.compose.ui.node.p
    public boolean getShowLayoutBounds() {
        return this.A;
    }

    @Override // androidx.compose.ui.node.p
    public e1 getSnapshotObserver() {
        return this.z;
    }

    @Override // androidx.compose.ui.node.p
    public f0 getTextInputService() {
        return this.W;
    }

    @Override // androidx.compose.ui.node.p
    public k2 getTextToolbar() {
        return this.B0;
    }

    @Override // androidx.compose.ui.node.p
    public v2 getViewConfiguration() {
        return this.G;
    }

    public final b getViewTreeOwners() {
        return (b) this.Q.getValue();
    }

    @Override // androidx.compose.ui.node.p
    public a3 getWindowInfo() {
        return this.g;
    }

    @Override // androidx.compose.ui.node.p
    public final void h(com.amazon.aps.iva.xb0.a<q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.p0.f<com.amazon.aps.iva.xb0.a<q>> fVar = this.G0;
        if (!fVar.g(aVar)) {
            fVar.b(aVar);
        }
    }

    @Override // com.amazon.aps.iva.p1.j0
    public final long i(long j2) {
        E();
        return com.amazon.aps.iva.aq.k.u(this.K, com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.c.c(j2) - com.amazon.aps.iva.e1.c.c(this.N), com.amazon.aps.iva.e1.c.d(j2) - com.amazon.aps.iva.e1.c.d(this.N)));
    }

    @Override // androidx.compose.ui.node.p
    public final void j(a.b bVar) {
        androidx.compose.ui.node.l lVar = this.F;
        lVar.getClass();
        lVar.e.b(bVar);
        G(null);
    }

    @Override // androidx.compose.ui.node.p
    public final void k(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
    }

    @Override // androidx.compose.ui.node.p
    public final void l(androidx.compose.ui.node.e eVar, long j2) {
        boolean z;
        androidx.compose.ui.node.l lVar = this.F;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            lVar.g(eVar, j2);
            com.amazon.aps.iva.u1.n nVar = lVar.b;
            if (((com.amazon.aps.iva.u1.m) nVar.c).c.isEmpty() && ((com.amazon.aps.iva.u1.m) nVar.b).c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                lVar.a(false);
            }
            q qVar = q.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.p
    public final long m(long j2) {
        E();
        return com.amazon.aps.iva.aq.k.u(this.K, j2);
    }

    @Override // androidx.compose.ui.node.p
    public final void n(androidx.compose.ui.node.e eVar, boolean z, boolean z2, boolean z3) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        androidx.compose.ui.node.l lVar = this.F;
        if (z) {
            if (lVar.m(eVar, z2) && z3) {
                G(eVar);
            }
        } else if (lVar.o(eVar, z2) && z3) {
            G(eVar);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void o(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        androidx.compose.ui.node.l lVar = this.F;
        lVar.getClass();
        lVar.b.f(eVar);
        this.w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        com.amazon.aps.iva.i5.o oVar;
        androidx.lifecycle.g lifecycle;
        com.amazon.aps.iva.i5.o oVar2;
        super.onAttachedToWindow();
        z(getRoot());
        y(getRoot());
        getSnapshotObserver().a.d();
        com.amazon.aps.iva.b1.a aVar = this.v;
        if (aVar != null) {
            com.amazon.aps.iva.b1.e.a.a(aVar);
        }
        com.amazon.aps.iva.i5.o a2 = com.amazon.aps.iva.i5.i0.a(this);
        com.amazon.aps.iva.s8.c a3 = com.amazon.aps.iva.s8.d.a(this);
        b viewTreeOwners = getViewTreeOwners();
        int i2 = 1;
        if (viewTreeOwners != null && (a2 == null || a3 == null || (a2 == (oVar2 = viewTreeOwners.a) && a3 == oVar2))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (a2 != null) {
                if (a3 != null) {
                    if (viewTreeOwners != null && (oVar = viewTreeOwners.a) != null && (lifecycle = oVar.getLifecycle()) != null) {
                        lifecycle.removeObserver(this);
                    }
                    a2.getLifecycle().addObserver(this);
                    b bVar = new b(a2, a3);
                    set_viewTreeOwners(bVar);
                    com.amazon.aps.iva.xb0.l<? super b, q> lVar = this.R;
                    if (lVar != null) {
                        lVar.invoke(bVar);
                    }
                    this.R = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        if (!isInTouchMode()) {
            i2 = 2;
        }
        com.amazon.aps.iva.m1.c cVar = this.z0;
        cVar.getClass();
        cVar.b.setValue(new com.amazon.aps.iva.m1.a(i2));
        b viewTreeOwners2 = getViewTreeOwners();
        com.amazon.aps.iva.yb0.j.c(viewTreeOwners2);
        viewTreeOwners2.a.getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.S);
        getViewTreeObserver().addOnScrollChangedListener(this.T);
        getViewTreeObserver().addOnTouchModeChangeListener(this.U);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        x platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        x.b<?> bVar = platformTextInputPluginRegistry.b.get(platformTextInputPluginRegistry.c);
        if (bVar != null) {
            obj = bVar.a;
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        this.e = com.amazon.aps.iva.gr.n.i(context);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        if (i3 >= 31) {
            i2 = configuration.fontWeightAdjustment;
        } else {
            i2 = 0;
        }
        if (i2 != this.w0) {
            if (i3 >= 31) {
                i4 = configuration.fontWeightAdjustment;
            }
            this.w0 = i4;
            Context context2 = getContext();
            com.amazon.aps.iva.yb0.j.e(context2, "context");
            setFontFamilyResolver(com.amazon.aps.iva.h2.p.a(context2));
        }
        this.u.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        com.amazon.aps.iva.i2.u uVar;
        com.amazon.aps.iva.yb0.j.f(editorInfo, "outAttrs");
        x platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        x.b<?> bVar = platformTextInputPluginRegistry.b.get(platformTextInputPluginRegistry.c);
        if (bVar != null) {
            uVar = bVar.a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        return uVar.a(editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.amazon.aps.iva.i5.o oVar;
        androidx.lifecycle.g lifecycle;
        super.onDetachedFromWindow();
        com.amazon.aps.iva.y0.y yVar = getSnapshotObserver().a;
        com.amazon.aps.iva.y0.g gVar = yVar.g;
        if (gVar != null) {
            gVar.dispose();
        }
        yVar.b();
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (oVar = viewTreeOwners.a) != null && (lifecycle = oVar.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        com.amazon.aps.iva.b1.a aVar = this.v;
        if (aVar != null) {
            com.amazon.aps.iva.b1.e.a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        getViewTreeObserver().removeOnScrollChangedListener(this.T);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.U);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z) {
            getFocusOwner().b();
        } else {
            getFocusOwner().l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.F.f(this.K0);
        this.D = null;
        J();
        if (this.B != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        androidx.compose.ui.node.l lVar = this.F;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                z(getRoot());
            }
            long v = v(i2);
            long v2 = v(i3);
            long a2 = com.amazon.aps.iva.o2.b.a((int) (v >>> 32), (int) (v & 4294967295L), (int) (v2 >>> 32), (int) (4294967295L & v2));
            com.amazon.aps.iva.o2.a aVar = this.D;
            if (aVar == null) {
                this.D = new com.amazon.aps.iva.o2.a(a2);
                this.E = false;
            } else if (!com.amazon.aps.iva.o2.a.b(aVar.a, a2)) {
                this.E = true;
            }
            lVar.p(a2);
            lVar.h();
            setMeasuredDimension(getRoot().A.n.b, getRoot().A.n.c);
            if (this.B != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().A.n.b, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getRoot().A.n.c, Ints.MAX_POWER_OF_TWO));
            }
            q qVar = q.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        com.amazon.aps.iva.b1.a aVar;
        if (viewStructure != null && (aVar = this.v) != null) {
            com.amazon.aps.iva.b1.c cVar = com.amazon.aps.iva.b1.c.a;
            com.amazon.aps.iva.b1.g gVar = aVar.b;
            int a2 = cVar.a(viewStructure, gVar.a.size());
            for (Map.Entry entry : gVar.a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                com.amazon.aps.iva.b1.f fVar = (com.amazon.aps.iva.b1.f) entry.getValue();
                ViewStructure b2 = cVar.b(viewStructure, a2);
                if (b2 == null) {
                    a2++;
                } else {
                    com.amazon.aps.iva.b1.d dVar = com.amazon.aps.iva.b1.d.a;
                    AutofillId a3 = dVar.a(viewStructure);
                    com.amazon.aps.iva.yb0.j.c(a3);
                    dVar.g(b2, a3, intValue);
                    cVar.d(b2, intValue, aVar.a.getContext().getPackageName(), null, null);
                    dVar.h(b2, 1);
                    fVar.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.i5.g
    public final void onResume(com.amazon.aps.iva.i5.o oVar) {
        setShowLayoutBounds(a.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        com.amazon.aps.iva.o2.l lVar;
        if (this.c) {
            if (i2 != 0) {
                if (i2 != 1) {
                    lVar = com.amazon.aps.iva.o2.l.Ltr;
                } else {
                    lVar = com.amazon.aps.iva.o2.l.Rtl;
                }
            } else {
                lVar = com.amazon.aps.iva.o2.l.Ltr;
            }
            setLayoutDirection(lVar);
            getFocusOwner().f(lVar);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean a2;
        this.g.a.setValue(Boolean.valueOf(z));
        this.M0 = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (a2 = a.a())) {
            setShowLayoutBounds(a2);
            y(getRoot());
        }
    }

    @Override // com.amazon.aps.iva.p1.j0
    public final long p(long j2) {
        E();
        long u = com.amazon.aps.iva.aq.k.u(this.J, j2);
        return com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.c.c(this.N) + com.amazon.aps.iva.e1.c.c(u), com.amazon.aps.iva.e1.c.d(this.N) + com.amazon.aps.iva.e1.c.d(u));
    }

    @Override // androidx.compose.ui.node.p
    public final void q() {
        if (this.w) {
            com.amazon.aps.iva.y0.y yVar = getSnapshotObserver().a;
            com.amazon.aps.iva.u1.w0 w0Var = com.amazon.aps.iva.u1.w0.h;
            yVar.getClass();
            com.amazon.aps.iva.yb0.j.f(w0Var, "predicate");
            synchronized (yVar.f) {
                com.amazon.aps.iva.p0.f<y.a> fVar = yVar.f;
                int i2 = fVar.d;
                if (i2 > 0) {
                    y.a[] aVarArr = fVar.b;
                    int i3 = 0;
                    do {
                        aVarArr[i3].d(w0Var);
                        i3++;
                    } while (i3 < i2);
                    q qVar = q.a;
                } else {
                    q qVar2 = q.a;
                }
            }
            this.w = false;
        }
        x0 x0Var = this.B;
        if (x0Var != null) {
            u(x0Var);
        }
        while (this.G0.j()) {
            int i4 = this.G0.d;
            for (int i5 = 0; i5 < i4; i5++) {
                com.amazon.aps.iva.xb0.a<q>[] aVarArr2 = this.G0.b;
                com.amazon.aps.iva.xb0.a<q> aVar = aVarArr2[i5];
                aVarArr2[i5] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.G0.m(0, i4);
        }
    }

    @Override // androidx.compose.ui.node.p
    public final void r() {
        androidx.compose.ui.platform.a aVar = this.n;
        aVar.p = true;
        if (aVar.n() && !aVar.D) {
            aVar.D = true;
            aVar.g.post(aVar.E);
        }
    }

    public final void setConfigurationChangeObserver(com.amazon.aps.iva.xb0.l<? super Configuration, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        this.u = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.L = j2;
    }

    public final void setOnViewTreeOwnersAvailable(com.amazon.aps.iva.xb0.l<? super b, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "callback");
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.R = lVar;
        }
    }

    @Override // androidx.compose.ui.node.p
    public void setShowLayoutBounds(boolean z) {
        this.A = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x00ed, blocks: (B:3:0x0008, B:53:0x00e3, B:4:0x004b, B:6:0x0054, B:11:0x005f, B:13:0x0069, B:21:0x007c, B:33:0x0094, B:34:0x009a, B:37:0x00a4, B:24:0x0083, B:38:0x00b0, B:47:0x00c2, B:49:0x00c8, B:51:0x00d6, B:52:0x00d9), top: B:61:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x00ed, blocks: (B:3:0x0008, B:53:0x00e3, B:4:0x004b, B:6:0x0054, B:11:0x005f, B:13:0x0069, B:21:0x007c, B:33:0x0094, B:34:0x009a, B:37:0x00a4, B:24:0x0083, B:38:0x00b0, B:47:0x00c2, B:49:0x00c8, B:51:0x00d6, B:52:0x00d9), top: B:61:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x00ed, blocks: (B:3:0x0008, B:53:0x00e3, B:4:0x004b, B:6:0x0054, B:11:0x005f, B:13:0x0069, B:21:0x007c, B:33:0x0094, B:34:0x009a, B:37:0x00a4, B:24:0x0083, B:38:0x00b0, B:47:0x00c2, B:49:0x00c8, B:51:0x00d6, B:52:0x00d9), top: B:61:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.x(android.view.MotionEvent):int");
    }

    public final void z(androidx.compose.ui.node.e eVar) {
        int i2 = 0;
        this.F.o(eVar, false);
        com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> y = eVar.y();
        int i3 = y.d;
        if (i3 > 0) {
            androidx.compose.ui.node.e[] eVarArr = y.b;
            do {
                z(eVarArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.v1.k getAccessibilityManager() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.p
    public com.amazon.aps.iva.v1.l getClipboardManager() {
        return this.x;
    }

    @Override // androidx.compose.ui.node.p
    public x getPlatformTextInputPluginRegistry() {
        return this.V;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }
}
