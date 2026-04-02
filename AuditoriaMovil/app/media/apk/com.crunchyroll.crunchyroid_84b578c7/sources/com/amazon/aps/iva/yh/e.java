package com.amazon.aps.iva.yh;

import android.app.Activity;
import com.amazon.aps.iva.cj.j0;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.k50.j;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
/* compiled from: MusicDependencies.kt */
/* loaded from: classes.dex */
public interface e {
    com.amazon.aps.iva.ye.a a();

    boolean b();

    com.amazon.aps.iva.aj.a c();

    void d(Activity activity);

    void e(o oVar, ArtistActivity.i iVar);

    com.amazon.aps.iva.bi.a f();

    j g(WatchMusicActivity watchMusicActivity);

    EtpContentService getEtpContentService();

    PlayService getPlayService();

    l getPlayerFeature();

    j0 h();

    com.amazon.aps.iva.gn.c i(com.amazon.aps.iva.gn.e eVar);

    com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.n60.b> j();
}
