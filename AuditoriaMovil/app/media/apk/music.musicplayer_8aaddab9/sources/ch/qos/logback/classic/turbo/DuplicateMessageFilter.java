package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import d.a.a.a.c.a;
import java.util.Objects;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class DuplicateMessageFilter extends TurboFilter {
    public static final int DEFAULT_ALLOWED_REPETITIONS = 5;
    public static final int DEFAULT_CACHE_SIZE = 100;
    public int allowedRepetitions = 5;
    public int cacheSize = 100;
    private a msgCache;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        Integer valueOf;
        a aVar = this.msgCache;
        Objects.requireNonNull(aVar);
        int i2 = 0;
        if (str != null) {
            synchronized (aVar) {
                Integer num = aVar.get(str);
                valueOf = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
                aVar.put(str, valueOf);
            }
            i2 = valueOf.intValue();
        }
        return i2 <= this.allowedRepetitions ? FilterReply.NEUTRAL : FilterReply.DENY;
    }

    public int getAllowedRepetitions() {
        return this.allowedRepetitions;
    }

    public int getCacheSize() {
        return this.cacheSize;
    }

    public void setAllowedRepetitions(int i2) {
        this.allowedRepetitions = i2;
    }

    public void setCacheSize(int i2) {
        this.cacheSize = i2;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.msgCache = new a(this.cacheSize);
        super.start();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.msgCache.clear();
        this.msgCache = null;
        super.stop();
    }
}
