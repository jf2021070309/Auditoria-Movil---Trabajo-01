package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.amazon.aps.iva.a2.b0;
import com.amazon.aps.iva.a2.r;
import com.amazon.aps.iva.a2.s;
import com.amazon.aps.iva.a2.v;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.m;
import com.amazon.aps.iva.v1.h2;
import com.amazon.aps.iva.v1.i2;
import com.amazon.aps.iva.v1.t;
import com.amazon.aps.iva.v1.u;
import com.amazon.aps.iva.y1.a;
import com.amazon.aps.iva.y1.h;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.p3.a {
    public static final int[] H = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public final com.amazon.aps.iva.k2.k A;
    public final LinkedHashMap B;
    public g C;
    public boolean D;
    public final com.amazon.aps.iva.e.d E;
    public final ArrayList F;
    public final j G;
    public final AndroidComposeView a;
    public int b;
    public final AccessibilityManager c;
    public final t d;
    public final u e;
    public List<AccessibilityServiceInfo> f;
    public final Handler g;
    public final m h;
    public int i;
    public final com.amazon.aps.iva.x.i<com.amazon.aps.iva.x.i<CharSequence>> j;
    public final com.amazon.aps.iva.x.i<Map<CharSequence, Integer>> k;
    public int l;
    public Integer m;
    public final com.amazon.aps.iva.x.b<androidx.compose.ui.node.e> n;
    public final com.amazon.aps.iva.ue0.a o;
    public boolean p;
    public com.amazon.aps.iva.y1.a q;
    public final com.amazon.aps.iva.x.a<Integer, com.amazon.aps.iva.y1.h> r;
    public final com.amazon.aps.iva.x.b<Integer> s;
    public f t;
    public Map<Integer, i2> u;
    public final com.amazon.aps.iva.x.b<Integer> v;
    public final HashMap<Integer, Integer> w;
    public final HashMap<Integer, Integer> x;
    public final String y;
    public final String z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* renamed from: androidx.compose.ui.platform.a$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC0021a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0021a() {
            a.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            com.amazon.aps.iva.y1.a aVar;
            ContentCaptureSession a;
            com.amazon.aps.iva.yb0.j.f(view, "view");
            a aVar2 = a.this;
            aVar2.c.addAccessibilityStateChangeListener(aVar2.d);
            aVar2.c.addTouchExplorationStateChangeListener(aVar2.e);
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                com.amazon.aps.iva.y1.g.a(view, 1);
            }
            if (i >= 29 && (a = com.amazon.aps.iva.y1.f.a(view)) != null) {
                aVar = new com.amazon.aps.iva.y1.a(a, view);
            } else {
                aVar = null;
            }
            aVar2.q = aVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
            a aVar = a.this;
            aVar.g.removeCallbacks(aVar.E);
            t tVar = aVar.d;
            AccessibilityManager accessibilityManager = aVar.c;
            accessibilityManager.removeAccessibilityStateChangeListener(tVar);
            accessibilityManager.removeTouchExplorationStateChangeListener(aVar.e);
            aVar.q = null;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static final void a(com.amazon.aps.iva.q3.l lVar, r rVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "info");
            com.amazon.aps.iva.yb0.j.f(rVar, "semanticsNode");
            if (androidx.compose.ui.platform.c.a(rVar)) {
                com.amazon.aps.iva.a2.a aVar = (com.amazon.aps.iva.a2.a) com.amazon.aps.iva.a2.m.a(rVar.d, com.amazon.aps.iva.a2.k.f);
                if (aVar != null) {
                    lVar.b(new l.a(16908349, aVar.a));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public static final void a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class d {
        public static final void a(com.amazon.aps.iva.q3.l lVar, r rVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "info");
            com.amazon.aps.iva.yb0.j.f(rVar, "semanticsNode");
            if (androidx.compose.ui.platform.c.a(rVar)) {
                b0<com.amazon.aps.iva.a2.a<com.amazon.aps.iva.xb0.a<Boolean>>> b0Var = com.amazon.aps.iva.a2.k.s;
                com.amazon.aps.iva.a2.l lVar2 = rVar.d;
                com.amazon.aps.iva.a2.a aVar = (com.amazon.aps.iva.a2.a) com.amazon.aps.iva.a2.m.a(lVar2, b0Var);
                if (aVar != null) {
                    lVar.b(new l.a(16908358, aVar.a));
                }
                com.amazon.aps.iva.a2.a aVar2 = (com.amazon.aps.iva.a2.a) com.amazon.aps.iva.a2.m.a(lVar2, com.amazon.aps.iva.a2.k.u);
                if (aVar2 != null) {
                    lVar.b(new l.a(16908359, aVar2.a));
                }
                com.amazon.aps.iva.a2.a aVar3 = (com.amazon.aps.iva.a2.a) com.amazon.aps.iva.a2.m.a(lVar2, com.amazon.aps.iva.a2.k.t);
                if (aVar3 != null) {
                    lVar.b(new l.a(16908360, aVar3.a));
                }
                com.amazon.aps.iva.a2.a aVar4 = (com.amazon.aps.iva.a2.a) com.amazon.aps.iva.a2.m.a(lVar2, com.amazon.aps.iva.a2.k.v);
                if (aVar4 != null) {
                    lVar.b(new l.a(16908361, aVar4.a));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public final class e extends AccessibilityNodeProvider {
        public e() {
            a.this = r1;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            com.amazon.aps.iva.yb0.j.f(accessibilityNodeInfo, "info");
            com.amazon.aps.iva.yb0.j.f(str, "extraDataKey");
            a.this.a(i, accessibilityNodeInfo, str, bundle);
        }

        /* JADX WARN: Code restructure failed: missing block: B:541:0x0163, code lost:
            if (r7.c == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:708:0x04cc, code lost:
            if (r0 == false) goto L202;
         */
        /* JADX WARN: Code restructure failed: missing block: B:793:0x0698, code lost:
            if (r11 != false) goto L420;
         */
        /* JADX WARN: Removed duplicated region for block: B:712:0x04d3  */
        /* JADX WARN: Removed duplicated region for block: B:826:0x075b  */
        /* JADX WARN: Removed duplicated region for block: B:829:0x0770  */
        /* JADX WARN: Removed duplicated region for block: B:832:0x077a  */
        /* JADX WARN: Removed duplicated region for block: B:867:0x0807  */
        /* JADX WARN: Removed duplicated region for block: B:870:0x0816  */
        /* JADX WARN: Removed duplicated region for block: B:871:0x081a  */
        /* JADX WARN: Removed duplicated region for block: B:874:0x0829  */
        /* JADX WARN: Removed duplicated region for block: B:915:0x0986  */
        /* JADX WARN: Removed duplicated region for block: B:916:0x098a  */
        /* JADX WARN: Removed duplicated region for block: B:921:0x09a9  */
        /* JADX WARN: Removed duplicated region for block: B:926:0x09d4  */
        /* JADX WARN: Removed duplicated region for block: B:929:0x09e6  */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r27) {
            /*
                Method dump skipped, instructions count: 2578
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.e.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:854:0x0566, code lost:
            if (r0 != 16) goto L463;
         */
        /* JADX WARN: Removed duplicated region for block: B:1028:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1032:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:570:0x00d5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:579:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:593:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:594:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:602:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:605:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:891:0x0647  */
        /* JADX WARN: Removed duplicated region for block: B:922:0x0698  */
        /* JADX WARN: Removed duplicated region for block: B:923:0x069b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:568:0x00d2 -> B:569:0x00d3). Please submit an issue!!! */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean performAction(int r20, int r21, android.os.Bundle r22) {
            /*
                Method dump skipped, instructions count: 1856
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.e.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class f {
        public final r a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public f(r rVar, int i, int i2, int i3, int i4, long j) {
            this.a = rVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class g {
        public final r a;
        public final com.amazon.aps.iva.a2.l b;
        public final LinkedHashSet c;

        public g(r rVar, Map<Integer, i2> map) {
            com.amazon.aps.iva.yb0.j.f(rVar, "semanticsNode");
            com.amazon.aps.iva.yb0.j.f(map, "currentSemanticsNodes");
            this.a = rVar;
            this.b = rVar.d;
            this.c = new LinkedHashSet();
            List<r> j = rVar.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                r rVar2 = j.get(i);
                if (map.containsKey(Integer.valueOf(rVar2.g))) {
                    this.c.add(Integer.valueOf(rVar2.g));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.b2.a.values().length];
            try {
                iArr[com.amazon.aps.iva.b2.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.b2.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.b2.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2195, 2228}, m = "boundsUpdatesEventLoop")
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.qb0.c {
        public a h;
        public com.amazon.aps.iva.x.b i;
        public com.amazon.aps.iva.ue0.h j;
        public /* synthetic */ Object k;
        public int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<h2, q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(1);
            a.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(h2 h2Var) {
            h2 h2Var2 = h2Var;
            com.amazon.aps.iva.yb0.j.f(h2Var2, "it");
            a aVar = a.this;
            aVar.getClass();
            if (h2Var2.y0()) {
                aVar.a.getSnapshotObserver().a(h2Var2, aVar.G, new androidx.compose.ui.platform.b(aVar, h2Var2));
            }
            return q.a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
        public static final k h = new k();

        public k() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0010, code lost:
            if (r2.c == true) goto L5;
         */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(androidx.compose.ui.node.e r2) {
            /*
                r1 = this;
                androidx.compose.ui.node.e r2 = (androidx.compose.ui.node.e) r2
                java.lang.String r0 = "it"
                com.amazon.aps.iva.yb0.j.f(r2, r0)
                com.amazon.aps.iva.a2.l r2 = r2.s()
                if (r2 == 0) goto L13
                boolean r2 = r2.c
                r0 = 1
                if (r2 != r0) goto L13
                goto L14
            L13:
                r0 = 0
            L14:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
        public static final l h = new l();

        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(androidx.compose.ui.node.e eVar) {
            androidx.compose.ui.node.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "it");
            return Boolean.valueOf(eVar2.z.d(8));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.amazon.aps.iva.v1.t] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.amazon.aps.iva.v1.u] */
    public a(AndroidComposeView androidComposeView) {
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "view");
        this.a = androidComposeView;
        this.b = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.c = accessibilityManager;
        this.d = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.amazon.aps.iva.v1.t
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                List<AccessibilityServiceInfo> list;
                androidx.compose.ui.platform.a aVar = androidx.compose.ui.platform.a.this;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                if (z) {
                    list = aVar.c.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = com.amazon.aps.iva.lb0.z.b;
                }
                aVar.f = list;
            }
        };
        this.e = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.amazon.aps.iva.v1.u
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                androidx.compose.ui.platform.a aVar = androidx.compose.ui.platform.a.this;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                aVar.f = aVar.c.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.g = new Handler(Looper.getMainLooper());
        this.h = new m(new e());
        this.i = Integer.MIN_VALUE;
        this.j = new com.amazon.aps.iva.x.i<>();
        this.k = new com.amazon.aps.iva.x.i<>();
        this.l = -1;
        this.n = new com.amazon.aps.iva.x.b<>();
        this.o = com.amazon.aps.iva.dg.b.c(-1, null, 6);
        this.p = true;
        this.r = new com.amazon.aps.iva.x.a<>();
        this.s = new com.amazon.aps.iva.x.b<>();
        a0 a0Var = a0.b;
        this.u = a0Var;
        this.v = new com.amazon.aps.iva.x.b<>();
        this.w = new HashMap<>();
        this.x = new HashMap<>();
        this.y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.A = new com.amazon.aps.iva.k2.k();
        this.B = new LinkedHashMap();
        this.C = new g(androidComposeView.getSemanticsOwner().a(), a0Var);
        androidComposeView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0021a());
        this.E = new com.amazon.aps.iva.e.d(this, 2);
        this.F = new ArrayList();
        this.G = new j();
    }

    public static /* synthetic */ void A(a aVar, int i2, int i3, Integer num, int i4) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        aVar.z(i2, i3, num, null);
    }

    public static final void G(a aVar, ArrayList arrayList, LinkedHashMap linkedHashMap, boolean z, r rVar) {
        com.amazon.aps.iva.a2.l h2 = rVar.h();
        b0<Boolean> b0Var = v.l;
        Boolean bool = Boolean.TRUE;
        boolean a = com.amazon.aps.iva.yb0.j.a((Boolean) com.amazon.aps.iva.a2.m.a(h2, b0Var), bool);
        int i2 = rVar.g;
        if ((a || aVar.o(rVar)) && aVar.h().keySet().contains(Integer.valueOf(i2))) {
            arrayList.add(rVar);
        }
        boolean a2 = com.amazon.aps.iva.yb0.j.a((Boolean) com.amazon.aps.iva.a2.m.a(rVar.h(), b0Var), bool);
        boolean z2 = rVar.b;
        if (a2) {
            linkedHashMap.put(Integer.valueOf(i2), aVar.F(x.Z0(rVar.g(!z2, false)), z));
            return;
        }
        List<r> g2 = rVar.g(!z2, false);
        int size = g2.size();
        for (int i3 = 0; i3 < size; i3++) {
            G(aVar, arrayList, linkedHashMap, z, g2.get(i3));
        }
    }

    public static CharSequence H(CharSequence charSequence) {
        boolean z;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i2);
                com.amazon.aps.iva.yb0.j.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
            return charSequence;
        }
        return charSequence;
    }

    public static boolean i(r rVar) {
        boolean z;
        com.amazon.aps.iva.b2.a aVar = (com.amazon.aps.iva.b2.a) com.amazon.aps.iva.a2.m.a(rVar.d, v.z);
        b0<com.amazon.aps.iva.a2.i> b0Var = v.s;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        com.amazon.aps.iva.a2.i iVar = (com.amazon.aps.iva.a2.i) com.amazon.aps.iva.a2.m.a(lVar, b0Var);
        boolean z2 = true;
        boolean z3 = false;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) com.amazon.aps.iva.a2.m.a(lVar, v.y);
        if (bool != null) {
            bool.booleanValue();
            if (iVar != null && iVar.a == 4) {
                z3 = true;
            }
            if (z3) {
                z2 = z;
            }
            return z2;
        }
        return z;
    }

    public static String l(r rVar) {
        com.amazon.aps.iva.c2.b bVar;
        if (rVar == null) {
            return null;
        }
        b0<List<String>> b0Var = v.a;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        if (lVar.d(b0Var)) {
            return z.t((List) lVar.e(b0Var), ",");
        }
        if (androidx.compose.ui.platform.c.i(rVar)) {
            com.amazon.aps.iva.c2.b m = m(lVar);
            if (m == null) {
                return null;
            }
            return m.b;
        }
        List list = (List) com.amazon.aps.iva.a2.m.a(lVar, v.u);
        if (list == null || (bVar = (com.amazon.aps.iva.c2.b) x.v0(list)) == null) {
            return null;
        }
        return bVar.b;
    }

    public static com.amazon.aps.iva.c2.b m(com.amazon.aps.iva.a2.l lVar) {
        return (com.amazon.aps.iva.c2.b) com.amazon.aps.iva.a2.m.a(lVar, v.v);
    }

    public static final boolean r(com.amazon.aps.iva.a2.j jVar, float f2) {
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        com.amazon.aps.iva.xb0.a<Float> aVar = jVar.a;
        if ((i2 < 0 && aVar.invoke().floatValue() > 0.0f) || (f2 > 0.0f && aVar.invoke().floatValue() < jVar.b.invoke().floatValue())) {
            return true;
        }
        return false;
    }

    public static final float s(float f2, float f3) {
        boolean z;
        if (Math.signum(f2) == Math.signum(f3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Math.abs(f2) >= Math.abs(f3)) {
                return f3;
            }
            return f2;
        }
        return 0.0f;
    }

    public static final boolean t(com.amazon.aps.iva.a2.j jVar) {
        com.amazon.aps.iva.xb0.a<Float> aVar = jVar.a;
        int i2 = (aVar.invoke().floatValue() > 0.0f ? 1 : (aVar.invoke().floatValue() == 0.0f ? 0 : -1));
        boolean z = jVar.c;
        if ((i2 > 0 && !z) || (aVar.invoke().floatValue() < jVar.b.invoke().floatValue() && z)) {
            return true;
        }
        return false;
    }

    public static final boolean u(com.amazon.aps.iva.a2.j jVar) {
        com.amazon.aps.iva.xb0.a<Float> aVar = jVar.a;
        int i2 = (aVar.invoke().floatValue() > jVar.b.invoke().floatValue() ? 1 : (aVar.invoke().floatValue() == jVar.b.invoke().floatValue() ? 0 : -1));
        boolean z = jVar.c;
        if ((i2 < 0 && !z) || (aVar.invoke().floatValue() > 0.0f && z)) {
            return true;
        }
        return false;
    }

    public final void B(int i2, int i3, String str) {
        AccessibilityEvent d2 = d(v(i2), 32);
        d2.setContentChangeTypes(i3);
        if (str != null) {
            d2.getText().add(str);
        }
        y(d2);
    }

    public final void C(int i2) {
        f fVar = this.t;
        if (fVar != null) {
            r rVar = fVar.a;
            if (i2 != rVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f <= 1000) {
                AccessibilityEvent d2 = d(v(rVar.g), 131072);
                d2.setFromIndex(fVar.d);
                d2.setToIndex(fVar.e);
                d2.setAction(fVar.b);
                d2.setMovementGranularity(fVar.c);
                d2.getText().add(l(rVar));
                y(d2);
            }
        }
        this.t = null;
    }

    public final void D(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.x.b<Integer> bVar) {
        com.amazon.aps.iva.a2.l s;
        androidx.compose.ui.node.e g2;
        if (!eVar.F() || this.a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(eVar)) {
            return;
        }
        if (!eVar.z.d(8)) {
            eVar = androidx.compose.ui.platform.c.g(eVar, l.h);
        }
        if (eVar != null && (s = eVar.s()) != null) {
            if (!s.c && (g2 = androidx.compose.ui.platform.c.g(eVar, k.h)) != null) {
                eVar = g2;
            }
            int i2 = eVar.c;
            if (!bVar.add(Integer.valueOf(i2))) {
                return;
            }
            A(this, v(i2), 2048, 1, 8);
        }
    }

    public final boolean E(r rVar, int i2, int i3, boolean z) {
        String l2;
        Integer num;
        Integer num2;
        b0<com.amazon.aps.iva.a2.a<com.amazon.aps.iva.xb0.q<Integer, Integer, Boolean, Boolean>>> b0Var = com.amazon.aps.iva.a2.k.g;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        boolean z2 = false;
        if (lVar.d(b0Var) && androidx.compose.ui.platform.c.a(rVar)) {
            com.amazon.aps.iva.xb0.q qVar = (com.amazon.aps.iva.xb0.q) ((com.amazon.aps.iva.a2.a) lVar.e(b0Var)).b;
            if (qVar == null) {
                return false;
            }
            return ((Boolean) qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } else if ((i2 == i3 && i3 == this.l) || (l2 = l(rVar)) == null) {
            return false;
        } else {
            this.l = (i2 < 0 || i2 != i3 || i3 > l2.length()) ? -1 : -1;
            if (l2.length() > 0) {
                z2 = true;
            }
            int i4 = rVar.g;
            int v = v(i4);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.l);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.l);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(l2.length());
            }
            y(e(v, num, num2, num3, l2));
            C(i4);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f5, code lost:
        if (r3 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList F(java.util.ArrayList r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.F(java.util.ArrayList, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r17, android.view.accessibility.AccessibilityNodeInfo r18, java.lang.String r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.a(int, android.view.accessibility.AccessibilityNodeInfo, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0072 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:67:0x002c, B:77:0x0057, B:81:0x006a, B:83:0x0072, B:86:0x0080, B:88:0x0085, B:89:0x0094, B:91:0x009b, B:92:0x00a4, B:72:0x0040), top: B:105:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ba  */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.amazon.aps.iva.ue0.h] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.amazon.aps.iva.ue0.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00b5 -> B:68:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r10, long r11, boolean r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.c(int, long, boolean):boolean");
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        com.amazon.aps.iva.yb0.j.e(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.a;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i2);
        i2 i2Var = h().get(Integer.valueOf(i2));
        if (i2Var != null) {
            obtain.setPassword(androidx.compose.ui.platform.c.c(i2Var.a));
        }
        return obtain;
    }

    public final AccessibilityEvent e(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent d2 = d(i2, 8192);
        if (num != null) {
            d2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            d2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            d2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            d2.getText().add(charSequence);
        }
        return d2;
    }

    public final int f(r rVar) {
        b0<List<String>> b0Var = v.a;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        if (!lVar.d(b0Var)) {
            b0<com.amazon.aps.iva.c2.z> b0Var2 = v.w;
            if (lVar.d(b0Var2)) {
                return com.amazon.aps.iva.c2.z.c(((com.amazon.aps.iva.c2.z) lVar.e(b0Var2)).a);
            }
        }
        return this.l;
    }

    public final int g(r rVar) {
        b0<List<String>> b0Var = v.a;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        if (!lVar.d(b0Var)) {
            b0<com.amazon.aps.iva.c2.z> b0Var2 = v.w;
            if (lVar.d(b0Var2)) {
                return (int) (((com.amazon.aps.iva.c2.z) lVar.e(b0Var2)).a >> 32);
            }
        }
        return this.l;
    }

    @Override // com.amazon.aps.iva.p3.a
    public final m getAccessibilityNodeProvider(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "host");
        return this.h;
    }

    public final Map<Integer, i2> h() {
        r rVar;
        if (this.p) {
            this.p = false;
            com.amazon.aps.iva.a2.u semanticsOwner = this.a.getSemanticsOwner();
            com.amazon.aps.iva.yb0.j.f(semanticsOwner, "<this>");
            r a = semanticsOwner.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            androidx.compose.ui.node.e eVar = a.c;
            if (eVar.G() && eVar.F()) {
                Region region = new Region();
                com.amazon.aps.iva.e1.e e2 = a.e();
                region.set(new Rect(com.amazon.aps.iva.ob0.f.a(e2.a), com.amazon.aps.iva.ob0.f.a(e2.b), com.amazon.aps.iva.ob0.f.a(e2.c), com.amazon.aps.iva.ob0.f.a(e2.d)));
                androidx.compose.ui.platform.c.h(region, a, linkedHashMap, a);
            }
            this.u = linkedHashMap;
            HashMap<Integer, Integer> hashMap = this.w;
            hashMap.clear();
            HashMap<Integer, Integer> hashMap2 = this.x;
            hashMap2.clear();
            i2 i2Var = h().get(-1);
            if (i2Var != null) {
                rVar = i2Var.a;
            } else {
                rVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(rVar);
            ArrayList F = F(f1.M(rVar), androidx.compose.ui.platform.c.d(rVar));
            int B = f1.B(F);
            int i2 = 1;
            if (1 <= B) {
                while (true) {
                    int i3 = ((r) F.get(i2 - 1)).g;
                    int i4 = ((r) F.get(i2)).g;
                    hashMap.put(Integer.valueOf(i3), Integer.valueOf(i4));
                    hashMap2.put(Integer.valueOf(i4), Integer.valueOf(i3));
                    if (i2 == B) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return this.u;
    }

    public final String j(r rVar) {
        Object string;
        boolean z;
        float floatValue;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.a2.l lVar = rVar.d;
        b0<List<String>> b0Var = v.a;
        Object a = com.amazon.aps.iva.a2.m.a(lVar, v.b);
        b0<com.amazon.aps.iva.b2.a> b0Var2 = v.z;
        com.amazon.aps.iva.a2.l lVar2 = rVar.d;
        com.amazon.aps.iva.b2.a aVar = (com.amazon.aps.iva.b2.a) com.amazon.aps.iva.a2.m.a(lVar2, b0Var2);
        com.amazon.aps.iva.a2.i iVar = (com.amazon.aps.iva.a2.i) com.amazon.aps.iva.a2.m.a(lVar2, v.s);
        AndroidComposeView androidComposeView = this.a;
        int i2 = 0;
        if (aVar != null) {
            int i3 = h.a[aVar.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3 && a == null) {
                        a = androidComposeView.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else {
                    if (iVar == null || iVar.a != 2) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5 && a == null) {
                        a = androidComposeView.getContext().getResources().getString(R.string.off);
                    }
                }
            } else {
                if (iVar == null || iVar.a != 2) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 && a == null) {
                    a = androidComposeView.getContext().getResources().getString(R.string.on);
                }
            }
        }
        Boolean bool = (Boolean) com.amazon.aps.iva.a2.m.a(lVar2, v.y);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (iVar == null || iVar.a != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 && a == null) {
                if (booleanValue) {
                    a = androidComposeView.getContext().getResources().getString(R.string.selected);
                } else {
                    a = androidComposeView.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        com.amazon.aps.iva.a2.h hVar = (com.amazon.aps.iva.a2.h) com.amazon.aps.iva.a2.m.a(lVar2, v.c);
        if (hVar != null) {
            com.amazon.aps.iva.a2.h hVar2 = com.amazon.aps.iva.a2.h.d;
            if (hVar != com.amazon.aps.iva.a2.h.d) {
                if (a == null) {
                    com.amazon.aps.iva.ec0.f<Float> fVar = hVar.b;
                    if (fVar.e().floatValue() - fVar.d().floatValue() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = (hVar.a - fVar.d().floatValue()) / (fVar.e().floatValue() - fVar.d().floatValue());
                    }
                    float i4 = com.amazon.aps.iva.aq.j.i(floatValue, 0.0f, 1.0f);
                    if (i4 == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (i4 == 1.0f) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            i2 = 100;
                        } else {
                            i2 = com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.ob0.f.a(i4 * 100), 1, 99);
                        }
                    }
                    string = androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i2));
                    a = string;
                }
            } else if (a == null) {
                string = androidComposeView.getContext().getResources().getString(R.string.in_progress);
                a = string;
            }
        }
        return (String) a;
    }

    public final SpannableString k(r rVar) {
        SpannableString spannableString;
        com.amazon.aps.iva.c2.b bVar;
        AndroidComposeView androidComposeView = this.a;
        k.a fontFamilyResolver = androidComposeView.getFontFamilyResolver();
        com.amazon.aps.iva.c2.b m = m(rVar.d);
        com.amazon.aps.iva.k2.k kVar = this.A;
        SpannableString spannableString2 = null;
        if (m != null) {
            spannableString = com.amazon.aps.iva.k2.a.a(m, androidComposeView.getDensity(), fontFamilyResolver, kVar);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) H(spannableString);
        List list = (List) com.amazon.aps.iva.a2.m.a(rVar.d, v.u);
        if (list != null && (bVar = (com.amazon.aps.iva.c2.b) x.v0(list)) != null) {
            spannableString2 = com.amazon.aps.iva.k2.a.a(bVar, androidComposeView.getDensity(), fontFamilyResolver, kVar);
        }
        SpannableString spannableString4 = (SpannableString) H(spannableString2);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    public final boolean n() {
        if (this.c.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.f;
            com.amazon.aps.iva.yb0.j.e(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(r rVar) {
        String str;
        boolean z;
        boolean z2;
        List list = (List) com.amazon.aps.iva.a2.m.a(rVar.d, v.a);
        if (list != null) {
            str = (String) x.v0(list);
        } else {
            str = null;
        }
        if (str == null && k(rVar) == null && j(rVar) == null && !i(rVar)) {
            z = false;
        } else {
            z = true;
        }
        if (rVar.d.c) {
            return true;
        }
        if (!rVar.e && rVar.j().isEmpty() && com.amazon.aps.iva.a2.t.b(rVar.c, s.h) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return true;
        }
        return false;
    }

    public final void p(androidx.compose.ui.node.e eVar) {
        if (this.n.add(eVar)) {
            this.o.h(q.a);
        }
    }

    public final void q(r rVar) {
        int i2;
        r i3;
        com.amazon.aps.iva.y1.h hVar;
        String e2;
        int i4 = rVar.g;
        com.amazon.aps.iva.y1.a aVar = this.q;
        com.amazon.aps.iva.y1.h hVar2 = null;
        if (aVar != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
            AutofillId a = com.amazon.aps.iva.y1.e.a(this.a);
            if (rVar.i() == null || (a = aVar.a(i3.g)) != null) {
                com.amazon.aps.iva.yb0.j.e(a, "if (parentNode != null) ….toAutofillId()\n        }");
                long j2 = rVar.g;
                if (i2 >= 29) {
                    hVar = new com.amazon.aps.iva.y1.h(a.C0880a.c(com.amazon.aps.iva.c8.b.g(aVar.a), a, j2));
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    b0<q> b0Var = v.A;
                    com.amazon.aps.iva.a2.l lVar = rVar.d;
                    if (!lVar.d(b0Var)) {
                        List list = (List) com.amazon.aps.iva.a2.m.a(lVar, v.u);
                        ViewStructure viewStructure = hVar.a;
                        if (list != null) {
                            h.a.a(viewStructure, "android.widget.TextView");
                            h.a.d(viewStructure, z.t(list, "\n"));
                        }
                        com.amazon.aps.iva.c2.b bVar = (com.amazon.aps.iva.c2.b) com.amazon.aps.iva.a2.m.a(lVar, v.v);
                        if (bVar != null) {
                            h.a.a(viewStructure, "android.widget.EditText");
                            h.a.d(viewStructure, bVar);
                        }
                        List list2 = (List) com.amazon.aps.iva.a2.m.a(lVar, v.a);
                        ViewStructure viewStructure2 = hVar.a;
                        if (list2 != null) {
                            h.a.b(viewStructure2, z.t(list2, "\n"));
                        }
                        com.amazon.aps.iva.a2.i iVar = (com.amazon.aps.iva.a2.i) com.amazon.aps.iva.a2.m.a(lVar, v.s);
                        if (iVar != null && (e2 = androidx.compose.ui.platform.c.e(iVar.a)) != null) {
                            h.a.a(viewStructure, e2);
                        }
                        com.amazon.aps.iva.e1.e f2 = rVar.f();
                        float f3 = f2.a;
                        float f4 = f2.b;
                        h.a.c(viewStructure2, (int) f3, (int) f4, 0, 0, (int) (f2.c - f3), (int) (f2.d - f4));
                        hVar2 = hVar;
                    }
                }
            }
        }
        if (hVar2 != null) {
            Integer valueOf = Integer.valueOf(i4);
            com.amazon.aps.iva.x.b<Integer> bVar2 = this.s;
            if (bVar2.contains(valueOf)) {
                bVar2.remove(Integer.valueOf(i4));
            } else {
                this.r.put(Integer.valueOf(i4), hVar2);
            }
        }
        List<r> j3 = rVar.j();
        int size = j3.size();
        for (int i5 = 0; i5 < size; i5++) {
            q(j3.get(i5));
        }
    }

    public final void updateHoveredVirtualView(int i2) {
        int i3 = this.b;
        if (i3 == i2) {
            return;
        }
        this.b = i2;
        A(this, i2, 128, null, 12);
        A(this, i3, 256, null, 12);
    }

    public final int v(int i2) {
        if (i2 == this.a.getSemanticsOwner().a().g) {
            return -1;
        }
        return i2;
    }

    public final void w(r rVar, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<r> j2 = rVar.j();
        int size = j2.size();
        int i2 = 0;
        while (true) {
            androidx.compose.ui.node.e eVar = rVar.c;
            if (i2 < size) {
                r rVar2 = j2.get(i2);
                if (h().containsKey(Integer.valueOf(rVar2.g))) {
                    LinkedHashSet linkedHashSet2 = gVar.c;
                    int i3 = rVar2.g;
                    if (!linkedHashSet2.contains(Integer.valueOf(i3))) {
                        p(eVar);
                        return;
                    }
                    linkedHashSet.add(Integer.valueOf(i3));
                }
                i2++;
            } else {
                for (Number number : gVar.c) {
                    if (!linkedHashSet.contains(Integer.valueOf(number.intValue()))) {
                        p(eVar);
                        return;
                    }
                }
                List<r> j3 = rVar.j();
                int size2 = j3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    r rVar3 = j3.get(i4);
                    if (h().containsKey(Integer.valueOf(rVar3.g))) {
                        Object obj = this.B.get(Integer.valueOf(rVar3.g));
                        com.amazon.aps.iva.yb0.j.c(obj);
                        w(rVar3, (g) obj);
                    }
                }
                return;
            }
        }
    }

    public final void x(r rVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "oldNode");
        List<r> j2 = rVar.j();
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar2 = j2.get(i2);
            if (h().containsKey(Integer.valueOf(rVar2.g)) && !gVar.c.contains(Integer.valueOf(rVar2.g))) {
                q(rVar2);
            }
        }
        LinkedHashMap linkedHashMap = this.B;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!h().containsKey(entry.getKey())) {
                int intValue = ((Number) entry.getKey()).intValue();
                com.amazon.aps.iva.x.a<Integer, com.amazon.aps.iva.y1.h> aVar = this.r;
                if (aVar.containsKey(Integer.valueOf(intValue))) {
                    aVar.remove(Integer.valueOf(intValue));
                } else {
                    this.s.add(Integer.valueOf(intValue));
                }
            }
        }
        List<r> j3 = rVar.j();
        int size2 = j3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            r rVar3 = j3.get(i3);
            if (h().containsKey(Integer.valueOf(rVar3.g))) {
                int i4 = rVar3.g;
                if (linkedHashMap.containsKey(Integer.valueOf(i4))) {
                    Object obj = linkedHashMap.get(Integer.valueOf(i4));
                    com.amazon.aps.iva.yb0.j.c(obj);
                    x(rVar3, (g) obj);
                }
            }
        }
    }

    public final boolean y(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        View view = this.a;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean z(int i2, int i3, Integer num, List<String> list) {
        if (i2 != Integer.MIN_VALUE && n()) {
            AccessibilityEvent d2 = d(i2, i3);
            if (num != null) {
                d2.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                d2.setContentDescription(z.t(list, ","));
            }
            return y(d2);
        }
        return false;
    }
}
