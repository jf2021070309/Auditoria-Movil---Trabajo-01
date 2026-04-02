package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.c;
import androidx.media3.ui.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c8.t;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.t0;
import com.amazon.aps.iva.q5.u;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.t5.g0;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PlayerControlView.java */
/* loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final float[] S0;
    public final View A;
    public final String A0;
    public final View B;
    public final String B0;
    public final View C;
    public l0 C0;
    public final TextView D;
    public InterfaceC0038c D0;
    public final TextView E;
    public boolean E0;
    public final androidx.media3.ui.f F;
    public boolean F0;
    public final StringBuilder G;
    public boolean G0;
    public final Formatter H;
    public boolean H0;
    public final r0.b I;
    public boolean I0;
    public final r0.d J;
    public int J0;
    public final com.amazon.aps.iva.e.h K;
    public int K0;
    public final Drawable L;
    public int L0;
    public final Drawable M;
    public long[] M0;
    public final Drawable N;
    public boolean[] N0;
    public final String O;
    public final long[] O0;
    public final String P;
    public final boolean[] P0;
    public final String Q;
    public long Q0;
    public final Drawable R;
    public boolean R0;
    public final Drawable S;
    public final float T;
    public final float U;
    public final String V;
    public final String W;
    public final t b;
    public final Resources c;
    public final b d;
    public final CopyOnWriteArrayList<l> e;
    public final RecyclerView f;
    public final g g;
    public final d h;
    public final i i;
    public final a j;
    public final com.amazon.aps.iva.c8.d k;
    public final Drawable k0;
    public final PopupWindow l;
    public final int m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;
    public final View r;
    public final TextView s;
    public final TextView t;
    public final ImageView u;
    public final ImageView v;
    public final Drawable v0;
    public final View w;
    public final String w0;
    public final ImageView x;
    public final String x0;
    public final ImageView y;
    public final Drawable y0;
    public final ImageView z;
    public final Drawable z0;

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class a extends k {
        public a() {
            super();
        }

        @Override // androidx.media3.ui.c.k
        public final void e(h hVar) {
            int i;
            hVar.b.setText(R.string.exo_track_selection_auto);
            l0 l0Var = c.this.C0;
            l0Var.getClass();
            if (g(l0Var.i())) {
                i = 4;
            } else {
                i = 0;
            }
            hVar.c.setVisibility(i);
            hVar.itemView.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 0));
        }

        @Override // androidx.media3.ui.c.k
        public final void f(String str) {
            c.this.g.b[1] = str;
        }

        public final boolean g(u0 u0Var) {
            for (int i = 0; i < this.a.size(); i++) {
                if (u0Var.z.containsKey(this.a.get(i).a.c)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class b implements l0.c, f.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // androidx.media3.ui.f.a
        public final void G(long j) {
            c cVar = c.this;
            cVar.I0 = true;
            TextView textView = cVar.E;
            if (textView != null) {
                textView.setText(g0.D(cVar.G, cVar.H, j));
            }
            cVar.b.f();
        }

        @Override // androidx.media3.ui.f.a
        public final void I(long j) {
            c cVar = c.this;
            TextView textView = cVar.E;
            if (textView != null) {
                textView.setText(g0.D(cVar.G, cVar.H, j));
            }
        }

        @Override // androidx.media3.ui.f.a
        public final void K(long j, boolean z) {
            l0 l0Var;
            c cVar = c.this;
            int i = 0;
            cVar.I0 = false;
            if (!z && (l0Var = cVar.C0) != null) {
                if (cVar.H0) {
                    if (l0Var.V(17) && l0Var.V(10)) {
                        r0 a0 = l0Var.a0();
                        int q = a0.q();
                        while (true) {
                            long a = a0.o(i, cVar.J).a();
                            if (j < a) {
                                break;
                            } else if (i == q - 1) {
                                j = a;
                                break;
                            } else {
                                j -= a;
                                i++;
                            }
                        }
                        l0Var.i0(i, j);
                    }
                } else if (l0Var.V(5)) {
                    l0Var.c(j);
                }
                cVar.o();
            }
            cVar.b.g();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void O(l0 l0Var, l0.b bVar) {
            u uVar = bVar.a;
            boolean a = uVar.a(4, 5, 13);
            c cVar = c.this;
            if (a) {
                cVar.m();
            }
            if (uVar.a(4, 5, 7, 13)) {
                cVar.o();
            }
            if (uVar.a(8, 13)) {
                cVar.p();
            }
            if (uVar.a(9, 13)) {
                cVar.r();
            }
            if (uVar.a(8, 9, 11, 0, 16, 17, 13)) {
                cVar.l();
            }
            if (uVar.a(11, 0, 13)) {
                cVar.s();
            }
            if (uVar.a(12, 13)) {
                cVar.n();
            }
            if (uVar.a(2, 13)) {
                cVar.t();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x00b5 A[LOOP:0: B:46:0x0096->B:63:0x00b5, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00b3 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onClick(android.view.View r8) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.c.b.onClick(android.view.View):void");
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            c cVar = c.this;
            if (cVar.R0) {
                cVar.b.g();
            }
        }
    }

    /* compiled from: PlayerControlView.java */
    @Deprecated
    /* renamed from: androidx.media3.ui.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038c {
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class d extends RecyclerView.h<h> {
        public final String[] a;
        public final float[] b;
        public int c;

        public d(String[] strArr, float[] fArr) {
            this.a = strArr;
            this.b = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(h hVar, final int i) {
            h hVar2 = hVar;
            String[] strArr = this.a;
            if (i < strArr.length) {
                hVar2.b.setText(strArr[i]);
            }
            if (i == this.c) {
                hVar2.itemView.setSelected(true);
                hVar2.c.setVisibility(0);
            } else {
                hVar2.itemView.setSelected(false);
                hVar2.c.setVisibility(4);
            }
            hVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.c8.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.d dVar = c.d.this;
                    int i2 = dVar.c;
                    int i3 = i;
                    androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                    if (i3 != i2) {
                        cVar.setPlaybackSpeed(dVar.b[i3]);
                    }
                    cVar.l.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final h onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class f extends RecyclerView.f0 {
        public final TextView b;
        public final TextView c;
        public final ImageView d;

        public f(View view) {
            super(view);
            if (g0.a < 26) {
                view.setFocusable(true);
            }
            this.b = (TextView) view.findViewById(R.id.exo_main_text);
            this.c = (TextView) view.findViewById(R.id.exo_sub_text);
            this.d = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 0));
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.h<f> {
        public final String[] a;
        public final String[] b;
        public final Drawable[] c;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.a = strArr;
            this.b = new String[strArr.length];
            this.c = drawableArr;
        }

        public final boolean d(int i) {
            c cVar = c.this;
            l0 l0Var = cVar.C0;
            if (l0Var == null) {
                return false;
            }
            if (i != 0) {
                if (i != 1) {
                    return true;
                }
                if (!l0Var.V(30) || !cVar.C0.V(29)) {
                    return false;
                }
                return true;
            }
            return l0Var.V(13);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(f fVar, int i) {
            f fVar2 = fVar;
            if (d(i)) {
                fVar2.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                fVar2.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            fVar2.b.setText(this.a[i]);
            String str = this.b[i];
            TextView textView = fVar2.c;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.c[i];
            ImageView imageView = fVar2.d;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final f onCreateViewHolder(ViewGroup viewGroup, int i) {
            c cVar = c.this;
            return new f(LayoutInflater.from(cVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public static class h extends RecyclerView.f0 {
        public final TextView b;
        public final View c;

        public h(View view) {
            super(view);
            if (g0.a < 26) {
                view.setFocusable(true);
            }
            this.b = (TextView) view.findViewById(R.id.exo_text);
            this.c = view.findViewById(R.id.exo_check);
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public static final class j {
        public final v0.a a;
        public final int b;
        public final String c;

        public j(v0 v0Var, int i, int i2, String str) {
            this.a = v0Var.a().get(i);
            this.b = i2;
            this.c = str;
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public abstract class k extends RecyclerView.h<h> {
        public List<j> a = new ArrayList();

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d */
        public void onBindViewHolder(h hVar, int i) {
            final l0 l0Var = c.this.C0;
            if (l0Var == null) {
                return;
            }
            if (i == 0) {
                e(hVar);
                return;
            }
            boolean z = true;
            final j jVar = this.a.get(i - 1);
            final s0 s0Var = jVar.a.c;
            int i2 = 0;
            if (l0Var.i().z.get(s0Var) == null || !jVar.a.f[jVar.b]) {
                z = false;
            }
            hVar.b.setText(jVar.c);
            if (!z) {
                i2 = 4;
            }
            hVar.c.setVisibility(i2);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.c8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.k kVar = c.k.this;
                    kVar.getClass();
                    l0 l0Var2 = l0Var;
                    if (l0Var2.V(29)) {
                        u0.a a = l0Var2.i().a();
                        c.j jVar2 = jVar;
                        l0Var2.D(a.k(new t0(s0Var, ImmutableList.of(Integer.valueOf(jVar2.b)))).o(jVar2.a.c.d, false).b());
                        kVar.f(jVar2.c);
                        androidx.media3.ui.c.this.l.dismiss();
                    }
                }
            });
        }

        public abstract void e(h hVar);

        public abstract void f(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            if (this.a.isEmpty()) {
                return 0;
            }
            return this.a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final h onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: PlayerControlView.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface l {
        void G(int i);
    }

    static {
        c0.a("media3.ui");
        S0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        TextView textView;
        ImageView imageView;
        TextView textView2;
        boolean z10;
        this.J0 = 5000;
        this.L0 = 0;
        this.K0 = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
        int i2 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.amazon.aps.iva.c8.u.c, 0, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                this.J0 = obtainStyledAttributes.getInt(21, this.J0);
                this.L0 = obtainStyledAttributes.getInt(9, this.L0);
                z2 = obtainStyledAttributes.getBoolean(18, true);
                z3 = obtainStyledAttributes.getBoolean(15, true);
                z4 = obtainStyledAttributes.getBoolean(17, true);
                z5 = obtainStyledAttributes.getBoolean(16, true);
                z7 = obtainStyledAttributes.getBoolean(19, false);
                z8 = obtainStyledAttributes.getBoolean(20, false);
                z6 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.K0));
                z = obtainStyledAttributes.getBoolean(2, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = false;
            z7 = false;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        b bVar = new b();
        this.d = bVar;
        this.e = new CopyOnWriteArrayList<>();
        this.I = new r0.b();
        this.J = new r0.d();
        StringBuilder sb = new StringBuilder();
        this.G = sb;
        this.H = new Formatter(sb, Locale.getDefault());
        this.M0 = new long[0];
        this.N0 = new boolean[0];
        this.O0 = new long[0];
        this.P0 = new boolean[0];
        this.K = new com.amazon.aps.iva.e.h(this, 4);
        this.D = (TextView) findViewById(R.id.exo_duration);
        this.E = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.x = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.y = imageView3;
        com.amazon.aps.iva.c8.e eVar = new com.amazon.aps.iva.c8.e(this, 0);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(eVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.z = imageView4;
        com.amazon.aps.iva.c8.f fVar = new com.amazon.aps.iva.c8.f(this, 0);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(fVar);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.A = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.B = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        androidx.media3.ui.f fVar2 = (androidx.media3.ui.f) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (fVar2 != null) {
            this.F = fVar2;
        } else if (findViewById4 != null) {
            androidx.media3.ui.b bVar2 = new androidx.media3.ui.b(context, attributeSet);
            bVar2.setId(R.id.exo_progress);
            bVar2.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(bVar2, indexOfChild);
            this.F = bVar2;
        } else {
            this.F = null;
        }
        androidx.media3.ui.f fVar3 = this.F;
        if (fVar3 != null) {
            fVar3.a(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.p = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.n = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.o = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        Typeface a2 = com.amazon.aps.iva.f3.f.a(R.font.roboto_medium_numbers, context);
        View findViewById8 = findViewById(R.id.exo_rew);
        if (findViewById8 == null) {
            z9 = z6;
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        } else {
            z9 = z6;
            textView = null;
        }
        this.t = textView;
        if (textView != null) {
            textView.setTypeface(a2);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.r = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(bVar);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        if (findViewById9 == null) {
            imageView = imageView2;
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        } else {
            imageView = imageView2;
            textView2 = null;
        }
        this.s = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a2);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.q = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(bVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.u = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(bVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_shuffle);
        this.v = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(bVar);
        }
        Resources resources = context.getResources();
        this.c = resources;
        boolean z11 = z8;
        this.T = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.U = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.w = findViewById10;
        if (findViewById10 != null) {
            k(findViewById10, false);
        }
        t tVar = new t(this);
        this.b = tVar;
        tVar.C = z;
        boolean z12 = z7;
        g gVar = new g(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{g0.t(context, resources, R.drawable.exo_styled_controls_speed), g0.t(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.g = gVar;
        this.m = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f = recyclerView;
        recyclerView.setAdapter(gVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.l = popupWindow;
        if (g0.a < 23) {
            z10 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z10 = false;
        }
        popupWindow.setOnDismissListener(bVar);
        this.R0 = true;
        this.k = new com.amazon.aps.iva.c8.d(getResources());
        this.k0 = g0.t(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.v0 = g0.t(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.w0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.x0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.i = new i();
        this.j = new a();
        this.h = new d(resources.getStringArray(R.array.exo_controls_playback_speeds), S0);
        this.y0 = g0.t(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.z0 = g0.t(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.L = g0.t(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.M = g0.t(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.N = g0.t(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.R = g0.t(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.S = g0.t(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.A0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.B0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.O = resources.getString(R.string.exo_controls_repeat_off_description);
        this.P = resources.getString(R.string.exo_controls_repeat_one_description);
        this.Q = resources.getString(R.string.exo_controls_repeat_all_description);
        this.V = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.W = resources.getString(R.string.exo_controls_shuffle_off_description);
        tVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        tVar.h(findViewById9, z3);
        tVar.h(findViewById8, z2);
        tVar.h(findViewById6, z4);
        tVar.h(findViewById7, z5);
        tVar.h(imageView6, z12);
        tVar.h(imageView, z11);
        tVar.h(findViewById10, z9);
        tVar.h(imageView5, this.L0 == 0 ? z10 : true);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.amazon.aps.iva.c8.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                cVar.getClass();
                int i11 = i6 - i4;
                int i12 = i10 - i8;
                if (i5 - i3 != i9 - i7 || i11 != i12) {
                    PopupWindow popupWindow2 = cVar.l;
                    if (popupWindow2.isShowing()) {
                        cVar.q();
                        int i13 = cVar.m;
                        popupWindow2.update(view, (cVar.getWidth() - popupWindow2.getWidth()) - i13, (-popupWindow2.getHeight()) - i13, -1, -1);
                    }
                }
            }
        });
    }

    public static void a(c cVar) {
        if (cVar.D0 != null) {
            boolean z = !cVar.E0;
            cVar.E0 = z;
            String str = cVar.A0;
            Drawable drawable = cVar.y0;
            String str2 = cVar.B0;
            Drawable drawable2 = cVar.z0;
            ImageView imageView = cVar.y;
            if (imageView != null) {
                if (z) {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                } else {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                }
            }
            boolean z2 = cVar.E0;
            ImageView imageView2 = cVar.z;
            if (imageView2 != null) {
                if (z2) {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                } else {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                }
            }
            InterfaceC0038c interfaceC0038c = cVar.D0;
            if (interfaceC0038c != null) {
                androidx.media3.ui.d.this.getClass();
            }
        }
    }

    public static boolean c(l0 l0Var, r0.d dVar) {
        r0 a0;
        int q;
        if (!l0Var.V(17) || (q = (a0 = l0Var.a0()).q()) <= 1 || q > 100) {
            return false;
        }
        for (int i2 = 0; i2 < q; i2++) {
            if (a0.o(i2, dVar).o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        l0 l0Var = this.C0;
        if (l0Var != null && l0Var.V(13)) {
            l0 l0Var2 = this.C0;
            l0Var2.f(new k0(f2, l0Var2.e().c));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        l0 l0Var = this.C0;
        boolean z2 = false;
        if (l0Var != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (l0Var.h() != 4 && l0Var.V(12)) {
                            l0Var.d();
                        }
                    } else if (keyCode == 89 && l0Var.V(11)) {
                        l0Var.T0();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            int i2 = g0.a;
                                            if (l0Var.V(1)) {
                                                l0Var.pause();
                                            }
                                        }
                                    } else {
                                        g0.I(l0Var);
                                    }
                                } else if (l0Var.V(7)) {
                                    l0Var.J();
                                }
                            } else if (l0Var.V(9)) {
                                l0Var.e0();
                            }
                        } else {
                            int i3 = g0.a;
                            if (!l0Var.k0() || l0Var.h() == 1 || l0Var.h() == 4) {
                                z2 = true;
                            }
                            if (z2) {
                                g0.I(l0Var);
                            } else if (l0Var.V(1)) {
                                l0Var.pause();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(RecyclerView.h<?> hVar, View view) {
        this.f.setAdapter(hVar);
        q();
        this.R0 = false;
        PopupWindow popupWindow = this.l;
        popupWindow.dismiss();
        this.R0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i2 = this.m;
        popupWindow.showAsDropDown(view, width - i2, (-popupWindow.getHeight()) - i2);
    }

    public final ImmutableList f(int i2, v0 v0Var) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<v0.a> immutableList = v0Var.b;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            v0.a aVar = immutableList.get(i3);
            if (aVar.c.d == i2) {
                for (int i4 = 0; i4 < aVar.b; i4++) {
                    if (aVar.i(i4)) {
                        v c = aVar.c(i4);
                        if ((c.e & 2) == 0) {
                            builder.add((ImmutableList.Builder) new j(v0Var, i3, i4, this.k.a(c)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    public final void g() {
        t tVar = this.b;
        int i2 = tVar.z;
        if (i2 != 3 && i2 != 2) {
            tVar.f();
            if (!tVar.C) {
                tVar.i(2);
            } else if (tVar.z == 1) {
                tVar.m.start();
            } else {
                tVar.n.start();
            }
        }
    }

    public l0 getPlayer() {
        return this.C0;
    }

    public int getRepeatToggleModes() {
        return this.L0;
    }

    public boolean getShowShuffleButton() {
        return this.b.c(this.v);
    }

    public boolean getShowSubtitleButton() {
        return this.b.c(this.x);
    }

    public int getShowTimeoutMs() {
        return this.J0;
    }

    public boolean getShowVrButton() {
        return this.b.c(this.w);
    }

    public final boolean h() {
        t tVar = this.b;
        if (tVar.z == 0 && tVar.a.i()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z) {
        float f2;
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (z) {
            f2 = this.T;
        } else {
            f2 = this.U;
        }
        view.setAlpha(f2);
    }

    public final void l() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        long j3;
        if (i() && this.F0) {
            l0 l0Var = this.C0;
            if (l0Var != null) {
                if (this.G0 && c(l0Var, this.J)) {
                    z = l0Var.V(10);
                } else {
                    z = l0Var.V(5);
                }
                z3 = l0Var.V(7);
                z4 = l0Var.V(11);
                z5 = l0Var.V(12);
                z2 = l0Var.V(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.c;
            View view = this.r;
            if (z4) {
                l0 l0Var2 = this.C0;
                if (l0Var2 != null) {
                    j3 = l0Var2.V0();
                } else {
                    j3 = 5000;
                }
                int i2 = (int) (j3 / 1000);
                TextView textView = this.t;
                if (textView != null) {
                    textView.setText(String.valueOf(i2));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            View view2 = this.q;
            if (z5) {
                l0 l0Var3 = this.C0;
                if (l0Var3 != null) {
                    j2 = l0Var3.C0();
                } else {
                    j2 = 15000;
                }
                int i3 = (int) (j2 / 1000);
                TextView textView2 = this.s;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i3));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i3, Integer.valueOf(i3)));
                }
            }
            k(this.n, z3);
            k(view, z4);
            k(view2, z5);
            k(this.o, z2);
            androidx.media3.ui.f fVar = this.F;
            if (fVar != null) {
                fVar.setEnabled(z);
            }
        }
    }

    public final void m() {
        View view;
        boolean z;
        int i2;
        int i3;
        if (i() && this.F0 && (view = this.p) != null) {
            l0 l0Var = this.C0;
            int i4 = g0.a;
            boolean z2 = false;
            if (l0Var != null && l0Var.k0() && l0Var.h() != 1 && l0Var.h() != 4) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = R.drawable.exo_styled_controls_play;
            } else {
                i2 = R.drawable.exo_styled_controls_pause;
            }
            if (z) {
                i3 = R.string.exo_controls_play_description;
            } else {
                i3 = R.string.exo_controls_pause_description;
            }
            Context context = getContext();
            Resources resources = this.c;
            ((ImageView) view).setImageDrawable(g0.t(context, resources, i2));
            view.setContentDescription(resources.getString(i3));
            l0 l0Var2 = this.C0;
            if (l0Var2 != null && l0Var2.V(1) && (!this.C0.V(17) || !this.C0.a0().r())) {
                z2 = true;
            }
            k(view, z2);
        }
    }

    public final void n() {
        d dVar;
        l0 l0Var = this.C0;
        if (l0Var == null) {
            return;
        }
        float f2 = l0Var.e().b;
        boolean z = false;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dVar = this.h;
            float[] fArr = dVar.b;
            if (i2 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f2 - fArr[i2]);
            if (abs < f3) {
                i3 = i2;
                f3 = abs;
            }
            i2++;
        }
        dVar.c = i3;
        String str = dVar.a[i3];
        g gVar = this.g;
        gVar.b[0] = str;
        if (gVar.d(1) || gVar.d(0)) {
            z = true;
        }
        k(this.A, z);
    }

    public final void o() {
        long j2;
        long j3;
        int h2;
        long j4;
        if (i() && this.F0) {
            l0 l0Var = this.C0;
            if (l0Var != null && l0Var.V(16)) {
                j2 = l0Var.E0() + this.Q0;
                j3 = l0Var.R0() + this.Q0;
            } else {
                j2 = 0;
                j3 = 0;
            }
            TextView textView = this.E;
            if (textView != null && !this.I0) {
                textView.setText(g0.D(this.G, this.H, j2));
            }
            androidx.media3.ui.f fVar = this.F;
            if (fVar != null) {
                fVar.setPosition(j2);
                fVar.setBufferedPosition(j3);
            }
            com.amazon.aps.iva.e.h hVar = this.K;
            removeCallbacks(hVar);
            if (l0Var == null) {
                h2 = 1;
            } else {
                h2 = l0Var.h();
            }
            long j5 = 1000;
            if (l0Var != null && l0Var.J0()) {
                if (fVar != null) {
                    j4 = fVar.getPreferredUpdateDelay();
                } else {
                    j4 = 1000;
                }
                long min = Math.min(j4, 1000 - (j2 % 1000));
                float f2 = l0Var.e().b;
                if (f2 > 0.0f) {
                    j5 = ((float) min) / f2;
                }
                postDelayed(hVar, g0.j(j5, this.K0, 1000L));
            } else if (h2 != 4 && h2 != 1) {
                postDelayed(hVar, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t tVar = this.b;
        tVar.a.addOnLayoutChangeListener(tVar.x);
        this.F0 = true;
        if (h()) {
            tVar.g();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.b;
        tVar.a.removeOnLayoutChangeListener(tVar.x);
        this.F0 = false;
        removeCallbacks(this.K);
        tVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.b.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.u) != null) {
            if (this.L0 == 0) {
                k(imageView, false);
                return;
            }
            l0 l0Var = this.C0;
            String str = this.O;
            Drawable drawable = this.L;
            if (l0Var != null && l0Var.V(15)) {
                k(imageView, true);
                int n = l0Var.n();
                if (n != 0) {
                    if (n != 1) {
                        if (n == 2) {
                            imageView.setImageDrawable(this.N);
                            imageView.setContentDescription(this.Q);
                            return;
                        }
                        return;
                    }
                    imageView.setImageDrawable(this.M);
                    imageView.setContentDescription(this.P);
                    return;
                }
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i2 = this.m;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i2 * 2));
        PopupWindow popupWindow = this.l;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i2 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.F0 && (imageView = this.v) != null) {
            l0 l0Var = this.C0;
            if (!this.b.c(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.W;
            Drawable drawable = this.S;
            if (l0Var != null && l0Var.V(14)) {
                k(imageView, true);
                if (l0Var.Q0()) {
                    drawable = this.R;
                }
                imageView.setImageDrawable(drawable);
                if (l0Var.Q0()) {
                    str = this.V;
                }
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z;
        r0 r0Var;
        long j2;
        long j3;
        int i2;
        int i3;
        int i4;
        r0 r0Var2;
        r0 r0Var3;
        boolean z2;
        boolean z3;
        int length;
        l0 l0Var = this.C0;
        if (l0Var == null) {
            return;
        }
        boolean z4 = this.G0;
        boolean z5 = true;
        r0.d dVar = this.J;
        if (z4 && c(l0Var, dVar)) {
            z = true;
        } else {
            z = false;
        }
        this.H0 = z;
        this.Q0 = 0L;
        if (l0Var.V(17)) {
            r0Var = l0Var.a0();
        } else {
            r0Var = r0.b;
        }
        long j4 = -9223372036854775807L;
        if (!r0Var.r()) {
            int K0 = l0Var.K0();
            boolean z6 = this.H0;
            if (z6) {
                i3 = 0;
            } else {
                i3 = K0;
            }
            if (z6) {
                i4 = r0Var.q() - 1;
            } else {
                i4 = K0;
            }
            j3 = 0;
            i2 = 0;
            while (true) {
                if (i3 > i4) {
                    break;
                }
                if (i3 == K0) {
                    this.Q0 = g0.e0(j3);
                }
                r0Var.o(i3, dVar);
                if (dVar.o == j4) {
                    com.amazon.aps.iva.cq.b.C(this.H0 ^ z5);
                    break;
                }
                int i5 = dVar.p;
                while (i5 <= dVar.q) {
                    r0.b bVar = this.I;
                    r0Var.g(i5, bVar);
                    com.amazon.aps.iva.q5.c cVar = bVar.h;
                    int i6 = cVar.f;
                    while (i6 < cVar.c) {
                        long d2 = bVar.d(i6);
                        int i7 = K0;
                        if (d2 == Long.MIN_VALUE) {
                            r0Var2 = r0Var;
                            long j5 = bVar.e;
                            if (j5 == j4) {
                                r0Var3 = r0Var2;
                                i6++;
                                K0 = i7;
                                r0Var = r0Var3;
                                j4 = -9223372036854775807L;
                            } else {
                                d2 = j5;
                            }
                        } else {
                            r0Var2 = r0Var;
                        }
                        long j6 = d2 + bVar.f;
                        if (j6 >= 0) {
                            long[] jArr = this.M0;
                            if (i2 == jArr.length) {
                                if (jArr.length == 0) {
                                    length = 1;
                                } else {
                                    length = jArr.length * 2;
                                }
                                this.M0 = Arrays.copyOf(jArr, length);
                                this.N0 = Arrays.copyOf(this.N0, length);
                            }
                            this.M0[i2] = g0.e0(j3 + j6);
                            boolean[] zArr = this.N0;
                            c.a a2 = bVar.h.a(i6);
                            int i8 = a2.c;
                            if (i8 == -1) {
                                r0Var3 = r0Var2;
                            } else {
                                int i9 = 0;
                                while (true) {
                                    r0Var3 = r0Var2;
                                    if (i9 < i8) {
                                        int i10 = a2.f[i9];
                                        if (i10 == 0) {
                                            break;
                                        }
                                        c.a aVar = a2;
                                        z2 = true;
                                        if (i10 == 1) {
                                            break;
                                        }
                                        i9++;
                                        r0Var2 = r0Var3;
                                        a2 = aVar;
                                    } else {
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                }
                                zArr[i2] = z3 ^ z2;
                                i2++;
                            }
                            z2 = true;
                            z3 = z2;
                            zArr[i2] = z3 ^ z2;
                            i2++;
                        } else {
                            r0Var3 = r0Var2;
                        }
                        i6++;
                        K0 = i7;
                        r0Var = r0Var3;
                        j4 = -9223372036854775807L;
                    }
                    i5++;
                    z5 = true;
                    r0Var = r0Var;
                    j4 = -9223372036854775807L;
                }
                j3 += dVar.o;
                i3++;
                z5 = z5;
                r0Var = r0Var;
                j4 = -9223372036854775807L;
            }
        } else {
            if (l0Var.V(16)) {
                long o0 = l0Var.o0();
                if (o0 != -9223372036854775807L) {
                    j2 = g0.Q(o0);
                    j3 = j2;
                    i2 = 0;
                }
            }
            j2 = 0;
            j3 = j2;
            i2 = 0;
        }
        long e0 = g0.e0(j3);
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(g0.D(this.G, this.H, e0));
        }
        androidx.media3.ui.f fVar = this.F;
        if (fVar != null) {
            fVar.setDuration(e0);
            long[] jArr2 = this.O0;
            int length2 = jArr2.length;
            int i11 = i2 + length2;
            long[] jArr3 = this.M0;
            if (i11 > jArr3.length) {
                this.M0 = Arrays.copyOf(jArr3, i11);
                this.N0 = Arrays.copyOf(this.N0, i11);
            }
            System.arraycopy(jArr2, 0, this.M0, i2, length2);
            System.arraycopy(this.P0, 0, this.N0, i2, length2);
            fVar.b(this.M0, this.N0, i11);
        }
        o();
    }

    public void setAnimationEnabled(boolean z) {
        this.b.C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0038c interfaceC0038c) {
        boolean z;
        this.D0 = interfaceC0038c;
        boolean z2 = true;
        if (interfaceC0038c != null) {
            z = true;
        } else {
            z = false;
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (interfaceC0038c == null) {
            z2 = false;
        }
        ImageView imageView2 = this.z;
        if (imageView2 != null) {
            if (z2) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    public void setPlayer(l0 l0Var) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (l0Var != null && l0Var.c0() != Looper.getMainLooper()) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        l0 l0Var2 = this.C0;
        if (l0Var2 == l0Var) {
            return;
        }
        b bVar = this.d;
        if (l0Var2 != null) {
            l0Var2.t0(bVar);
        }
        this.C0 = l0Var;
        if (l0Var != null) {
            l0Var.u(bVar);
        }
        j();
    }

    public void setRepeatToggleModes(int i2) {
        this.L0 = i2;
        l0 l0Var = this.C0;
        boolean z = false;
        if (l0Var != null && l0Var.V(15)) {
            int n = this.C0.n();
            if (i2 == 0 && n != 0) {
                this.C0.l(0);
            } else if (i2 == 1 && n == 2) {
                this.C0.l(1);
            } else if (i2 == 2 && n == 1) {
                this.C0.l(2);
            }
        }
        if (i2 != 0) {
            z = true;
        }
        this.b.h(this.u, z);
        p();
    }

    public void setShowFastForwardButton(boolean z) {
        this.b.h(this.q, z);
        l();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.G0 = z;
        s();
    }

    public void setShowNextButton(boolean z) {
        this.b.h(this.o, z);
        l();
    }

    public void setShowPreviousButton(boolean z) {
        this.b.h(this.n, z);
        l();
    }

    public void setShowRewindButton(boolean z) {
        this.b.h(this.r, z);
        l();
    }

    public void setShowShuffleButton(boolean z) {
        this.b.h(this.v, z);
        r();
    }

    public void setShowSubtitleButton(boolean z) {
        this.b.h(this.x, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.J0 = i2;
        if (h()) {
            this.b.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.b.h(this.w, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.K0 = g0.i(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.w;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            k(view, z);
        }
    }

    public final void t() {
        boolean z;
        i iVar = this.i;
        iVar.getClass();
        iVar.a = Collections.emptyList();
        a aVar = this.j;
        aVar.getClass();
        aVar.a = Collections.emptyList();
        l0 l0Var = this.C0;
        boolean z2 = false;
        ImageView imageView = this.x;
        if (l0Var != null && l0Var.V(30) && this.C0.V(29)) {
            v0 Q = this.C0.Q();
            ImmutableList f2 = f(1, Q);
            aVar.a = f2;
            c cVar = c.this;
            l0 l0Var2 = cVar.C0;
            l0Var2.getClass();
            u0 i2 = l0Var2.i();
            boolean isEmpty = f2.isEmpty();
            g gVar = cVar.g;
            if (isEmpty) {
                gVar.b[1] = cVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (!aVar.g(i2)) {
                gVar.b[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= f2.size()) {
                        break;
                    }
                    j jVar = (j) f2.get(i3);
                    if (jVar.a.f[jVar.b]) {
                        gVar.b[1] = jVar.c;
                        break;
                    }
                    i3++;
                }
            }
            if (this.b.c(imageView)) {
                iVar.g(f(3, Q));
            } else {
                iVar.g(ImmutableList.of());
            }
        }
        if (iVar.getItemCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        k(imageView, z);
        g gVar2 = this.g;
        if (gVar2.d(1) || gVar2.d(0)) {
            z2 = true;
        }
        k(this.A, z2);
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class i extends k {
        public i() {
            super();
        }

        @Override // androidx.media3.ui.c.k, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: d */
        public final void onBindViewHolder(h hVar, int i) {
            int i2;
            super.onBindViewHolder(hVar, i);
            if (i > 0) {
                j jVar = this.a.get(i - 1);
                View view = hVar.c;
                if (jVar.a.f[jVar.b]) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
        }

        @Override // androidx.media3.ui.c.k
        public final void e(h hVar) {
            boolean z;
            int i;
            hVar.b.setText(R.string.exo_track_selection_none);
            int i2 = 0;
            while (true) {
                if (i2 < this.a.size()) {
                    j jVar = this.a.get(i2);
                    if (jVar.a.f[jVar.b]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            hVar.c.setVisibility(i);
            hVar.itemView.setOnClickListener(new com.amazon.aps.iva.c8.k(this, 0));
        }

        public final void g(List<j> list) {
            Drawable drawable;
            String str;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                j jVar = list.get(i);
                if (jVar.a.f[jVar.b]) {
                    z = true;
                    break;
                }
                i++;
            }
            c cVar = c.this;
            ImageView imageView = cVar.x;
            if (imageView != null) {
                if (z) {
                    drawable = cVar.k0;
                } else {
                    drawable = cVar.v0;
                }
                imageView.setImageDrawable(drawable);
                if (z) {
                    str = cVar.w0;
                } else {
                    str = cVar.x0;
                }
                cVar.x.setContentDescription(str);
            }
            this.a = list;
        }

        @Override // androidx.media3.ui.c.k
        public final void f(String str) {
        }
    }

    public void setProgressUpdateListener(e eVar) {
    }
}
