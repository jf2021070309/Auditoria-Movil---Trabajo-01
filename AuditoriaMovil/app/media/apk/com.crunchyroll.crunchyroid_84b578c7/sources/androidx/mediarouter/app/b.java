package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.k.o;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.segment.analytics.internal.Utils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class b extends o {
    public static final /* synthetic */ int P = 0;
    public View A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public String E;
    public MediaControllerCompat F;
    public final e G;
    public MediaDescriptionCompat H;
    public d I;
    public Bitmap J;
    public Uri K;
    public boolean L;
    public Bitmap M;
    public int N;
    public final boolean O;
    public final f0 b;
    public final g c;
    public e0 d;
    public f0.h e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final Context j;
    public boolean k;
    public boolean l;
    public long m;
    public final a n;
    public RecyclerView o;
    public h p;
    public j q;
    public HashMap r;
    public f0.h s;
    public HashMap t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ImageButton x;
    public Button y;
    public ImageView z;

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            b bVar = b.this;
            if (i != 1) {
                if (i == 2 && bVar.s != null) {
                    bVar.s = null;
                    bVar.X7();
                    return;
                }
                return;
            }
            bVar.H6();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* renamed from: androidx.mediarouter.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0042b implements View.OnClickListener {
        public View$OnClickListenerC0042b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            if (bVar.e.i()) {
                bVar.b.getClass();
                f0.l(2);
            }
            bVar.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class d extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        public int c;

        public d() {
            Bitmap bitmap;
            boolean z;
            MediaDescriptionCompat mediaDescriptionCompat = b.this.H;
            if (mediaDescriptionCompat == null) {
                bitmap = null;
            } else {
                bitmap = mediaDescriptionCompat.f;
            }
            if (bitmap != null && bitmap.isRecycled()) {
                z = true;
            } else {
                z = false;
            }
            this.a = z ? null : bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = b.this.H;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.g : null;
        }

        public final BufferedInputStream a(Uri uri) throws IOException {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!"android.resource".equals(lowerCase) && !FirebaseAnalytics.Param.CONTENT.equals(lowerCase) && !"file".equals(lowerCase)) {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(Utils.DEFAULT_FLUSH_INTERVAL);
                openConnection.setReadTimeout(Utils.DEFAULT_FLUSH_INTERVAL);
                openInputStream = openConnection.getInputStream();
            } else {
                openInputStream = b.this.j.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0073: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:33:0x0073 */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.graphics.Bitmap doInBackground(java.lang.Void[] r8) {
            /*
                r7 = this;
                java.lang.Void[] r8 = (java.lang.Void[]) r8
                r8 = 0
                r0 = 1
                r1 = 0
                android.graphics.Bitmap r2 = r7.a
                if (r2 == 0) goto Lb
                goto L88
            Lb:
                android.net.Uri r2 = r7.b
                if (r2 == 0) goto L87
                java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
                if (r3 != 0) goto L1b
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r3 == 0) goto Lcc
                goto L6e
            L1b:
                android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                r4.<init>()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                r4.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                int r5 = r4.outWidth     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r5 == 0) goto L6e
                int r5 = r4.outHeight     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r5 != 0) goto L2e
                goto L6e
            L2e:
                r3.reset()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L72
                goto L41
            L32:
                r3.close()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r3 != 0) goto L41
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r3 == 0) goto Lcc
                goto L6e
            L41:
                r4.inJustDecodeBounds = r8     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                androidx.mediarouter.app.b r5 = androidx.mediarouter.app.b.this     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                android.content.Context r5 = r5.j     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                r6 = 2131166385(0x7f0704b1, float:1.7947014E38)
                int r5 = r5.getDimensionPixelSize(r6)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                int r6 = r4.outHeight     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                int r6 = r6 / r5
                int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                int r5 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                r4.inSampleSize = r5     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                boolean r5 = r7.isCancelled()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                if (r5 == 0) goto L66
                goto L6e
            L66:
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L78
                r3.close()     // Catch: java.io.IOException -> L88
                goto L88
            L6e:
                r3.close()     // Catch: java.io.IOException -> Lcc
                goto Lcc
            L72:
                r8 = move-exception
                r1 = r3
                goto L81
            L75:
                r8 = move-exception
                goto L81
            L77:
                r3 = r1
            L78:
                java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L72
                if (r3 == 0) goto L87
                r3.close()     // Catch: java.io.IOException -> L87
                goto L87
            L81:
                if (r1 == 0) goto L86
                r1.close()     // Catch: java.io.IOException -> L86
            L86:
                throw r8
            L87:
                r2 = r1
            L88:
                if (r2 == 0) goto L92
                boolean r3 = r2.isRecycled()
                if (r3 == 0) goto L92
                r3 = r0
                goto L93
            L92:
                r3 = r8
            L93:
                if (r3 == 0) goto L99
                java.util.Objects.toString(r2)
                goto Lcc
            L99:
                if (r2 == 0) goto Lcb
                int r1 = r2.getWidth()
                int r3 = r2.getHeight()
                if (r1 >= r3) goto Lcb
                com.amazon.aps.iva.k8.b$b r1 = new com.amazon.aps.iva.k8.b$b
                r1.<init>(r2)
                r1.c = r0
                com.amazon.aps.iva.k8.b r0 = r1.a()
                java.util.List<com.amazon.aps.iva.k8.b$d> r0 = r0.a
                java.util.List r1 = java.util.Collections.unmodifiableList(r0)
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lbd
                goto Lc9
            Lbd:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.Object r8 = r0.get(r8)
                com.amazon.aps.iva.k8.b$d r8 = (com.amazon.aps.iva.k8.b.d) r8
                int r8 = r8.d
            Lc9:
                r7.c = r8
            Lcb:
                r1 = r2
            Lcc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            b bVar = b.this;
            bVar.I = null;
            Bitmap bitmap3 = bVar.J;
            Bitmap bitmap4 = this.a;
            boolean a = com.amazon.aps.iva.o3.b.a(bitmap3, bitmap4);
            Uri uri = this.b;
            if (!a || !com.amazon.aps.iva.o3.b.a(bVar.K, uri)) {
                bVar.J = bitmap4;
                bVar.M = bitmap2;
                bVar.K = uri;
                bVar.N = this.c;
                bVar.L = true;
                bVar.U2();
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            b bVar = b.this;
            bVar.L = false;
            bVar.M = null;
            bVar.N = 0;
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class e extends MediaControllerCompat.a {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat b;
            if (mediaMetadataCompat == null) {
                b = null;
            } else {
                b = mediaMetadataCompat.b();
            }
            b bVar = b.this;
            bVar.H = b;
            bVar.b1();
            bVar.U2();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void onSessionDestroyed() {
            b bVar = b.this;
            MediaControllerCompat mediaControllerCompat = bVar.F;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.e(bVar.G);
                bVar.F = null;
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public abstract class f extends RecyclerView.f0 {
        public f0.h b;
        public final ImageButton c;
        public final MediaRouteVolumeSlider d;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = f.this;
                b bVar = b.this;
                if (bVar.s != null) {
                    bVar.n.removeMessages(2);
                }
                f0.h hVar = fVar.b;
                b bVar2 = b.this;
                bVar2.s = hVar;
                int i = 1;
                boolean z = !view.isActivated();
                if (z) {
                    i = 0;
                } else {
                    Integer num = (Integer) bVar2.t.get(fVar.b.c);
                    if (num != null) {
                        i = Math.max(1, num.intValue());
                    }
                }
                fVar.U2(z);
                fVar.d.setProgress(i);
                fVar.b.l(i);
                bVar2.n.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            int color;
            int color2;
            this.c = imageButton;
            this.d = mediaRouteVolumeSlider;
            Context context = b.this.j;
            Drawable a2 = com.amazon.aps.iva.l.a.a(context, R.drawable.mr_cast_mute_button);
            if (androidx.mediarouter.app.d.i(context)) {
                a.b.g(a2, com.amazon.aps.iva.d3.a.getColor(context, R.color.mr_dynamic_dialog_icon_light));
            }
            imageButton.setImageDrawable(a2);
            Context context2 = b.this.j;
            if (androidx.mediarouter.app.d.i(context2)) {
                color = com.amazon.aps.iva.d3.a.getColor(context2, R.color.mr_cast_progressbar_progress_and_thumb_light);
                color2 = com.amazon.aps.iva.d3.a.getColor(context2, R.color.mr_cast_progressbar_background_light);
            } else {
                color = com.amazon.aps.iva.d3.a.getColor(context2, R.color.mr_cast_progressbar_progress_and_thumb_dark);
                color2 = com.amazon.aps.iva.d3.a.getColor(context2, R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.a(color, color2);
        }

        public final void U2(boolean z) {
            ImageButton imageButton = this.c;
            if (imageButton.isActivated() == z) {
                return;
            }
            imageButton.setActivated(z);
            b bVar = b.this;
            if (z) {
                bVar.t.put(this.b.c, Integer.valueOf(this.d.getProgress()));
            } else {
                bVar.t.remove(this.b.c);
            }
        }

        public final void b1(f0.h hVar) {
            boolean z;
            this.b = hVar;
            int i = hVar.o;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            ImageButton imageButton = this.c;
            imageButton.setActivated(z);
            imageButton.setOnClickListener(new a());
            f0.h hVar2 = this.b;
            MediaRouteVolumeSlider mediaRouteVolumeSlider = this.d;
            mediaRouteVolumeSlider.setTag(hVar2);
            mediaRouteVolumeSlider.setMax(hVar.p);
            mediaRouteVolumeSlider.setProgress(i);
            mediaRouteVolumeSlider.setOnSeekBarChangeListener(b.this.q);
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class g extends f0.a {
        public g() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteAdded(f0 f0Var, f0.h hVar) {
            b.this.H6();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteChanged(f0 f0Var, f0.h hVar) {
            f0.h.a b;
            boolean z;
            b bVar = b.this;
            boolean z2 = false;
            if (hVar == bVar.e) {
                hVar.getClass();
                if (f0.h.a() != null) {
                    f0.g gVar = hVar.a;
                    gVar.getClass();
                    f0.b();
                    Iterator it = Collections.unmodifiableList(gVar.b).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        f0.h hVar2 = (f0.h) it.next();
                        if (!bVar.e.c().contains(hVar2) && (b = bVar.e.b(hVar2)) != null) {
                            a0.b.a aVar = b.a;
                            if (aVar != null && aVar.d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && !bVar.g.contains(hVar2)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z2) {
                bVar.X7();
                bVar.G4();
                return;
            }
            bVar.H6();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
            b.this.H6();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteSelected(f0 f0Var, f0.h hVar) {
            b bVar = b.this;
            bVar.e = hVar;
            bVar.X7();
            bVar.G4();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteUnselected(f0 f0Var, f0.h hVar) {
            b.this.H6();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteVolumeChanged(f0 f0Var, f0.h hVar) {
            f fVar;
            boolean z;
            int i = hVar.o;
            int i2 = b.P;
            b bVar = b.this;
            if (bVar.s != hVar && (fVar = (f) bVar.r.get(hVar.c)) != null) {
                int i3 = fVar.b.o;
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.U2(z);
                fVar.d.setProgress(i3);
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public static final class i implements Comparator<f0.h> {
        public static final i b = new i();

        @Override // java.util.Comparator
        public final int compare(f0.h hVar, f0.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            boolean z2;
            if (z) {
                f0.h hVar = (f0.h) seekBar.getTag();
                f fVar = (f) b.this.r.get(hVar.c);
                if (fVar != null) {
                    if (i == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fVar.U2(z2);
                }
                hVar.l(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            b bVar = b.this;
            if (bVar.s != null) {
                bVar.n.removeMessages(2);
            }
            bVar.s = (f0.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            b.this.n.sendEmptyMessageDelayed(2, 500L);
        }
    }

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    public b() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = androidx.mediarouter.app.d.a(r2, r0, r0)
            int r0 = androidx.mediarouter.app.d.b(r2)
            r1.<init>(r2, r0)
            com.amazon.aps.iva.f8.e0 r2 = com.amazon.aps.iva.f8.e0.c
            r1.d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.i = r2
            androidx.mediarouter.app.b$a r2 = new androidx.mediarouter.app.b$a
            r2.<init>()
            r1.n = r2
            android.content.Context r2 = r1.getContext()
            r1.j = r2
            com.amazon.aps.iva.f8.f0 r2 = com.amazon.aps.iva.f8.f0.d(r2)
            r1.b = r2
            boolean r2 = com.amazon.aps.iva.f8.f0.h()
            r1.O = r2
            androidx.mediarouter.app.b$g r2 = new androidx.mediarouter.app.b$g
            r2.<init>()
            r1.c = r2
            com.amazon.aps.iva.f8.f0$h r2 = com.amazon.aps.iva.f8.f0.g()
            r1.e = r2
            androidx.mediarouter.app.b$e r2 = new androidx.mediarouter.app.b$e
            r2.<init>()
            r1.G = r2
            android.support.v4.media.session.MediaSessionCompat$Token r2 = com.amazon.aps.iva.f8.f0.e()
            r1.setMediaSession(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.<init>(android.content.Context):void");
    }

    public final void G4() {
        boolean z;
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList.addAll(this.e.c());
        f0.g gVar = this.e.a;
        gVar.getClass();
        f0.b();
        for (f0.h hVar : Collections.unmodifiableList(gVar.b)) {
            f0.h.a b = this.e.b(hVar);
            if (b != null) {
                boolean z2 = true;
                a0.b.a aVar = b.a;
                if (aVar != null && aVar.d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(hVar);
                }
                if ((aVar == null || !aVar.e) ? false : false) {
                    arrayList3.add(hVar);
                }
            }
        }
        onFilterRoutes(arrayList2);
        onFilterRoutes(arrayList3);
        i iVar = i.b;
        Collections.sort(arrayList, iVar);
        Collections.sort(arrayList2, iVar);
        Collections.sort(arrayList3, iVar);
        this.p.g();
    }

    public final void H6() {
        boolean z;
        if (this.l) {
            if (SystemClock.uptimeMillis() - this.m >= 300) {
                if (this.s == null && !this.u) {
                    z = !this.k;
                } else {
                    z = true;
                }
                if (z) {
                    this.v = true;
                    return;
                }
                this.v = false;
                if (!this.e.i() || this.e.f()) {
                    dismiss();
                }
                this.m = SystemClock.uptimeMillis();
                this.p.f();
                return;
            }
            a aVar = this.n;
            aVar.removeMessages(1);
            aVar.sendEmptyMessageAtTime(1, this.m + 300);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U2() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.U2():void");
    }

    public final void X7() {
        if (this.v) {
            H6();
        }
        if (this.w) {
            U2();
        }
    }

    public final void b1() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.H;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.g;
        }
        d dVar = this.I;
        if (dVar == null) {
            bitmap2 = this.J;
        } else {
            bitmap2 = dVar.a;
        }
        if (dVar == null) {
            uri = this.K;
        } else {
            uri = dVar.b;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || com.amazon.aps.iva.o3.b.a(uri, uri2))) {
            return;
        }
        d dVar2 = this.I;
        if (dVar2 != null) {
            dVar2.cancel(true);
        }
        d dVar3 = new d();
        this.I = dVar3;
        dVar3.execute(new Void[0]);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
        this.b.a(this.d, this.c, 1);
        G4();
        setMediaSession(f0.e());
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        Context context = this.j;
        androidx.mediarouter.app.d.j(context, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.x = imageButton;
        imageButton.setColorFilter(-1);
        this.x.setOnClickListener(new View$OnClickListenerC0042b());
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.y = button;
        button.setTextColor(-1);
        this.y.setOnClickListener(new c());
        this.p = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.o = recyclerView;
        recyclerView.setAdapter(this.p);
        this.o.setLayoutManager(new LinearLayoutManager(context));
        this.q = new j();
        this.r = new HashMap();
        this.t = new HashMap();
        this.z = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.A = findViewById(R.id.mr_cast_meta_black_scrim);
        this.B = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.C = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.D = textView2;
        textView2.setTextColor(-1);
        this.E = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.k = true;
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = false;
        this.b.i(this.c);
        this.n.removeCallbacksAndMessages(null);
        setMediaSession(null);
    }

    public final void onFilterRoutes(List<f0.h> list) {
        boolean z;
        for (int size = list.size() - 1; size >= 0; size--) {
            f0.h hVar = list.get(size);
            if (!hVar.f() && hVar.g && hVar.j(this.d) && this.e != hVar) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                list.remove(size);
            }
        }
    }

    public final void setMediaSession(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.F;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        e eVar = this.G;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.e(eVar);
            this.F = null;
        }
        if (token == null || !this.l) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.j, token);
        this.F = mediaControllerCompat2;
        mediaControllerCompat2.d(eVar);
        MediaMetadataCompat a2 = this.F.a();
        if (a2 != null) {
            mediaDescriptionCompat = a2.b();
        }
        this.H = mediaDescriptionCompat;
        b1();
        U2();
    }

    public final void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            if (!this.d.equals(e0Var)) {
                this.d = e0Var;
                if (this.l) {
                    f0 f0Var = this.b;
                    g gVar = this.c;
                    f0Var.i(gVar);
                    f0Var.a(e0Var, gVar, 1);
                    G4();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void updateLayout() {
        int a2;
        Context context = this.j;
        int i2 = -1;
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            a2 = -1;
        } else {
            a2 = com.amazon.aps.iva.e8.g.a(context);
        }
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            i2 = -2;
        }
        getWindow().setLayout(a2, i2);
        this.J = null;
        this.K = null;
        b1();
        U2();
        H6();
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class h extends RecyclerView.h<RecyclerView.f0> {
        public final ArrayList<f> a = new ArrayList<>();
        public final LayoutInflater b;
        public final Drawable c;
        public final Drawable d;
        public final Drawable e;
        public final Drawable f;
        public f g;
        public final int h;
        public final AccelerateDecelerateInterpolator i;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class a extends Animation {
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ View d;

            public a(int i, int i2, View view) {
                this.b = i;
                this.c = i2;
                this.d = view;
            }

            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int i = this.b;
                int i2 = this.c;
                int i3 = i2 + ((int) ((i - i2) * f));
                int i4 = b.P;
                View view = this.d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.f0 {
            public final View b;
            public final ImageView c;
            public final ProgressBar d;
            public final TextView e;
            public final float f;
            public f0.h g;

            public c(View view) {
                super(view);
                this.b = view;
                this.c = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.d = progressBar;
                this.e = (TextView) view.findViewById(R.id.mr_cast_group_name);
                this.f = androidx.mediarouter.app.d.d(b.this.j);
                androidx.mediarouter.app.d.k(b.this.j, progressBar);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class d extends f {
            public final TextView f;
            public final int g;

            public d(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.f = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = b.this.j.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.g = (int) typedValue.getDimension(displayMetrics);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class e extends RecyclerView.f0 {
            public final TextView b;

            public e(View view) {
                super(view);
                this.b = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class f {
            public final Object a;
            public final int b;

            public f(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class g extends f {
            public final View f;
            public final ImageView g;
            public final ProgressBar h;
            public final TextView i;
            public final RelativeLayout j;
            public final CheckBox k;
            public final float l;
            public final int m;
            public final a n;

            /* compiled from: MediaRouteDynamicControllerDialog.java */
            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z;
                    boolean z2;
                    int i;
                    boolean z3;
                    g gVar = g.this;
                    boolean z4 = true;
                    boolean z5 = !gVar.G4(gVar.b);
                    boolean g = gVar.b.g();
                    int i2 = 0;
                    h hVar = h.this;
                    if (z5) {
                        f0 f0Var = b.this.b;
                        f0.h hVar2 = gVar.b;
                        f0Var.getClass();
                        if (hVar2 != null) {
                            f0.b();
                            f0.d c = f0.c();
                            if (c.u instanceof a0.b) {
                                f0.h.a b = c.t.b(hVar2);
                                if (!c.t.c().contains(hVar2) && b != null) {
                                    a0.b.a aVar = b.a;
                                    if (aVar != null && aVar.d) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        ((a0.b) c.u).m(hVar2.b);
                                    }
                                }
                                hVar2.toString();
                            } else {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                        } else {
                            throw new NullPointerException("route must not be null");
                        }
                    } else {
                        f0 f0Var2 = b.this.b;
                        f0.h hVar3 = gVar.b;
                        f0Var2.getClass();
                        if (hVar3 != null) {
                            f0.b();
                            f0.d c2 = f0.c();
                            if (c2.u instanceof a0.b) {
                                f0.h.a b2 = c2.t.b(hVar3);
                                if (c2.t.c().contains(hVar3) && b2 != null) {
                                    a0.b.a aVar2 = b2.a;
                                    if (aVar2 != null && !aVar2.c) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if (c2.t.c().size() > 1) {
                                            ((a0.b) c2.u).n(hVar3.b);
                                        }
                                    }
                                }
                                hVar3.toString();
                            } else {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                        } else {
                            throw new NullPointerException("route must not be null");
                        }
                    }
                    gVar.H6(z5, !g);
                    if (g) {
                        List<f0.h> c3 = b.this.e.c();
                        for (f0.h hVar4 : gVar.b.c()) {
                            if (c3.contains(hVar4) != z5) {
                                f fVar = (f) b.this.r.get(hVar4.c);
                                if (fVar instanceof g) {
                                    ((g) fVar).H6(z5, true);
                                }
                            }
                        }
                    }
                    f0.h hVar5 = gVar.b;
                    b bVar = b.this;
                    List<f0.h> c4 = bVar.e.c();
                    int max = Math.max(1, c4.size());
                    int i3 = -1;
                    if (hVar5.g()) {
                        for (f0.h hVar6 : hVar5.c()) {
                            if (c4.contains(hVar6) != z5) {
                                if (z5) {
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                                max += i;
                            }
                        }
                    } else {
                        if (z5) {
                            i3 = 1;
                        }
                        max += i3;
                    }
                    b bVar2 = b.this;
                    if (bVar2.O && bVar2.e.c().size() > 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z4 = (!bVar.O || max < 2) ? false : false;
                    if (z2 != z4) {
                        RecyclerView.f0 findViewHolderForAdapterPosition = bVar.o.findViewHolderForAdapterPosition(0);
                        if (findViewHolderForAdapterPosition instanceof d) {
                            d dVar = (d) findViewHolderForAdapterPosition;
                            View view2 = dVar.itemView;
                            if (z4) {
                                i2 = dVar.g;
                            }
                            hVar.d(view2, i2);
                        }
                    }
                }
            }

            public g(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.n = new a();
                this.f = view;
                this.g = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.h = progressBar;
                this.i = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.j = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.k = checkBox;
                b bVar = b.this;
                Context context = bVar.j;
                Drawable a2 = com.amazon.aps.iva.l.a.a(context, R.drawable.mr_cast_checkbox);
                if (androidx.mediarouter.app.d.i(context)) {
                    a.b.g(a2, com.amazon.aps.iva.d3.a.getColor(context, R.color.mr_dynamic_dialog_icon_light));
                }
                checkBox.setButtonDrawable(a2);
                Context context2 = bVar.j;
                androidx.mediarouter.app.d.k(context2, progressBar);
                this.l = androidx.mediarouter.app.d.d(context2);
                Resources resources = context2.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.m = (int) typedValue.getDimension(displayMetrics);
            }

            public final boolean G4(f0.h hVar) {
                int i;
                if (hVar.i()) {
                    return true;
                }
                f0.h.a b = b.this.e.b(hVar);
                if (b != null) {
                    a0.b.a aVar = b.a;
                    if (aVar != null) {
                        i = aVar.b;
                    } else {
                        i = 1;
                    }
                    if (i == 3) {
                        return true;
                    }
                }
                return false;
            }

            public final void H6(boolean z, boolean z2) {
                CheckBox checkBox = this.k;
                int i = 0;
                checkBox.setEnabled(false);
                this.f.setEnabled(false);
                checkBox.setChecked(z);
                if (z) {
                    this.g.setVisibility(4);
                    this.h.setVisibility(0);
                }
                if (z2) {
                    if (z) {
                        i = this.m;
                    }
                    h.this.d(this.j, i);
                }
            }
        }

        public h() {
            this.b = LayoutInflater.from(b.this.j);
            Context context = b.this.j;
            this.c = androidx.mediarouter.app.d.e(R.attr.mediaRouteDefaultIconDrawable, context);
            this.d = androidx.mediarouter.app.d.e(R.attr.mediaRouteTvIconDrawable, context);
            this.e = androidx.mediarouter.app.d.e(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.f = androidx.mediarouter.app.d.e(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            this.h = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.i = new AccelerateDecelerateInterpolator();
            g();
        }

        public final void d(View view, int i) {
            a aVar = new a(i, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new animation.Animation$AnimationListenerC0043b());
            aVar.setDuration(this.h);
            aVar.setInterpolator(this.i);
            view.startAnimation(aVar);
        }

        public final Drawable e(f0.h hVar) {
            Uri uri = hVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(b.this.j.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    uri.toString();
                }
            }
            int i = hVar.m;
            if (i != 1) {
                if (i != 2) {
                    if (hVar.g()) {
                        return this.f;
                    }
                    return this.c;
                }
                return this.e;
            }
            return this.d;
        }

        public final void f() {
            boolean z;
            b bVar = b.this;
            bVar.i.clear();
            ArrayList arrayList = bVar.i;
            ArrayList arrayList2 = bVar.g;
            ArrayList arrayList3 = new ArrayList();
            f0.g gVar = bVar.e.a;
            gVar.getClass();
            f0.b();
            for (f0.h hVar : Collections.unmodifiableList(gVar.b)) {
                f0.h.a b = bVar.e.b(hVar);
                if (b != null) {
                    a0.b.a aVar = b.a;
                    if (aVar != null && aVar.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList3.add(hVar);
                    }
                }
            }
            HashSet hashSet = new HashSet(arrayList2);
            hashSet.removeAll(arrayList3);
            arrayList.addAll(hashSet);
            notifyDataSetChanged();
        }

        public final void g() {
            String str;
            String str2;
            ArrayList<f> arrayList = this.a;
            arrayList.clear();
            b bVar = b.this;
            this.g = new f(bVar.e, 1);
            ArrayList arrayList2 = bVar.f;
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f((f0.h) it.next(), 3));
                }
            } else {
                arrayList.add(new f(bVar.e, 3));
            }
            ArrayList arrayList3 = bVar.g;
            boolean isEmpty = arrayList3.isEmpty();
            Context context = bVar.j;
            boolean z = false;
            if (!isEmpty) {
                Iterator it2 = arrayList3.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    f0.h hVar = (f0.h) it2.next();
                    if (!arrayList2.contains(hVar)) {
                        if (!z2) {
                            bVar.e.getClass();
                            a0.b a2 = f0.h.a();
                            if (a2 != null) {
                                str2 = a2.j();
                            } else {
                                str2 = null;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = context.getString(R.string.mr_dialog_groupable_header);
                            }
                            arrayList.add(new f(str2, 2));
                            z2 = true;
                        }
                        arrayList.add(new f(hVar, 3));
                    }
                }
            }
            ArrayList arrayList4 = bVar.h;
            if (!arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    f0.h hVar2 = (f0.h) it3.next();
                    f0.h hVar3 = bVar.e;
                    if (hVar3 != hVar2) {
                        if (!z) {
                            hVar3.getClass();
                            a0.b a3 = f0.h.a();
                            if (a3 != null) {
                                str = a3.k();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = context.getString(R.string.mr_dialog_transferable_header);
                            }
                            arrayList.add(new f(str, 2));
                            z = true;
                        }
                        arrayList.add(new f(hVar2, 4));
                    }
                }
            }
            f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i) {
            f fVar;
            if (i == 0) {
                fVar = this.g;
            } else {
                fVar = this.a.get(i - 1);
            }
            return fVar.b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
            if (r12 != false) goto L52;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.f0 r11, int r12) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.b.h.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return new c(layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
                        }
                        throw new IllegalStateException();
                    }
                    return new g(layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
                }
                return new e(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            return new d(layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onViewRecycled(RecyclerView.f0 f0Var) {
            super.onViewRecycled(f0Var);
            b.this.r.values().remove(f0Var);
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* renamed from: androidx.mediarouter.app.b$h$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class animation.Animation$AnimationListenerC0043b implements Animation.AnimationListener {
            public animation.Animation$AnimationListenerC0043b() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                b bVar = b.this;
                bVar.u = false;
                bVar.X7();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                b.this.u = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }
        }
    }
}
