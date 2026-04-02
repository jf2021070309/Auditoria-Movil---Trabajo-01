package com.ellation.crunchyroll.cast.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.SeekBar;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.cast.dialog.CustomMediaRouteControllerDialog;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: CustomMediaRouteControllerDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u00060\u0018R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog;", "Landroidx/mediarouter/app/a;", "Lcom/amazon/aps/iva/kb0/q;", "setupVolumeControl", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/widget/SeekBar;", "volumeControl$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getVolumeControl", "()Landroid/widget/SeekBar;", "volumeControl", "Lcom/amazon/aps/iva/f8/f0;", "router", "Lcom/amazon/aps/iva/f8/f0;", "Lcom/amazon/aps/iva/f8/f0$h;", "selectedRoute", "Lcom/amazon/aps/iva/f8/f0$h;", "", "volumeSliderMap", "Ljava/util/Map;", "Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$MediaRouterCallback;", "callback", "Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$MediaRouterCallback;", "Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$VolumeChangeListener;", "volumeChangeListener", "Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$VolumeChangeListener;", "routeInVolumeSliderTouched", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "MediaRouterCallback", "VolumeChangeListener", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CustomMediaRouteControllerDialog extends androidx.mediarouter.app.a {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(CustomMediaRouteControllerDialog.class, "volumeControl", "getVolumeControl()Landroid/widget/SeekBar;", 0)};
    private final MediaRouterCallback callback;
    private f0.h routeInVolumeSliderTouched;
    private final f0 router;
    private final f0.h selectedRoute;
    private final VolumeChangeListener volumeChangeListener;
    private final b volumeControl$delegate;
    private final Map<f0.h, SeekBar> volumeSliderMap;

    /* compiled from: CustomMediaRouteControllerDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$MediaRouterCallback;", "Lcom/amazon/aps/iva/f8/f0$a;", "Lcom/amazon/aps/iva/f8/f0;", "router", "Lcom/amazon/aps/iva/f8/f0$h;", "route", "Lcom/amazon/aps/iva/kb0/q;", "onRouteVolumeChanged", "<init>", "(Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public final class MediaRouterCallback extends f0.a {
        public MediaRouterCallback() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public void onRouteVolumeChanged(f0 f0Var, f0.h hVar) {
            j.f(f0Var, "router");
            j.f(hVar, "route");
            SeekBar seekBar = (SeekBar) CustomMediaRouteControllerDialog.this.volumeSliderMap.get(hVar);
            if (seekBar != null && !j.a(CustomMediaRouteControllerDialog.this.routeInVolumeSliderTouched, hVar)) {
                seekBar.setProgress(hVar.o);
            }
        }
    }

    /* compiled from: CustomMediaRouteControllerDialog.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog$VolumeChangeListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "Lcom/amazon/aps/iva/kb0/q;", "onStartTrackingTouch", "onStopTrackingTouch", "", "progress", "", "fromUser", "onProgressChanged", "Ljava/lang/Runnable;", "stopTrackingTouch", "Ljava/lang/Runnable;", "<init>", "(Lcom/ellation/crunchyroll/cast/dialog/CustomMediaRouteControllerDialog;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public final class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        private final Runnable stopTrackingTouch;

        public VolumeChangeListener() {
            this.stopTrackingTouch = new Runnable() { // from class: com.ellation.crunchyroll.cast.dialog.a
                @Override // java.lang.Runnable
                public final void run() {
                    CustomMediaRouteControllerDialog.VolumeChangeListener.stopTrackingTouch$lambda$1(CustomMediaRouteControllerDialog.this);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void stopTrackingTouch$lambda$1(CustomMediaRouteControllerDialog customMediaRouteControllerDialog) {
            j.f(customMediaRouteControllerDialog, "this$0");
            f0.h hVar = customMediaRouteControllerDialog.routeInVolumeSliderTouched;
            if (hVar != null) {
                SeekBar seekBar = (SeekBar) customMediaRouteControllerDialog.volumeSliderMap.get(hVar);
                if (seekBar != null) {
                    seekBar.setProgress(hVar.o);
                }
                customMediaRouteControllerDialog.routeInVolumeSliderTouched = null;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            j.f(seekBar, "seekBar");
            if (z) {
                Object tag = seekBar.getTag();
                j.d(tag, "null cannot be cast to non-null type androidx.mediarouter.media.MediaRouter.RouteInfo");
                f0.h hVar = (f0.h) tag;
                if (hVar.o != i) {
                    hVar.l(i);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            j.f(seekBar, "seekBar");
            if (CustomMediaRouteControllerDialog.this.routeInVolumeSliderTouched != null) {
                CustomMediaRouteControllerDialog.this.getVolumeControl().removeCallbacks(this.stopTrackingTouch);
            }
            CustomMediaRouteControllerDialog customMediaRouteControllerDialog = CustomMediaRouteControllerDialog.this;
            Object tag = seekBar.getTag();
            j.d(tag, "null cannot be cast to non-null type androidx.mediarouter.media.MediaRouter.RouteInfo");
            customMediaRouteControllerDialog.routeInVolumeSliderTouched = (f0.h) tag;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            j.f(seekBar, "seekBar");
            CustomMediaRouteControllerDialog.this.getVolumeControl().postDelayed(this.stopTrackingTouch, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMediaRouteControllerDialog(Context context) {
        super(context);
        j.f(context, "context");
        this.volumeControl$delegate = g.h(R.id.volume_control, k.h);
        this.router = f0.d(context);
        f0.h g = f0.g();
        j.e(g, "router.selectedRoute");
        this.selectedRoute = g;
        this.volumeSliderMap = new HashMap();
        this.callback = new MediaRouterCallback();
        this.volumeChangeListener = new VolumeChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeekBar getVolumeControl() {
        return (SeekBar) this.volumeControl$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupVolumeControl() {
        SeekBar volumeControl = getVolumeControl();
        volumeControl.setOnSeekBarChangeListener(this.volumeChangeListener);
        volumeControl.setTag(this.selectedRoute);
        volumeControl.setMax(this.selectedRoute.p);
        volumeControl.setProgress(this.selectedRoute.o);
        this.volumeSliderMap.put(this.selectedRoute, getVolumeControl());
    }

    @Override // androidx.mediarouter.app.a, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.router.a(e0.c, this.callback, 2);
    }

    @Override // androidx.mediarouter.app.a, androidx.appcompat.app.e, com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(getContext().getResources().getDimensionPixelSize(R.dimen.dialog_media_route_width), -2);
        }
        setupVolumeControl();
    }

    @Override // androidx.mediarouter.app.a, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.router.i(this.callback);
    }
}
