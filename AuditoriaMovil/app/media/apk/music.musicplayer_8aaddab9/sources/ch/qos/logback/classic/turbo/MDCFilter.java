package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.MDC;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class MDCFilter extends MatchingFilter {
    public String MDCKey;
    public String value;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (isStarted()) {
            return this.value.equals(MDC.get(this.MDCKey)) ? this.onMatch : this.onMismatch;
        }
        return FilterReply.NEUTRAL;
    }

    public void setMDCKey(String str) {
        this.MDCKey = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i2;
        if (this.value == null) {
            addError("'value' parameter is mandatory. Cannot start.");
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.MDCKey == null) {
            addError("'MDCKey' parameter is mandatory. Cannot start.");
            i2++;
        }
        if (i2 == 0) {
            this.start = true;
        }
    }
}
