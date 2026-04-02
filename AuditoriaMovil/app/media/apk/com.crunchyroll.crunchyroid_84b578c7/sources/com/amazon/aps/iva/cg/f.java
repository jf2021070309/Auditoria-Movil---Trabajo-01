package com.amazon.aps.iva.cg;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.model.music.MusicConcert;
import com.ellation.crunchyroll.model.music.MusicVideo;
/* compiled from: DeepLinkDataInteractor.kt */
/* loaded from: classes.dex */
public interface f extends com.amazon.aps.iva.wy.j {
    Object J(String str, com.amazon.aps.iva.ob0.d<? super Artist> dVar);

    Object T0(String str, com.amazon.aps.iva.ob0.d<? super MusicVideo> dVar);

    Object getSeason(String str, com.amazon.aps.iva.ob0.d<? super Season> dVar);

    Object getUserSubscription(com.amazon.aps.iva.ob0.d<? super SubscriptionProductWrapper> dVar);

    Object u0(a0 a0Var, com.amazon.aps.iva.ob0.d<? super Panel> dVar);

    Object w0(String str, com.amazon.aps.iva.ob0.d<? super MusicConcert> dVar);
}
