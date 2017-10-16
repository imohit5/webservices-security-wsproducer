package com.wsproducer.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ProducerPasswordCallback implements CallbackHandler {

	Map<String, String> credentials = new HashMap<>();

	public ProducerPasswordCallback() {
		credentials.put("admin", "password");
		credentials.put("wsproducerkey", "skpass");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			WSPasswordCallback wspc = (WSPasswordCallback) callback;
			String string = credentials.get(wspc.getIdentifier());
			wspc.setPassword(string);
			return;
		}
	}

}
