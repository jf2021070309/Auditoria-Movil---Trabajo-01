package e.a.c.w6;

import e.a.c.z6;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class d {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public long f5210b;

    /* renamed from: c  reason: collision with root package name */
    public String f5211c;

    /* renamed from: d  reason: collision with root package name */
    public String f5212d;

    public void a(String str) {
        if (str == null || str.length() == 0 || str.equals("<unknown>")) {
            str = z6.E(R.string.unknown_artist_name);
        }
        this.f5211c = str;
    }
}
