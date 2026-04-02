package com.android.music;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.music.CreatePlaylist;
import e.a.c.z6;
import e.h.g.j0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class CreatePlaylist extends Activity {
    public EditText a;

    /* renamed from: c  reason: collision with root package name */
    public TextView f2946c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f2947d;

    /* renamed from: b  reason: collision with root package name */
    public final View.OnClickListener f2945b = new a();

    /* renamed from: e  reason: collision with root package name */
    public TextWatcher f2948e = new b();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            final String obj = CreatePlaylist.this.a.getText().toString();
            if (obj == null || obj.length() <= 0) {
                return;
            }
            j0.f(new j0.b() { // from class: e.a.c.b0
                @Override // e.h.g.j0.b
                public final void a() {
                    long j2;
                    final CreatePlaylist.a aVar = CreatePlaylist.a.this;
                    String str = obj;
                    Objects.requireNonNull(aVar);
                    ReentrantLock reentrantLock = e.h.b.n.a;
                    Object obj2 = e.h.g.j1.a;
                    long j3 = -1;
                    if (e.h.b.n.f8071i && str != null) {
                        String trim = str.trim();
                        if (trim.length() != 0) {
                            if (e.h.b.n.f8068f) {
                                ReentrantLock reentrantLock2 = e.h.b.n.a;
                                reentrantLock2.lock();
                                try {
                                    Iterator<e.h.b.p> it = e.h.b.n.q(e.h.b.n.f8068f).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            j2 = -1;
                                            break;
                                        }
                                        e.h.b.p next = it.next();
                                        if (next.f8083f.equals(trim)) {
                                            j2 = next.f8081d;
                                            break;
                                        }
                                    }
                                    if (j2 != -1) {
                                        reentrantLock2.unlock();
                                        j3 = j2;
                                    } else {
                                        long b2 = e.h.b.o.b(trim);
                                        String trim2 = trim.trim();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("_pName", trim2);
                                        contentValues.put("_pMDID", Long.valueOf(b2));
                                        contentValues.put("_pDM", Long.valueOf(System.currentTimeMillis() / 1000));
                                        contentValues.put("_pStatus", (Integer) 0);
                                        j3 = e.h.b.n.t("playlist", contentValues);
                                        reentrantLock2.unlock();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        reentrantLock2.unlock();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else {
                                j3 = e.h.b.o.b(trim);
                            }
                        }
                    }
                    final Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, j3);
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.a0
                        @Override // e.h.g.j0.c
                        public final void a() {
                            CreatePlaylist.a aVar2 = CreatePlaylist.a.this;
                            CreatePlaylist.this.setResult(-1, new Intent().setData(withAppendedId));
                            Object obj3 = n6.a;
                            HashMap hashMap = new HashMap();
                            hashMap.put("PlaylistCreator", "Yes");
                            e.h.e.g.i("CreatedPlaylist", hashMap);
                            CreatePlaylist.this.finish();
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
            String obj = CreatePlaylist.this.a.getText().toString();
            if (obj.trim().length() == 0) {
                CreatePlaylist.this.f2947d.setEnabled(false);
                return;
            }
            CreatePlaylist.this.f2947d.setEnabled(true);
            Objects.requireNonNull(CreatePlaylist.this);
            Cursor Q = z6.Q(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "name=?", new String[]{obj}, "name");
            if (Q != null) {
                try {
                    Q.moveToFirst();
                    r4 = Q.isAfterLast() ? -1 : Q.getInt(0);
                } finally {
                    Q.close();
                }
            }
            if (r4 >= 0) {
                CreatePlaylist.this.f2947d.setText(z6.E(R.string.create_playlist_overwrite_text));
            } else {
                CreatePlaylist.this.f2947d.setText(z6.E(R.string.create_playlist_create_text));
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreatePlaylist.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String E;
        Cursor query;
        super.onCreate(bundle);
        setVolumeControlStream(3);
        requestWindowFeature(1);
        setContentView(R.layout.create_playlist);
        getWindow().setLayout(-1, -2);
        this.f2946c = (TextView) findViewById(R.id.prompt);
        this.a = (EditText) findViewById(R.id.playlist);
        TextView textView = (TextView) findViewById(R.id.create);
        this.f2947d = textView;
        textView.setOnClickListener(this.f2945b);
        this.f2947d.setText(z6.E(R.string.create_playlist_create_text));
        TextView textView2 = (TextView) findViewById(R.id.cancel);
        textView2.setOnClickListener(new c());
        textView2.setText(z6.E(R.string.cancel));
        if (bundle != null) {
            str = bundle.getString("defaultname");
        } else {
            try {
                E = z6.E(R.string.new_playlist_name_template);
                query = getContentResolver().query(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "name != ''", null, "name");
            } catch (Throwable unused) {
            }
            if (query == null) {
                str = null;
            } else {
                int i2 = 2;
                String format = String.format(E, 1);
                boolean z = false;
                while (!z) {
                    query.moveToFirst();
                    z = true;
                    while (!query.isAfterLast()) {
                        if (query.getString(0).compareToIgnoreCase(format) == 0) {
                            format = String.format(E, Integer.valueOf(i2));
                            i2++;
                            z = false;
                        }
                        query.moveToNext();
                    }
                }
                query.close();
                str = format;
            }
        }
        if (str == null) {
            finish();
            return;
        }
        this.f2946c.setText(String.format(z6.E(R.string.create_playlist_create_text_prompt), str));
        this.a.setText(str);
        this.a.setSelection(str.length());
        this.a.addTextChangedListener(this.f2948e);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("defaultname", this.a.getText().toString());
    }
}
