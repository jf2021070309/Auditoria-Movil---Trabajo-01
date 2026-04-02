package com.ellation.crunchyroll.presentation.browse.filtering;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.a0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BrowseFilterOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseFilterOption;", "Default", "DubbedOnly", "SubtitledOnly", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$Default;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$DubbedOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$SubtitledOnly;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BrowseSubDubFilter extends BrowseFilterOption {

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$Default;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Default extends BrowseSubDubFilter {
        public static final Default d = new Default();

        private Default() {
            super(0);
        }
    }

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$DubbedOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DubbedOnly extends BrowseSubDubFilter {
        public static final DubbedOnly d = new DubbedOnly();

        private DubbedOnly() {
            super(R.string.browse_filter_dubbed_only, k.x(new j("is_dubbed", "true")));
        }
    }

    /* compiled from: BrowseFilterOption.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter$SubtitledOnly;", "Lcom/ellation/crunchyroll/presentation/browse/filtering/BrowseSubDubFilter;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SubtitledOnly extends BrowseSubDubFilter {
        public static final SubtitledOnly d = new SubtitledOnly();

        private SubtitledOnly() {
            super(R.string.browse_filter_subtitled_only, k.x(new j("is_subbed", "true")));
        }
    }

    public BrowseSubDubFilter() {
        throw null;
    }

    public BrowseSubDubFilter(int i) {
        super(R.string.browse_filter_all, a0.b);
    }
}
