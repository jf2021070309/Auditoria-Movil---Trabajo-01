package com.android.music;

import android.app.ListActivity;
import android.content.AsyncQueryHandler;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SectionIndexer;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.android.music.MusicPicker;
import e.a.c.x6;
import e.a.c.z6;
import e.h.g.j0;
import e.h.g.s1;
import java.util.Formatter;
import java.util.Locale;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class MusicPicker extends ListActivity implements View.OnClickListener, MediaPlayer.OnCompletionListener {
    public static final String[] a = {"_id", "title", "title_key", "_data", "album", "artist", "artist_id", "duration", "track"};

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f2977b = new Object[5];

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2978c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static StringBuilder f2979d = new StringBuilder();

    /* renamed from: e  reason: collision with root package name */
    public b f2980e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f2981f;

    /* renamed from: g  reason: collision with root package name */
    public View f2982g;

    /* renamed from: h  reason: collision with root package name */
    public Cursor f2983h;

    /* renamed from: i  reason: collision with root package name */
    public View f2984i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2985j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2986k;

    /* renamed from: m  reason: collision with root package name */
    public MediaPlayer f2988m;
    public View o;
    public a p;
    public Uri r;
    public String t;

    /* renamed from: l  reason: collision with root package name */
    public Parcelable f2987l = null;

    /* renamed from: n  reason: collision with root package name */
    public long f2989n = -1;
    public long q = -1;
    public int s = -1;

    /* loaded from: classes.dex */
    public final class a extends AsyncQueryHandler {
        public a(Context context) {
            super(context.getContentResolver());
        }

        @Override // android.content.AsyncQueryHandler
        public void onQueryComplete(int i2, Object obj, Cursor cursor) {
            if (MusicPicker.this.isFinishing()) {
                cursor.close();
                return;
            }
            b bVar = MusicPicker.this.f2980e;
            bVar.f2996h = false;
            bVar.changeCursor(cursor);
            MusicPicker.this.setProgressBarIndeterminateVisibility(false);
            MusicPicker musicPicker = MusicPicker.this;
            if (musicPicker.f2987l != null) {
                musicPicker.getListView().onRestoreInstanceState(MusicPicker.this.f2987l);
                MusicPicker musicPicker2 = MusicPicker.this;
                if (musicPicker2.f2985j) {
                    musicPicker2.getListView().requestFocus();
                }
                MusicPicker musicPicker3 = MusicPicker.this;
                musicPicker3.f2985j = false;
                musicPicker3.f2987l = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends SimpleCursorAdapter implements SectionIndexer {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2990b;

        /* renamed from: c  reason: collision with root package name */
        public final StringBuilder f2991c;

        /* renamed from: d  reason: collision with root package name */
        public int f2992d;

        /* renamed from: e  reason: collision with root package name */
        public int f2993e;

        /* renamed from: f  reason: collision with root package name */
        public x6 f2994f;

        /* renamed from: g  reason: collision with root package name */
        public int f2995g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2996h;

        /* renamed from: i  reason: collision with root package name */
        public int f2997i;

        /* renamed from: j  reason: collision with root package name */
        public final String f2998j;

        /* renamed from: k  reason: collision with root package name */
        public final String f2999k;

        /* loaded from: classes.dex */
        public class a {
            public CharArrayBuffer a;

            /* renamed from: b  reason: collision with root package name */
            public char[] f3001b;

            /* renamed from: c  reason: collision with root package name */
            public TextView f3002c;

            /* renamed from: d  reason: collision with root package name */
            public TextView f3003d;

            /* renamed from: e  reason: collision with root package name */
            public TextView f3004e;

            /* renamed from: f  reason: collision with root package name */
            public ImageView f3005f;

            /* renamed from: g  reason: collision with root package name */
            public RadioButton f3006g;

            public a(b bVar) {
            }
        }

        public b(Context context, ListView listView, int i2, String[] strArr, int[] iArr) {
            super(context, i2, null, strArr, iArr);
            this.f2991c = new StringBuilder();
            this.f2996h = true;
            this.f2999k = z6.E(R.string.unknown_artist_name);
            this.f2998j = z6.E(R.string.unknown_album_name);
        }

        @Override // android.widget.SimpleCursorAdapter, android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            a aVar = (a) view.getTag();
            cursor.copyStringToBuffer(this.f2997i, aVar.a);
            TextView textView = aVar.f3003d;
            CharArrayBuffer charArrayBuffer = aVar.a;
            textView.setText(charArrayBuffer.data, 0, charArrayBuffer.sizeCopied);
            int i2 = cursor.getInt(this.f2992d) / 1000;
            if (i2 == 0) {
                aVar.f3002c.setText("");
            } else {
                aVar.f3002c.setText(z6.L(i2));
            }
            StringBuilder sb = this.f2991c;
            sb.delete(0, sb.length());
            String string = cursor.getString(this.a);
            if (string == null || string.equals("<unknown>")) {
                sb.append(this.f2998j);
            } else {
                sb.append(string);
            }
            sb.append('\n');
            String string2 = cursor.getString(this.f2990b);
            if (string2 == null || string2.equals("<unknown>")) {
                sb.append(this.f2999k);
            } else {
                sb.append(string2);
            }
            int length = sb.length();
            if (aVar.f3001b.length < length) {
                aVar.f3001b = new char[length];
            }
            sb.getChars(0, length, aVar.f3001b, 0);
            aVar.f3004e.setText(aVar.f3001b, 0, length);
            long j2 = cursor.getLong(this.f2993e);
            aVar.f3006g.setChecked(j2 == MusicPicker.this.q);
            ImageView imageView = aVar.f3005f;
            if (j2 != MusicPicker.this.f2989n) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setImageResource(R.drawable.indicator_ic_mp_playing_list);
            imageView.setVisibility(0);
        }

        @Override // android.widget.CursorAdapter
        public void changeCursor(Cursor cursor) {
            x6 x6Var;
            super.changeCursor(cursor);
            MusicPicker.this.f2983h = cursor;
            if (cursor != null) {
                this.f2993e = cursor.getColumnIndex("_id");
                this.f2997i = cursor.getColumnIndex("title");
                this.f2990b = cursor.getColumnIndex("artist");
                this.a = cursor.getColumnIndex("album");
                this.f2992d = cursor.getColumnIndex("duration");
                int i2 = this.f2995g;
                int i3 = MusicPicker.this.s;
                if (i2 != i3 || (x6Var = this.f2994f) == null) {
                    this.f2995g = i3;
                    int i4 = this.f2997i;
                    if (i3 == 2) {
                        i4 = this.a;
                    } else if (i3 == 3) {
                        i4 = this.f2990b;
                    }
                    this.f2994f = new x6(cursor, i4, z6.E(R.string.fast_scroll_alphabet));
                } else {
                    Cursor cursor2 = x6Var.f5123c;
                    if (cursor2 != null) {
                        cursor2.unregisterDataSetObserver(x6Var);
                    }
                    x6Var.f5123c = cursor;
                    cursor.registerDataSetObserver(x6Var);
                    x6Var.f5124d.clear();
                }
            }
            MusicPicker musicPicker = MusicPicker.this;
            if (musicPicker.f2986k) {
                return;
            }
            musicPicker.f2986k = true;
            musicPicker.o.startAnimation(AnimationUtils.loadAnimation(musicPicker, 17432577));
            musicPicker.o.setVisibility(8);
            musicPicker.f2984i.startAnimation(AnimationUtils.loadAnimation(musicPicker, 17432576));
            musicPicker.f2984i.setVisibility(0);
        }

        @Override // android.widget.SectionIndexer
        public int getPositionForSection(int i2) {
            if (getCursor() == null) {
                return 0;
            }
            return this.f2994f.getPositionForSection(i2);
        }

        @Override // android.widget.SectionIndexer
        public int getSectionForPosition(int i2) {
            return 0;
        }

        @Override // android.widget.SectionIndexer
        public Object[] getSections() {
            x6 x6Var = this.f2994f;
            if (x6Var != null) {
                return x6Var.f5125e;
            }
            return null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean isEmpty() {
            if (this.f2996h) {
                return false;
            }
            return super.isEmpty();
        }

        @Override // android.widget.ResourceCursorAdapter, android.widget.CursorAdapter
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            View newView = super.newView(context, cursor, viewGroup);
            a aVar = new a(this);
            aVar.f3003d = (TextView) newView.findViewById(R.id.line1);
            aVar.f3004e = (TextView) newView.findViewById(R.id.line2);
            aVar.f3002c = (TextView) newView.findViewById(R.id.duration);
            aVar.f3006g = (RadioButton) newView.findViewById(R.id.radio);
            aVar.f3005f = (ImageView) newView.findViewById(R.id.play_indicator);
            aVar.a = new CharArrayBuffer(100);
            aVar.f3001b = new char[200];
            newView.setTag(aVar);
            return newView;
        }

        @Override // android.widget.CursorAdapter
        public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
            return MusicPicker.this.a(true, charSequence.toString());
        }
    }

    static {
        new Formatter(f2979d, Locale.getDefault());
    }

    public Cursor a(boolean z, String str) {
        this.p.cancelOperation(42);
        StringBuilder sb = new StringBuilder();
        sb.append("title != ''");
        Uri uri = this.f2981f;
        if (!TextUtils.isEmpty(str)) {
            uri = uri.buildUpon().appendQueryParameter("filter", Uri.encode(str)).build();
        }
        Uri uri2 = uri;
        if (z) {
            try {
                return getContentResolver().query(uri2, a, sb.toString(), null, this.t);
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        this.f2980e.f2996h = true;
        setProgressBarIndeterminateVisibility(true);
        this.p.startQuery(42, null, uri2, a, sb.toString(), null, this.t);
        return null;
    }

    public boolean b(int i2) {
        if (i2 != this.s) {
            if (i2 == 1) {
                this.s = i2;
                this.t = "title_key";
                a(false, null);
                return true;
            } else if (i2 == 2) {
                this.s = i2;
                this.t = "album_key ASC, track ASC, title_key ASC";
                a(false, null);
                return true;
            } else if (i2 == 3) {
                this.s = i2;
                this.t = "artist_key ASC, album_key ASC, track ASC, title_key ASC";
                a(false, null);
                return true;
            }
        }
        return false;
    }

    public void c() {
        j0.g(new j0.b() { // from class: e.a.c.y2
            @Override // e.h.g.j0.b
            public final void a() {
                MusicPicker musicPicker = MusicPicker.this;
                Objects.requireNonNull(musicPicker);
                synchronized (MusicPicker.f2978c) {
                    MediaPlayer mediaPlayer = musicPicker.f2988m;
                    if (mediaPlayer != null) {
                        mediaPlayer.stop();
                        musicPicker.f2988m.release();
                        musicPicker.f2988m = null;
                        musicPicker.f2989n = -1L;
                    }
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.applyTv /* 2131296358 */:
            case R.id.okayButton /* 2131296720 */:
                if (this.q >= 0) {
                    setResult(-1, new Intent().setData(this.r));
                    finish();
                    return;
                }
                return;
            case R.id.cancelButton /* 2131296407 */:
            case R.id.closeTv /* 2131296432 */:
                finish();
                return;
            default:
                return;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(final MediaPlayer mediaPlayer) {
        j0.g(new j0.b() { // from class: e.a.c.z2
            @Override // e.h.g.j0.b
            public final void a() {
                final MusicPicker musicPicker = MusicPicker.this;
                MediaPlayer mediaPlayer2 = mediaPlayer;
                Objects.requireNonNull(musicPicker);
                synchronized (MusicPicker.f2978c) {
                    if (musicPicker.f2988m == mediaPlayer2) {
                        mediaPlayer2.stop();
                        mediaPlayer2.release();
                        musicPicker.f2988m = null;
                        musicPicker.f2989n = -1L;
                        e.h.g.j0.i(new j0.c() { // from class: e.a.c.a3
                            @Override // e.h.g.j0.c
                            public final void a() {
                                MusicPicker.this.getListView().invalidateViews();
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        requestWindowFeature(5);
        if (bundle == null) {
            this.r = (Uri) getIntent().getParcelableExtra("android.intent.extra.ringtone.EXISTING_URI");
            i2 = 1;
        } else {
            this.r = (Uri) bundle.getParcelable("android.intent.extra.ringtone.EXISTING_URI");
            this.f2987l = bundle.getParcelable("liststate");
            this.f2985j = bundle.getBoolean("focused");
            i2 = bundle.getInt("sortMode", 1);
        }
        if ("android.intent.action.GET_CONTENT".equals(getIntent().getAction())) {
            this.f2981f = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            Uri data = getIntent().getData();
            this.f2981f = data;
            if (data == null) {
                s1.m("No data URI given to PICK action");
                finish();
                return;
            }
        }
        setContentView(R.layout.music_picker);
        ImageView imageView = (ImageView) findViewById(R.id.blurred_bg_player_view);
        z6.c0(this, 0, imageView);
        Uri uri = z6.a;
        z6.b0(this, 0, imageView, true, 0);
        this.t = "title_key";
        ListView listView = getListView();
        listView.setItemsCanFocus(false);
        b bVar = new b(this, listView, R.layout.music_picker_item, new String[0], new int[0]);
        this.f2980e = bVar;
        setListAdapter(bVar);
        listView.setTextFilterEnabled(true);
        listView.setSaveEnabled(false);
        this.p = new a(this);
        this.o = findViewById(R.id.progressContainer);
        this.f2984i = findViewById(R.id.listContainer);
        Button button = (Button) findViewById(R.id.okayButton);
        if (button != null) {
            button.setOnClickListener(this);
        }
        TextView textView = (TextView) findViewById(R.id.applyTv);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        View findViewById = findViewById(R.id.cancelButton);
        this.f2982g = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        TextView textView2 = (TextView) findViewById(R.id.closeTv);
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        Uri uri2 = this.r;
        if (uri2 != null) {
            Uri.Builder buildUpon = uri2.buildUpon();
            String encodedPath = this.r.getEncodedPath();
            int lastIndexOf = encodedPath.lastIndexOf(47);
            if (lastIndexOf >= 0) {
                encodedPath = encodedPath.substring(0, lastIndexOf);
            }
            buildUpon.encodedPath(encodedPath);
            if (buildUpon.build().equals(this.f2981f)) {
                this.q = ContentUris.parseId(this.r);
            }
        }
        b(i2);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, z6.E(R.string.sort_by_track));
        menu.add(0, 2, 0, z6.E(R.string.albums_title));
        menu.add(0, 3, 0, z6.E(R.string.artists_title));
        return true;
    }

    @Override // android.app.ListActivity
    public void onListItemClick(ListView listView, View view, int i2, long j2) {
        this.f2983h.moveToPosition(i2);
        final Cursor cursor = this.f2983h;
        j0.g(new j0.b() { // from class: e.a.c.b3
            /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|(2:9|10)|14|15|16|(1:18)(1:21)|19|10) */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
                android.util.Log.w("MusicPicker", "Unable to play track", r0);
             */
            @Override // e.h.g.j0.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a() {
                /*
                    r8 = this;
                    com.android.music.MusicPicker r0 = com.android.music.MusicPicker.this
                    android.database.Cursor r1 = r2
                    java.util.Objects.requireNonNull(r0)
                    java.lang.Object r2 = com.android.music.MusicPicker.f2978c
                    monitor-enter(r2)
                    android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L8c
                    java.lang.String r4 = "_id"
                    int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8c
                    long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L8c
                    android.net.Uri r1 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch: java.lang.Throwable -> L8c
                    r0.r = r1     // Catch: java.lang.Throwable -> L8c
                    r0.q = r4     // Catch: java.lang.Throwable -> L8c
                    long r6 = r0.f2989n     // Catch: java.lang.Throwable -> L8c
                    int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r1 != 0) goto L35
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.lang.Throwable -> L8c
                    if (r1 != 0) goto L29
                    goto L35
                L29:
                    r0.c()     // Catch: java.lang.Throwable -> L8c
                    e.a.c.w2 r1 = new e.a.c.w2     // Catch: java.lang.Throwable -> L8c
                    r1.<init>()     // Catch: java.lang.Throwable -> L8c
                    e.h.g.j0.i(r1)     // Catch: java.lang.Throwable -> L8c
                    goto L8a
                L35:
                    r0.c()     // Catch: java.lang.Throwable -> L8c
                    android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L8c
                    r1.<init>()     // Catch: java.lang.Throwable -> L8c
                    r0.f2988m = r1     // Catch: java.lang.Throwable -> L8c
                    android.net.Uri r3 = r0.r     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.setDataSource(r0, r3)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.setOnCompletionListener(r0)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    boolean r1 = e.h.g.v0.j()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r3 = 2
                    if (r1 == 0) goto L68
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    android.media.AudioAttributes$Builder r6 = new android.media.AudioAttributes$Builder     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r6.<init>()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r7 = 1
                    android.media.AudioAttributes$Builder r6 = r6.setUsage(r7)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    android.media.AudioAttributes$Builder r3 = r6.setContentType(r3)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    android.media.AudioAttributes r3 = r3.build()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.setAudioAttributes(r3)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    goto L6d
                L68:
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.setAudioStreamType(r3)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                L6d:
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.prepare()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    android.media.MediaPlayer r1 = r0.f2988m     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.start()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r0.f2989n = r4     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    e.a.c.x2 r1 = new e.a.c.x2     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    r1.<init>()     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    e.h.g.j0.i(r1)     // Catch: java.io.IOException -> L82 java.lang.Throwable -> L8c
                    goto L8a
                L82:
                    r0 = move-exception
                    java.lang.String r1 = "MusicPicker"
                    java.lang.String r3 = "Unable to play track"
                    android.util.Log.w(r1, r3, r0)     // Catch: java.lang.Throwable -> L8c
                L8a:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
                    return
                L8c:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L8c
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e.a.c.b3.a():void");
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (b(menuItem.getItemId())) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        c();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        a(false, null);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("liststate", getListView().onSaveInstanceState());
        bundle.putBoolean("focused", getListView().hasFocus());
        bundle.putInt("sortMode", this.s);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        b bVar = this.f2980e;
        bVar.f2996h = true;
        try {
            bVar.changeCursor(null);
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
