package e.a.c.w6;

import e.a.c.z6;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class b {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public String f5205b;

    /* renamed from: c  reason: collision with root package name */
    public int f5206c;

    /* renamed from: d  reason: collision with root package name */
    public int f5207d;

    /* renamed from: e  reason: collision with root package name */
    public String f5208e;

    public void a(String str) {
        if (str == null || str.length() == 0 || str.equals("<unknown>")) {
            str = z6.E(R.string.unknown_artist_name);
        }
        this.f5208e = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a) {
                String str = this.f5208e;
                if (str == null && bVar.f5208e == null) {
                    return true;
                }
                return str != null && str.equals(bVar.f5208e);
            }
            return false;
        }
        return false;
    }
}
