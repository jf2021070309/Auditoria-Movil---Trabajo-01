package e.a.c.w6;

import e.a.c.z6;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class a {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public b f5199b;

    /* renamed from: c  reason: collision with root package name */
    public long f5200c;

    /* renamed from: d  reason: collision with root package name */
    public int f5201d;

    /* renamed from: e  reason: collision with root package name */
    public String f5202e;

    /* renamed from: f  reason: collision with root package name */
    public String f5203f;

    /* renamed from: g  reason: collision with root package name */
    public String f5204g;

    public void a(String str) {
        if (str == null || str.length() == 0 || str.equals("<unknown>")) {
            str = z6.E(R.string.unknown_artist_name);
        }
        this.f5203f = str;
    }

    public void b(String str) {
        if (str == null || str.length() == 0 || str.equals("<unknown>")) {
            str = z6.E(R.string.unknown_album_name);
        }
        this.f5204g = str;
    }
}
