package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import e.a.d.a.a;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
/* loaded from: classes.dex */
public class MarkerFilter extends MatchingFilter {
    public Marker markerToMatch;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (isStarted()) {
            if (marker != null && marker.contains(this.markerToMatch)) {
                return this.onMatch;
            }
            return this.onMismatch;
        }
        return FilterReply.NEUTRAL;
    }

    public void setMarker(String str) {
        if (str != null) {
            this.markerToMatch = MarkerFactory.getMarker(str);
        }
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.markerToMatch != null) {
            super.start();
            return;
        }
        StringBuilder y = a.y("The marker property must be set for [");
        y.append(getName());
        y.append("]");
        addError(y.toString());
    }
}
