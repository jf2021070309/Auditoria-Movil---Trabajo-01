package com.ellation.crunchyroll.ui.toolbarmenu.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.p3.a0;
import com.amazon.aps.iva.p3.y0;
import com.amazon.aps.iva.v1.m;
import com.amazon.aps.iva.wy.d;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuContentFactory;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ToolbarMenuDialog.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0007¢\u0006\u0004\bE\u0010FJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016R+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialog;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogView;", "", "Lcom/amazon/aps/iva/wy/k;", "setupPresenters", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Lcom/amazon/aps/iva/kb0/q;", "onStart", "Landroid/view/View;", "view", "onViewCreated", "displayContent", "positionDialogForRtl", "positionDialogForLtr", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuContentFactory;", "<set-?>", "contentFactory$delegate", "Lcom/amazon/aps/iva/xw/s;", "getContentFactory", "()Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuContentFactory;", "setContentFactory", "(Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuContentFactory;)V", "contentFactory", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "presenter$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogPresenter;", "presenter", "Landroid/widget/FrameLayout;", "dialogContainer$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getDialogContainer", "()Landroid/widget/FrameLayout;", "dialogContainer", "Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogButton;", "dialogMenuButton$delegate", "getDialogMenuButton", "()Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogButton;", "dialogMenuButton", "Landroid/graphics/Rect;", "anchor", "Landroid/graphics/Rect;", "Landroidx/fragment/app/Fragment;", "getContentFragment", "()Landroidx/fragment/app/Fragment;", "contentFragment", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuButtonDataProvider;", "getMenuButtonProvider", "()Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuButtonDataProvider;", "menuButtonProvider", "Landroid/graphics/Point;", "getDialogViewOffset", "()Landroid/graphics/Point;", "dialogViewOffset", "", "getArrowOffset", "()I", "arrowOffset", "getHalfOfTheArrowWidth", "halfOfTheArrowWidth", "", "getCanGoBack", "()Z", "canGoBack", "<init>", "()V", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToolbarMenuDialog extends d implements ToolbarMenuDialogView {
    private Rect anchor;
    private final s contentFactory$delegate;
    private final b dialogContainer$delegate;
    private final b dialogMenuButton$delegate;
    private final e presenter$delegate;
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {e.b(ToolbarMenuDialog.class, "contentFactory", "getContentFactory()Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuContentFactory;", 0), q.a(ToolbarMenuDialog.class, "dialogContainer", "getDialogContainer()Landroid/widget/FrameLayout;", 0), q.a(ToolbarMenuDialog.class, "dialogMenuButton", "getDialogMenuButton()Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialogButton;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ToolbarMenuDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/ui/toolbarmenu/dialog/ToolbarMenuDialog$Companion;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuContentFactory;", "contentFactory", "Landroidx/fragment/app/g;", "show", "<init>", "()V", "widgets_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final g show(FragmentManager fragmentManager, ToolbarMenuContentFactory toolbarMenuContentFactory) {
            j.f(fragmentManager, "fragmentManager");
            j.f(toolbarMenuContentFactory, "contentFactory");
            ToolbarMenuDialog toolbarMenuDialog = new ToolbarMenuDialog();
            toolbarMenuDialog.setContentFactory(toolbarMenuContentFactory);
            toolbarMenuDialog.show(fragmentManager, "menu_dialog");
            return toolbarMenuDialog;
        }
    }

    public ToolbarMenuDialog() {
        super(Integer.valueOf((int) R.layout.dialog_toolbar_menu));
        this.contentFactory$delegate = new s("menu_content_factory");
        this.presenter$delegate = f.b(new ToolbarMenuDialog$presenter$2(this));
        this.dialogContainer$delegate = com.amazon.aps.iva.xw.g.e(this, R.id.dialog_container);
        this.dialogMenuButton$delegate = com.amazon.aps.iva.xw.g.e(this, R.id.dialog_icon_settings);
    }

    private final int getArrowOffset() {
        return getResources().getDimensionPixelSize(R.dimen.popup_arrow_fixed_offset);
    }

    private final ToolbarMenuContentFactory getContentFactory() {
        return (ToolbarMenuContentFactory) this.contentFactory$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final Fragment getContentFragment() {
        return getChildFragmentManager().B(R.id.dialog_container);
    }

    private final FrameLayout getDialogContainer() {
        return (FrameLayout) this.dialogContainer$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ToolbarMenuDialogButton getDialogMenuButton() {
        return (ToolbarMenuDialogButton) this.dialogMenuButton$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final Point getDialogViewOffset() {
        View requireView = requireView();
        j.e(requireView, "requireView()");
        int[] iArr = new int[2];
        requireView.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    private final int getHalfOfTheArrowWidth() {
        return getResources().getDimensionPixelSize(R.dimen.popup_arrow_width) / 2;
    }

    private final ToolbarMenuButtonDataProvider getMenuButtonProvider() {
        h requireActivity = requireActivity();
        j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider");
        return (ToolbarMenuButtonDataProvider) requireActivity;
    }

    public final ToolbarMenuDialogPresenter getPresenter() {
        return (ToolbarMenuDialogPresenter) this.presenter$delegate.getValue();
    }

    public static final void onViewCreated$lambda$2(ToolbarMenuDialog toolbarMenuDialog) {
        j.f(toolbarMenuDialog, "this$0");
        toolbarMenuDialog.getMenuButtonProvider().getMenuButtonLiveData().e(toolbarMenuDialog, new ToolbarMenuDialog$sam$androidx_lifecycle_Observer$0(new ToolbarMenuDialog$onViewCreated$1$1(toolbarMenuDialog)));
    }

    public static final void onViewCreated$lambda$3(ToolbarMenuDialog toolbarMenuDialog, View view) {
        j.f(toolbarMenuDialog, "this$0");
        toolbarMenuDialog.getPresenter().onCancel();
    }

    public final void setContentFactory(ToolbarMenuContentFactory toolbarMenuContentFactory) {
        this.contentFactory$delegate.b(this, $$delegatedProperties[0], toolbarMenuContentFactory);
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogView
    public void displayContent() {
        Fragment createMenuContentFragment = getContentFactory().createMenuContentFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        a aVar = new a(childFragmentManager);
        aVar.e(R.id.dialog_container, createMenuContentFragment, null);
        aVar.h();
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogView
    public boolean getCanGoBack() {
        if (getContentFragment() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.ToolbarMenuDialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        y0.e cVar;
        y0 y0Var;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            a0 a0Var = new a0(window.getDecorView());
            if (Build.VERSION.SDK_INT >= 30) {
                cVar = new y0.d(window, a0Var);
            } else {
                cVar = new y0.c(window, a0Var);
            }
            h requireActivity = requireActivity();
            j.e(requireActivity, "requireActivity()");
            Window window2 = requireActivity.getWindow();
            if (window2 != null) {
                y0Var = new y0(window2, window2.getDecorView());
            } else {
                y0Var = null;
            }
            if (y0Var != null) {
                cVar.f(y0Var.a.a());
            }
            if (cVar.a() == 2) {
                cVar.b(7);
            }
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        getPresenter().onCreate(bundle);
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        if (k.n(requireContext).c()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new m(this, 1));
            view.findViewById(R.id.window_frame_container).setOnClickListener(new r(this, 19));
        }
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogView
    public void positionDialogForLtr() {
        FrameLayout dialogContainer = getDialogContainer();
        Rect rect = this.anchor;
        if (rect != null) {
            dialogContainer.setX((rect.exactCenterX() - getDialogContainer().getWidth()) + getArrowOffset() + getHalfOfTheArrowWidth());
            FrameLayout dialogContainer2 = getDialogContainer();
            Rect rect2 = this.anchor;
            if (rect2 != null) {
                dialogContainer2.setY(rect2.bottom - getDialogViewOffset().y);
                t0.h(getDialogContainer(), null, null, null, Integer.valueOf((int) getDialogContainer().getY()), 7);
                return;
            }
            j.m("anchor");
            throw null;
        }
        j.m("anchor");
        throw null;
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialogView
    public void positionDialogForRtl() {
        FrameLayout dialogContainer = getDialogContainer();
        Rect rect = this.anchor;
        if (rect != null) {
            dialogContainer.setX((rect.exactCenterX() - getArrowOffset()) - getHalfOfTheArrowWidth());
            FrameLayout dialogContainer2 = getDialogContainer();
            Rect rect2 = this.anchor;
            if (rect2 != null) {
                dialogContainer2.setY(rect2.bottom - getDialogViewOffset().y);
                t0.h(getDialogContainer(), null, null, null, Integer.valueOf((int) getDialogContainer().getY()), 7);
                return;
            }
            j.m("anchor");
            throw null;
        }
        j.m("anchor");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }
}
