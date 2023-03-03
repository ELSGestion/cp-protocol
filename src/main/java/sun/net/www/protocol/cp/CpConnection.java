package sun.net.www.protocol.cp;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class CpConnection extends URLConnection {
	public CpConnection(URL u) {
		super(u);
	}

	@Override
	public void connect() throws IOException {
		//throw new UnsupportedOperationException("The connect() method is not supported");
	}

	@Override
	public Object getContent() throws IOException {
		throw new UnsupportedOperationException("The getContent() method is not supported");
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return this.getClass().getResourceAsStream(this.url.getPath());
	}
}