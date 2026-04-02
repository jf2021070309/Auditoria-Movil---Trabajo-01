package e.a.c;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.jrtstudio.audio.Bookmark;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class o6 implements e.h.d.t {
    public static boolean a;

    /* renamed from: b  reason: collision with root package name */
    public long f5145b;

    /* renamed from: c  reason: collision with root package name */
    public long f5146c;

    /* renamed from: d  reason: collision with root package name */
    public String f5147d;

    /* renamed from: e  reason: collision with root package name */
    public long f5148e;

    /* renamed from: f  reason: collision with root package name */
    public String f5149f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5150g;

    /* renamed from: h  reason: collision with root package name */
    public long f5151h;

    /* renamed from: i  reason: collision with root package name */
    public String f5152i;

    /* renamed from: j  reason: collision with root package name */
    public String f5153j;

    public o6(long j2) {
        this.f5145b = j2;
        if (a) {
            a();
        }
    }

    @Override // e.h.d.t
    public long A() {
        a();
        return this.f5151h;
    }

    @Override // e.h.d.t
    public boolean J() {
        return false;
    }

    @Override // e.h.d.t
    public boolean V() {
        return false;
    }

    @Override // e.h.d.t
    public Uri X() {
        return Uri.parse(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + this.f5145b);
    }

    @Override // e.h.d.t
    public Bookmark Z() {
        return null;
    }

    public final void a() {
        if (this.f5150g) {
            return;
        }
        try {
            Cursor query = e.h.g.x0.f8405d.getContentResolver().query(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.f5145b), new String[]{"_id", "_data", "artist_id", "album_id", "duration", "artist", "album", "title", "mime_type"}, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    this.f5152i = query.getString(query.getColumnIndex("_data"));
                    this.f5151h = query.getLong(query.getColumnIndex("duration"));
                    this.f5148e = query.getLong(query.getColumnIndex("artist_id"));
                    this.f5146c = query.getLong(query.getColumnIndex("album_id"));
                    this.f5149f = query.getString(query.getColumnIndex("artist"));
                    this.f5147d = query.getString(query.getColumnIndex("album"));
                    this.f5153j = query.getString(query.getColumnIndex("title"));
                    query.getString(query.getColumnIndex("mime_type"));
                    if (this.f5153j == null) {
                        this.f5153j = "";
                    }
                    String str = this.f5149f;
                    if (str == null || str.length() == 0 || this.f5149f.equals("<unknown>")) {
                        this.f5149f = z6.E(R.string.unknown_artist_name);
                    }
                    String str2 = this.f5147d;
                    if (str2 == null || str2.length() == 0 || this.f5147d.equals("<unknown>")) {
                        this.f5147d = z6.E(R.string.unknown_album_name);
                    }
                }
                query.close();
            }
            this.f5150g = true;
        } catch (Throwable th) {
            e.h.g.s1.l(th, true);
        }
    }

    public long b() {
        a();
        return this.f5146c;
    }

    @Override // e.h.d.t
    public String d() {
        a();
        return this.f5147d;
    }

    @Override // e.h.d.t
    public String e() {
        a();
        return this.f5149f;
    }

    public long f() {
        return this.f5145b;
    }

    @Override // e.h.d.t
    public String getPath() {
        a();
        return this.f5152i;
    }

    @Override // e.h.d.t
    public String getTitle() {
        a();
        return this.f5153j;
    }

    @Override // e.h.d.t
    public boolean j() {
        return false;
    }

    @Override // e.h.d.t
    public boolean l() {
        return false;
    }

    @Override // e.h.d.t
    public Bookmark p() {
        return null;
    }

    @Override // e.h.d.t
    public Bookmark q() {
        return null;
    }

    @Override // e.h.d.t
    public void r(Bookmark bookmark) {
    }

    @Override // e.h.d.t
    public int w() {
        return 0;
    }
}
