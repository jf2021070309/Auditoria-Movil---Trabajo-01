package com.android.music;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.music.RenamePlaylist;
import e.a.c.z6;
import e.h.b.n;
import e.h.g.j0;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class RenamePlaylist extends Activity {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public String f3014b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f3015c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f3016d;

    /* renamed from: e  reason: collision with root package name */
    public long f3017e;

    /* renamed from: g  reason: collision with root package name */
    public TextView f3019g;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f3018f = new a();

    /* renamed from: h  reason: collision with root package name */
    public TextWatcher f3020h = new b();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final String obj = RenamePlaylist.this.f3015c.getText().toString();
            if (obj == null || obj.length() <= 0) {
                return;
            }
            j0.f(new j0.b() { // from class: e.a.c.w4
                @Override // e.h.g.j0.b
                public final void a() {
                    final RenamePlaylist.a aVar = RenamePlaylist.a.this;
                    final String str = obj;
                    final long j2 = RenamePlaylist.this.f3017e;
                    ReentrantLock reentrantLock = e.h.b.n.a;
                    Object obj2 = e.h.g.j1.a;
                    if (e.h.b.n.f8068f) {
                        e.h.g.j0.c(new j0.b() { // from class: e.h.b.e
                            @Override // e.h.g.j0.b
                            public final void a() {
                                long j3 = j2;
                                String str2 = str;
                                p o = n.o(j3);
                                if (o != null) {
                                    o.l(o.f8080c, str2);
                                }
                            }
                        });
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("_pName", str);
                        e.h.b.n.E("playlist", contentValues, "_dum = " + j2, null);
                        e.h.b.n.x();
                    } else {
                        e.h.b.o.l(j2, str);
                        e.h.b.n.x();
                    }
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.x4
                        @Override // e.h.g.j0.c
                        public final void a() {
                            RenamePlaylist.a aVar2 = RenamePlaylist.a.this;
                            RenamePlaylist.this.setResult(-1);
                            z6.Z(z6.E(R.string.playlist_renamed_message), 0);
                            RenamePlaylist.this.finish();
                        }
                    });
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            RenamePlaylist renamePlaylist = RenamePlaylist.this;
            int i5 = RenamePlaylist.a;
            renamePlaylist.a();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RenamePlaylist.this.finish();
        }
    }

    public final void a() {
        final String obj = this.f3015c.getText().toString();
        if (obj.trim().length() == 0) {
            this.f3019g.setEnabled(false);
            return;
        }
        this.f3019g.setEnabled(true);
        j0.f(new j0.b() { // from class: e.a.c.z4
            @Override // e.h.g.j0.b
            public final void a() {
                long j2;
                final RenamePlaylist renamePlaylist = RenamePlaylist.this;
                String str = obj;
                Objects.requireNonNull(renamePlaylist);
                Iterator<e.h.b.p> it = e.h.b.n.q(true).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j2 = -1;
                        break;
                    }
                    e.h.b.p next = it.next();
                    if (next.f8083f.equals(str)) {
                        j2 = next.f8081d;
                        break;
                    }
                }
                if (j2 < 0 || renamePlaylist.f3014b.equals(str)) {
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.y4
                        @Override // e.h.g.j0.c
                        public final void a() {
                            RenamePlaylist.this.f3019g.setText(z6.E(R.string.create_playlist_create_text));
                        }
                    });
                } else {
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.a5
                        @Override // e.h.g.j0.c
                        public final void a() {
                            RenamePlaylist.this.f3019g.setText(z6.E(R.string.create_playlist_overwrite_text));
                        }
                    });
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setVolumeControlStream(3);
        requestWindowFeature(1);
        setContentView(R.layout.create_playlist);
        getWindow().setLayout(-1, -2);
        this.f3016d = (TextView) findViewById(R.id.prompt);
        this.f3015c = (EditText) findViewById(R.id.playlist);
        TextView textView = (TextView) findViewById(R.id.create);
        this.f3019g = textView;
        textView.setOnClickListener(this.f3018f);
        findViewById(R.id.cancel).setOnClickListener(new c());
        long j2 = bundle != null ? bundle.getLong("rename") : getIntent().getLongExtra("rename", -1L);
        this.f3017e = j2;
        String str2 = n.o(j2).f8083f;
        this.f3014b = str2;
        if (bundle != null) {
            str2 = bundle.getString("defaultname");
        }
        if (this.f3017e < 0 || (str = this.f3014b) == null || str2 == null) {
            finish();
            return;
        }
        this.f3016d.setText(String.format(str.equals(str2) ? z6.E(R.string.rename_playlist_same_prompt) : z6.E(R.string.rename_playlist_same_prompt), this.f3014b, str2));
        this.f3015c.setText(str2);
        this.f3015c.setSelection(str2.length());
        this.f3015c.addTextChangedListener(this.f3020h);
        a();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("defaultname", this.f3015c.getText().toString());
        bundle.putLong("rename", this.f3017e);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            double[] dArr = new double[2];
            float f2 = 0.6f;
            if (defaultDisplay.getWidth() >= 400 && defaultDisplay.getHeight() >= 400) {
                if (defaultDisplay.getWidth() < defaultDisplay.getHeight()) {
                    f2 = 0.82f;
                }
                dArr[0] = f2 * defaultDisplay.getWidth();
                dArr[1] = -2.0d;
                getWindow().setLayout((int) dArr[0], (int) dArr[1]);
            }
            f2 = 0.9f;
            dArr[0] = f2 * defaultDisplay.getWidth();
            dArr[1] = -2.0d;
            getWindow().setLayout((int) dArr[0], (int) dArr[1]);
        } catch (NullPointerException unused) {
        }
    }
}
