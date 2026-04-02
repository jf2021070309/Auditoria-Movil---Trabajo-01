package com.amazon.aps.iva.ap;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenInput.kt */
/* loaded from: classes2.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new b();
    public final PlayableAsset b;
    public final h c;
    public final Long d;
    public final Boolean e;
    public final com.amazon.aps.iva.no.a f;

    /* compiled from: WatchScreenInput.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static g a(Intent intent) {
            PlayableAsset playableAsset;
            h hVar;
            Long l;
            Boolean bool;
            com.amazon.aps.iva.no.a aVar;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj5 = extras.getSerializable("playable_asset", PlayableAsset.class);
                } else {
                    obj5 = (PlayableAsset) extras.getSerializable("playable_asset");
                }
                playableAsset = (PlayableAsset) obj5;
            } else {
                playableAsset = null;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj4 = extras2.getSerializable("watch_page_raw_input", h.class);
                } else {
                    obj4 = (h) extras2.getSerializable("watch_page_raw_input");
                }
                hVar = (h) obj4;
            } else {
                hVar = null;
            }
            Bundle extras3 = intent.getExtras();
            if (extras3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj3 = extras3.getSerializable("playhead", Long.class);
                } else {
                    obj3 = (Long) extras3.getSerializable("playhead");
                }
                l = (Long) obj3;
            } else {
                l = null;
            }
            Bundle extras4 = intent.getExtras();
            if (extras4 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = extras4.getSerializable("is_completed", Boolean.class);
                } else {
                    obj2 = (Boolean) extras4.getSerializable("is_completed");
                }
                bool = (Boolean) obj2;
            } else {
                bool = null;
            }
            Bundle extras5 = intent.getExtras();
            if (extras5 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras5.getSerializable("watch_page_session_origin", com.amazon.aps.iva.no.a.class);
                } else {
                    obj = (com.amazon.aps.iva.no.a) extras5.getSerializable("watch_page_session_origin");
                }
                aVar = (com.amazon.aps.iva.no.a) obj;
            } else {
                aVar = null;
            }
            return new g(playableAsset, hVar, l, bool, aVar);
        }
    }

    /* compiled from: WatchScreenInput.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Long valueOf;
            boolean z;
            Boolean valueOf2;
            com.amazon.aps.iva.no.a valueOf3;
            j.f(parcel, "parcel");
            PlayableAsset playableAsset = (PlayableAsset) parcel.readSerializable();
            h hVar = (h) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf2 = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = com.amazon.aps.iva.no.a.valueOf(parcel.readString());
            }
            return new g(playableAsset, hVar, valueOf, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g() {
        this(null, 31);
    }

    public final com.amazon.aps.iva.ap.a a() {
        PlayableAsset playableAsset = this.b;
        if (playableAsset != null) {
            return new com.amazon.aps.iva.ap.a(playableAsset.getParentId(), playableAsset.getParentType());
        }
        h hVar = this.c;
        if (hVar != null) {
            return hVar.b;
        }
        throw new IllegalArgumentException("Watch page input is missing. ");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j.a(this.b, gVar.b) && j.a(this.c, gVar.c) && j.a(this.d, gVar.d) && j.a(this.e, gVar.e) && this.f == gVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        PlayableAsset playableAsset = this.b;
        if (playableAsset == null) {
            hashCode = 0;
        } else {
            hashCode = playableAsset.hashCode();
        }
        int i2 = hashCode * 31;
        h hVar = this.c;
        if (hVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.d;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool = this.e;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        com.amazon.aps.iva.no.a aVar = this.f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "WatchScreenInput(asset=" + this.b + ", raw=" + this.c + ", startPlayheadMs=" + this.d + ", isCompleted=" + this.e + ", sessionOrigin=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "out");
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        com.amazon.aps.iva.no.a aVar = this.f;
        if (aVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(aVar.name());
    }

    public g(PlayableAsset playableAsset, h hVar, Long l, Boolean bool, com.amazon.aps.iva.no.a aVar) {
        this.b = playableAsset;
        this.c = hVar;
        this.d = l;
        this.e = bool;
        this.f = aVar;
    }

    public /* synthetic */ g(PlayableAsset playableAsset, int i) {
        this((i & 1) != 0 ? null : playableAsset, null, null, null, null);
    }
}
