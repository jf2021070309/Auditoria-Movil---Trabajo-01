package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.ee0.f1;
import java.util.List;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class y {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] a = {defpackage.e.b(y.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), defpackage.e.b(y.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), defpackage.e.b(y.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), defpackage.e.b(y.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), defpackage.e.b(y.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), defpackage.e.b(y.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), defpackage.e.b(y.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), defpackage.e.b(y.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), defpackage.e.b(y.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), defpackage.e.b(y.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), defpackage.e.b(y.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), defpackage.e.b(y.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), defpackage.e.b(y.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), defpackage.e.b(y.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), defpackage.e.b(y.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), defpackage.e.b(y.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), defpackage.e.b(y.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), defpackage.e.b(y.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), defpackage.e.b(y.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), defpackage.e.b(y.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        b0<List<String>> b0Var = v.a;
        b0<a<com.amazon.aps.iva.xb0.l<List<com.amazon.aps.iva.c2.y>, Boolean>>> b0Var2 = k.a;
    }

    public static void a(c0 c0Var, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        c0Var.b(k.a, new a(null, lVar));
    }

    public static final void b(c0 c0Var, String str, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        c0Var.b(k.b, new a(str, aVar));
    }

    public static final void c(c0 c0Var, String str) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "value");
        b0<List<String>> b0Var = v.a;
        c0Var.b(v.a, f1.J(str));
    }

    public static final void d(c0 c0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "$this$role");
        b0<List<String>> b0Var = v.a;
        v.s.a(c0Var, a[10], new i(i));
    }

    public static final void e(c0 c0Var, String str) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        v.t.a(c0Var, a[11], str);
    }
}
