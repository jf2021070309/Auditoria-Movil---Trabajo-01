package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import android.content.Context;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.t;
import com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogPresenter;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToolbarMenuDialog$presenter$2 extends l implements a<ToolbarMenuDialogPresenter> {
    final /* synthetic */ ToolbarMenuDialog this$0;

    /* compiled from: ToolbarMenuDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog$presenter$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements a<Boolean> {
        final /* synthetic */ ToolbarMenuDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarMenuDialog toolbarMenuDialog) {
            super(0);
            this.this$0 = toolbarMenuDialog;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            Context requireContext = this.this$0.requireContext();
            j.e(requireContext, "requireContext()");
            return Boolean.valueOf(q.f(requireContext));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarMenuDialog$presenter$2(ToolbarMenuDialog toolbarMenuDialog) {
        super(0);
        this.this$0 = toolbarMenuDialog;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final ToolbarMenuDialogPresenter invoke() {
        ToolbarMenuDialogPresenter.Companion companion = ToolbarMenuDialogPresenter.Companion;
        ToolbarMenuDialog toolbarMenuDialog = this.this$0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarMenuDialog);
        Context requireContext = this.this$0.requireContext();
        j.e(requireContext, "requireContext()");
        return companion.create(toolbarMenuDialog, anonymousClass1, new t(k.n(requireContext)) { // from class: com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog$presenter$2.2
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.rv.a) this.receiver).c());
            }
        });
    }
}
