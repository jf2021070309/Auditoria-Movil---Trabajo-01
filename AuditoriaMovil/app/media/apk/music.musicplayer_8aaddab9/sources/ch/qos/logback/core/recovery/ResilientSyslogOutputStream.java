package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import e.a.d.a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;
/* loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    public int port;
    public String syslogHost;

    public ResilientSyslogOutputStream(String str, int i2) throws UnknownHostException, SocketException {
        this.syslogHost = str;
        this.port = i2;
        this.os = new SyslogOutputStream(str, i2);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder y = a.y("syslog [");
        y.append(this.syslogHost);
        y.append(":");
        return a.p(y, this.port, "]");
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() throws IOException {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        StringBuilder y = a.y("c.q.l.c.recovery.ResilientSyslogOutputStream@");
        y.append(System.identityHashCode(this));
        return y.toString();
    }
}
