package com.ellation.crunchyroll.cast.expanded;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.k.a;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.rf.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.expanded.mature.ChromecastMatureFlowViewModelImpl;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuContentFactory;
import com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import kotlin.Metadata;
/* compiled from: CastControllerActivity.kt */
@Metadata(d1 = {"\u0000µ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0001U\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bv\u0010wJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0014J\b\u0010/\u001a\u00020\u0006H\u0002J#\u00103\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000600H\u0002¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u0010>R\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u0010KR\u001b\u0010O\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u0010KR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010qR\u0016\u0010u\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerActivity;", "Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerView;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuButtonDataProvider;", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "showSkipNextButton", "hideSkipNextButton", "finish", "", "title", "setTitle", MediaTrack.ROLE_SUBTITLE, "setSubtitle", "imageUrl", "loadImage", "close", "setOrientationPortrait", "hasFocus", "onWindowFocusChanged", "disableControls", "showRestrictedContentOverlay", "hideOverlay", "showUnavailableOverlay", "showComingSoonOverlay", "showPremiumOverlay", "showMatureBlockedOverlay", "Lcom/amazon/aps/iva/rf/c;", "premiumDubFormatter", "Lcom/amazon/aps/iva/rf/f;", "premiumDubUiModel", "showPremiumDubOverlay", "showLoadingOverlay", "Lcom/amazon/aps/iva/u70/i;", "message", "showSnackbar", "enableControls", "onDestroy", "bindSeekButtons", "Lkotlin/Function1;", "Lcom/amazon/aps/iva/a1/f;", "overlay", "showOverlay", "(Lcom/amazon/aps/iva/xb0/q;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", "titleText$delegate", "getTitleText", "()Landroid/widget/TextView;", "titleText", "episodeText$delegate", "getEpisodeText", "episodeText", "Landroid/widget/ImageView;", "backgroundImage$delegate", "getBackgroundImage", "()Landroid/widget/ImageView;", "backgroundImage", "Landroid/widget/ImageButton;", "rewindButton$delegate", "getRewindButton", "()Landroid/widget/ImageButton;", "rewindButton", "forwardButton$delegate", "getForwardButton", "forwardButton", "Landroidx/compose/ui/platform/ComposeView;", "castStateLayer$delegate", "getCastStateLayer", "()Landroidx/compose/ui/platform/ComposeView;", "castStateLayer", "com/ellation/crunchyroll/cast/expanded/CastControllerActivity$remoteMediaClientCallback$1", "remoteMediaClientCallback", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerActivity$remoteMediaClientCallback$1;", "Lcom/amazon/aps/iva/i5/v;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/MenuButtonData;", "menuButtonLiveData", "Lcom/amazon/aps/iva/i5/v;", "getMenuButtonLiveData", "()Lcom/amazon/aps/iva/i5/v;", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "viewModel$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getViewModel", "()Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModelImpl;", "viewModel", "Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "matureFlowViewModel$delegate", "getMatureFlowViewModel", "()Lcom/ellation/crunchyroll/cast/expanded/mature/ChromecastMatureFlowViewModelImpl;", "matureFlowViewModel", "Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "presenter$delegate", "getPresenter", "()Lcom/ellation/crunchyroll/cast/expanded/CastControllerPresenter;", "presenter", "Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter;", "restoreActivityStackPresenter$delegate", "getRestoreActivityStackPresenter", "()Lcom/ellation/crunchyroll/cast/expanded/RestoreActivityStackPresenter;", "restoreActivityStackPresenter", "getSkipNextMenuItem", "()Landroid/view/MenuItem;", "skipNextMenuItem", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastControllerActivity extends ExpandedControllerActivity implements CastControllerView, ToolbarMenuButtonDataProvider {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(CastControllerActivity.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(CastControllerActivity.class, "titleText", "getTitleText()Landroid/widget/TextView;", 0), q.a(CastControllerActivity.class, "episodeText", "getEpisodeText()Landroid/widget/TextView;", 0), q.a(CastControllerActivity.class, "backgroundImage", "getBackgroundImage()Landroid/widget/ImageView;", 0), q.a(CastControllerActivity.class, "rewindButton", "getRewindButton()Landroid/widget/ImageButton;", 0), q.a(CastControllerActivity.class, "forwardButton", "getForwardButton()Landroid/widget/ImageButton;", 0), q.a(CastControllerActivity.class, "castStateLayer", "getCastStateLayer()Landroidx/compose/ui/platform/ComposeView;", 0)};
    private final b toolbar$delegate = g.d(this, R.id.toolbar);
    private final b titleText$delegate = g.d(this, R.id.cast_controller_title);
    private final b episodeText$delegate = g.d(this, R.id.cast_controller_subtitle);
    private final b backgroundImage$delegate = g.d(this, R.id.primary_background_image_view);
    private final b rewindButton$delegate = g.d(this, R.id.button_1);
    private final b forwardButton$delegate = g.d(this, R.id.button_2);
    private final b castStateLayer$delegate = g.d(this, R.id.cast_overlays);
    private final CastControllerActivity$remoteMediaClientCallback$1 remoteMediaClientCallback = new RemoteMediaClient.Callback() { // from class: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$remoteMediaClientCallback$1
        @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
        public void onMetadataUpdated() {
            CastControllerViewModelImpl viewModel;
            viewModel = CastControllerActivity.this.getViewModel();
            viewModel.onMetaDataUpdated();
        }
    };
    private final v<MenuButtonData> menuButtonLiveData = new v<>();
    private final e viewModel$delegate = f.b(new CastControllerActivity$viewModel$2(this));
    private final e matureFlowViewModel$delegate = f.b(new CastControllerActivity$matureFlowViewModel$2(this));
    private final e presenter$delegate = f.b(new CastControllerActivity$presenter$2(this));
    private final e restoreActivityStackPresenter$delegate = f.b(new CastControllerActivity$restoreActivityStackPresenter$2(this));

    private final void bindSeekButtons() {
        getRewindButton().setContentDescription(getResources().getString(com.google.android.gms.cast.framework.R.string.cast_rewind_10));
        ImageButton rewindButton = getRewindButton();
        CastFeature.Companion companion = CastFeature.Companion;
        rewindButton.setImageResource(companion.getDependencies$cast_release().getResources().getRewindBackDrawableResId());
        getUIMediaController().bindViewToRewind(getRewindButton(), NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
        getForwardButton().setContentDescription(getResources().getString(com.google.android.gms.cast.framework.R.string.cast_rewind_10));
        getForwardButton().setImageResource(companion.getDependencies$cast_release().getResources().getFastForwardDrawableResId());
        getUIMediaController().bindViewToForward(getForwardButton(), NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
    }

    private final ImageView getBackgroundImage() {
        return (ImageView) this.backgroundImage$delegate.getValue(this, $$delegatedProperties[3]);
    }

    private final ComposeView getCastStateLayer() {
        return (ComposeView) this.castStateLayer$delegate.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getEpisodeText() {
        return (TextView) this.episodeText$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final ImageButton getForwardButton() {
        return (ImageButton) this.forwardButton$delegate.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChromecastMatureFlowViewModelImpl getMatureFlowViewModel() {
        return (ChromecastMatureFlowViewModelImpl) this.matureFlowViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CastControllerPresenter getPresenter() {
        return (CastControllerPresenter) this.presenter$delegate.getValue();
    }

    private final RestoreActivityStackPresenter getRestoreActivityStackPresenter() {
        return (RestoreActivityStackPresenter) this.restoreActivityStackPresenter$delegate.getValue();
    }

    private final ImageButton getRewindButton() {
        return (ImageButton) this.rewindButton$delegate.getValue(this, $$delegatedProperties[4]);
    }

    private final MenuItem getSkipNextMenuItem() {
        return getToolbar().getMenu().findItem(R.id.menu_item_next_episode);
    }

    private final TextView getTitleText() {
        return (TextView) this.titleText$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CastControllerViewModelImpl getViewModel() {
        return (CastControllerViewModelImpl) this.viewModel$delegate.getValue();
    }

    private final void showOverlay(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.a1.f, ? super i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar) {
        getCastStateLayer().setContent(com.amazon.aps.iva.v0.b.c(999411332, new CastControllerActivity$showOverlay$1(qVar), true));
    }

    @Override // com.amazon.aps.iva.c3.i, com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void close() {
        finish();
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void disableControls() {
        getRewindButton().setEnabled(false);
        getForwardButton().setEnabled(false);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void enableControls() {
        getRewindButton().setEnabled(true);
        getForwardButton().setEnabled(true);
    }

    @Override // android.app.Activity
    public void finish() {
        getRestoreActivityStackPresenter().restoreActivityStack(isTaskRoot());
        super.finish();
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void hideOverlay() {
        getCastStateLayer().setContent(ComposableSingletons$CastControllerActivityKt.INSTANCE.m28getLambda1$cast_release());
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void hideSkipNextButton() {
        MenuItem skipNextMenuItem = getSkipNextMenuItem();
        if (skipNextMenuItem != null) {
            skipNextMenuItem.setVisible(false);
        }
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void loadImage(String str) {
        j.f(str, "imageUrl");
        ImageUtil.INSTANCE.loadImageIntoView(this, str, getBackgroundImage());
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.d(this, true);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        RemoteMediaClient remoteMediaClient = getUIMediaController().getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.registerCallback(this.remoteMediaClientCallback);
        }
        com.ellation.crunchyroll.mvp.lifecycle.a.a(getPresenter(), this);
        bindSeekButtons();
        final Toolbar toolbar = getToolbar();
        toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$onCreate$1$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) Toolbar.this.findViewById(R.id.menu_item_settings);
                if (actionMenuItemView != null) {
                    v<MenuButtonData> menuButtonLiveData = this.getMenuButtonLiveData();
                    Rect rect = new Rect();
                    actionMenuItemView.getGlobalVisibleRect(rect);
                    menuButtonLiveData.k(new MenuButtonData(com.crunchyroll.crunchyroid.R.drawable.ic_player_settings, rect));
                    Toolbar.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        j.f(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.chromecast_only_menu, menu);
        CastButtonFactory.setUpMediaRouteButton(this, menu, R.id.menu_item_media_route);
        return true;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity, com.amazon.aps.iva.k.c, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RemoteMediaClient remoteMediaClient = getUIMediaController().getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.unregisterCallback(this.remoteMediaClientCallback);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        j.f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_next_episode) {
            getPresenter().onSkipNextClick();
            return true;
        } else if (itemId == R.id.menu_item_settings) {
            ToolbarMenuDialog.Companion companion = ToolbarMenuDialog.Companion;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            j.e(supportFragmentManager, "supportFragmentManager");
            companion.show(supportFragmentManager, new ToolbarMenuContentFactory() { // from class: com.ellation.crunchyroll.cast.expanded.CastControllerActivity$onOptionsItemSelected$1
                @Override // com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuContentFactory
                public Fragment createMenuContentFragment() {
                    return CastFeature.Companion.getDependencies$cast_release().getPlayerFeature().f();
                }
            });
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void setOrientationPortrait() {
        setRequestedOrientation(1);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void setSubtitle(String str) {
        j.f(str, MediaTrack.ROLE_SUBTITLE);
        getEpisodeText().setText(str);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void setTitle(String str) {
        j.f(str, "title");
        getTitleText().setText(str);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showComingSoonOverlay() {
        showOverlay(ComposableSingletons$CastControllerActivityKt.INSTANCE.m30getLambda3$cast_release());
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showLoadingOverlay() {
        showOverlay(ComposableSingletons$CastControllerActivityKt.INSTANCE.m31getLambda4$cast_release());
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showMatureBlockedOverlay() {
        showOverlay(com.amazon.aps.iva.v0.b.c(-2069997318, new CastControllerActivity$showMatureBlockedOverlay$1(this), true));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showPremiumDubOverlay(c cVar, com.amazon.aps.iva.rf.f fVar) {
        j.f(cVar, "premiumDubFormatter");
        j.f(fVar, "premiumDubUiModel");
        showOverlay(com.amazon.aps.iva.v0.b.c(584134987, new CastControllerActivity$showPremiumDubOverlay$1(fVar, cVar, this), true));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showPremiumOverlay() {
        showOverlay(com.amazon.aps.iva.v0.b.c(1386776077, new CastControllerActivity$showPremiumOverlay$1(this), true));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showRestrictedContentOverlay() {
        showOverlay(com.amazon.aps.iva.v0.b.c(825692372, new CastControllerActivity$showRestrictedContentOverlay$1(this), true));
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showSkipNextButton() {
        MenuItem skipNextMenuItem = getSkipNextMenuItem();
        if (skipNextMenuItem != null) {
            skipNextMenuItem.setVisible(true);
        }
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        j.f(iVar, "message");
        int i = h.a;
        View findViewById = findViewById(R.id.errors_layout);
        j.e(findViewById, "findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.ellation.crunchyroll.cast.expanded.CastControllerView
    public void showUnavailableOverlay() {
        showOverlay(ComposableSingletons$CastControllerActivityKt.INSTANCE.m29getLambda2$cast_release());
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider
    public v<MenuButtonData> getMenuButtonLiveData() {
        return this.menuButtonLiveData;
    }
}
