package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public class a extends androidx.appcompat.app.e {
    static final int BUTTON_DISCONNECT_RES_ID = 16908314;
    private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
    static final int BUTTON_STOP_RES_ID = 16908313;
    static final int CONNECTION_TIMEOUT_MILLIS;
    static final boolean DEBUG = false;
    static final String TAG = "MediaRouteCtrlDialog";
    static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
    private Interpolator mAccelerateDecelerateInterpolator;
    final AccessibilityManager mAccessibilityManager;
    int mArtIconBackgroundColor;
    Bitmap mArtIconBitmap;
    boolean mArtIconIsLoaded;
    Bitmap mArtIconLoadedBitmap;
    Uri mArtIconUri;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final p mCallback;
    private ImageButton mCloseButton;
    Context mContext;
    o mControllerCallback;
    private boolean mCreated;
    private FrameLayout mCustomControlLayout;
    private View mCustomControlView;
    FrameLayout mDefaultControlLayout;
    MediaDescriptionCompat mDescription;
    private LinearLayout mDialogAreaLayout;
    private int mDialogContentWidth;
    private Button mDisconnectButton;
    private View mDividerView;
    final boolean mEnableGroupVolumeUX;
    private FrameLayout mExpandableAreaLayout;
    private Interpolator mFastOutSlowInInterpolator;
    n mFetchArtTask;
    private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
    int mGroupListAnimationDurationMs;
    Runnable mGroupListFadeInAnimation;
    private int mGroupListFadeInDurationMs;
    private int mGroupListFadeOutDurationMs;
    private List<f0.h> mGroupMemberRoutes;
    Set<f0.h> mGroupMemberRoutesAdded;
    Set<f0.h> mGroupMemberRoutesAnimatingWithBitmap;
    private Set<f0.h> mGroupMemberRoutesRemoved;
    boolean mHasPendingUpdate;
    private Interpolator mInterpolator;
    boolean mIsGroupExpanded;
    boolean mIsGroupListAnimating;
    boolean mIsGroupListAnimationPending;
    private Interpolator mLinearOutSlowInInterpolator;
    MediaControllerCompat mMediaController;
    private LinearLayout mMediaMainControlLayout;
    boolean mPendingUpdateAnimationNeeded;
    private ImageButton mPlaybackControlButton;
    private RelativeLayout mPlaybackControlLayout;
    final f0.h mRoute;
    f0.h mRouteInVolumeSliderTouched;
    private TextView mRouteNameTextView;
    final f0 mRouter;
    PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    q mVolumeChangeListener;
    private boolean mVolumeControlEnabled;
    LinearLayout mVolumeControlLayout;
    r mVolumeGroupAdapter;
    OverlayListView mVolumeGroupList;
    private int mVolumeGroupListItemHeight;
    private int mVolumeGroupListItemIconSize;
    private int mVolumeGroupListMaxHeight;
    private final int mVolumeGroupListPaddingTop;
    SeekBar mVolumeSlider;
    Map<f0.h, SeekBar> mVolumeSliderMap;

    /* compiled from: MediaRouteControllerDialog.java */
    /* renamed from: androidx.mediarouter.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040a implements OverlayListView.a.InterfaceC0039a {
        public final /* synthetic */ f0.h a;

        public C0040a(f0.h hVar) {
            this.a = hVar;
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = a.this;
            aVar.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            aVar.startGroupListFadeInAnimationInternal();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.startGroupListFadeInAnimation();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PendingIntent sessionActivity;
            a aVar = a.this;
            MediaControllerCompat mediaControllerCompat = aVar.mMediaController;
            if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.a.a.getSessionActivity()) != null) {
                try {
                    sessionActivity.send();
                    aVar.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    sessionActivity.toString();
                }
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            boolean z = !aVar.mIsGroupExpanded;
            aVar.mIsGroupExpanded = z;
            if (z) {
                aVar.mVolumeGroupList.setVisibility(0);
            }
            aVar.loadInterpolator();
            aVar.updateLayoutHeight(true);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class i implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ boolean b;

        public i(boolean z) {
            this.b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = a.this;
            aVar.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (aVar.mIsGroupListAnimating) {
                aVar.mIsGroupListAnimationPending = true;
            } else {
                aVar.updateLayoutHeightInternal(this.b);
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class j extends Animation {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ View d;

        public j(int i, int i2, View view) {
            this.b = i;
            this.c = i2;
            this.d = view;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            int i = this.c;
            int i2 = this.b;
            a.setLayoutHeight(this.d, i2 - ((int) ((i2 - i) * f)));
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class k implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Map b;
        public final /* synthetic */ Map c;

        public k(Map map, Map map2) {
            this.b = map;
            this.c = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = a.this;
            aVar.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            aVar.animateGroupListItemsInternal(this.b, this.c);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public final class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            int i = 1;
            a aVar = a.this;
            if (id != a.BUTTON_STOP_RES_ID && id != a.BUTTON_DISCONNECT_RES_ID) {
                if (id == R.id.mr_control_playback_ctrl) {
                    if (aVar.mMediaController != null && (playbackStateCompat = aVar.mState) != null) {
                        int i2 = 0;
                        if (playbackStateCompat.b != 3) {
                            i = 0;
                        }
                        if (i != 0 && aVar.isPauseActionSupported()) {
                            aVar.mMediaController.c().a.pause();
                            i2 = R.string.mr_controller_pause;
                        } else if (i != 0 && aVar.isStopActionSupported()) {
                            aVar.mMediaController.c().a.stop();
                            i2 = R.string.mr_controller_stop;
                        } else if (i == 0 && aVar.isPlayActionSupported()) {
                            aVar.mMediaController.c().a.play();
                            i2 = R.string.mr_controller_play;
                        }
                        AccessibilityManager accessibilityManager = aVar.mAccessibilityManager;
                        if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain((int) Http2.INITIAL_MAX_FRAME_SIZE);
                            obtain.setPackageName(aVar.mContext.getPackageName());
                            obtain.setClassName(m.class.getName());
                            obtain.getText().add(aVar.mContext.getString(i2));
                            aVar.mAccessibilityManager.sendAccessibilityEvent(obtain);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (id == R.id.mr_close) {
                    aVar.dismiss();
                    return;
                } else {
                    return;
                }
            }
            if (aVar.mRoute.i()) {
                f0 f0Var = aVar.mRouter;
                if (id == a.BUTTON_STOP_RES_ID) {
                    i = 2;
                }
                f0Var.getClass();
                f0.l(i);
            }
            aVar.dismiss();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class n extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;
        public long d;

        public n() {
            Bitmap bitmap;
            MediaDescriptionCompat mediaDescriptionCompat = a.this.mDescription;
            if (mediaDescriptionCompat == null) {
                bitmap = null;
            } else {
                bitmap = mediaDescriptionCompat.f;
            }
            this.a = a.isBitmapRecycled(bitmap) ? null : bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = a.this.mDescription;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.g : null;
        }

        public final BufferedInputStream a(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!"android.resource".equals(lowerCase) && !FirebaseAnalytics.Param.CONTENT.equals(lowerCase) && !"file".equals(lowerCase)) {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i = a.CONNECTION_TIMEOUT_MILLIS;
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                openInputStream = openConnection.getInputStream();
            } else {
                openInputStream = a.this.mContext.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x006e: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:33:0x006e */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.graphics.Bitmap doInBackground(java.lang.Void[] r9) {
            /*
                r8 = this;
                java.lang.Void[] r9 = (java.lang.Void[]) r9
                r9 = 0
                r0 = 1
                r1 = 0
                android.graphics.Bitmap r2 = r8.a
                if (r2 == 0) goto Lb
                goto L83
            Lb:
                android.net.Uri r2 = r8.b
                if (r2 == 0) goto L82
                java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
                if (r3 != 0) goto L1b
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r3 == 0) goto Lc0
                goto L69
            L1b:
                android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                r4.<init>()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                r4.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r5 = r4.outWidth     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r5 == 0) goto L69
                int r5 = r4.outHeight     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r5 != 0) goto L2e
                goto L69
            L2e:
                r3.reset()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L6d
                goto L41
            L32:
                r3.close()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r3 != 0) goto L41
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r3 == 0) goto Lc0
                goto L69
            L41:
                r4.inJustDecodeBounds = r9     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                androidx.mediarouter.app.a r5 = androidx.mediarouter.app.a.this     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r6 = r4.outWidth     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r7 = r4.outHeight     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r5 = r5.getDesiredArtHeight(r6, r7)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r6 = r4.outHeight     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r6 = r6 / r5
                int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                int r5 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                r4.inSampleSize = r5     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                boolean r5 = r8.isCancelled()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                if (r5 == 0) goto L61
                goto L69
            L61:
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L73
                r3.close()     // Catch: java.io.IOException -> L83
                goto L83
            L69:
                r3.close()     // Catch: java.io.IOException -> Lc0
                goto Lc0
            L6d:
                r9 = move-exception
                r1 = r3
                goto L7c
            L70:
                r9 = move-exception
                goto L7c
            L72:
                r3 = r1
            L73:
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L6d
                if (r3 == 0) goto L82
                r3.close()     // Catch: java.io.IOException -> L82
                goto L82
            L7c:
                if (r1 == 0) goto L81
                r1.close()     // Catch: java.io.IOException -> L81
            L81:
                throw r9
            L82:
                r2 = r1
            L83:
                boolean r3 = androidx.mediarouter.app.a.isBitmapRecycled(r2)
                if (r3 == 0) goto L8d
                java.util.Objects.toString(r2)
                goto Lc0
            L8d:
                if (r2 == 0) goto Lbf
                int r1 = r2.getWidth()
                int r3 = r2.getHeight()
                if (r1 >= r3) goto Lbf
                com.amazon.aps.iva.k8.b$b r1 = new com.amazon.aps.iva.k8.b$b
                r1.<init>(r2)
                r1.c = r0
                com.amazon.aps.iva.k8.b r0 = r1.a()
                java.util.List<com.amazon.aps.iva.k8.b$d> r0 = r0.a
                java.util.List r1 = java.util.Collections.unmodifiableList(r0)
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lb1
                goto Lbd
            Lb1:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.Object r9 = r0.get(r9)
                com.amazon.aps.iva.k8.b$d r9 = (com.amazon.aps.iva.k8.b.d) r9
                int r9 = r9.d
            Lbd:
                r8.c = r9
            Lbf:
                r1 = r2
            Lc0:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.n.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            a aVar = a.this;
            aVar.mFetchArtTask = null;
            Bitmap bitmap3 = aVar.mArtIconBitmap;
            Bitmap bitmap4 = this.a;
            boolean a = com.amazon.aps.iva.o3.b.a(bitmap3, bitmap4);
            Uri uri = this.b;
            if (!a || !com.amazon.aps.iva.o3.b.a(aVar.mArtIconUri, uri)) {
                aVar.mArtIconBitmap = bitmap4;
                aVar.mArtIconLoadedBitmap = bitmap2;
                aVar.mArtIconUri = uri;
                aVar.mArtIconBackgroundColor = this.c;
                boolean z = true;
                aVar.mArtIconIsLoaded = true;
                if (SystemClock.uptimeMillis() - this.d <= 120) {
                    z = false;
                }
                aVar.update(z);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            a.this.clearLoadedBitmap();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public final class o extends MediaControllerCompat.a {
        public o() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat b;
            if (mediaMetadataCompat == null) {
                b = null;
            } else {
                b = mediaMetadataCompat.b();
            }
            a aVar = a.this;
            aVar.mDescription = b;
            aVar.updateArtIconIfNeeded();
            aVar.update(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            a aVar = a.this;
            aVar.mState = playbackStateCompat;
            aVar.update(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void onSessionDestroyed() {
            a aVar = a.this;
            MediaControllerCompat mediaControllerCompat = aVar.mMediaController;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.e(aVar.mControllerCallback);
                aVar.mMediaController = null;
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public final class p extends f0.a {
        public p() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteChanged(f0 f0Var, f0.h hVar) {
            a.this.update(true);
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteUnselected(f0 f0Var, f0.h hVar) {
            a.this.update(false);
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteVolumeChanged(f0 f0Var, f0.h hVar) {
            a aVar = a.this;
            SeekBar seekBar = aVar.mVolumeSliderMap.get(hVar);
            int i = hVar.o;
            String str = a.TAG;
            if (seekBar != null && aVar.mRouteInVolumeSliderTouched != hVar) {
                seekBar.setProgress(i);
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class q implements SeekBar.OnSeekBarChangeListener {
        public final RunnableC0041a b = new RunnableC0041a();

        /* compiled from: MediaRouteControllerDialog.java */
        /* renamed from: androidx.mediarouter.app.a$q$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0041a implements Runnable {
            public RunnableC0041a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (aVar.mRouteInVolumeSliderTouched != null) {
                    aVar.mRouteInVolumeSliderTouched = null;
                    if (aVar.mHasPendingUpdate) {
                        aVar.update(aVar.mPendingUpdateAnimationNeeded);
                    }
                }
            }
        }

        public q() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                String str = a.TAG;
                ((f0.h) seekBar.getTag()).l(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            a aVar = a.this;
            if (aVar.mRouteInVolumeSliderTouched != null) {
                aVar.mVolumeSlider.removeCallbacks(this.b);
            }
            aVar.mRouteInVolumeSliderTouched = (f0.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            a.this.mVolumeSlider.postDelayed(this.b, 500L);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class r extends ArrayAdapter<f0.h> {
        public final float b;

        public r(Context context, List<f0.h> list) {
            super(context, 0, list);
            this.b = androidx.mediarouter.app.d.d(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            a aVar = a.this;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                aVar.updateVolumeGroupItemHeight(view);
            }
            f0.h item = getItem(i);
            if (item != null) {
                boolean z = item.g;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z);
                textView.setText(item.d);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                androidx.mediarouter.app.d.l(viewGroup.getContext(), mediaRouteVolumeSlider, aVar.mVolumeGroupList);
                mediaRouteVolumeSlider.setTag(item);
                aVar.mVolumeSliderMap.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.b(!z);
                mediaRouteVolumeSlider.setEnabled(z);
                if (z) {
                    if (aVar.isVolumeControlAvailable(item)) {
                        mediaRouteVolumeSlider.setMax(item.p);
                        mediaRouteVolumeSlider.setProgress(item.o);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(aVar.mVolumeChangeListener);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
                if (z) {
                    i2 = 255;
                } else {
                    i2 = (int) (this.b * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
                if (aVar.mGroupMemberRoutesAnimatingWithBitmap.contains(item)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                Set<f0.h> set = aVar.mGroupMemberRoutesAdded;
                if (set != null && set.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return false;
        }
    }

    static {
        Log.isLoggable(TAG, 3);
        CONNECTION_TIMEOUT_MILLIS = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    public a(Context context) {
        this(context, 0);
    }

    private void animateGroupListItems(Map<f0.h, Rect> map, Map<f0.h, BitmapDrawable> map2) {
        this.mVolumeGroupList.setEnabled(false);
        this.mVolumeGroupList.requestLayout();
        this.mIsGroupListAnimating = true;
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    private void animateLayoutHeight(View view, int i2) {
        j jVar = new j(getLayoutHeight(view), i2, view);
        jVar.setDuration(this.mGroupListAnimationDurationMs);
        jVar.setInterpolator(this.mInterpolator);
        view.startAnimation(jVar);
    }

    private boolean canShowPlaybackControlLayout() {
        if (this.mCustomControlView == null && (this.mDescription != null || this.mState != null)) {
            return true;
        }
        return false;
    }

    private void fadeInAddedRoutes() {
        c cVar = new c();
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i2 = 0; i2 < this.mVolumeGroupList.getChildCount(); i2++) {
            View childAt = this.mVolumeGroupList.getChildAt(i2);
            if (this.mGroupMemberRoutesAdded.contains(this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(cVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private static int getLayoutHeight(View view) {
        return view.getLayoutParams().height;
    }

    private int getMainControllerHeight(boolean z) {
        int i2;
        if (!z && this.mVolumeControlLayout.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.mMediaMainControlLayout.getPaddingBottom() + this.mMediaMainControlLayout.getPaddingTop() + 0;
        if (z) {
            paddingBottom += this.mPlaybackControlLayout.getMeasuredHeight();
        }
        if (this.mVolumeControlLayout.getVisibility() == 0) {
            i2 = this.mVolumeControlLayout.getMeasuredHeight() + paddingBottom;
        } else {
            i2 = paddingBottom;
        }
        if (z && this.mVolumeControlLayout.getVisibility() == 0) {
            return i2 + this.mDividerView.getMeasuredHeight();
        }
        return i2;
    }

    public static boolean isBitmapRecycled(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            return true;
        }
        return false;
    }

    private boolean isGroup() {
        if (this.mRoute.g() && this.mRoute.c().size() > 1) {
            return true;
        }
        return false;
    }

    private boolean isIconChanged() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.g;
        }
        n nVar = this.mFetchArtTask;
        if (nVar == null) {
            bitmap2 = this.mArtIconBitmap;
        } else {
            bitmap2 = nVar.a;
        }
        if (nVar == null) {
            uri = this.mArtIconUri;
        } else {
            uri = nVar.b;
        }
        if (bitmap2 != bitmap) {
            return true;
        }
        if (bitmap2 == null && !uriEquals(uri, uri2)) {
            return true;
        }
        return false;
    }

    private void rebuildVolumeGroupList(boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        List<f0.h> c2 = this.mRoute.c();
        if (c2.isEmpty()) {
            this.mGroupMemberRoutes.clear();
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else if (new HashSet(this.mGroupMemberRoutes).equals(new HashSet(c2))) {
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = this.mVolumeGroupList;
                r rVar = this.mVolumeGroupAdapter;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                    f0.h item = rVar.getItem(firstVisiblePosition + i2);
                    View childAt = overlayListView.getChildAt(i2);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                Context context = this.mContext;
                OverlayListView overlayListView2 = this.mVolumeGroupList;
                r rVar2 = this.mVolumeGroupAdapter;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                    f0.h item2 = rVar2.getItem(firstVisiblePosition2 + i3);
                    View childAt2 = overlayListView2.getChildAt(i3);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            List<f0.h> list = this.mGroupMemberRoutes;
            HashSet hashSet = new HashSet(c2);
            hashSet.removeAll(list);
            this.mGroupMemberRoutesAdded = hashSet;
            HashSet hashSet2 = new HashSet(this.mGroupMemberRoutes);
            hashSet2.removeAll(c2);
            this.mGroupMemberRoutesRemoved = hashSet2;
            this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
            this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
            this.mVolumeGroupAdapter.notifyDataSetChanged();
            if (z && this.mIsGroupExpanded) {
                if (this.mGroupMemberRoutesRemoved.size() + this.mGroupMemberRoutesAdded.size() > 0) {
                    animateGroupListItems(hashMap, hashMap2);
                    return;
                }
            }
            this.mGroupMemberRoutesAdded = null;
            this.mGroupMemberRoutesRemoved = null;
        }
    }

    public static void setLayoutHeight(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void setMediaSession(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.e(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token == null || !this.mAttachedToWindow) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.mContext, token);
        this.mMediaController = mediaControllerCompat2;
        mediaControllerCompat2.d(this.mControllerCallback);
        MediaMetadataCompat a = this.mMediaController.a();
        if (a != null) {
            mediaDescriptionCompat = a.b();
        }
        this.mDescription = mediaDescriptionCompat;
        this.mState = this.mMediaController.b();
        updateArtIconIfNeeded();
        update(false);
    }

    private void updateMediaControlVisibility(boolean z) {
        int i2;
        View view = this.mDividerView;
        int i3 = 0;
        if (this.mVolumeControlLayout.getVisibility() == 0 && z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        LinearLayout linearLayout = this.mMediaMainControlLayout;
        if (this.mVolumeControlLayout.getVisibility() == 8 && !z) {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updatePlaybackControlLayout() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.updatePlaybackControlLayout():void");
    }

    private void updateVolumeControlLayout() {
        int i2 = 0;
        if (!this.mEnableGroupVolumeUX && isGroup()) {
            this.mVolumeControlLayout.setVisibility(8);
            this.mIsGroupExpanded = true;
            this.mVolumeGroupList.setVisibility(0);
            loadInterpolator();
            updateLayoutHeight(false);
        } else if ((this.mIsGroupExpanded && !this.mEnableGroupVolumeUX) || !isVolumeControlAvailable(this.mRoute)) {
            this.mVolumeControlLayout.setVisibility(8);
        } else if (this.mVolumeControlLayout.getVisibility() == 8) {
            this.mVolumeControlLayout.setVisibility(0);
            this.mVolumeSlider.setMax(this.mRoute.p);
            this.mVolumeSlider.setProgress(this.mRoute.o);
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.mGroupExpandCollapseButton;
            if (!isGroup()) {
                i2 = 8;
            }
            mediaRouteExpandCollapseButton.setVisibility(i2);
        }
    }

    private static boolean uriEquals(Uri uri, Uri uri2) {
        if (uri != null && uri.equals(uri2)) {
            return true;
        }
        if (uri == null && uri2 == null) {
            return true;
        }
        return false;
    }

    public void animateGroupListItemsInternal(Map<f0.h, Rect> map, Map<f0.h, BitmapDrawable> map2) {
        OverlayListView.a aVar;
        int i2;
        Set<f0.h> set = this.mGroupMemberRoutesAdded;
        if (set != null && this.mGroupMemberRoutesRemoved != null) {
            int size = set.size() - this.mGroupMemberRoutesRemoved.size();
            l lVar = new l();
            int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
            boolean z = false;
            for (int i3 = 0; i3 < this.mVolumeGroupList.getChildCount(); i3++) {
                View childAt = this.mVolumeGroupList.getChildAt(i3);
                f0.h item = this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i3);
                Rect rect = map.get(item);
                int top = childAt.getTop();
                if (rect != null) {
                    i2 = rect.top;
                } else {
                    i2 = (this.mVolumeGroupListItemHeight * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                Set<f0.h> set2 = this.mGroupMemberRoutesAdded;
                if (set2 != null && set2.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
                translateAnimation.setDuration(this.mGroupListAnimationDurationMs);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.mInterpolator);
                if (!z) {
                    animationSet.setAnimationListener(lVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map.remove(item);
                map2.remove(item);
            }
            for (Map.Entry<f0.h, BitmapDrawable> entry : map2.entrySet()) {
                f0.h key = entry.getKey();
                BitmapDrawable value = entry.getValue();
                Rect rect2 = map.get(key);
                if (this.mGroupMemberRoutesRemoved.contains(key)) {
                    aVar = new OverlayListView.a(value, rect2);
                    aVar.h = 1.0f;
                    aVar.i = 0.0f;
                    aVar.e = this.mGroupListFadeOutDurationMs;
                    aVar.d = this.mInterpolator;
                } else {
                    OverlayListView.a aVar2 = new OverlayListView.a(value, rect2);
                    aVar2.g = this.mVolumeGroupListItemHeight * size;
                    aVar2.e = this.mGroupListAnimationDurationMs;
                    aVar2.d = this.mInterpolator;
                    aVar2.m = new C0040a(key);
                    this.mGroupMemberRoutesAnimatingWithBitmap.add(key);
                    aVar = aVar2;
                }
                this.mVolumeGroupList.b.add(aVar);
            }
        }
    }

    public void clearGroupListAnimation(boolean z) {
        Set<f0.h> set;
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.mVolumeGroupList.getChildCount(); i2++) {
            View childAt = this.mVolumeGroupList.getChildAt(i2);
            f0.h item = this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i2);
            if (!z || (set = this.mGroupMemberRoutesAdded) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.mVolumeGroupList.b.iterator();
        while (it.hasNext()) {
            OverlayListView.a aVar = (OverlayListView.a) it.next();
            aVar.k = true;
            aVar.l = true;
            OverlayListView.a.InterfaceC0039a interfaceC0039a = aVar.m;
            if (interfaceC0039a != null) {
                C0040a c0040a = (C0040a) interfaceC0039a;
                a aVar2 = a.this;
                aVar2.mGroupMemberRoutesAnimatingWithBitmap.remove(c0040a.a);
                aVar2.mVolumeGroupAdapter.notifyDataSetChanged();
            }
        }
        if (!z) {
            finishAnimation(false);
        }
    }

    public void clearLoadedBitmap() {
        this.mArtIconIsLoaded = false;
        this.mArtIconLoadedBitmap = null;
        this.mArtIconBackgroundColor = 0;
    }

    public void finishAnimation(boolean z) {
        this.mGroupMemberRoutesAdded = null;
        this.mGroupMemberRoutesRemoved = null;
        this.mIsGroupListAnimating = false;
        if (this.mIsGroupListAnimationPending) {
            this.mIsGroupListAnimationPending = false;
            updateLayoutHeight(z);
        }
        this.mVolumeGroupList.setEnabled(true);
    }

    public int getDesiredArtHeight(int i2, int i3) {
        if (i2 >= i3) {
            return (int) (((this.mDialogContentWidth * i3) / i2) + 0.5f);
        }
        return (int) (((this.mDialogContentWidth * 9.0f) / 16.0f) + 0.5f);
    }

    public View getMediaControlView() {
        return this.mCustomControlView;
    }

    public MediaSessionCompat.Token getMediaSession() {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat == null) {
            return null;
        }
        return mediaControllerCompat.b;
    }

    public f0.h getRoute() {
        return this.mRoute;
    }

    public boolean isPauseActionSupported() {
        if ((this.mState.f & 514) != 0) {
            return true;
        }
        return false;
    }

    public boolean isPlayActionSupported() {
        if ((this.mState.f & 516) != 0) {
            return true;
        }
        return false;
    }

    public boolean isStopActionSupported() {
        if ((this.mState.f & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVolumeControlAvailable(f0.h hVar) {
        if (this.mVolumeControlEnabled && hVar.e() == 1) {
            return true;
        }
        return false;
    }

    public boolean isVolumeControlEnabled() {
        return this.mVolumeControlEnabled;
    }

    public void loadInterpolator() {
        Interpolator interpolator;
        if (this.mIsGroupExpanded) {
            interpolator = this.mLinearOutSlowInInterpolator;
        } else {
            interpolator = this.mFastOutSlowInInterpolator;
        }
        this.mInterpolator = interpolator;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.a(e0.c, this.mCallback, 2);
        this.mRouter.getClass();
        setMediaSession(f0.e());
    }

    @Override // androidx.appcompat.app.e, com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(BUTTON_NEUTRAL_RES_ID).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.mExpandableAreaLayout = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.mDialogAreaLayout = linearLayout;
        linearLayout.setOnClickListener(new f());
        Context context = this.mContext;
        int g2 = androidx.mediarouter.app.d.g(context, R.attr.colorPrimary);
        if (com.amazon.aps.iva.g3.e.d(g2, androidx.mediarouter.app.d.g(context, 16842801)) < 3.0d) {
            g2 = androidx.mediarouter.app.d.g(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(BUTTON_DISCONNECT_RES_ID);
        this.mDisconnectButton = button;
        button.setText(R.string.mr_controller_disconnect);
        this.mDisconnectButton.setTextColor(g2);
        this.mDisconnectButton.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(BUTTON_STOP_RES_ID);
        this.mStopCastingButton = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.mStopCastingButton.setTextColor(g2);
        this.mStopCastingButton.setOnClickListener(mVar);
        this.mRouteNameTextView = (TextView) findViewById(R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_close);
        this.mCloseButton = imageButton;
        imageButton.setOnClickListener(mVar);
        this.mCustomControlLayout = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.mDefaultControlLayout = (FrameLayout) findViewById(R.id.mr_default_control);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.mArtView = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(R.id.mr_control_title_container).setOnClickListener(gVar);
        this.mMediaMainControlLayout = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.mDividerView = findViewById(R.id.mr_control_divider);
        this.mPlaybackControlLayout = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.mTitleView = (TextView) findViewById(R.id.mr_control_title);
        this.mSubtitleView = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.mPlaybackControlButton = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.mVolumeControlLayout = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.mVolumeSlider = seekBar;
        seekBar.setTag(this.mRoute);
        q qVar = new q();
        this.mVolumeChangeListener = qVar;
        this.mVolumeSlider.setOnSeekBarChangeListener(qVar);
        this.mVolumeGroupList = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.mGroupMemberRoutes = new ArrayList();
        r rVar = new r(this.mVolumeGroupList.getContext(), this.mGroupMemberRoutes);
        this.mVolumeGroupAdapter = rVar;
        this.mVolumeGroupList.setAdapter((ListAdapter) rVar);
        this.mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
        Context context2 = this.mContext;
        LinearLayout linearLayout3 = this.mMediaMainControlLayout;
        OverlayListView overlayListView = this.mVolumeGroupList;
        boolean isGroup = isGroup();
        int g3 = androidx.mediarouter.app.d.g(context2, R.attr.colorPrimary);
        int g4 = androidx.mediarouter.app.d.g(context2, R.attr.colorPrimaryDark);
        if (isGroup && androidx.mediarouter.app.d.c(context2) == -570425344) {
            g4 = g3;
            g3 = -1;
        }
        linearLayout3.setBackgroundColor(g3);
        overlayListView.setBackgroundColor(g4);
        linearLayout3.setTag(Integer.valueOf(g3));
        overlayListView.setTag(Integer.valueOf(g4));
        androidx.mediarouter.app.d.l(this.mContext, (MediaRouteVolumeSlider) this.mVolumeSlider, this.mMediaMainControlLayout);
        HashMap hashMap = new HashMap();
        this.mVolumeSliderMap = hashMap;
        hashMap.put(this.mRoute, this.mVolumeSlider);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.mGroupExpandCollapseButton = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        loadInterpolator();
        this.mGroupListAnimationDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.mGroupListFadeInDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.mGroupListFadeOutDurationMs = this.mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View onCreateMediaControlView = onCreateMediaControlView(bundle);
        this.mCustomControlView = onCreateMediaControlView;
        if (onCreateMediaControlView != null) {
            this.mCustomControlLayout.addView(onCreateMediaControlView);
            this.mCustomControlLayout.setVisibility(0);
        }
        this.mCreated = true;
        updateLayout();
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mRouter.i(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.e, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int i3;
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.mEnableGroupVolumeUX || !this.mIsGroupExpanded) {
            f0.h hVar = this.mRoute;
            if (i2 == 25) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            hVar.m(i3);
        }
        return true;
    }

    @Override // androidx.appcompat.app.e, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.mVolumeControlEnabled != z) {
            this.mVolumeControlEnabled = z;
            if (this.mCreated) {
                update(false);
            }
        }
    }

    public void startGroupListFadeInAnimation() {
        clearGroupListAnimation(true);
        this.mVolumeGroupList.requestLayout();
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    public void startGroupListFadeInAnimationInternal() {
        Set<f0.h> set = this.mGroupMemberRoutesAdded;
        if (set != null && set.size() != 0) {
            fadeInAddedRoutes();
        } else {
            finishAnimation(true);
        }
    }

    public void update(boolean z) {
        if (this.mRouteInVolumeSliderTouched != null) {
            this.mHasPendingUpdate = true;
            this.mPendingUpdateAnimationNeeded = z | this.mPendingUpdateAnimationNeeded;
            return;
        }
        int i2 = 0;
        this.mHasPendingUpdate = false;
        this.mPendingUpdateAnimationNeeded = false;
        if (this.mRoute.i() && !this.mRoute.f()) {
            if (!this.mCreated) {
                return;
            }
            this.mRouteNameTextView.setText(this.mRoute.d);
            Button button = this.mDisconnectButton;
            if (!this.mRoute.i) {
                i2 = 8;
            }
            button.setVisibility(i2);
            if (this.mCustomControlView == null && this.mArtIconIsLoaded) {
                if (isBitmapRecycled(this.mArtIconLoadedBitmap)) {
                    Objects.toString(this.mArtIconLoadedBitmap);
                } else {
                    this.mArtView.setImageBitmap(this.mArtIconLoadedBitmap);
                    this.mArtView.setBackgroundColor(this.mArtIconBackgroundColor);
                }
                clearLoadedBitmap();
            }
            updateVolumeControlLayout();
            updatePlaybackControlLayout();
            updateLayoutHeight(z);
            return;
        }
        dismiss();
    }

    public void updateArtIconIfNeeded() {
        if (this.mCustomControlView == null && isIconChanged()) {
            if (!isGroup() || this.mEnableGroupVolumeUX) {
                n nVar = this.mFetchArtTask;
                if (nVar != null) {
                    nVar.cancel(true);
                }
                n nVar2 = new n();
                this.mFetchArtTask = nVar2;
                nVar2.execute(new Void[0]);
            }
        }
    }

    public void updateLayout() {
        int a = com.amazon.aps.iva.e8.g.a(this.mContext);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.mDialogContentWidth = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.mContext.getResources();
        this.mVolumeGroupListItemIconSize = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.mVolumeGroupListItemHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.mVolumeGroupListMaxHeight = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        updateArtIconIfNeeded();
        update(false);
    }

    public void updateLayoutHeight(boolean z) {
        this.mDefaultControlLayout.requestLayout();
        this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new i(z));
    }

    public void updateLayoutHeightInternal(boolean z) {
        int i2;
        int i3;
        boolean z2;
        Bitmap bitmap;
        ImageView.ScaleType scaleType;
        int layoutHeight = getLayoutHeight(this.mMediaMainControlLayout);
        setLayoutHeight(this.mMediaMainControlLayout, -1);
        updateMediaControlVisibility(canShowPlaybackControlLayout());
        View decorView = getWindow().getDecorView();
        boolean z3 = false;
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, Ints.MAX_POWER_OF_TWO), 0);
        setLayoutHeight(this.mMediaMainControlLayout, layoutHeight);
        if (this.mCustomControlView == null && (this.mArtView.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.mArtView.getDrawable()).getBitmap()) != null) {
            i2 = getDesiredArtHeight(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = this.mArtView;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i2 = 0;
        }
        int mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
        int size = this.mGroupMemberRoutes.size();
        if (isGroup()) {
            i3 = this.mRoute.c().size() * this.mVolumeGroupListItemHeight;
        } else {
            i3 = 0;
        }
        if (size > 0) {
            i3 += this.mVolumeGroupListPaddingTop;
        }
        int min = Math.min(i3, this.mVolumeGroupListMaxHeight);
        if (!this.mIsGroupExpanded) {
            min = 0;
        }
        int max = Math.max(i2, min) + mainControllerHeight;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
        if (this.mCustomControlView == null && i2 > 0 && max <= height) {
            this.mArtView.setVisibility(0);
            setLayoutHeight(this.mArtView, i2);
        } else {
            if (this.mMediaMainControlLayout.getMeasuredHeight() + getLayoutHeight(this.mVolumeGroupList) >= this.mDefaultControlLayout.getMeasuredHeight()) {
                this.mArtView.setVisibility(8);
            }
            max = min + mainControllerHeight;
            i2 = 0;
        }
        if (canShowPlaybackControlLayout() && max <= height) {
            this.mPlaybackControlLayout.setVisibility(0);
        } else {
            this.mPlaybackControlLayout.setVisibility(8);
        }
        if (this.mPlaybackControlLayout.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        updateMediaControlVisibility(z2);
        if (this.mPlaybackControlLayout.getVisibility() == 0) {
            z3 = true;
        }
        int mainControllerHeight2 = getMainControllerHeight(z3);
        int max2 = Math.max(i2, min) + mainControllerHeight2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (z) {
            animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            animateLayoutHeight(this.mVolumeGroupList, min);
            animateLayoutHeight(this.mDefaultControlLayout, height);
        } else {
            setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            setLayoutHeight(this.mVolumeGroupList, min);
            setLayoutHeight(this.mDefaultControlLayout, height);
        }
        setLayoutHeight(this.mExpandableAreaLayout, rect.height());
        rebuildVolumeGroupList(z);
    }

    public void updateVolumeGroupItemHeight(View view) {
        setLayoutHeight((LinearLayout) view.findViewById(R.id.volume_item_container), this.mVolumeGroupListItemHeight);
        View findViewById = view.findViewById(R.id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.mVolumeGroupListItemIconSize;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.view.ContextThemeWrapper r2 = androidx.mediarouter.app.d.a(r2, r3, r0)
            int r3 = androidx.mediarouter.app.d.b(r2)
            r1.<init>(r2, r3)
            r1.mVolumeControlEnabled = r0
            androidx.mediarouter.app.a$d r3 = new androidx.mediarouter.app.a$d
            r3.<init>()
            r1.mGroupListFadeInAnimation = r3
            android.content.Context r3 = r1.getContext()
            r1.mContext = r3
            androidx.mediarouter.app.a$o r3 = new androidx.mediarouter.app.a$o
            r3.<init>()
            r1.mControllerCallback = r3
            android.content.Context r3 = r1.mContext
            com.amazon.aps.iva.f8.f0 r3 = com.amazon.aps.iva.f8.f0.d(r3)
            r1.mRouter = r3
            boolean r3 = com.amazon.aps.iva.f8.f0.h()
            r1.mEnableGroupVolumeUX = r3
            androidx.mediarouter.app.a$p r3 = new androidx.mediarouter.app.a$p
            r3.<init>()
            r1.mCallback = r3
            com.amazon.aps.iva.f8.f0$h r3 = com.amazon.aps.iva.f8.f0.g()
            r1.mRoute = r3
            android.support.v4.media.session.MediaSessionCompat$Token r3 = com.amazon.aps.iva.f8.f0.e()
            r1.setMediaSession(r3)
            android.content.Context r3 = r1.mContext
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131166392(0x7f0704b8, float:1.7947028E38)
            int r3 = r3.getDimensionPixelSize(r0)
            r1.mVolumeGroupListPaddingTop = r3
            android.content.Context r3 = r1.mContext
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.mAccessibilityManager = r3
            r3 = 2131558421(0x7f0d0015, float:1.8742157E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mLinearOutSlowInInterpolator = r3
            r3 = 2131558420(0x7f0d0014, float:1.8742155E38)
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.mFastOutSlowInInterpolator = r2
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.mAccelerateDecelerateInterpolator = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.<init>(android.content.Context, int):void");
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            a.this.finishAnimation(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class l implements Animation.AnimationListener {
        public l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            a aVar = a.this;
            OverlayListView overlayListView = aVar.mVolumeGroupList;
            Iterator it = overlayListView.b.iterator();
            while (it.hasNext()) {
                OverlayListView.a aVar2 = (OverlayListView.a) it.next();
                if (!aVar2.k) {
                    aVar2.j = overlayListView.getDrawingTime();
                    aVar2.k = true;
                }
            }
            aVar.mVolumeGroupList.postDelayed(aVar.mGroupListFadeInAnimation, aVar.mGroupListAnimationDurationMs);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
