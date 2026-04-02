package com.amazon.aps.iva.ii;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.k50.d;
import com.amazon.aps.iva.l50.c;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yh.f;
import com.crunchyroll.music.artist.ArtistActivity;
/* compiled from: MusicRouterImpl.kt */
/* loaded from: classes.dex */
public final class a implements d {
    public final Context a;

    public a(Context context) {
        j.f(context, "context");
        this.a = context;
    }

    @Override // com.amazon.aps.iva.k50.d
    public final void C1(c cVar) {
        com.amazon.aps.iva.hi.a aVar = f.a.b;
        if (aVar != null) {
            aVar.a(this.a, cVar);
        } else {
            j.m("watchMusicScreenRouter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.k50.d
    public final void D1(com.amazon.aps.iva.l50.a aVar) {
        int i = ArtistActivity.m;
        Context context = this.a;
        j.f(context, "context");
        Intent intent = new Intent(context, ArtistActivity.class);
        j.e(intent.putExtra("ARTIST_INPUT", aVar), "intent.putExtra(ARTIST_INPUT_EXTRA, this)");
        context.startActivity(intent);
    }
}
