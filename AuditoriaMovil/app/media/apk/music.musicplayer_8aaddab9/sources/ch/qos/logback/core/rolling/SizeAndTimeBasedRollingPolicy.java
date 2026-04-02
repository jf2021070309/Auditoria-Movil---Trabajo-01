package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP;
import ch.qos.logback.core.util.FileSize;
import e.a.d.a.a;
/* loaded from: classes.dex */
public class SizeAndTimeBasedRollingPolicy<E> extends TimeBasedRollingPolicy<E> {
    public FileSize maxFileSize;

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy, ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String sb;
        SizeAndTimeBasedFNATP sizeAndTimeBasedFNATP = new SizeAndTimeBasedFNATP(SizeAndTimeBasedFNATP.a.EMBEDDED);
        if (this.maxFileSize == null) {
            sb = "maxFileSize property is mandatory";
        } else {
            StringBuilder y = a.y("Archive files will be limited to [");
            y.append(this.maxFileSize);
            y.append("] each.");
            addInfo(y.toString());
            sizeAndTimeBasedFNATP.setMaxFileSize(this.maxFileSize);
            this.timeBasedFileNamingAndTriggeringPolicy = sizeAndTimeBasedFNATP;
            if (isUnboundedTotalSizeCap() || this.totalSizeCap.getSize() >= this.maxFileSize.getSize()) {
                super.start();
                return;
            }
            StringBuilder y2 = a.y("totalSizeCap of [");
            y2.append(this.totalSizeCap);
            y2.append("] is smaller than maxFileSize [");
            y2.append(this.maxFileSize);
            y2.append("] which is non-sensical");
            sb = y2.toString();
        }
        addError(sb);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy
    public String toString() {
        StringBuilder y = a.y("c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@");
        y.append(hashCode());
        return y.toString();
    }
}
